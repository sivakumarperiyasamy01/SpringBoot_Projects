package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Inputboxchange {
	
	
	@GetMapping("/input")
	public String inputvalue(@RequestParam (defaultValue = "siva") String namevalue, Model model) {
		
		model.addAttribute("enteredname",namevalue);
		return "index";
	}
	

}
