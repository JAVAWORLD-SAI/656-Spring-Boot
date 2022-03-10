package com.example.Runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.example.Entity.CoronaVaccine;
import com.example.Service.ICoronaVaccineService;

@Component
public class CoronaVaccineRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			// here are using arrays.aslist. same functioning happens  list.of, map.of, set.of
				Iterable<CoronaVaccine> listofVaccines=service.RegistrationBatch(Arrays.asList(new CoronaVaccine(101, "Saichand", 96.6, "Giop", 1),
																					new CoronaVaccine(102, "chand", 3696.6, "klou", 2),
																					new CoronaVaccine(103, "Snd", 893896.6, "juoip", 5)));
					
				System.out.println("The registration are");
				listofVaccines.forEach(CoronaVaccine->System.out.println(CoronaVaccine.getRegNo()));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}

	}

}
