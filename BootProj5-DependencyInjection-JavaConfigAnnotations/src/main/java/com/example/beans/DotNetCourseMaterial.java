package com.example.beans;

import javax.inject.Named;

@Named("dotNet")
public class DotNetCourseMaterial implements IcouseMaterial {
	
	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial. 0 param Constructor");
	}

	@Override
	public String CourseContent() {
		  System.out.println("DotNetCourseMaterial.CourseContent()");
		return "1. Dot Net 2.Dot Net Exp 3. Dot  Net Method";
	}

	@Override
	public double price() {
		System.out.println("DotNetCourseMaterial.price()");
		return 4000;
	}

}
