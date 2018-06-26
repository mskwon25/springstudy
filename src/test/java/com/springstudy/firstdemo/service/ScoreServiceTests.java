package com.springstudy.firstdemo.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springstudy.firstdemo.model.Score;
import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.model.Subject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreServiceTests {

	@Autowired
	private ScoreService scoreService;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private StudentService studentService;

	private Score score1, score2, score3;
	
	@Before
	public void setUp() throws Exception {
		score1 = new Score(1, 1, 1, 30);
		score2 = new Score(2, 1, 2, 30);
		score3 = new Score(3, 2, 1, 40);
	}
	
	@Test
	public void addAndGetScoreTest() {
		Student student1 = new Student(1, "이성경", "900810");
		Student student2 = new Student(2, "이지은", "930516");
        studentService.addStudent(student1);
        studentService.addStudent(student2);
		
		Subject subject1 = new Subject(1, "수학");
		Subject subject2 = new Subject(2, "국어");
		subjectService.addSubject(subject1);
		subjectService.addSubject(subject2);
		
		scoreService.addScore(score1);
		scoreService.addScore(score2);
		scoreService.addScore(score3);
		
		assertThat(scoreService.getScoresByStudentId(1).size(), is(2));
		assertThat(scoreService.getScoresBySubjectId(1).size(), is(2));
		
		assertThat(scoreService.getScoresByStudentId(1).get(0).getId(), is(score1.getId()));
		assertThat(scoreService.getScoresByStudentId(1).get(1).getId(), is(score2.getId()));
		assertThat(scoreService.getScoresBySubjectId(1).get(1).getId(), is(score3.getId()));
	}

	@Test
	public void deleteScoreTest() {
		assertThat(scoreService.getScoresByStudentId(1).size(), is(2));
		scoreService.deleteScoreById(2);
		assertThat(scoreService.getScoresByStudentId(1).size(), is(1));
		
		scoreService.deleteAllScores();
		studentService.deleteAllStudents();
		subjectService.deleteAllSubjects();
		
	}
}
