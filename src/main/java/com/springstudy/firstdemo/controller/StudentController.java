package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springstudy.firstdemo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
    StudentService studentservice;
	
	@GetMapping("/student")
	public String student_main(Model model) {
		System.out.println("studentController");
		//작업 처리후 student
		return "student";
	}
}
