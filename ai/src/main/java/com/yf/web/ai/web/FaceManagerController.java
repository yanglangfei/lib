package com.yf.web.ai.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author YangLF
 * @date 2018/1/17
 */
@Controller
public class FaceManagerController {

    @PostMapping("/addFace")
    public  String addFace(MultipartFile multipartFile){


        return "新增成功";
    }

}
