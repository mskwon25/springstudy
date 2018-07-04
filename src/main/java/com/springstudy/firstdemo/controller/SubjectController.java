package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.service.SubjectService;

@Controller
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/subject")
	public String getAllSubjects(Model model) {
		model.addAttribute("subjects", subjectService.getAllSubjects());
		return "subject";
	}
	
	@GetMapping("/subject/add")
	public String addSubject(@RequestParam("id") int id, @RequestParam("name") String name) {
		subjectService.addSubject(new Subject(id, name));
		return "redirect:/subject";
	}
	
	@GetMapping("/subject/delete")
	public String deleteSubject(@RequestParam("id") int id) {
		subjectService.deleteSubjectById(id);
		return "redirect:/subject";
	}
	
	@GetMapping("/subject/get")
	public String getSubject(@RequestParam("id") int id, Model model) {
		model.addAttribute("subject", subjectService.getSubjectById(id));
		return "subject";
	}
}
