package com.chifuyong.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: chify
 * @Date: 17/12/2019 15:15
 * @Description: 全局异常处理1
 */
@ControllerAdvice
public class GolbalException3 {

    /*
    * 缺点：每个异常都要重新写一个方法，累人
    * */

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMessage",e.toString());
        mv.setViewName("/error3/errorNullPointException");
        return mv;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMessage",e.toString());
        mv.setViewName("/error3/errorArithmeticException");
        return mv;
    }

}
