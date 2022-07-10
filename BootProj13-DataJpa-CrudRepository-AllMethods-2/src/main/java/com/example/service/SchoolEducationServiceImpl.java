package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.SchoolEducation;
import com.example.repo.SchoolEducationRepo;

@Service("SchoolEducationService")
public class SchoolEducationServiceImpl implements SchoolEducationService {

	@Autowired
	private SchoolEducationRepo repo;
	
	@Override
	public Iterable<SchoolEducation> saveColleges(Iterable<SchoolEducation> Education) {
								if(Education!=null)
									return repo.saveAll(Education);
								else
									throw new IllegalArgumentException("Data Is not saved");
	} 
	@Override
	public Iterable<SchoolEducation> fetchAllColleges() {
		
		return repo.findAll(); 
	}
	
	@Override
	public Iterable<SchoolEducation> fetchAllCollegesByid (List<Integer	> schoolId) {
		
		return repo.findAllById(schoolId);
	}

}
