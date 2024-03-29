package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	
	public Student() {
		System.out.println("Student.0 param constructor");
	}
	@Autowired
	//@Qualifier("${course.choose}")
	// place holders using only @value annotations not @qualifier
	@Qualifier("course id")
		private  IcouseMaterial material;
	
	public void preparation (String examName)
	{
		System.out.println("Student.preparation()" + examName);
		
		String courseContent=material.CourseContent();
		double price=	material.price();
		
		System.out.println("PREPARRATION IS GOING ON  USING" +courseContent+ "WITH PRICE "+price);
		System.out.println("PREPARATION IS COMPLETED "+ examName);
	}

}
