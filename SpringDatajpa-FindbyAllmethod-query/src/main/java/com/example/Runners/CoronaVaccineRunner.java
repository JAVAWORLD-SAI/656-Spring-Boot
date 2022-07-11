package com.example.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.example.Entity.CoronaVaccine;
import com.example.Service.CoronaVaccineMgmt;

@Component
public class CoronaVaccineRunner implements CommandLineRunner {
	@Autowired
	private CoronaVaccineMgmt service;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * try { CoronaVaccine vaccine=new CoronaVaccine(0, "Giom", 6782.6, "upio", 3);
		 * System.out.println(service.registerVaccine(vaccine)); } catch
		 * (DataAccessException dae) { dae.printStackTrace(); }
		 * 
		 * System.out.println("//////////////////////////////////////"); try {
		 * Iterable<CoronaVaccine> listofvaccine=service.registerBatch(List.of(new
		 * CoronaVaccine(1,"SAICHAND", 7000.5,"BARATH_TECH",2), new
		 * CoronaVaccine(2,"RAM", 5890.5,"ARATI_TECH",3), new CoronaVaccine(3,"CHAND",
		 * 96000.5,"SORATH_TECH",4), new CoronaVaccine(4,"SAD",
		 * 46300.5,"RITH_TECH",1)));
		 * 
		 * System.out.println("The Registry NO Are"); listofvaccine.forEach(vaccine->
		 * System.out.println(vaccine.getRegNo())); } catch (DataAccessException dae) {
		 * dae.printStackTrace(); }
		 * 
		 */		
		  service.findBydose(2).forEach(System.out::println);
		  
		  System.out.println("////////////////////////////////////////");
		  
		service.findByname("SAICHAND").forEach(System.out::println);
		
		 System.out.println("////////////////////////////////////////"); 
		 service.findBypriceLessThan(7000.5).forEach(System.out::println);
		 
		 System.out.println("////////////////////////////////////////");
		 service.findBypriceGreaterThan(5000.5).forEach(System.out::println);
		 
		 System.out.println("////////////////////////////////////////");
		 service.findBypriceLessThanEqual(5890.5).forEach(System.out::println);
		 
		// service.findByNameIsNull("").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findByNameLike("R%").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findByNameLike("____").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findBypriceBetween(5000.2, 7000.5).forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findByFirstNameStartingWith("S").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findByNameEndingWith("D").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findByNameContaining("G").forEach(System.out::println);
		 System.out.println("////////////////////////////////////////");
		 
		 service.findBypriceOrderByAsc(400.5).forEach(System.out::println);
		 
		 
	}

}
