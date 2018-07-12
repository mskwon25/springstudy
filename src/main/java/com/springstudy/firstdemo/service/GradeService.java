package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.GradeMapper;
import com.springstudy.firstdemo.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class GradeService {

    @Autowired
    GradeMapper gradeMapper;

    public void addGrade(Grade grade) {
        gradeMapper.registerGrade(grade);
    }

    public Grade getGradeByStudentId(int gradeStudentId) {
        return gradeMapper.getGradeByStudentId(gradeStudentId);
    }
    
    public Grade getGradeBySubjectId(int gradeStudentId) {
        return gradeMapper.getGradeBySubjectId(gradeStudentId);
    }

    public List<Grade> getAllGrades() {
        return gradeMapper.getAllGrades();
    }

    public void deleteGrade(int gradeId) {
        gradeMapper.deleteGradeById(gradeId);
    }

    public void deleteAllGrades() {
        gradeMapper.deleteAllGrades();
    }
}
