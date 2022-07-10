package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.StudentRegistration;
import com.example.repo.StudentRepo;
import com.example.service.IStudentService;

@Service
public class StudentRegistrationImple implements IStudentService {

	@Autowired
	private StudentRepo repo;
	@Override
	public Integer saveStudent(StudentRegistration s) {
		
		return repo.save(s).getStdId();
	}

	@Override
	public void updateStudent(StudentRegistration s) {
		repo.save(s);
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.findById(id);
	}

	@Override
	public Optional<StudentRegistration> getOneStudent(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<StudentRegistration> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public boolean isStudentExist(Integer id) {
		return repo.existsById(id);
	}

}
