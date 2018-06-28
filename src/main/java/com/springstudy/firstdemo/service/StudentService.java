package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.StudentMapper;
import com.springstudy.firstdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public void addStudent(Student student) {
        studentMapper.registerStudent(student);
    }

    public Student getStudentById(int studentId) {
        return studentMapper.getStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    public void deleteStudent(int studentId) {
        studentMapper.deleteStudentById(studentId);
    }

    public void deleteAllStudents() {
        studentMapper.deleteAllStudents();
    }
}
