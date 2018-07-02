package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.model.Professor;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    
	//학생
	void registerStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    void deleteStudentById(int id);

    void deleteAllStudents();

    
    //과목
	void registerSubject(Subject subject);
	
	Subject getSubjectById(int id);

    List<Subject> getAllSubjects();

    void deleteSubjectById(int id);

    void deleteAllSubjects();
    
    //교수
	void registerProfessor(Professor professor);
	
	Professor getProfessorById(int id);

    List<Professor> getAllProfessors();

    void deleteProfessorById(int id);

    void deleteAllProfessors();
}
