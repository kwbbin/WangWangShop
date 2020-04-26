package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.SortAllVo;
import com.wangwang.shop.dao.ViewSortMapper;
import com.wangwang.shop.dao.default_dao.GoodsSortAllDao;
import com.wangwang.shop.dao.default_dao.GoodsSortOneDao;
import com.wangwang.shop.dao.default_dao.GoodsSortOneTwoDao;
import com.wangwang.shop.dao.default_dao.GoodsSortTwoDao;
import com.wangwang.shop.service.GoodsSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GoodsSortServiceImpl implements GoodsSortService {

    @Autowired
    GoodsSortOneDao goodsSortOneDao;

    @Autowired
    GoodsSortTwoDao goodsSortTwoDao;

    @Autowired
    GoodsSortOneTwoDao goodsSortOneTwoDao;

    @Autowired
    GoodsSortAllDao goodsSortAllDao;


    @Autowired
    ViewSortMapper viewSortMapper;

    public ResultBean<Map<String, List<String>>> getGoodsSortAll(){
        List<SortAll> gsAll = goodsSortAllDao.findAll();
        Map<String, List<String>> map = new LinkedHashMap<>();
        Set set = new HashSet();
        String item="";

        //转换数据格式
        for (SortAll sa : gsAll){
            set.add(sa.getSortOne());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            List list = new ArrayList();
            String sortOne = it.next();
            for (SortAll sa : gsAll){
                if(sa.getSortOne().equals(sortOne) ){
                    list.add(sa.getSortTwo());
                }
            }
            map.put(sortOne,list);
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

    public ResultBean<List<GoodsSortTwo>> getAllSortTwoByOneId(Integer id){
        ResultBean<List<GoodsSortTwo>> resultBean = new ResultBean<>();
        List<GoodsSortOneTwo> list = goodsSortOneTwoDao.getAllByGoodsSortOneId(id);
        List<Integer> li = new ArrayList();
        for (GoodsSortOneTwo goodsSortOneTwo : list){
            li.add(goodsSortOneTwo.getGoodSortTwoId());
        }
        List<GoodsSortTwo> list2 =new ArrayList<>();
        for (Integer num : li){
            GoodsSortTwo goodsSortTwo = goodsSortTwoDao.findByGoodsSortTwoId(num);
            list2.add(goodsSortTwo);
            System.out.println(goodsSortTwo);
        }
        resultBean.setMessage("查询成功");
        resultBean.setCode(0);
        resultBean.setData(list2);
        return resultBean;
    }

    @Override
    public ResultBean<Map<String, List<SortAll>>> getSortAllDetail() {
        List<SortAll> gsAll = goodsSortAllDao.findAll();
        Map<String, List<GoodsSortTwo>> map = new LinkedHashMap<>();
        Set set = new HashSet();
        String item="";

        //转换数据格式
        for (SortAll sa : gsAll){
            set.add(sa.getSortOne());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            List list = new ArrayList();
            String sortOne = it.next();
            for (SortAll sa : gsAll){
                if(sa.getSortOne().equals(sortOne) ){
                    list.add(sa);
                }
            }
            map.put(sortOne,list);
        }

        ResultBean<Map<String, List<SortAll>>> resultBean = new ResultBean(0,"请求成功！",map);
        return resultBean;
    }

    @Override
    public ResultBean<List<ViewSort>> getAllViewSort() {
        List<ViewSort> list = viewSortMapper.selectByExample(new ViewSortExample());
        return new ResultBean<>(0,"success",list);
    }

    @Override
    public ResultBean<List<GoodsSortOne>> getAllSortOneNotInViewSort() {
        List<GoodsSortOne> listOne = goodsSortOneDao.findAll();
        List<ViewSort> listVS = viewSortMapper.selectByExample(new ViewSortExample());
        List<GoodsSortOne> l = new ArrayList<>();
        for(ViewSort vs :listVS){
            for (GoodsSortOne gso :listOne){
                if(gso.getGoodsSortOneId() ==vs.getGoodsSortOne()){
                    l.add(gso);
                }
            }
        }
        for(GoodsSortOne gs : l){
            listOne.remove(gs);
        }
        return new ResultBean<List<GoodsSortOne>>(0,"success",listOne);
    }

    @Override
    public ResultBean<String> addViewSort(ViewSort viewSort) {
        GoodsSortOne goodsSortOne = goodsSortOneDao.getByGoodsSortOneId(viewSort.getGoodsSortOne());
        viewSort.setViewName(goodsSortOne.getSortName());
        viewSortMapper.insert(viewSort);
        return new ResultBean<>(0,"success","添加成功");
    }

    @Override
    public ResultBean<String> removeViewSortById(Integer id) {
        viewSortMapper.deleteByPrimaryKey(id);
        return new ResultBean<>(0,"success","删除成功");
    }


}
