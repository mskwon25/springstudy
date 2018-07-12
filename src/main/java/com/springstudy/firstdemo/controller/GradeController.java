package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstudy.firstdemo.model.Grade;
import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.service.GradeService;
import com.springstudy.firstdemo.service.ProfessorService;

@Controller
public class GradeController {
	@Autowired
    GradeService gradeService;
	
	@RequestMapping(value="/gradeView/add",method=RequestMethod.POST)
	public String addGrade(Grade grade) {
		gradeService.addGrade(grade);
		return "redirect:/gradeView";
	}
	
	@RequestMapping(value="/gradeView", method=RequestMethod.GET)
	public String getAllGrades(Model model) { 
		// Model객체 : 컨트롤러에서 뷰로 전환할 때 데이터를 가지고 있는 객체, 컨트롤러가 뷰로 model 객체를 넘겨 뷰에서 model 객체의 데이터 이용 가능
		model.addAttribute("gradeList", gradeService.getAllGrades());
		System.out.println("Gradelist 사이즈 : " + gradeService.getAllGrades().size());
		return "gradeView";
	}
	
	@RequestMapping(value="/gradeView/deleteByNum", method=RequestMethod.POST)
	public String deleteProfessor(Grade grade) {
		gradeService.deleteGrade(grade.getGrade_num());
		return "redirect:/gradeView";
	}
	
	@RequestMapping(value="/gradeView/getGradeByStudentId", method=RequestMethod.GET)
	public String getGradeByStudentId(Grade grade, Model model) {
		model.addAttribute("gradeGetByStudentId", gradeService.getGradeByStudentId(grade.getGrade_student_id()));
		return "gradeView";
	}
	
	@RequestMapping(value="/gradeView/getGradeBySubjectId", method=RequestMethod.GET)
	public String getGradeBySubjectId(Grade grade, Model model) {
		model.addAttribute("gradeBySubjectId", gradeService.getGradeBySubjectId(grade.getGrade_sub_id()));
		return "gradeView";
	}
}
