package com.chifuyong.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: chify
 * @Date: 17/12/2019 12:11
 * @Description: 测试异常
 */
@Controller
public class TestController3 {

    @RequestMapping("/test31")
    public String test(){
        //制造空指针异常
        String str = null ;
        str.length();
        return "index";
    }

    @RequestMapping("/test32")
    public String test2(){
        //制造除零异常
        int a = 1/0;
        return "index";
    }


}
