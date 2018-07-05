package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AllServiceTests {

    @Autowired
    StudentService userService;
    @Autowired
    ProfessorService profService;
    SubjectService subservice;
    GradeService gradeservice;

    @Before
    public void setUp() throws Exception {
        userService.deleteAllStudents();
    }

    @Test
    public void addAndGetStudentTest() {
        Student student1 = new Student(1, "이성경", "900811");
        Student student2 = new Student(2, "이지은", "930517");

        userService.addStudent(student1);
        userService.addStudent(student2);
        assertThat(userService.getAllStudents().size(), is(2));

        Student studentGet1 = userService.getStudentById(1);
        assertThat(studentGet1.getStudent_name(), is(student1.getStudent_name()));

        Student studentGet2 = userService.getStudentById(2);
        assertThat(studentGet2.getStudent_name(), is(student2.getStudent_name()));
    }

    @Test
    public void deleteStudentTest() {
        Student student1 = new Student(1, "최진현", "900810");
        Student student2 = new Student(2, "이지은", "930516");
        Student student3 = new Student(3, "김사랑", "780112");

        userService.addStudent(student1);
        userService.addStudent(student2);
        userService.addStudent(student3);
        assertThat(userService.getAllStudents().size(), is(3));

        userService.deleteStudent(2);
        assertThat(userService.getAllStudents().size(), is(2));

        Student studentGet1 = userService.getStudentById(2);
        assertTrue(studentGet1 == null);
        
        
    }
    @Test
    public void addAndGetAndDeleteProfService() {
    	
    	profService.deleteAllProfessors();
    	Professor prof1 = new Professor(1, "교수1", "880312","컴퓨터");
    	Professor prof2 = new Professor(2, "교수2", "880313","수학");
    	Professor prof3 = new Professor(3, "교수3", "880314","과학");
    	
    	profService.addProfessor(prof1);
    	profService.addProfessor(prof2);
    	profService.addProfessor(prof3);
    	assertThat(profService.getAllProfessors().size(), is(3));
    	
    	profService.deleteProfessor(2);
    	assertThat(profService.getAllProfessors().size(), is(2));
    	
    	Professor profGet1 = profService.getProfessorById(2);
    	assertTrue(profGet1 == null);
    	
    	Professor profGet2 = profService.getProfessorById(1);
    	assertThat(profGet2.getProf_name(), is(profGet2.getProf_name()));
    }
}
