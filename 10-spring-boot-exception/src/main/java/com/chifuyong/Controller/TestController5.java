package com.chifuyong.Controller;


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
public class TestController5 {

    @RequestMapping("/test51")
    public String test() {
        //制造 数据越界 异常
        throw new ArrayIndexOutOfBoundsException("");
    }

    @RequestMapping("/test52")
    public String test2() {
        //制造 数据存储 异常
        throw new ArrayStoreException("");
    }

}
