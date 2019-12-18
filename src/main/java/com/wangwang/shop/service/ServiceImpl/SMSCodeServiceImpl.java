package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.SMSCode;
import com.wangwang.shop.bean.SMSCodeExample;
import com.wangwang.shop.dao.SMSCodeMapper;
import com.wangwang.shop.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    SMSCodeMapper smsCodeMapper;

    @Override
    public boolean updateSMSCode(String code, String phone) {

        SMSCodeExample smsCodeExample = new SMSCodeExample();
        smsCodeExample.createCriteria().andPhoneEqualTo(phone);
        /** 验证数据库是否存在该手机号验证码记录 */
        List<SMSCode> list = smsCodeMapper.selectByExample(smsCodeExample);

        if (list.size()>0){
            /** 存在该手机的数据，执行修改 */
            SMSCode smsCode = list.get(0);
            Date date1 = smsCode.getDate();
            Date date2 = new Date(date1.getTime()+5*60*1000);
            Date date3 = new Date();
            if (date3.after(date2)){
                /**  已经五分钟之后，可以发送验证码 */
                SMSCode smsCode1 = new SMSCode();
                smsCode1.setDate(new Date());
                smsCode1.setCode(code);
                smsCodeMapper.updateByExampleSelective(smsCode1,smsCodeExample);
                return true;
            }
            return false;

        }else {
            /** 不存在该手机的数据，执行插入 */
            SMSCode smsCode = new SMSCode();
            smsCode.setCode(code);
            smsCode.setPhone(phone);
            smsCode.setDate(new Date());
            smsCodeMapper.insert(smsCode);
        }

        return true;
    }



}
