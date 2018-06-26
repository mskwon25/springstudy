package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.mapper.SubjectMapper;
import com.springstudy.firstdemo.model.Subject;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class SubjectService {
	
	@Autowired
	private SubjectMapper subjectMapper;
	
	public void addSubject(Subject subject) {
		subjectMapper.registerSubject(subject);
	}
	
	public Subject getSubjectById(int id) {
		return subjectMapper.getSubjectById(id);
	}
	
	public List<Subject> getAllSubjects() {
		return subjectMapper.getAllSubjects();
	}
	
	public void deleteSubjectById(int id) {
		subjectMapper.deleteSubjectById(id);
	}

	public void deleteAllSubjects() {
		subjectMapper.deleteAllSubjects();
	}
}
