 package com.example.Service;

import java.util.List;

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
	
	  @Override
	  public List<CoronaVaccine> findBydose(Integer dose) { return
	  repo.findByDose(dose); }
	  
	  
	
	  @Override
	   public List<CoronaVaccine> findByname(String name) { 
	  return
	  repo.findByName(name);
	   }
	 
	  
	
	  @Override 
	  public List<CoronaVaccine> findBypriceLessThan(Double price) { 
		  
	  return repo.findBypriceLessThan(price);
	  }
	 @Override
	public List<CoronaVaccine> findBypriceGreaterThan(Double price) {
		// TODO Auto-generated method stub
		return repo.findBypriceGreaterThan(price);
	}
	 
	 @Override
	public List<CoronaVaccine> findBypriceLessThanEqual(Double price) {
		// TODO Auto-generated method stub
		return repo.findBypriceLessThanEqual(price);
	}
	/*
	 * @Override public List<CoronaVaccine> findByNameIsNull(String name) { // TODO
	 * Auto-generated method stub return repo.findByNameIsNull(name); }
	 */
	 
	 @Override
	public List<CoronaVaccine> findByNameLike(String initChars) {
		// TODO Auto-generated method stub
		return repo.findByNameLike(initChars);
	}
@Override
public List<CoronaVaccine> findBypriceBetween(Double startprice, Double endprice) {
	// TODO Auto-generated method stub
	return  repo.findBypriceBetween(startprice, endprice);
}
@Override
	public List<CoronaVaccine> findByFirstNameStartingWith(String startletters) {
		return repo.findByNameStartingWith(startletters);
	}
@Override
public List<CoronaVaccine> findByNameEndingWith(String endletters) {
	// TODO Auto-generated method stub
	return repo.findByNameEndingWith(endletters);

}
@Override
public List<CoronaVaccine> findByNameContaining(String initChars) {
	// TODO Auto-generated method stub
	return repo.findByNameContaining(initChars);
}
			@Override
			public List<CoronaVaccine> findBypriceOrderByAsc(Double startprice) {
				// TODO Auto-generated method stub
				return repo.findBypriceGreaterThanOrderBypriceAsc(startprice);
			}
	}
