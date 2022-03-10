package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example.Entity.CoronaVaccine;
import com.example.Service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootProj9DataJpaCrudRepositoryApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootProj9DataJpaCrudRepositoryApplication.class, args);
	ICoronaVaccineMgmtService service=ctx.getBean("CoronaVaccineService",ICoronaVaccineMgmtService.class);
	
	try {
		CoronaVaccine Vaccine= new CoronaVaccine(5,"SAICAND","INTERFACE",5000.2,5);
		System.out.println(service.registerVaccine(Vaccine));	
	} 
	catch (DataAccessException dae) {
			dae.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	((ConfigurableApplicationContext) ctx).close();
				
	}

}
