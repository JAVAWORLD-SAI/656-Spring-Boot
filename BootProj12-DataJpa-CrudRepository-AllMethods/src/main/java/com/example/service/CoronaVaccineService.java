package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Entity.CoronaVaccine;

public interface CoronaVaccineService {
	
	public  void Register_No (CoronaVaccine vaccine);
	
	public Iterable<CoronaVaccine> Registration_Vaccine(Iterable<CoronaVaccine> vaccine);
	
	public long GetVaccinetionCount();
	
	public Iterable<CoronaVaccine>fetchAllDetails();
	
	public Iterable<CoronaVaccine>FetchAllDetailsByids(List<Integer> ids);
	
	public Optional<CoronaVaccine>fetchVaccineById(Integer RegNo);

	boolean CheckVaccinationAvaliablityByRegNo(int regno);
	

}
