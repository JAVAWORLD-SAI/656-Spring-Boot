package com.example.beans;

import javax.inject.Named;

@Named("Ui")
public class UiCourseMaterial implements IcouseMaterial {
	
	public UiCourseMaterial() {
		System.out.println("UiCourseMaterial. 0 param Constructor");
	}

	@Override
	public String CourseContent() {
		  System.out.println("UiCourseMaterial.CourseContent()");
		return "1. Html 2.Css 3. Angular 10";
	}

	@Override
	public double price() {
		System.out.println("UiCourseMaterial.price()");
		return 1000;
	}

}
