package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ViewSort;
import com.wangwang.shop.bean.ViewSortExample;
import com.wangwang.shop.dao.ViewSortMapper;
import com.wangwang.shop.service.ViewSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewSortServiceImpl implements ViewSortService {

    @Autowired
    ViewSortMapper viewSortMapper;


    public ResultBean<List<ViewSort>> getAllViewSort(){
        ViewSortExample viewSortExample = new ViewSortExample();
        viewSortExample.createCriteria();
        List list = viewSortMapper.selectByExample(viewSortExample);
        return new ResultBean<>(0,"success",list);
    }
}
