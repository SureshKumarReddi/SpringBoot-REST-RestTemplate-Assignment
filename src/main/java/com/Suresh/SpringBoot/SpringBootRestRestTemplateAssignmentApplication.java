package com.Suresh.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Suresh.SpringBoot.Service.ServiceProgram;

@SpringBootApplication
public class SpringBootRestRestTemplateAssignmentApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootRestRestTemplateAssignmentApplication.class, args);
	ServiceProgram bean = run.getBean(ServiceProgram.class);
	bean.getUnitedFlights();
	bean.getHeaders();
		
	}
	
}
