package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.service.SubjectService;

@Controller
public class SubjectController {
	@Autowired
    SubjectService subjectService;
	
	@RequestMapping(value="/subjectView/add",method=RequestMethod.POST)
	public String addSubject(Subject subject) {
		subjectService.addSubject(subject);
		return "redirect:/subjectView";
	}
	
	@RequestMapping(value="/subjectView", method=RequestMethod.GET)
	public String getAllSubjects(Model model) { 
		// Model객체 : 컨트롤러에서 뷰로 전환할 때 데이터를 가지고 있는 객체, 컨트롤러가 뷰로 model 객체를 넘겨 뷰에서 model 객체의 데이터 이용 가능
		model.addAttribute("subjectList", subjectService.getAllSubjects());
		System.out.println("subjectlist 사이즈 : " + subjectService.getAllSubjects().size());
		return "subjectView";
	}
	
	@RequestMapping(value="/subjectView/deleteById", method=RequestMethod.POST)
	public String deleteSubject(Subject subject) {
		subjectService.deleteSubject(subject.getsub_id());
		return "redirect:/subjectView";
	}
	
	@RequestMapping(value="/subjectView/getById", method=RequestMethod.GET)
	public String getSubject(Subject subject, Model model) {
		model.addAttribute("subjectGetById", subjectService.getSubjectById(subject.getsub_id()));
		return "subjectView";
	}
}
