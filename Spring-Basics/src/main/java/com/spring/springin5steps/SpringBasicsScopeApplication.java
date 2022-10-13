package com.spring.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import com.spring.springin5steps.basic.BinarySearchImpl;
import com.spring.springin5steps.scope.PersonDAO;

@SpringBootApplication

public class SpringBasicsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

	public static void main(String[] args) {
	
		
		System.out.println("SpringBoot SpringBasicsScopeApplication Project Started ....");
		

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsScopeApplication.class, args);
		PersonDAO personDao =applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao1 =applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao1);
		
		LOGGER.info("{}", personDao.getJdbcconnection());
		LOGGER.info("{}", personDao1.getJdbcconnection());
		
		
	}

}
