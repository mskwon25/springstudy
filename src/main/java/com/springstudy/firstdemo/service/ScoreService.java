package com.springstudy.firstdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstudy.firstdemo.mapper.ScoreMapper;
import com.springstudy.firstdemo.model.Score;

@Service
public class ScoreService {

	@Autowired
	private ScoreMapper scoreMapper;

	public void addScore(Score score) {
		scoreMapper.registerScore(score);
	}

	public List<Score> getAllScores(){
		return scoreMapper.getAllScores();
	}
	
	public List<Score> getScoresByStudentId(int studentId){
		return scoreMapper.getScoresByStudentId(studentId);
	}

	public List<Score> getScoresBySubjectId(int subjectId){
		return scoreMapper.getScoresBySubjectId(subjectId);
	}

	public void deleteScoreById(int id) {
		scoreMapper.deleteScoreById(id);
	}

	public void deleteAllScores() {
		scoreMapper.deleteAllScores();
	}







}
