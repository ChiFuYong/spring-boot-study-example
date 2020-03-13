package com.chifuyong.controller;

import com.chifuyong.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class StudentController {

    @RequestMapping("/show")
    public String showInfo(HttpServletRequest request, Model model) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        model.addAttribute("key", new Date());
        return "index";
    }

    @RequestMapping("/show2")
    public String showInfo2(Model model) {
        model.addAttribute("sex", "女");
        model.addAttribute("id", "1");
        return "index2";
    }

    @RequestMapping("/show3")
    public String showInfo3(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "张三", 20));
        list.add(new Student(2, "李四", 22));
        list.add(new Student(3, "王五", 24));
        model.addAttribute("list", list);
        return "index3";
    }

    @RequestMapping("/show4")
    public String showInfo4(Model model) {
        Map<String, Student> map = new HashMap<>();
        map.put("s1", new Student(1, "张三", 20));
        map.put("s2", new Student(2, "李四", 22));
        map.put("s3", new Student(3, "王五", 24));
        model.addAttribute("map", map);
        return "index4";
    }

    @RequestMapping("/show5")
    public String showInfo5(HttpServletRequest request, Model model) {
        request.setAttribute("request", "HttpServletRequest 测试");
        request.getSession().setAttribute("session", "HttpSession 测试");
        request.getSession().getServletContext().setAttribute("application", "Application 测试");
        return "index5";
    }

    @RequestMapping("/{page}")
    public String showInfo(@PathVariable String page, Integer id, String name,Model model) {
        System.out.println(id + "--" + name);
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return page;
    }
}
