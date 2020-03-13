package com.chifuyong.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: chify
 * @Date: 17/12/2019 16:00
 * @Description: 全局异常3
 */
@Configuration
public class GolbalException5 implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        if (ex instanceof ArrayIndexOutOfBoundsException){
            mv.setViewName("/error5/errorArrayIndexOutOfBoundsException");

        }
        if (ex instanceof ArrayStoreException ){
            mv.setViewName("/error5/errorArrayStoreException");
        }
        mv.addObject("errorMessage",ex.toString());
        return mv;
    }
}
