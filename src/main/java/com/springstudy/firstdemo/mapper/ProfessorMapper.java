package com.springstudy.firstdemo.mapper;

import com.springstudy.firstdemo.model.Professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface ProfessorMapper {
	void registerProfessor(Professor professor);
	
	Professor getProfessorById(int id);
	
	List<Professor> getAllProfessors();
	
	void deleteProfessorById(int id);
	
	void deleteAllProfessors();
}
