package com.spring.springin5steps;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import com.spring.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication

public class SpringBasicsApplication {
	
	//What are beans?
	//using @Component annotation we tell spring about the beans to manage
	
	//What are the dependencies of bean?
	//@Autowired annotation tells about dependency
	
	//Where to search for beans?
	//@ComponentScan is used to scan package (where main class is presnt) for beans annotated with @Component annotation
	//@SpringBootApplication annotation scans beans in current and base package
	

	public static void main(String[] args) {
	
		
		System.out.println("SpringBoot Project Started ....");
		
		//BinarySearchImpl binarySearchImpl =new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = (BinarySearchImpl) applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		
		//Singletone Scope is By default scope of spring bean where there is single instance per spring context
		
		BinarySearchImpl binarySearchImpl1 = (BinarySearchImpl) applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl1);
		
		
		//Prototype is scope in which new bean is returned for every request
		//@Scope("prototype") on bean enables prototype scope
		//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		
		//Request scope in which one bean per HTTP request is returned
		
		//Session scope in which one bean per HTTP session is returned
		
		
		
		int result = binarySearchImpl.binarySearch(new int []{12,15,66}, 3);
		System.out.println(result);
		System.out.println(result);
		
		
	}

}
