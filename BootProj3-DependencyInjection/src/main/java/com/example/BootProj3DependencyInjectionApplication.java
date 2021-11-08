package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.Student;

@SpringBootApplication
public class BootProj3DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj3DependencyInjectionApplication.class, args);
		Student st=ctx.getBean("std",Student.class);
		st.preparation("CTS EXAM ");
		((ConfigurableApplicationContext) ctx).close();
	}

}
