package com.springstudy.firstdemo.controller;

import com.springstudy.firstdemo.model.Student;
import com.springstudy.firstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    /*@GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        return "student";
    }*/
    
    @GetMapping("/")
    private String boardList(Model model) throws Exception{
        
        model.addAttribute("list", userService.getAllStudents());
        
        return "student"; 
    }
    
    @PostMapping("/insertUser")
    private String userInsertProc(HttpServletRequest request) throws Exception{
    	
    	int user_id = Integer.parseInt(request.getParameter("id"));
    	String user_name = request.getParameter("name");
    	String user_birth = request.getParameter("birth");
    	
        Student student = new Student(user_id, user_name, user_birth);
       
        userService.addStudent(student);
        
        return "redirect:/";
    }
    
    @GetMapping("/insertUserForm")
    private String userInsertForm(Model model) throws Exception{
    	model.addAttribute("param", "insertUser");
        return "insert";
    }


    @GetMapping("/deleteUser/{student_id}")
    private String deleteStudent(@PathVariable int student_id, Model model) throws Exception{
        
        userService.deleteStudent(student_id);
        
        return "redirect:/"; 
    }
}
