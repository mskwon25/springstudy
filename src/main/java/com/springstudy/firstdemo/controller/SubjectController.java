package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springstudy.firstdemo.service.SubjectService;

@Controller
public class SubjectController {
	@Autowired
    SubjectService subjectservice;
	
	@GetMapping("/subject")
	public String subject_main(Model model) {
		System.out.println("subjectController");
		//작업 처리후 subject
		return "subject";
	}
}
