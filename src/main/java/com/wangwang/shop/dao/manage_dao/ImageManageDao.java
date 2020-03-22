package com.wangwang.shop.dao.manage_dao;

import com.wangwang.shop.bean.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImageManageDao extends JpaRepository<Images, Long>, JpaSpecificationExecutor {
}
