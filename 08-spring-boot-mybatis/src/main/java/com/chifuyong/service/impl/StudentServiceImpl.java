package com.chifuyong.service.impl;

import com.chifuyong.entity.Student;
import com.chifuyong.mapper.StudentMapper;
import com.chifuyong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    /*
    * 新增学生信息
    * */
    @Override
    public void addStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public Student findStudentByid(int id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.updateStudent(student);
    }
}
