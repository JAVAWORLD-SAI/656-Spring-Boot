package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
@Primary
public class JavaCourseMaterial implements IcouseMaterial {
	
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial. 0 param Constructor");
	}

	@Override
	public String CourseContent() {
		  System.out.println("JavaCourseMaterial.CourseContent()");
		return "1. oops 2. Exception Handling 3. metods";
	}

	@Override
	public double price() {
		System.out.println("JavaCourseMaterial.price()");
		return 50000;
	}

}
