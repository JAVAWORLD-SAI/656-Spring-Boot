package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.CoronaVaccine;

public interface CoronaVaccineRepo extends CrudRepository<CoronaVaccine, Integer> {

}
