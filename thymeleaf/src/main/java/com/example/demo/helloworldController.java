package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloworldController {
	@GetMapping("/hello")
	public String hello(Model model) {
	model.addAttribute("message", "Hello World!");
	return "helloworld";
	}
	}



