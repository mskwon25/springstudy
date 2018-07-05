package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.ProfMapper;
import com.springstudy.firstdemo.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ProfessorService {

    @Autowired
    ProfMapper profMapper;

    public void addProfessor(Professor professor) {
        profMapper.registerProfessor(professor);
    }

    public Professor getProfessorById(int professorId) {
        return profMapper.getProfessorById(professorId);
    }

    public List<Professor> getAllProfessors() {
        return profMapper.getAllProfessors();
    }

    public void deleteProfessor(int professorId) {
        profMapper.deleteProfessorById(professorId);
    }

    public void deleteAllProfessors() {
        profMapper.deleteAllProfessors();
    }
}
