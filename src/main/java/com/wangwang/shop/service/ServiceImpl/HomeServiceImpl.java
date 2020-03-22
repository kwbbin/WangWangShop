package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.HotViewHome;
import com.wangwang.shop.bean.HotViewHomeExample;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.HomeViewVo;
import com.wangwang.shop.dao.HotViewHomeMapper;
import com.wangwang.shop.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    HotViewHomeMapper hotViewHomeMapper;


    @Override
    public ResultBean<List<HomeViewVo>> getHomeView() {
        HotViewHomeExample hotViewHomeExample = new HotViewHomeExample();
        List<HotViewHome> list = hotViewHomeMapper.selectByExample(hotViewHomeExample);
        List<HomeViewVo> listHomeViewVo = new ArrayList<>();
        String strName="";
        int num=1;
        List<HotViewHome> listData = new ArrayList<>();
        for (HotViewHome hvh : list){
            if(!strName.equals(hvh.getSortOneName())){
                strName = hvh.getSortOneName();
                HomeViewVo homeViewVo = new HomeViewVo();
                homeViewVo.setNum(num);
                homeViewVo.setName(strName);
                listHomeViewVo.add(homeViewVo);
                num++;
            }
        }

        for (HomeViewVo homeViewVo : listHomeViewVo){
            List<HotViewHome> list1=new ArrayList<>();
            for (HotViewHome hvh : list){
                if(homeViewVo.getName().equals(hvh.getSortOneName())){
                    String s = hvh.getImageUrl();
                    if(s.contains("/")){
                        s=s.substring(s.lastIndexOf("/"));
                    }
                    hvh.setImageUrl(s);
                    list1.add(hvh);

                }
            }
            homeViewVo.setList(list1);
        }


        ResultBean<List<HomeViewVo>> resultBean= new ResultBean<>();
        resultBean.setMessage("获取数据成功");
        resultBean.setCode(0);
        resultBean.setData(listHomeViewVo);
        return resultBean;
    }
}
