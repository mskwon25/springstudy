package com.springstudy.firstdemo.controller;

import com.springstudy.firstdemo.model.Subject;
import com.springstudy.firstdemo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SubjectController {

    @Autowired
    SubjectService subjectService;
    
    @GetMapping("/subject")
    private String boardList(Model model) throws Exception{
        try {
        	 model.addAttribute("list", subjectService.getAllSubjects());
             
             return "subject"; 
        }catch (Exception e) {
    		return "redirect:/subject"; 
        }
    }
    
    @PostMapping("/insertSubject")
    private String subjectInsertProc(HttpServletRequest request) throws Exception{
    	try {
    		int subject_id = Integer.parseInt(request.getParameter("id"));
        	String subject_name = request.getParameter("name");
        	int professor_id = Integer.parseInt(request.getParameter("professor_id"));
        	
            Subject subject = new Subject(subject_id, subject_name, professor_id);
           
            subjectService.addSubject(subject);
            
            return "redirect:/subject";
        }catch (Exception e) {
    		return "redirect:/subject"; 
        }
    }
    
    @GetMapping("/insertSubjectForm")
    private String subjectInsertForm(Model model) throws Exception{
    	try {
    		model.addAttribute("param", "insertSubject");
            return "insert";
        }catch (Exception e) {
    		return "redirect:/subject"; 
        }
    }


    @GetMapping("/deleteSubject/{subject_id}")
    private String deleteSubject(@PathVariable int subject_id, Model model) throws Exception{
    	try {
    		subjectService.deleteSubject(subject_id);
            
            return "redirect:/subject"; 
        }catch (Exception e) {
    		return "redirect:/subject"; 
        }
    }
}
