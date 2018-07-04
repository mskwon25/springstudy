package com.springstudy.firstdemo.controller;

import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "student";
    }
    
    @GetMapping("/student/register")
    public String addStudent(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("dateOfBirth") String dateOfBirth) {
    	studentService.addStudent(new Student(id, name, dateOfBirth));
        return "redirect:/";
    }
    
    @GetMapping("/student/delete")
    public String removeStudent(@RequestParam("id") int id) {
    	studentService.deleteStudent(id);
    	return "redirect:/";
    }
    
    @GetMapping("/student/get")
    public String getStudent(@RequestParam("id") int id, Model model) {
    	model.addAttribute("student", studentService.getStudentById(id));
    	return "student";
    }
}
