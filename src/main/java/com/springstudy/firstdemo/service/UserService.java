package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.UserMapper;
import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void addStudent(Student student) {
        userMapper.registerStudent(student);
    }

    public Student getStudentById(int studentId) {
        return userMapper.getStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return userMapper.getAllStudents();
    }

    public void deleteStudent(int studentId) {
        userMapper.deleteStudentById(studentId);
    }

    public void deleteAllStudents() {
        userMapper.deleteAllStudents();
    }
    
    ///과목 추가
    public void addSubject(Subject subject) {
        userMapper.registerSubject(subject);
    }

    public Subject getSubjectById(int subjectId) {
        return userMapper.getSubjectById(subjectId);
    }

    public List<Subject> getAllSubjects() {
        return userMapper.getAllSubjects();
    }

    public void deleteSubject(int subjectId) {
        userMapper.deleteSubjectById(subjectId);
    }

    public void deleteAllSubjects() {
        userMapper.deleteAllSubjects();
    }
    
    //교수 추가
    public void addProfessor(Professor professor) {
        userMapper.registerProfessor(professor);
    }

    public Professor getProfessorById(int professorId) {
        return userMapper.getProfessorById(professorId);
    }

    public List<Professor> getAllProfessors() {
        return userMapper.getAllProfessors();
    }

    public void deleteProfessor(int professorId) {
        userMapper.deleteProfessorById(professorId);
    }

    public void deleteAllProfessors() {
        userMapper.deleteAllProfessors();
    }

}
