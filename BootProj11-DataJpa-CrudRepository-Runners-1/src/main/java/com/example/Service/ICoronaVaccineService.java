package com.example.Service;

import com.example.Entity.CoronaVaccine;

public interface ICoronaVaccineService {
	
	public  String VaccineRegister(CoronaVaccine vaccine);
	
	public Iterable<CoronaVaccine> RegistrationBatch(Iterable<CoronaVaccine> vaccine);

}
