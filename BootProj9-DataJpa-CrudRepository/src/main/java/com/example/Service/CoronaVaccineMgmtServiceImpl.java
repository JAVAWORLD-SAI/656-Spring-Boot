package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CoronaVaccine;
import com.example.repo.CoronaVaccineRepo;

@Service("CoronaVaccineService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	
	@Autowired
	private CoronaVaccineRepo repo;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine savedVaccine=null;
			if(vaccine!=null)
		savedVaccine=repo.save(vaccine);
		return savedVaccine!=null?"Vaccine Registered Successfully with"+savedVaccine.getRegNo():"vacccine Register Failed";
		

	}
}
