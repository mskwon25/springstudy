package com.springstudy.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springstudy.firstdemo.model.Score;
import com.springstudy.firstdemo.service.ScoreService;

@Controller
public class ScoreController {

	@Autowired
	ScoreService scoreService;
	
	@GetMapping("/score")
	public String getAllScores(Model model) {
		model.addAttribute("scores", scoreService.getAllScores());
		return "score";
	}

	@GetMapping("/score/add")
	public String addScore(@RequestParam("id") int id, @RequestParam("studentId") int studentId, @RequestParam("subjectId") int subjectId, @RequestParam("score") int score) {
		scoreService.addScore(new Score(id, studentId, subjectId, score));
		return "redirect:/score";
	}
	
	@GetMapping("/score/delete")
	public String deleteScore(@RequestParam("id") int id) {
		scoreService.deleteScoreById(id);
		return "redirect:/score";
	}
	
	@GetMapping("/score/get/stid")
	public String getScoresByStudentId(Model model, @RequestParam("studentId") int studentId) {
		model.addAttribute("scores", scoreService.getScoresByStudentId(studentId));
		return "score";
	}
	
	@GetMapping("/score/get/sjid")
	public String getScoresBySubjectId(Model model, @RequestParam("subjectId") int subjectId) {
		model.addAttribute("scores", scoreService.getScoresBySubjectId(subjectId));
		return "score";
	}
}
