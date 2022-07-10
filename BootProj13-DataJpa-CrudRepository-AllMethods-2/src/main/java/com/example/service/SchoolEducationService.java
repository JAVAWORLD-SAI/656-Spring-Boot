package com.example.service;

import java.util.List;

import com.example.Entity.SchoolEducation;

public interface SchoolEducationService {
	
	public Iterable<SchoolEducation> saveColleges(Iterable<SchoolEducation> Education);
	
	public Iterable<SchoolEducation> fetchAllColleges();
	
	public  Iterable<SchoolEducation> fetchAllCollegesByid(List<Integer> schoolId);
	
	

}
