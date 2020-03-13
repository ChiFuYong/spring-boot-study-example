package com.chifuyong.controller;

import com.chifuyong.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/showStudentDetial")
    public String showPersonDetial(Model model){
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("001","测试1",20,"男"));
        studentsList.add(new Student("002","测试2",21,"女"));
        studentsList.add(new Student("003","测试3",22,"男"));
        studentsList.add(new Student("004","测试4",24,"男"));
        model.addAttribute("studentlist",studentsList);
        //请求转发到别的页面
        return "showStudentDetial";
    }
}
