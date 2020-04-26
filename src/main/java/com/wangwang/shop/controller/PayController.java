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
    private final String APP_ID = "2016102100733316";
    private final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQChMrFioifbRpHJzfDFC7TEiQlH/yfGqcHIbIpEIZHVY7emTUKfm29epuaRFW7iMXFYqCZfLr4rVYDjOkLh5u2NoODaWLUP8yz29KVQ707Fux3lcVfFTP5TeYGYv6fGzrsLpJVeEUQl5ltg9RGpvh7x3PUx7SMoAzczwLhWV1771+mHM/j401+rtxzTtN9HIxiKNnz1fqCmxjuE9JUvd1KKur3NDJyb2LDiHfY1UELMSpSJgr8N3LBAUnKhAnWHE9UpYLib+rGz9q0Kw0h9gtkVpAIyKHCrZadoDxDOV2v1RFlqYsyzy/eUfLD66XyB/vKZ8x0rb3LryDO8obzK3ZZ1AgMBAAECggEAe2//J8F2ddJHR1p9Odap+Snawpgf1GAf9SMwidWO//HZKu7UyrXTBY8W1hisjWdBHZu9rntzwmk6RkZR+vzEAgUkye7Nz8XuM7nJcf2eu4l67jzp8jrwMenElLyGdJXP462Hd74PClqotMlVWj8tIRaLaEzn8/bqaaX1QqCrKnvHGVsNuljtUBsjwi4kRkCnBsIXj+MZ2smtoTCkAc2njt9w+q4mpfDuSeqmgxo4HgLg2bRWwKxK2YwydElF4wj8pIkzg4BFviYNMYEs3ZfYVFA77jhntc3GjDbXs1MDcP4ORvuIYtEvw1s8QyA8yb5dZ2r8I34lm+2xcvIK69KnDQKBgQDZFnunbkXmDulP/WnLcbdDHVKjGG41Iwa6BL9dHBXJsH9cRPwjPdd7GgVUtLhDEqPM57eRuLHQTL8j0I4sxX2W1g7QLguI9op14U6cofaG6Ct9t9+woysM+Ywf8ml8Buf7PMKkQZK1D8t5DP5MyLuolV74cyolhaldspobrmaIGwKBgQC+F5ej6YMI5ykkP5NvQ6WPzEkcody4rMImti54INbo3kbzeqxY9uHseBHvnfuSYFSu2QcWZJKZMx1j5l1uJqaqZn2jvonHMvv73mQLfAfxLH5bZq3Ii3vHTmxk8c9D7moVXAV1mVNzfx8ww/rTsHPSC61uljbR2WjSJhvm4pRkrwKBgGiIwQaAvTvo1kRkXLtQiNTSm+ZZb0g7E5QjkRp+2acDTHDb7yXxM3/dqc9+LnRt115l/ik3bLhHHItcc/nvJ2iorv1kDr3nKglVcwtNmm6gAcFJ93cROzvGNslza4QDt1VtjrSVttVlQ6+IqDPFPUgSlWbB3fuvfzzVMgw+ULUdAoGBAJsJTOEf04JQXmq0+39UsdRtLfgPP6DTLeo6zf2l8wGsQDvWgnhwquSdLSu8MvE4ZfjRAwnNbw9J9B+FRBBRr77spm4FOgPgXkoXIIuJVkTqIAhV30jgEk0Edj2CRqRF7/mJut4l9j0Nohe4z3sVv/DBG2tFUmKmqeozsLAHfjX7AoGBAI4uWIXlxYkzSFfXW+hTTyXRfDRwp8zDBqpAcsYFfqVVW6yQ8+YbNXjS1K9zDaxMMRGhyOkq1TiFUegoW0weFSfjJHVQJ1Lh3ul9tHtmBWHggQlbROduNyn0DojBb88kgqaRbj8/pmAj75BUAxuAQpXv/7DYls3rUqcvZ0oInFzs";
    private final String CHARSET = "UTF-8";
    private final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArxechXy/wkzSumcy+EwzWq/PaZTTDI9OygcQfN8pT5ehrRnG3RweuHh1YqhAcQKCF3NE39bJlZufN352uzOvI/8XE1w6ZSU0aT8q/Fej1UU0WUQ+E6QsfSa8vyxF9Mn0/EEHYw5RLDRDhyZnotC2nHxHJoeCqqxFdw1ybnyua4PtlKly1rNye2WmpM5Aw1JdCw6TNomp3UJnDw0f0Pr3txzaZ06qqDQMWkqCB1cJE/i8w3dhbb8oyEKhzHyc+9/+ohIevsxo6Li31M8QrWoigpvLeyXiS1T9bIjIR2UkkE+26R0TnwD5I1pQtC9vZYxyI12SN3EZEGOA+B4JDw2GPwIDAQAB";
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
