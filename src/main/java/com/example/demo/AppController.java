package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;  

@Controller
public class AppController {


	
	@GetMapping("/")
	public String greeting(Model model) {
		getTime();
		model.addAttribute("greeting", getTime() + ", Daniel, Welcome to COMP367");
		return "index";
	}
	
	public String getTime() {
		int now = LocalTime.now().getHour();
		if (now < 12) {
			return "Good morning";
		} else {
			return "Good afternoon";
		}
	}
	
}
