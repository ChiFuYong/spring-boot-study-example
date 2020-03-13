package com.chifuyong.mapper;


import com.chifuyong.entity.Student;

import java.util.List;

public interface StudentMapper {

    public void insertStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(int id);

    public List<Student> selectAllStudent();

    public Student selectStudentById(int id);
}
