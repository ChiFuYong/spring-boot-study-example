package com.chifuyong.controller;

import com.chifuyong.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    /*
     * 页面跳转
     * */
    @RequestMapping("/{page}")
    public String page(@PathVariable(value = "page") String page){
        return page;
    }

    @RequestMapping("/add")
    public ModelAndView add(@Valid Student student, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        if (bindingResult.hasErrors()){
            for (ObjectError error :bindingResult.getAllErrors()){
                System.out.println(error.getDefaultMessage());
            }
            mv.setViewName("index");
            mv.addObject("resultMessage","数据校验失败");
            mv.addObject("allErrors",bindingResult.getAllErrors());
            mv.addObject("student",student);
        }else {
            mv.setViewName("success");
            mv.addObject("resultMessage","校验成功");
        }
        return mv;
    }

}


