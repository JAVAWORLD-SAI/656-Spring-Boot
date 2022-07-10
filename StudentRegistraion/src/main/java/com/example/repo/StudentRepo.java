package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.StudentRegistration;

public interface StudentRepo extends JpaRepository<StudentRegistration, Integer> {

}
