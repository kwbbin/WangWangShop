package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.Notice;
import com.wangwang.shop.bean.NoticeExample;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.NoticeVo;
import com.wangwang.shop.dao.NoticeMapper;
import com.wangwang.shop.service.manage.AdminService;
import com.wangwang.shop.service.manage.NoticeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeMapper noticeMapper;

    @Autowired
    AdminService adminService;

    @Override
    public ResultBean<String> saveNotice(Notice notice, HttpServletRequest request) {
        try {
            String token = request.getHeader("token");
            Admin admin = adminService.getAdminByToken(token  );
            if(notice!=null){
                notice.setCreateBy(admin.getAdminId());
                notice.setCreateDate(new Date());
                notice.setState((byte)1);
                noticeMapper.insert(notice);
            }
            return new ResultBean<>(0,"success","成功");
        }catch (Exception e){
            return new ResultBean<>(1,"faile","保存失败");
        }


    }

    @Override
    public ResultBean<List<Notice>> getNotLookNitice() {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.createCriteria().andStateEqualTo((byte)1);
        List<Notice> list = noticeMapper.selectByExample(noticeExample  );
        if (list.size()>0){
            return new ResultBean<>(0,"success",list);
        }
        return new ResultBean<>(0,"success",null);
    }

    @Override
    public ResultBean<List<NoticeVo>> getAllNitice() {
        NoticeExample noticeExample = new NoticeExample();
        List<Notice> list = noticeMapper.selectByExample(noticeExample  );
        List<NoticeVo> listVo = new ArrayList<>();
        for ( Notice notice : list){
            NoticeVo noticeVo = new NoticeVo();
            Admin admin = adminService.getAdminById(notice.getCreateBy());
            BeanUtils.copyProperties(notice,noticeVo,NoticeVo.class);
            noticeVo.setName(admin.getLoginName());
            listVo.add(noticeVo);
        }
        return new ResultBean<>(0,"success",listVo);
    }

    @Override
    public void setState(Notice notice) {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.createCriteria().andStateEqualTo((byte)1);
        noticeMapper.updateByPrimaryKeySelective(notice);
    }

}
