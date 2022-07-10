package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Model.Address;
import com.example.service.IAddressService;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private IAddressService service;
	
	@GetMapping("/register")
	public String registerAddress( @ModelAttribute Address add,
			Model model) 
	{
		model.addAttribute("Address", new Address());
		return  "Address";
		
	}
	@PostMapping("/save")
	public String saveAddress(@ModelAttribute Address add ,
			Model model) {
		Integer id=service.saveAdress(add);
		String Message="Address is "+id+" is saves";
		model.addAttribute("Address", new Address());
		model.addAttribute("Message", Message);
		return "Address";
	}
	
}
