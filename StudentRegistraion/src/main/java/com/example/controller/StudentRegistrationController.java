package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.StudentRegistration;
import com.example.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentRegistrationController {
	
	@Autowired
	private IStudentService service;
	@GetMapping("/register")
	public String showReg(Model model)
	{
		//Form Backing Object
		model.addAttribute("student", new StudentRegistration());
		return "StudentRegister";
	}
	
	//2. Save Student
	@PostMapping("/save")
	public String save(
			@ModelAttribute StudentRegistration student,
			Model model) 
	{
		Integer id = service.saveStudent(student);
		model.addAttribute("message", "Student '"+id+"' saved");
		//clear form
		model.addAttribute("student", new StudentRegistration());
		return "StudentRegister";
	}
	
	@GetMapping("/all")
	public String showAll(Model model) {
		List<StudentRegistration> list = service.getAllStudent();
		model.addAttribute("list", list);
		return "StudentData";
	}
	
		@GetMapping("/delete")
		public String delete(
				@RequestParam Integer id,
				Model model)
		{
			/** 
			service.deleteStudent(id);
			List<StudentRegistration> message=service.getAllStudent();
			model.addAttribute("message", message);
			model.addAttribute("Student Deleted");
			return "StudentData";
		}
		**/
			
			String message=null;
			if(service.isStudentExist(id)) {
				service.deleteStudent(id);
				message = "Student '"+id+"' Deleted";
				System.out.println("deleted id  2" + id);
			}else {
				message = "Student '"+id+"' not exist";
				System.out.println("deleted id  3" + id);
			}
			model.addAttribute("message", message);
			//fetch latest table data
			List<StudentRegistration> list = service.getAllStudent();
			model.addAttribute("list", list);
			//send to UI
			return "StudentData";
		}
		
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Integer id,
			Model model) 
	{
		String page = null;
		Optional<StudentRegistration> opt = service.getOneStudent(id);
		
		if(opt.isPresent()) {
			//if exist--goto edit page
			model.addAttribute("student", opt.get());
			page = "StudentEdit";
		}else { 
			//given id not exist in DB
			page ="redirect:all";
		}
		return page;
	}
	
	@PostMapping("/update")
	public String update(
			@ModelAttribute StudentRegistration student
			) 
	{
		service.updateStudent(student);
		return "redirect:all";
	}

}
