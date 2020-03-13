package com.chifuyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
* 文件上传Controller
* */
@Controller
public class FileUpLoadController {

    @RequestMapping("/fileUploadController")
    @ResponseBody
    public Map<String,Object> fileUpLoad(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("/home/guan/cstudy/"+file.getOriginalFilename()));
        Map<String, Object> map = new HashMap<>();
        map.put("status", "上传成功");
        return map;
    }
}
