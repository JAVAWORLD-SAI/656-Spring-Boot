package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CoronaVaccine;
import com.example.repo.ICoronaVaccine;

@Service("CoronaVaccineImple")
public class CoronaVaccineImplementation implements ICoronaVaccineService {

	@Autowired
	private  ICoronaVaccine repo;
	
	@SuppressWarnings("unused")
	@Override
	public String VaccineRegister(CoronaVaccine vaccine) {
				CoronaVaccine savedCorona=null;
				if(savedCorona!=null)
					savedCorona= repo.save(vaccine);
					return  savedCorona!=null?"vaccine Register successfull with"+savedCorona.getRegNo():"vaccine Registration Failed";
	}

	@Override
	public Iterable<CoronaVaccine> RegistrationBatch(Iterable<CoronaVaccine> vaccine) {
		if(vaccine!=null)
		return repo.saveAll(vaccine);
		else throw new IllegalArgumentException("batch insertion failed");
	
	}

}
