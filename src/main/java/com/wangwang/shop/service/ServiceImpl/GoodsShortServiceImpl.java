package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.SortAllVo;
import com.wangwang.shop.dao.default_dao.GoodsSortAllDao;
import com.wangwang.shop.dao.default_dao.GoodsSortOneDao;
import com.wangwang.shop.dao.default_dao.GoodsSortOneTwoDao;
import com.wangwang.shop.dao.default_dao.GoodsSortTwoDao;
import com.wangwang.shop.service.GoodsSortService;
import com.wangwang.shop.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GoodsShortServiceImpl implements GoodsSortService {

    @Autowired
    GoodsSortOneDao goodsSortOneDao;

    @Autowired
    GoodsSortTwoDao goodsSortTwoDao;

    @Autowired
    GoodsSortOneTwoDao goodsSortOneTwoDao;

    @Autowired
    GoodsSortAllDao goodsSortAllDao;

    public ResultBean<Map<String, List<String>>> getGoodsSortAll(){
        List<SortAll> gsAll = goodsSortAllDao.findAll();
        List<String> list = new ArrayList();
        Map<String, List<String>> map = new LinkedHashMap<>();
        Set set = new HashSet();
        String item="";

        //转换数据格式
        for (SortAll sa : gsAll){
            set.add(sa.getSortOne());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String sortOne = it.next();
            for (SortAll sa : gsAll){
                if(sa.getSortOne() == sortOne){
                    list.add(sa.getSortTwo());
                }
            }
            List<String> list1 = StringUtils.copyList(list);
            map.put(sortOne,list1);
        }

        ResultBean<Map<String, List<String>>> resultBean = new ResultBean(0,"请求成功！",map);

        return resultBean;
    }

    @Override
    public ResultBean<String> addSrot(SortAllVo sortAll) {
        ResultBean<String> resultBean = new ResultBean<>();
        System.out.println(sortAll);
        //只添加二级分类
        if ("1".equals(sortAll.getType())){
            if(sortAll.getSortTwo() == null){
                resultBean.setMessage("请传入参数sortTwo");
                resultBean.setCode(1);
                return resultBean;
            }
            if(sortAll.getOneId() == null||sortAll.getOneId() ==0){
                resultBean.setMessage("请传入参数oneId");
                resultBean.setCode(1);
                return resultBean;
            }
            GoodsSortTwo gst = new GoodsSortTwo();
            gst.setSortName(sortAll.getSortTwo());
            gst.setState((byte)0);
            GoodsSortTwo goodsSortTwo = goodsSortTwoDao.saveAndFlush(gst);

            GoodsSortOneTwo oneTwo = new GoodsSortOneTwo();
            oneTwo.setGoodsSortOneId(sortAll.getOneId());
            oneTwo.setGoodSortTwoId(goodsSortTwo.getGoodsSortTwoId());
            goodsSortOneTwoDao.saveAndFlush(oneTwo);
        }else if("2".equals(sortAll.getType())){
            //添加一级分类和二级分类
            if(sortAll.getSortTwo() == null){
                resultBean.setMessage("请传入参数sortTwo");
                resultBean.setCode(1);
                return resultBean;
            }
            if(sortAll.getSortOne() == null){
                resultBean.setMessage("请传入参数sortOne");
                resultBean.setCode(1);
                return resultBean;
            }
            GoodsSortTwo gst = new GoodsSortTwo();
            gst.setSortName(sortAll.getSortTwo());
            gst.setState((byte) 0);
            GoodsSortTwo goodsSortTwo = goodsSortTwoDao.save(gst);

            GoodsSortOne gso = new GoodsSortOne();
            gso.setSortName(sortAll.getSortOne());
            gso.setState((byte) 0);
            GoodsSortOne goodsSortOne = goodsSortOneDao.save(gso);

            GoodsSortOneTwo oneTwo = new GoodsSortOneTwo();
            oneTwo.setGoodsSortOneId(goodsSortOne.getGoodsSortOneId());
            oneTwo.setGoodSortTwoId(goodsSortTwo.getGoodsSortTwoId());
            goodsSortOneTwoDao.save(oneTwo);
        }else {
            resultBean.setMessage("请传入正确的参数Type");
            resultBean.setCode(1);
            return resultBean;
        }

        resultBean.setMessage("添加分类成功");
        resultBean.setCode(0);
        return resultBean;
    }

    @Override
    public ResultBean<List<SortAll>> getSortAll() {
        ResultBean<List<SortAll>> resultBean = new ResultBean<>();
        List<SortAll> list = goodsSortAllDao.findAll();
        resultBean.setData(list);
        resultBean.setCode(0);
        resultBean.setMessage("查询成功");
        return resultBean;
    }

    public ResultBean<String> updateSortAll(SortAll sortAll){
        ResultBean<String> resultBean = new ResultBean<>();
        if(sortAll.getTwoId()==null && sortAll.getOneId() == null){
            resultBean.setMessage("请填写id");
            resultBean.setCode(1);
            return resultBean;
        }else if(sortAll.getSortOne() == null && sortAll.getSortTwo() == null){
            resultBean.setMessage("请填写分类名称");
            resultBean.setCode(1);
            return resultBean;
        }
        if(sortAll.getSortOne() != null && sortAll.getOneId() != null){
            GoodsSortOne goodsSortOne = goodsSortOneDao.getByGoodsSortOneId(sortAll.getOneId());
            goodsSortOne.setSortName(sortAll.getSortOne());
            goodsSortOneDao.save(goodsSortOne);
        }
        if(sortAll.getSortTwo() != null && sortAll.getTwoId() != null){
            GoodsSortTwo goodsSortTwo = goodsSortTwoDao.findByGoodsSortTwoId(sortAll.getTwoId());
            goodsSortTwo.setSortName(sortAll.getSortTwo());
            goodsSortTwoDao.save(goodsSortTwo);
        }
        resultBean.setMessage("修改成功");
        resultBean.setCode(0);
        return resultBean;

    }

    @Override
    public ResultBean updateSortHot(Integer id) {
        ResultBean<String> resultBean = new ResultBean<>();
        GoodsSortTwo goodsSortTwo = goodsSortTwoDao.findByGoodsSortTwoId(id);
        if(goodsSortTwo.getHotNum() == 0)
            goodsSortTwo.setHotNum(1);
        else
            goodsSortTwo.setHotNum(0);
        goodsSortTwoDao.save(goodsSortTwo);
        resultBean.setMessage("修改成功");
        resultBean.setCode(0);
        return resultBean;
    }

    ;
}
