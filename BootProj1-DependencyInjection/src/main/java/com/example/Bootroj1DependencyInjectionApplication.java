package com.example;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.beans.WishMessageGenerator;

@SpringBootApplication
public class Bootroj1DependencyInjectionApplication {
	@Bean(name="ldt")
	public LocalDateTime CreateLocalDateTime() {
		System.out.println("Bootroj1DependencyInjectionApplication.CreateLocalDateTime()");
		LocalDateTime ldt= LocalDateTime.now();
		return ldt;
	}
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Bootroj1DependencyInjectionApplication.class, args);
		// get target class from IOC container
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		//invoke methods
		String result=generator.generateWishMessage("SAICHAND");
		System.out.println(result);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
