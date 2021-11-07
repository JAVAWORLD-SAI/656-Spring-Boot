package com.example;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj2DependencyInjectionApplication {
	
	//@Bean("ldt")
	public LocalDateTime CreateLocalTimee() {
		System.out.println("BootProj2DependencyInjectionApplication.CreateLocalTimee()");
		LocalDateTime ldt=LocalDateTime.now();
		return ldt;
	}
	
	@Bean("ldt1")
	//@Primary
	public LocalDateTime CreateLocalTimee1() {
		System.out.println("BootProj2DependencyInjectionApplication.CreateLocalTimee()");
		LocalDateTime ldt1=LocalDateTime.now();
		return ldt1;
	}

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj2DependencyInjectionApplication.class, args);
		WishMessageGenerator generator=ctx.getBean("wmg", WishMessageGenerator.class);
	        String message=generator.generateWishMessge("SAICHAND");
	        System.out.println(message);
	        int c=ctx.getBeanDefinitionCount();
	        System.out.println(c);
	        ((ConfigurableApplicationContext) ctx).close();
	}

}
