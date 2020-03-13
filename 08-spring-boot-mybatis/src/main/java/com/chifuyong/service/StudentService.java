package com.chifuyong.service;

import com.chifuyong.entity.Student;

import java.util.List;

public interface StudentService {
    /*
    * 添加学生信息
    * */
    public void addStudent(Student student);
    /*
    * 查询所有学生信息
    * */
    public List<Student> findAllStudent();
    /*
     * 删除学生信息
     * */
    public void deleteStudent(int id);
    /*
    * 通过id查询某个学生信息
    * */
    public Student findStudentByid(int id);
    /*
    * 更新学生信息
    * */
    public void update(Student student);
}
