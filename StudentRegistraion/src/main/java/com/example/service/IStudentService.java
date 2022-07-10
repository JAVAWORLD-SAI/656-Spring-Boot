package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Model.StudentRegistration;

public interface IStudentService {
	

	public Integer saveStudent(StudentRegistration s);
	public void updateStudent(StudentRegistration s);
	public void deleteStudent(Integer id);
	public Optional<StudentRegistration> getOneStudent(Integer id);
	public List<StudentRegistration> getAllStudent();
	public boolean isStudentExist(Integer id);


}
