package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.Images;
import com.wangwang.shop.service.manage.ImageManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/manage/images")
public class ImageManageController {
    @Autowired
    ImageManageService imageManageService;

    @RequestMapping(value = "/save")
    public String save(@RequestParam(value = "file") MultipartFile file, String id,  HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("id===="+request.getParameter("id"));
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        if(!suffixName.equals(".jpg") && !suffixName.equals(".png")){
            return "请选择图片！！！";
        }
        String filePath = "F://shop//images//goods//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = filePath + fileName;
        Images images = new Images();
        images.setImageDesc("图片");
        images.setImageUrl(filename);
        Images images1 = imageManageService.saveImage(images);
        return images1.getImageId()+"";
    }
}
