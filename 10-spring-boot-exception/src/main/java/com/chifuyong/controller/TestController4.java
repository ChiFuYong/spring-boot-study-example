package com.chifuyong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;

/**
 * @Auther: chify
 * @Date: 17/12/2019 12:11
 * @Description: 测试异常
 */
@Controller
public class TestController4 {

    @RequestMapping("/test41")
    public String test() {
        //制造 文件已存在 异常
        throw new FileSystemAlreadyExistsException("");
    }

    @RequestMapping("/test42")
    public String test2() {
        //制造 文件找不到 异常
        throw new FileSystemNotFoundException("");
    }

}
