package com.springstudy.firstdemo.controller;

import com.springstudy.firstdemo.model.Grade;
import com.springstudy.firstdemo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GradeController {

    @Autowired
    GradeService gradeService;
    
    @GetMapping("/grade")
    private String boardList(Model model) throws Exception{
        try {
        	model.addAttribute("list", gradeService.getAllGrades());
            
            return "grade"; 
        }catch (Exception e) {
        	return "redirect:/grade"; 
        }
        
    }
    
    @PostMapping("/insertGrade")
    private String gradeInsertProc(HttpServletRequest request) throws Exception{
    	try {
        	String score = request.getParameter("score");
        	int student_id = Integer.parseInt(request.getParameter("student_id"));
        	int subject_id = Integer.parseInt(request.getParameter("subject_id"));
        	
            Grade grade = new Grade(score, student_id, subject_id);
           
            gradeService.addGrade(grade);
            
            return "redirect:/grade";
    	}catch (Exception e) {
    		return "redirect:/grade"; 
        }
    }
    
    @GetMapping("/insertGradeForm")
    private String gradeInsertForm(Model model) throws Exception{
    	try {
    		model.addAttribute("param", "insertGrade");
            return "insert";
    	}catch (Exception e) {
    		return "redirect:/grade"; 
        }
    }


    @GetMapping("/deleteGrade/{student_id}/{subject_id}")
    private String deleteGrade(@PathVariable int student_id, @PathVariable int subject_id, Model model) throws Exception{
    	try {
    		Grade grade = new Grade(student_id, subject_id);
            gradeService.deleteGrade(grade);
            
            return "redirect:/grade"; 
    	}catch (Exception e) {
    		return "redirect:/grade"; 
        }
    }
}
