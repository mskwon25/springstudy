package com.springstudy.firstdemo.service;

import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.model.Professor;

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
public class UserServiceTests {

    @Autowired
    UserService userService;
    
    @Before
    public void setUp() throws Exception {
        userService.deleteAllStudents();
        userService.deleteAllSubjects();
        userService.deleteAllProfessors();
        
        
    }
    
//학생
    
    @Test
    public void addAndGetStudentTest() {
        Student student1 = new Student(1, "이성경", "900810");
        Student student2 = new Student(2, "이지은", "930516");

        userService.addStudent(student1);
        userService.addStudent(student2);
        assertThat(userService.getAllStudents().size(), is(2));

        Student studentGet1 = userService.getStudentById(1);
        assertThat(studentGet1.getName(), is(student1.getName()));

        Student studentGet2 = userService.getStudentById(2);
        assertThat(studentGet2.getName(), is(student2.getName()));
    }

    @Test
    public void deleteStudentTest() {
        Student student1 = new Student(1, "이성경", "900810");
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
    
    
// 과목

    @Test
    public void addAndGetSubjectTest() {
        Subject subject1 = new Subject(1, "컴퓨터네트워크");
        Subject subject2 = new Subject(2, "데이타베이스");
        Subject subject3 = new Subject(3, "미적분학");

        userService.addSubject(subject1);
        userService.addSubject(subject2);
        userService.addSubject(subject3);
        assertThat(userService.getAllSubjects().size(), is(3));

        Subject subjectGet1 = userService.getSubjectById(1);
        assertThat(subjectGet1.getName(), is(subject1.getName()));

        Subject subjectGet2 = userService.getSubjectById(2);
        assertThat(subjectGet2.getName(), is(subject2.getName()));
        
        Subject subjectGet3 = userService.getSubjectById(3);
        assertThat(subjectGet3.getName(), is(subject3.getName()));
    }

    @Test
    public void deleteSubjectTest() {
        Subject subject1 = new Subject(1, "컴퓨터네트워크");
        Subject subject2 = new Subject(2, "데이타베이스");
        Subject subject3 = new Subject(3, "미적분학");
        Subject subject4 = new Subject(4, "인공지능");

        userService.addSubject(subject1);
        userService.addSubject(subject2);
        userService.addSubject(subject3);
        userService.addSubject(subject4);
        assertThat(userService.getAllSubjects().size(), is(4));

        userService.deleteSubject(2);
        assertThat(userService.getAllSubjects().size(), is(3));

        Subject subjectGet1 = userService.getSubjectById(2);
        assertTrue(subjectGet1 == null);
    }
 
    


    @Test
    public void addAndGetProfessorTest() {
    	Professor professor1 = new Professor(1, "김성철", "671119",1);
    	Professor professor2 = new Professor(2, "송병호", "660205", 2);
    	Professor professor3 = new Professor(3, "박현주", "790503", 3);

        userService.addProfessor(professor1);
        userService.addProfessor(professor2);
        userService.addProfessor(professor3);
        assertThat(userService.getAllProfessors().size(), is(3));

        Professor professorGet1 = userService.getProfessorById(1);
        assertThat(professorGet1.getName(), is(professor1.getName()));

        Professor professorGet2 = userService.getProfessorById(2);
        assertThat(professorGet2.getName(), is(professor2.getName()));
        
        Professor professorGet3 = userService.getProfessorById(3);
        assertThat(professorGet3.getName(), is(professor3.getName()));
    }

    @Test
    public void deleteProfessorTest() {
    	Professor professor1 = new Professor(1, "김성철", "671119",1);
    	Professor professor2 = new Professor(2, "송병호", "660205", 2);
    	Professor professor3 = new Professor(3, "박현주", "790503", 3);
    	Professor professor4 = new Professor(4, "김영준", "670308", 4);

        userService.addProfessor(professor1);
        userService.addProfessor(professor2);
        userService.addProfessor(professor3);
        userService.addProfessor(professor4);
        assertThat(userService.getAllProfessors().size(), is(4));

        userService.deleteProfessor(2);
        assertThat(userService.getAllProfessors().size(), is(3));

        Professor professorGet1 = userService.getProfessorById(2);
        assertTrue(professorGet1 == null);
    }
}
