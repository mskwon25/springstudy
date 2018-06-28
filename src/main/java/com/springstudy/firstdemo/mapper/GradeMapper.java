package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GradeMapper {
    void registerGrade(Grade Grade);

    Grade getGradeById(int id);

    List<Grade> getAllGrades();

    void deleteGradeById(int id);

    void deleteAllGrades();
}
