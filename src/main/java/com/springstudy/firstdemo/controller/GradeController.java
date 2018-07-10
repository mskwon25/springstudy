package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springstudy.firstdemo.model.Grade;
import com.springstudy.firstdemo.service.GradeService;

@Controller
public class GradeController {
	@Autowired
    GradeService gradeservice;
	
	@GetMapping("/grade")
	public String grade_main(Grade grade) {
		System.out.println("grade");
		//작업 처리후 grade
		return "gradeView";
	}
}
