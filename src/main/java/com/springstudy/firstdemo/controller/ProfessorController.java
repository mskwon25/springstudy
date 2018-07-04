package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.service.ProfessorService;

@Controller
public class ProfessorController {

	@Autowired
	ProfessorService professorService;
	
	@GetMapping("/professor")
	public String getAllProfessors(Model model) {
		model.addAttribute("professors", professorService.getAllProfessors());
		return "professor";
	}
	
	@GetMapping("/professor/add")
	public String addProfessor(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("dateOfBirth") String dateOfBirth, @RequestParam("nameOfSubject") String nameOfSubject) {
		professorService.addProfessor(new Professor(id, name, dateOfBirth, nameOfSubject));
		return "redirect:/professor";
	}
	
	@GetMapping("/professor/delete")
	public String deleteProfessor(@RequestParam("id") int id) {
		professorService.deleteProfessorById(id);
		return "redirect:/professor";
	}
	
	@GetMapping("/professor/get")
	public String getProfessor(@RequestParam("id") int id, Model model) {
		model.addAttribute("professor", professorService.getProfessorById(id));
		return "professor";
	}
}
