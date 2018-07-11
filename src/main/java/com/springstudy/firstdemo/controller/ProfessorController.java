package com.springstudy.firstdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.service.ProfessorService;

@Controller
public class ProfessorController {
	@Autowired
    ProfessorService professorservice;
	
	@GetMapping("/professorView")
	public String professor_main(Model model) {
		System.out.println("professorController");
		//작업 처리후 professor
		return "professorView";
	}
	
	@RequestMapping(value="/professorView/add",method=RequestMethod.GET)
	public String addProfessor(Professor professor) {
		int prof_num=professor.getProf_num();
		String prof_name=professor.getProf_name();
		String prof_sub=professor.getProf_sub();
		String prof_birthday=professor.getProf_birthday();
		System.out.println(prof_num+prof_name+prof_sub+prof_birthday);
		Professor profAddInstance = new Professor(professor);
		professorservice.addProfessor(profAddInstance);
		return "redirect:/professorView";
	}
}
