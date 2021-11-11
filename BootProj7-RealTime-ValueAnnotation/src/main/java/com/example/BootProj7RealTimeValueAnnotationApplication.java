package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Data.BillGenenrator;

@SpringBootApplication
public class BootProj7RealTimeValueAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootProj7RealTimeValueAnnotationApplication.class, args);
	 		BillGenenrator Bill=ctx.getBean("Bill", BillGenenrator.class);
	 		System.out.println("Bill Data  "+ Bill);
	 		((ConfigurableApplicationContext) ctx).close();
	}

}
