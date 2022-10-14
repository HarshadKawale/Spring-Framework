package com.spring.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.componentscan.ComponentDAO;
import com.spring.springin5steps.basic.BinarySearchImpl;
import com.spring.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.spring.componentscan")
public class SpringBasicsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsComponentScanApplication.class);

	public static void main(String[] args) {
	
		
		System.out.println("SpringBoot SpringBasicsScopeApplication Project Started ....");
		

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsComponentScanApplication.class, args);
		
		ComponentDAO componentDao =applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDao1 =applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",componentDao);
		LOGGER.info("{}",componentDao1);
		
		LOGGER.info("{}", componentDao.getJdbcconnection());
		LOGGER.info("{}", componentDao1.getJdbcconnection());
		
		
	}

}
