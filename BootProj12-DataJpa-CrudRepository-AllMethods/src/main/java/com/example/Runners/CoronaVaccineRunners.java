package com.example.Runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.example.Entity.CoronaVaccine;
import com.example.service.CoronaVaccineService;

@Component
public class CoronaVaccineRunners implements CommandLineRunner{

	@Autowired
	private CoronaVaccineService service;
	
	@Override
	public void run(String... args) throws Exception {
		
				try {
				Iterable<CoronaVaccine> SavedVaccines=service.Registration_Vaccine(Arrays.asList(new CoronaVaccine(10,"Saicand","Interface",5,5000.5),
																														 new CoronaVaccine(11,"jouliet","jomio",2,2000.5),
																														 new CoronaVaccine(12,"jack","hedwad",1,4600.5)));
				System.out.println("Registration companies");
				SavedVaccines.forEach(CoronaVaccine ->System.out.println(CoronaVaccine.getRegNo()));
				}
				catch (DataAccessException dae) {
					dae.printStackTrace();
				}
				
				System.out.println("************************************************");
		
				try {
									System.out.println("Records Count : "+service.GetVaccinetionCount());
				}
				catch (DataAccessException dae) {
					dae.printStackTrace();
				}
						 	
				System.out.println("***********************************************");
				try {
							System.out.println( "This register no is "+ service.CheckVaccinationAvaliablityByRegNo(21));
				}
				catch (DataAccessException dae) {
					dae.printStackTrace();
				}
				System.out.println (" ************************************************** ");
				
						try {
						Iterable<CoronaVaccine> listData =service.fetchAllDetails();
						listData.forEach(CoronaVaccine ->System.out.println(CoronaVaccine));
						}
						catch (DataAccessException dae) {
							dae.printStackTrace();
						}
						System.out.println( "**************************************************");
							
						try {
					//service.FetchAllDetailsByids(List.of(10, 25,30)).forEach(CoronaVaccine ->System.out.println(CoronaVaccine));
					//service.FetchAllDetailsByids(List.of(10,5,6)).forEach(System.out::println);  // for each method
				   //Arrays.asList(service.FetchAllDetailsByids(List.of(10,8,6))).stream().forEach(System.out::println); // stream api
						Arrays.asList(service.FetchAllDetailsByids(List.of(8,6,5))).stream().map(s1->s1).forEach(System.out::println);
						}
						catch (DataAccessException dae) {
							dae.printStackTrace();
						}
						System.out.println("***********************************************************");
						
						try {
							Optional<CoronaVaccine>opt=service.fetchVaccineById(1);
							if(opt.isEmpty())
							{
								System.out.println(opt.get());
							}
							else
								System.out.println("Record not found");	
							}
						catch (DataAccessException dae) {
							dae.printStackTrace();
						}
						
	}  
		
}
