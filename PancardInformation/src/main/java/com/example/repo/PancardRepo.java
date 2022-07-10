package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Pancard;

public interface PancardRepo extends JpaRepository<Pancard, Integer> {

}
