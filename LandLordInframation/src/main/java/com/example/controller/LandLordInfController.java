package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.ILandlordService;
import com.example.model.LandLordinf;

@Controller
@RequestMapping("/Landlord")
public class LandLordInfController {
	@Autowired
	private ILandlordService service; //HAS-A

	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("Landlord", new LandLordinf());
		return "LandLord";
	}
	
	@PostMapping("/save")
	public String savelandlord( @ModelAttribute LandLordinf landload,
			Model model)
	{
		Integer id=service.saveLandLord(landload);
		String Message = "Landload "+id+" is Saved";
		model.addAttribute(Message, Message);
		return"LandLord";
	}
}