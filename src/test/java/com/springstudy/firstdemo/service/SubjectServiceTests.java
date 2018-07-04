package com.springstudy.firstdemo.service;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springstudy.firstdemo.model.Subject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectServiceTests {

	@Autowired
	SubjectService subjectService;
	
	@Before
	public void setUp() throws Exception {
		subjectService.deleteAllSubjects();
	}
	
	@Test
	public void addAndGetSubjectTest() {
		Subject subject1 = new Subject(1, "수학");
		Subject subject2 = new Subject(2, "국어");
		
		subjectService.addSubject(subject1);
		subjectService.addSubject(subject2);
		assertThat(subjectService.getAllSubjects().size(), is(2));
		
		Subject subjectGet1 = subjectService.getSubjectById(1);
		assertThat(subjectGet1.getName(), is(subject1.getName()));
		
		Subject subjectGet2 = subjectService.getSubjectById(2);
		assertThat(subjectGet2.getName(), is(subject2.getName()));
	}
	
	@Test
	public void deleteSubjectTest() {
		Subject subject1 = new Subject(1, "수학");
		Subject subject2 = new Subject(2, "국어");
		Subject subject3 = new Subject(3, "영어");

		subjectService.addSubject(subject1);
		subjectService.addSubject(subject2);
		subjectService.addSubject(subject3);
		assertThat(subjectService.getAllSubjects().size(), is(3));
		
		subjectService.deleteSubjectById(2);
		assertThat(subjectService.getAllSubjects().size(), is(2));
		
		Subject subjectGet1 = subjectService.getSubjectById(2);
		assertTrue(subjectGet1==null);
	}

}
