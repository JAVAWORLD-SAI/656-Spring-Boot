package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CoronaVaccine;
import com.example.Repo.CoronaVaccineRepo;

@Service
public class CoronaVaccineServiceImple implements CoronaVaccineService {

	@Autowired
	private CoronaVaccineRepo repo;
	
	@Override
	public void Register_No(CoronaVaccine vaccine) {
		
		System.out.println(repo.getClass());;
	}
	@Override
	public Iterable<CoronaVaccine> Registration_Vaccine(Iterable<CoronaVaccine> vaccine) {
		if(vaccine!=null)
		return repo.saveAll(vaccine);
		else throw new IllegalArgumentException("batch insertion failed");
	}

	@Override
	public long GetVaccinetionCount() {
		return repo.count();
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		return repo.findAll();
	}
		@Override
		public Iterable<CoronaVaccine> FetchAllDetailsByids(List<Integer> ids) {
			return repo.findAllById(ids);
		}
		@Override
		public Optional<CoronaVaccine> fetchVaccineById(Integer RegNo) {
			return repo.findById(RegNo);
		}
		@Override
		public boolean CheckVaccinationAvaliablityByRegNo(int regno) {
			return repo.existsById(regno);
		}
	
}
