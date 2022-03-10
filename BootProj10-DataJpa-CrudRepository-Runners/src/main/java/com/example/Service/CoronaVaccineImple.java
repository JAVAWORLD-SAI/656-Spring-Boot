package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CoronaVaccine;
import com.example.repo.CoronaVaccineRepo;

@Service("CoronaVaccineImple")
public class CoronaVaccineImple implements CoronaVaccineMgmt {
	@Autowired
	private CoronaVaccineRepo repo;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine savedVaccine= null;
		if(vaccine!=null)
		savedVaccine=repo.save(vaccine);
		return savedVaccine!=null?"Vaccine Register Successfully With"+savedVaccine.getRegNo():"Vaccine Register Failed";
	}

	@Override
	public Iterable<CoronaVaccine> registerBatch(Iterable<CoronaVaccine> Vaccine) {
		if(Vaccine!=null)
		return repo.saveAll(Vaccine);
		else
			throw new IllegalArgumentException("Batch insertion is not");
	}

}
