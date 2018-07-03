package com.springstudy.firstdemo.controller;

import com.springstudy.firstdemo.model.Professor;
import com.springstudy.firstdemo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProfessorController {

    @Autowired
    ProfessorService professorService;
    
    @GetMapping("/professor")
    private String boardList(Model model) throws Exception{
        
        model.addAttribute("list", professorService.getAllProfessors());
        
        return "professor"; 
    }
    
    @PostMapping("/insertProfessor")
    private String professorInsertProc(HttpServletRequest request) throws Exception{
    	
    	int professor_id = Integer.parseInt(request.getParameter("id"));
    	String professor_name = request.getParameter("name");
    	String professor_birth = request.getParameter("birth");
    	
        Professor professor = new Professor(professor_id, professor_name, professor_birth);
       
        professorService.addProfessor(professor);
        
        return "redirect:/professor";
    }
    
    @GetMapping("/insertProfessorForm")
    private String professorInsertForm(Model model) throws Exception{
    	model.addAttribute("param", "insertProfessor");
        return "insert";
    }


    @GetMapping("/deleteProfessor/{professor_id}")
    private String deleteProfessor(@PathVariable int professor_id, Model model) throws Exception{
        
        professorService.deleteProfessor(professor_id);
        
        return "redirect:/professor"; 
    }
}
