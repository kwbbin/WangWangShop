package com.wangwang.shop.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.ShopOrder;
import com.wangwang.shop.bean.ShopOrderExample;
import com.wangwang.shop.dao.GoodsMapper;
import com.wangwang.shop.dao.ShopOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

@Controller
public class PayController {
    //填写appID
    private final String APP_ID = "*****AppId******";
    //放上自己生成的私钥
    private final String APP_PRIVATE_KEY = "*****私钥****";
    private final String CHARSET = "UTF-8";
    //放上自己生成的公钥
    private final String ALIPAY_PUBLIC_KEY = "******公钥*******";
    //这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
    private final String GATEWAY_URL ="https://openapi.alipaydev.com/gateway.do";
    private final String FORMAT = "JSON";
    //签名方式
    private final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
    private final String NOTIFY_URL = "https://www.baidu.com";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
    private final String RETURN_URL = "http://localhost:8081/returnUrl";

    @Autowired
    ShopOrderMapper shopOrderMapper;

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("/alipay")
    public void alipay(HttpServletResponse httpResponse,String ids,Long position) throws IOException {

        StringBuilder strName = new StringBuilder();
        String [] orders = ids.split(",");
        BigDecimal totalPrice = new BigDecimal(0);
        StringBuilder strDesc = new StringBuilder();
        int num=1;
        String out_trade_no="";
        StringBuilder stringBuilder = new StringBuilder();
        for (String i : orders){
            //商户订单号，商户网站订单系统中唯一订单号，必填
            //生成随机Id
            out_trade_no = UUID.randomUUID().toString();
            ShopOrder order = shopOrderMapper.selectByPrimaryKey(Long.parseLong(i));
            order.setGoodsNum(out_trade_no);
            order.setPositionId(position);
            shopOrderMapper.updateByPrimaryKey(order);
            Goods goods = goodsMapper.selectByPrimaryKey(order.getGoodsId());
            strName.append("商品"+num+": "+goods.getName()+"    ");
            strDesc.append("/"+goods.getGoodsDesc());
            totalPrice=totalPrice.add(goods.getPrice().multiply(new BigDecimal(order.getCount())));
            stringBuilder.append(order.getOrderId()+"&&");
            num++;
        }

        Random r=new Random();
        //实例化客户端,填入所需参数
        AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        request.setReturnUrl(RETURN_URL);
        request.setNotifyUrl(NOTIFY_URL);


        //付款金额，必填
        String total_amount = totalPrice.toString();
        //订单名称，必填
        String subject =strName.toString();
        //商品描述，可空
        String body = strDesc.toString();
        System.out.println("stringBuilder:"+stringBuilder.toString());
        request.setBizContent("{\"out_trade_no\":\""+ stringBuilder+"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"position\":\""+ position +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String form = "";
        try {
            form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + CHARSET);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }


    @RequestMapping(value = "/returnUrl", method = RequestMethod.GET)
    public void returnUrl(HttpServletRequest request, HttpServletResponse response)
            throws IOException, AlipayApiException {
        System.out.println("=================================同步回调=====================================");

        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("utf-8"), "utf-8");
            params.put(name, valueStr);
        }

        System.out.println(params);//查看参数都有哪些
        boolean signVerified = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, CHARSET, SIGN_TYPE); // 调用SDK验证签名
        //验证签名通过
        if(signVerified){
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            System.out.println("商户订单号="+out_trade_no);
            System.out.println("支付宝交易号="+trade_no);
            System.out.println("付款金额="+total_amount);

            //支付成功，修复支付状态
            String [] noList = out_trade_no.split("&&");
            for(String str : noList){
                ShopOrderExample shopOrderExample = new ShopOrderExample();
                shopOrderExample.createCriteria().andOrderIdEqualTo(Long.parseLong(str));
                ShopOrder shopOrder = new ShopOrder();
                shopOrder.setStatus(0);
//                shopOrder.setPositionId();
                shopOrderMapper.updateByExampleSelective(shopOrder,shopOrderExample);
                ShopOrder shopOrder1 = shopOrderMapper.selectByPrimaryKey(Long.parseLong(str));
                Goods goods = goodsMapper.selectByPrimaryKey(shopOrder1.getGoodsId());
                Integer goodsStock = goods.getGoodsStock()-shopOrder1.getCount();
                Goods g = new Goods();
                g.setGoodsStock(goodsStock);
                g.setGoodsId(goods.getGoodsId());
                goodsMapper.updateByPrimaryKeySelective(g);
            }

            response.sendRedirect("http://localhost:8082/ShoppingCart");
//            return "";//跳转付款成功页面
        }else{
//            return "no";//跳转付款失败页面
        }

    }
}
