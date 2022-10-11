package com.spring.basics.springin5steps;

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
	@Qualifier("bubble")
	private sortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(com.spring.basics.sortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public sortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	public void setSortAlgorithm(sortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

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
