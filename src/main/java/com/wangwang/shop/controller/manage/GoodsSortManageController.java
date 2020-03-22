package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.GoodsSortOne;
import com.wangwang.shop.bean.GoodsSortTwo;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.SortAll;
import com.wangwang.shop.bean.VO.SortAllVo;
import com.wangwang.shop.dao.default_dao.GoodsSortOneDao;
import com.wangwang.shop.dao.default_dao.GoodsSortTwoDao;
import com.wangwang.shop.service.GoodsSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class GoodsSortManageController {
    @Autowired
    GoodsSortService goodsSortService;

    @Autowired
    GoodsSortOneDao goodsSortOneDao;

    @Autowired
    GoodsSortTwoDao goodsSortTwoDao;

    @RequestMapping("/sortOneAll")
    public ResultBean<GoodsSortOne> getSortOneAll(){
        List<GoodsSortOne> list = goodsSortOneDao.findAll();
        ResultBean<GoodsSortOne> result = new ResultBean(0,"获取成功",list);
        return result;
    }

    /**
     * 根据一级分类id查出相关联的所有二级分类
     * @return
     */
    @RequestMapping("/sortTwoById")
    public ResultBean<List<GoodsSortTwo>> getSortTwoById(@RequestBody GoodsSortOne goodsSortOne){
        return goodsSortService.getAllSortTwoByOneId(goodsSortOne.getGoodsSortOneId());
    }

    /**
     *  type= 1 应该传参一级分类的id，要添加的二级分类的名称
     *  type = 2 应该传入一级分类的名称和二级分类的名称
     * @param sortAll.type 为1是添加二级分类，为2是添加一级分类和二级分类
     * @param sortAll
     * @return
     */
    @RequestMapping("/sortAdd")
    public ResultBean<String> addSrot(@RequestBody SortAllVo sortAll){
        return goodsSortService.addSrot(sortAll);
    }

    @RequestMapping("/Category")
    public ResultBean<List<SortAll>> getSortAll(){
        return goodsSortService.getSortAll();
    }

    /**
     * 修改分类信息，包括一级和二级分类
     * @param sortAll
     * @return
     */
    @RequestMapping("/updateSort")
    public ResultBean<String> updateSortAll(@RequestBody SortAll sortAll){
       return goodsSortService.updateSortAll(sortAll);
    }

    /**
     * 设置热门分类
     * @return
     */
    @RequestMapping("/hotSort")
    public ResultBean<String> setHotSort(@RequestBody SortAll sortAll){
        return goodsSortService.updateSortHot(sortAll.getTwoId());
    }

    /**
     * 根据id查询一级分类
     * @return
     */
    @RequestMapping("/getSortOne")
    public ResultBean<String> getSortOne(){
        return null;
    }

    /**
     * 根据id查询二级分类
     * @return
     */
    @RequestMapping("/getSortTwo")
    public ResultBean<String> getSortTwo(){
        return null;
    }

}
