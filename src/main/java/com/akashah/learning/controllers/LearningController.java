package com.akashah.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LearningController {
	
	@RequestMapping("/")
	public String index() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/m/{Part1}/{Part2}/{Part3}")

	public String Routes(Model model,@PathVariable("Part1") String part1, @PathVariable("Part2") String part2, @PathVariable("Part3") String part3) {
		System.out.println("Got here");
		if (part1.equals("38") && part2.equals("0553") && part3.equals("0733")){
			String content = "Setting up your servers";
			model.addAttribute("content",content);
			return "lesson.jsp";
		}
		
		else if (part1.equals("38") && part2.equals("0483") && part3.equals("0345")) {
			String content = "Coding Forms";
			model.addAttribute("content",content);
			return "assignment.jsp";
		}
		
		else if (part1.equals("38") && part2.equals("0553") && part3.equals("0342")) {
			String content = "Punch Cards";
			model.addAttribute("content",content);
			return "lesson.jsp";
		}
		
		else if (part1.equals("26") && part2.equals("0553") && part3.equals("0348")) {
			String content = "Advanced Fortran Intro";
			model.addAttribute("content",content);
			return "assignment.jsp";
		}
		
		else if (part1.equals("26") && part2.equals("0483") && part3.equals("2342")) {
			String content = "Fortran to Binary";
			model.addAttribute("content",content);
			return "assignment.jsp";
		}
		else {
			return "home.jsp";
		}
		
	}
}
