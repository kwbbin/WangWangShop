package com.wangwang.shop.controller;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.SMSCodeService;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.SMSCodeTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class SendSmsController extends BaseController {
    @Autowired
    SMSCodeService smsCodeService;
    @Autowired
    UserService userService;

    @RequestMapping(value="/SMSCode", method= RequestMethod.POST)
    public ResultBean getSMSCode(HttpServletRequest request1){
        String phone = request1.getParameter("phone");
        String str = SMSCodeTools.getSMSCode();

//        if (!userService.existPhone(phone)){
//            return failed("手机号不存在！");
//        }
        if(!smsCodeService.updateSMSCode(str,phone)){
            return failed("你已经申请过验证码，请稍后再试");
        };


        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "****", "***");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "旺旺超市");
        request.putQueryParameter("TemplateCode", "SMS_180347012");
        request.putQueryParameter("TemplateParam", "{'code':'"+str+"'}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }


        return success("短信验证码发送成功！");
    }
}
