package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.CoronaVaccine;

public interface ICoronaVaccine extends CrudRepository<CoronaVaccine, Integer> {

}
