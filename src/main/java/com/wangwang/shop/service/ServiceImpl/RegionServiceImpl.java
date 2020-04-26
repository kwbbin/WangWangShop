package com.wangwang.shop.service.ServiceImpl;

import com.alibaba.fastjson.JSONObject;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.region.City;
import com.wangwang.shop.bean.region.ResponseEntry;
import com.wangwang.shop.service.RegionService;
import com.wangwang.shop.utils.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegionServiceImpl implements RegionService {

    private String appcode = "125517220c804b7fa6f5328d83715ef0";
    private String method = "GET";

    public List<City> getRegionByGrade(String level, String page, String size){
        String host = "https://api02.aliyun.venuscn.com";
        String path = "/area/all";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("level", level);
        querys.put("page", page);
        querys.put("size", size);


        HttpResponse response = null;
        try {
            response = HttpUtils.doGet(host, path, method, headers, querys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getData(response);
    }

    public List<City> getRegionByFather(String parentId){
            String host = "https://api02.aliyun.venuscn.com";
            String path = "/area/query";
            Map<String, String> headers = new HashMap<String, String>();
            //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
            headers.put("Authorization", "APPCODE " + appcode);
            Map<String, String> querys = new HashMap<String, String>();
            querys.put("parent_id", parentId);


        HttpResponse response = null;
        try {
            response = HttpUtils.doGet(host, path, method, headers, querys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getData(response);
    }

    private List<City> getData(HttpResponse response){
        try {
            JSONObject jsonObject = JSONObject.parseObject(EntityUtils.toString(response.getEntity()));
            ResponseEntry responseEntry = jsonObject.toJavaObject(ResponseEntry.class);
            return responseEntry.getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultBean<List<City>> getProvince(){
        List<City> list = getRegionByGrade("0","1","99");
        ResultBean<List<City>> resultBean = new ResultBean();
        resultBean.setData(list);
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }

    public ResultBean<List<City>> getCitysByFather(String id){
        if(id.contains("=")){
            id=id.replace("=","").trim();
        }
        List<City> list = getRegionByFather(id);
        ResultBean<List<City>> resultBean = new ResultBean();
        resultBean.setData(list);
        resultBean.setCode(0);
        resultBean.setMessage("success");
        return resultBean;
    }

//    public static void main(String[] args) {
//        RegionServiceImpl rsi=new RegionServiceImpl();
//        List<City> list1 = rsi.getRegionByGrade("0","1","50");
//        for (City city :list1){
//            System.out.println(city);
//        }
//        System.out.println(list1);
//        List<City> list2 = rsi.getRegionByFather("424449");
//        System.out.println(list2);
//    }


}
