package com.example.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.example.service.IShopService;

@Controller
public class ShopsRunners  implements CommandLineRunner{

	@Autowired
		private IShopService service;
		
	@Override
	public void run(String... args) throws Exception {
		service.fetchshopsbyname("Zooker").forEach(System.out::println);
		
	}

}
