package com.spring.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.spring.springin5steps.cdi.SomeCdiBusiness;

@SpringBootApplication

public class SpringCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {
	
		
		System.out.println("SpringBoot Project Started ....");
		

		ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);
		
		SomeCdiBusiness somecdibusiness = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{} dao-{}",somecdibusiness,somecdibusiness.getSomeCDIDAO());
		
	}

}
