package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.ProfessorMapper;
import com.springstudy.firstdemo.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorMapper professorMapper;
	
	public void addProfessor(Professor professor) {
		professorMapper.registerProfessor(professor);
	}
	
	public Professor getProfessorById(int id) {
		return professorMapper.getProfessorById(id);
	}
	
	public List<Professor> getAllProfessors(){
		return professorMapper.getAllProfessors();
	}
	
	public void deleteProfessorById(int id) {
		professorMapper.deleteProfessorById(id);
	}
	
	public void deleteAllProfessors() {
		professorMapper.deleteAllProfessors();
	}

}