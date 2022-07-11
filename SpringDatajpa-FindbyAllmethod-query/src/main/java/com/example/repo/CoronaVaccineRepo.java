package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.CoronaVaccine;

public interface CoronaVaccineRepo extends CrudRepository<CoronaVaccine, Integer> {
		
			//select regno, name,price, company dose from CoronaVaccine where dose=?
			public  List<CoronaVaccine> findByDose(Integer dose);
			
			
			  //select regno, name, price, company, dose form cornaVaccine where name=?
			 public List<CoronaVaccine> findByName(String name);
			  
				
				  //select regno,name,price,company, dose from coronaVaccine where price <?
				  public List<CoronaVaccine> findBypriceLessThan(Double price);
				  
				  
				  //select regno, name, price,company dose form coronaVaccine  where price>?
				  public List<CoronaVaccine>findBypriceGreaterThan(Double price);
				  
				  //select regno,name,price,company ,dose from cornaVaccine where price<?
				  public List<CoronaVaccine> findBypriceLessThanEqual(Double price);
				  
				  //select regno, name,price,company,dose from coronaVaccine where name is null
				//  public List<CoronaVaccine>findByNameIsNull(String name);
				  
				  
				  //selelct regno, name price, company dose from coronVaccine where name like 'P%' 
				  public List<CoronaVaccine> findByNameLike(String initChars);
				  
				  //select regno name, price, company, dose from coronaVaccone where price ?1 ,?2
				  public List<CoronaVaccine>findBypriceBetween(Double startprice , Double Endprice);
				  
				  //select regno name, price, company, dose from coronaVaccone where nameStaring like ?
				  public List<CoronaVaccine>findByNameStartingWith(String startletters);
				  
				  //select regno name, price, company, dose from coronaVaccone where nameEnding like ?
				  public List<CoronaVaccine> findByNameEndingWith(String endletters);
				  
				  //select regno name, price, company, dose from coronaVaccone where namecontaining like ?
				  public List<CoronaVaccine> findByNameContaining(String initChars);
				  
				  
				  public List<CoronaVaccine> findBypriceGreaterThanOrderBypriceAsc(Double startprice);
			
				 
			 
			
		

}
