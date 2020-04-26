package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.GoodsImagesVo;
import com.wangwang.shop.dao.GoodsImagesMapper;
import com.wangwang.shop.dao.GoodsMapper;
import com.wangwang.shop.dao.GoodsSortTwoMapper;
import com.wangwang.shop.dao.default_dao.GoodsSortAllDao;
import com.wangwang.shop.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsSortAllDao goodsSortAllDao;

    @Autowired
    GoodsImagesMapper goodsImagesMapper;

    @Autowired
    GoodsSortTwoMapper goodsSortTwoMapper;


    @Override
    public ResultBean<Goods> getGoodsById(Long id) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsIdEqualTo(id);
        Goods goods = goodsMapper.selectByExample(goodsExample).get(0);
        ResultBean<Goods> resultBean=new ResultBean<>();
        resultBean.setData(goods);
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }

    @Override
    public ResultBean<SortAll> getSortAllByGoodsId(Long id) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsIdEqualTo(id);
        Goods goods = goodsMapper.selectByExample(goodsExample).get(0);
        SortAll sortAll = goodsSortAllDao.findSortAllByTwoId(goods.getGoodsSortId());
        ResultBean<SortAll> resultBean = new ResultBean<>();
        resultBean.setData(sortAll);
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }

    @Override
    public ResultBean<List<GoodsImagesVo>> getGoodsByIds(Long[] ids) {
        List<GoodsImagesVo> listVo = new ArrayList<>();
        for(int i=0; i<ids.length;i++){
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(ids[i]);
            List<GoodsImages> list = goodsImagesMapper.selectByExample(goodsImagesExample);
            List<GoodsImages> list1 =new ArrayList<>();
            for(GoodsImages goodsImages: list){
                String str=goodsImages.getImageUrl();
                if(goodsImages.getImageUrl().contains("/")){
                    str=str.substring(str.lastIndexOf("/"));
                }
                goodsImages.setImageUrl(str);
                list1.add(goodsImages);
            }

            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andGoodsIdEqualTo(ids[i]);
            Goods goods = goodsMapper.selectByExample(goodsExample).get(0);
            GoodsImagesVo goodsImagesVo  =  new GoodsImagesVo();

            BeanUtils.copyProperties(goods,goodsImagesVo);
            goodsImagesVo.setList(list1);
            listVo.add(goodsImagesVo);
        }
        ResultBean<List<GoodsImagesVo>> resultBean = new ResultBean<>();
        resultBean.setData(listVo);
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }


    @Override
    public ResultBean<List<GoodsImages>> getImagesByGoodsId(Long id) {
        GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
        goodsImagesExample.createCriteria().andGoodsIdEqualTo(id);
        List<GoodsImages> list = new ArrayList<>();
        list = goodsImagesMapper.selectByExample(goodsImagesExample);
        for (GoodsImages goodsImages: list) {
            String str=goodsImages.getImageUrl();;
            if(goodsImages.getImageUrl().contains("/")){
                str=str.substring(str.lastIndexOf("/"));
            }
            goodsImages.setImageUrl(str);
        }
        ResultBean<List<GoodsImages>> resultBean = new ResultBean<>();
        resultBean.setMessage("success");
        resultBean.setCode(0);
        resultBean.setData(list);
        return resultBean;
    }

    @Override
    public ResultBean<GoodsImages> getImageByGoodsId(GoodsImages goodsImages) {
        GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
        goodsImagesExample.createCriteria().andGoodsIdEqualTo(goodsImages.getGoodsId());
        GoodsImages goodsImages1 = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
        String str=goodsImages1.getImageUrl();;
        if(goodsImages1.getImageUrl().contains("/")){
            str=str.substring(str.lastIndexOf("/"));
        }
        goodsImages1.setImageUrl(str);
        ResultBean<GoodsImages> resultBean = new ResultBean<>();
        resultBean.setMessage("success");
        resultBean.setCode(0);
        resultBean.setData(goodsImages1);
        return resultBean;
    }

    @Override
    public ResultBean<String> getCategoryNameById(Integer id) {
        String name;
        GoodsSortTwo goodsSortTwo =goodsSortTwoMapper.selectByPrimaryKey(id);
        if (goodsSortTwo!=null){
            name = goodsSortTwo.getSortName();
        }else {
            name="";
        }
        return new ResultBean<>(0,"success",name);
    }

    @Override
    public ResultBean<List<GoodsImagesVo>> getCategoryGoodsByCId(Integer id) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsSortIdEqualTo(id  );
        List<Goods> list = goodsMapper.selectByExample(goodsExample);
        List<GoodsImagesVo> listVo = new ArrayList<>();
        for (Goods goods : list){
            GoodsImagesVo goodsImagesVo = new GoodsImagesVo();
            BeanUtils.copyProperties(goods,goodsImagesVo,GoodsImagesVo.class);
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
            GoodsImages goodsImages1 = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
            String str=goodsImages1.getImageUrl();;
            if(goodsImages1.getImageUrl().contains("/")){
                str=str.substring(str.lastIndexOf("/"));
            }
            goodsImagesVo.setImageUrl(str);
            listVo.add(goodsImagesVo  );
        }


        return new ResultBean<>(0,"success",listVo);
    }


    public ResultBean<List<GoodsImagesVo>> searchGoods(String str){

//        通过名称查找
        List<Goods> lastList = new ArrayList<>();
        List<GoodsImagesVo> listVo = new ArrayList<>();
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andNameLike("%"+str+"%");
        List<Goods> list1 = goodsMapper.selectByExample(goodsExample);
        if(list1 == null||list1.size()==0){
//            通过商品描述查询
            GoodsExample goodsExample1 = new GoodsExample();
            goodsExample1.createCriteria().andGoodsDescLike("%"+str+"%");
            List<Goods> list2 = goodsMapper.selectByExample(goodsExample);

            if(list2 == null || list2.size() == 0){
                //        查找分类
                List<Goods> list3 = new ArrayList<>();
                GoodsSortTwoExample goodsSortTwoExample = new GoodsSortTwoExample();
                goodsSortTwoExample.createCriteria().andSortNameLike("%"+str+"%"    );
                List<GoodsSortTwo> listSort = goodsSortTwoMapper.selectByExample(goodsSortTwoExample);
                for (GoodsSortTwo goodsSortTwo  : listSort){
                    GoodsExample goodsExample2 = new GoodsExample();
                    goodsExample2.createCriteria().andGoodsSortIdEqualTo(goodsSortTwo.getGoodsSortTwoId());
                    List<Goods> goods = goodsMapper.selectByExample(goodsExample2   );
                    list3.addAll(goods  );
                }
                lastList = list3;
            }else {
                lastList = list2;
            }
        }else{
            lastList = list1;
        }

        for (Goods goods : lastList){
            GoodsImagesVo goodsImagesVo = new GoodsImagesVo();
            BeanUtils.copyProperties(goods,goodsImagesVo,GoodsImagesVo.class);
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
            GoodsImages goodsImages1 = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
            String s=goodsImages1.getImageUrl();;
            if(goodsImages1.getImageUrl().contains("/")){
                s=s.substring(s.lastIndexOf("/"));
            }
            goodsImagesVo.setImageUrl(s);
            listVo.add(goodsImagesVo    );
        }

        return new ResultBean<>(0,"success",listVo  );
    }

    @Override
    public ResultBean<List<GoodsImagesVo>> guessUserLove() {
        List<Goods> goods = goodsMapper.selectByExample(new GoodsExample());
        Collections.shuffle(goods);
        List<Goods> goods1 = new ArrayList<>();
        List<GoodsImagesVo> listVo = new ArrayList<>();
        int i=0;
        for(Goods gd : goods){
            i++;
            if(i<=6)
            goods1.add(gd);
        }

        for (Goods gd : goods1){
            GoodsImagesVo goodsImagesVo = new GoodsImagesVo();
            BeanUtils.copyProperties(gd,goodsImagesVo,GoodsImagesVo.class);
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(gd.getGoodsId());
            GoodsImages goodsImages1 = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
            String s=goodsImages1.getImageUrl();;
            if(goodsImages1.getImageUrl().contains("/")){
                s=s.substring(s.lastIndexOf("/"));
            }
            goodsImagesVo.setImageUrl(s);
            listVo.add(goodsImagesVo    );
        }

        return new ResultBean<>(0,"success",listVo);
    }



}