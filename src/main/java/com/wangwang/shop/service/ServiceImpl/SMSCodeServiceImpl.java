package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.SMSCode;
import com.wangwang.shop.dao.SMSCodeMapper;
import com.wangwang.shop.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    SMSCodeMapper smsCodeMapper;

    @Override
    public void insertSMSCode(String code, String phone) {
        SMSCode smsCode = new SMSCode();
        smsCode.setCode(code);
        smsCode.setPhone(phone);
        smsCode.setDate(new Date());
        smsCodeMapper.insert(smsCode);
    }
}
