package com.spring.springin5steps.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	@Autowired
	
	//
	//If no constructor or setter injection used/written, it is fine and only @Autowired  uses the setter injection and injection happens by type between eligible beans
	
	//@Component-@Autowired-@Primary
	//or
	//@Component-@Autowired-@Qualifier are two possible combinations shcan be used
	
	//object will be injected into the property sortAlgorithm at run time using @Autowired annotation
	//sortAlgorithm is a dependency of binarysearchImpl
	//@Qualifier("quick")
	private sortAlgorithm sortAlgorithm;
	
	
	
	
	//1.Constructor injection using constructor to set dependency above using @Autowired annotation 
	//autowiring by name
	
	//Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSortAlgorithm'(Because bubbleSortAlgorithm is marked with @Primary)
//	public BinarySearchImpl(sortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	
	public sortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	//1.Setter injection using setter method to set dependency above using @Autowired annotation
	////autowiring by type
//	public void setSortAlgorithm(sortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int [] numbers ,int numToSearchFor) {
		
		int [] sortedNumbers;
		
		// Implement Sorting Logic 
				// BubbleSort Algorithm
				// Quick Sort Algorithm
		
		//Tight Coupling 
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//sortedNumbers= bubbleSortAlgorithm.sort(numbers);
		
		//QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
		//sortedNumbers= quickSortAlgorithm.sort(numbers);		
		
		//Loss Coupling using Interface
		sortedNumbers= sortAlgorithm.sort(numbers);		
		System.out.println(sortAlgorithm);
		
		
//		for (int element: sortedNumbers) {
//            System.out.println(element);
//        }
		
//		System.out.println(Arrays.toString(sortedNumbers));
		
		// Implement Searching logic
		
		
		return 3;
	}


	
}
