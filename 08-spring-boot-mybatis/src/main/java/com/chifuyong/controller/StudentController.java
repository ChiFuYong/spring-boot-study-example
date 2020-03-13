package com.chifuyong.controller;

import com.chifuyong.entity.Student;
import com.chifuyong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, Student student){
        studentService.addStudent(student);
        //请求从定向
        return "redirect:/student/findAllStudents";
    }

    @RequestMapping("/findAllStudents")
    public String showStudents(Model model){
        List<Student> students= studentService.findAllStudent();
        model.addAttribute("list",students);
        return "showAllStudents";
    }

    @RequestMapping("/delete")
    public String delete(int id){
        studentService.deleteStudent(id);
        //请求重定向
        return "redirect:/student/findAllStudents";
    }

    @RequestMapping("/updatePageLoad")
    public String updatePageLoad(int id,Model model){
        //先查找到要修改的学生信息
        Student student = studentService.findStudentByid(id);
        model.addAttribute("student",student);
        return "editStudent";
    }

    @RequestMapping("/update")
    public String update(Student student){
        studentService.update(student);
        //请求重定向
        return "redirect:/student/findAllStudents";
    }

}
