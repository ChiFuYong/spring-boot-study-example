package com.chifuyong.controller;


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
public class TestController2 {

    @RequestMapping("/test21")
    public String test(){
        //制造空指针异常
        String str = null ;
        str.length();
        return "index";
    }

    @RequestMapping("/test22")
    public String test2(){
        //制造除零异常
        int a = 1/0;
        return "index";
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMessage",e.toString());
        mv.setViewName("/error2/errorNullPointException");
        return mv;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMessage",e.toString());
        mv.setViewName("/error2/errorArithmeticException");
        return mv;
    }


}
