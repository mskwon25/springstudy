package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springstudy.firstdemo.service.ProfessorService;

@Controller
public class ProfessorController {
	@Autowired
    ProfessorService professorservice;
	
	@GetMapping("/professor")
	public String professor_main(Model model) {
		System.out.println("professorController");
		//작업 처리후 professor
		return "professor";
	}
}
