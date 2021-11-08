package com.example.beans;

import javax.inject.Named;
// java config annotations invoice annotations but it has imposible to develop entire project as java config annotations
// choose spring annotations 
// java config annotations 
// @name @ inject @ Named @ resource @ postConstruct @ preDestroy
@Named("Java")
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
