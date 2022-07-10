package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Pancard;
import com.example.service.PancardService;

@Controller
@RequestMapping("/Pancard")
public class PancardController {
	@Autowired
	private PancardService service;
	
	@GetMapping("/register")
	public String registerpancard() {
		return "Register";
	}
	
	@PostMapping("/save")
	public String savepancard(@ModelAttribute Pancard pancard , 
			Model model)
	{
		Integer id=service.savepancard(pancard);
		String Message="pancard '"+id+"' is saved";
	  model.addAttribute(Message, Message);
		return "Register";
	}

}
