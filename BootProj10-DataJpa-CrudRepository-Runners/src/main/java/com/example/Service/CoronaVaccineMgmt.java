package com.example.Service;

import com.example.Entity.CoronaVaccine;

public interface CoronaVaccineMgmt {
	
	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable <CoronaVaccine> registerBatch(Iterable<CoronaVaccine> Vaccine);

}
