package com.example.Service;

import java.util.List;

import com.example.Entity.CoronaVaccine;

public interface CoronaVaccineMgmt {
	
	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable <CoronaVaccine> registerBatch(Iterable<CoronaVaccine> Vaccine);
	
	
	  public List<CoronaVaccine> findBydose(Integer dose);
	  
	 public List<CoronaVaccine>findByname(String name);
	  
	  public List<CoronaVaccine>findBypriceLessThan(Double price);
	  
	  public List<CoronaVaccine>findBypriceGreaterThan(Double price);
	  
	  public List<CoronaVaccine> findBypriceLessThanEqual(Double price);
	  
	//  public List<CoronaVaccine> findByNameIsNull(String name);
	  
	  public List<CoronaVaccine> findByNameLike(String initChars);
	  
	  public List<CoronaVaccine>findBypriceBetween(Double startprice, Double endprice);
	  
	  
	  public List<CoronaVaccine>findByFirstNameStartingWith(String startletters);
	  
	  public List<CoronaVaccine> findByNameEndingWith(String endletters);
	  
	  
	  public List<CoronaVaccine>findByNameContaining(String initChars);
	  
	  
	  public List<CoronaVaccine> findBypriceOrderByAsc( Double startprice);
}
