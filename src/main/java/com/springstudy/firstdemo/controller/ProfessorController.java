package com.springstudy.firstdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.service.ProfessorService;

@Controller
public class ProfessorController {
	@Autowired
    ProfessorService professorService;
	
	@RequestMapping(value="/professorView/add",method=RequestMethod.POST)
	public String addProfessor(Professor professor) {
		professorService.addProfessor(professor);
		return "redirect:/professorView";
	}
	
	@RequestMapping(value="/professorView", method=RequestMethod.GET)
	public String getAllProfessors(Model model) { 
		// Model객체 : 컨트롤러에서 뷰로 전환할 때 데이터를 가지고 있는 객체, 컨트롤러가 뷰로 model 객체를 넘겨 뷰에서 model 객체의 데이터 이용 가능
		model.addAttribute("professorList", professorService.getAllProfessors());
		System.out.println("list 사이즈 : " + professorService.getAllProfessors().size());
		return "professorView";
	}
	
	@RequestMapping(value="/professorView/deleteByNum", method=RequestMethod.POST)
	public String deleteProfessor(Professor professor) {
		professorService.deleteProfessor(professor.getProf_num());
		return "redirect:/professorView";
	}
	
	@RequestMapping(value="/professorView/getById", method=RequestMethod.GET)
	public String getProfessor(Professor professor, Model model) {
		model.addAttribute("professorGetById", professorService.getProfessorById(professor.getProf_num()));
		return "professorView";
	}
}
