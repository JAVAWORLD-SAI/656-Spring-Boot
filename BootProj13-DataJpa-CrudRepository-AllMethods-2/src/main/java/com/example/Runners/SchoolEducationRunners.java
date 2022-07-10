package com.example.Runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.example.Entity.SchoolEducation;
import com.example.service.SchoolEducationService;

@Component
public class SchoolEducationRunners implements CommandLineRunner {

	@Autowired
	private SchoolEducationService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
					Iterable<SchoolEducation> SavedColleges=	service.saveColleges(Arrays.asList(new SchoolEducation(1, "Suizit", "Mkr", 1536.30, 453836.5),
																																							new SchoolEducation(2, "zolo", "dj", 16836.30, 53836.5),
																																							new SchoolEducation(3, "uiit", "msd", 0591.30, 3836.5)));
						System.out.println("Saved Colleges");
						SavedColleges.forEach(SchoolEducation -> System.out.println(SavedColleges.getClass()));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		
		try {
							Iterable<SchoolEducation> listofSchools=service.fetchAllColleges();
							listofSchools.forEach(SchoolEducation ->{
								System.out.println(SchoolEducation);
							});
			
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		
		try {
		Iterable<SchoolEducation> listbyid=	service.fetchAllCollegesByid(List.of(1,2,3));
		listbyid.forEach(SchoolEducation -> {
			System.out.println(SchoolEducation);
		});
		}
		catch (DataAccessException e) {
			e.printStackTrace();
		}
		

	}

}
