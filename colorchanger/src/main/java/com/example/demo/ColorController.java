package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



// Together: Controller → Model (data) → View (page)

@Controller
public class ColorController {

	@GetMapping("/")
	public String showcolorpicker(@RequestParam(defaultValue = "f1f1f1") String color, Model model) {
		model.addAttribute("selectedcolor", color);
		return "Home";

	}

}
