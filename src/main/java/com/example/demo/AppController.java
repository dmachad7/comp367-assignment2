package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/")
	public String greeting(Model model) {
		model.addAttribute("greeting", "Good morning, Daniel, Welcome to COMP367");
		return "index";
	}
	
}
