package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
    StudentService studentService;
	
	@RequestMapping(value="/studentView/add",method=RequestMethod.POST)
	public String addStudent(Student student) {
		studentService.addStudent(student);
		return "redirect:/studentView";
	}
	
	@RequestMapping(value="/studentView", method=RequestMethod.GET)
	public String getAllStudents(Model model) { 
		// Model객체 : 컨트롤러에서 뷰로 전환할 때 데이터를 가지고 있는 객체, 컨트롤러가 뷰로 model 객체를 넘겨 뷰에서 model 객체의 데이터 이용 가능
		model.addAttribute("studentList", studentService.getAllStudents());
		System.out.println("studentlist 사이즈 : " + studentService.getAllStudents().size());
		return "studentView";
	}
	
	@RequestMapping(value="/studentView/deleteById", method=RequestMethod.POST)
	public String deleteStudent(Student student) {
		studentService.deleteStudent(student.getStudent_id());
		return "redirect:/studentView";
	}
	
	@RequestMapping(value="/studentView/getById", method=RequestMethod.GET)
	public String getStudent(Student student, Model model) {
		model.addAttribute("studentGetById", studentService.getStudentById(student.getStudent_id()));
		return "studentView";
	}
}
