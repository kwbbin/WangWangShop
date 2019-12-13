package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.Ad;
import com.wangwang.shop.bean.AdExample;
import com.wangwang.shop.dao.AdMapper;
import com.wangwang.shop.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    AdMapper adMapper;
    @Override
    public void insertAd(Ad ad) {

    }

    @Override
    public Ad selectAds(Integer adId) {
        AdExample adExample = new AdExample();
        adExample.createCriteria().andAdIdEqualTo(adId);
        List<Ad> list = adMapper.selectByExample(adExample);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
