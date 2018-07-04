package com.springstudy.firstdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.springstudy.firstdemo.model.Score;

@Mapper
@Repository
public interface ScoreMapper {
	void registerScore(Score score);
	
	List<Score> getScoresByStudentId(int studentId);
	
	List<Score> getAllScores();
	
	List<Score> getScoresBySubjectId(int subjectId);
	
	void deleteScoreById(int id);
	
	void deleteAllScores();

}
