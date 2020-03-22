package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Images;
import com.wangwang.shop.dao.manage_dao.ImageManageDao;
import com.wangwang.shop.service.manage.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageManageServiceImpl implements ImageManageService {
    @Autowired
    ImageManageDao imageManageDao;

    @Override
    public Images saveImage(Images images) {
        Images images1 = imageManageDao.save(images);
        return images1;
    }
}
