package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//we use @Primary to give higher preference to a bean when there are multiple beans of the same type
@Qualifier("quick")
public class QuickSortAlgorithm implements sortAlgorithm {

	public int[] sort(int [] numbers) {
		
		
		System.out.println("Sorting using QuickSort Algorithm...");
		
		return numbers;
	}
}
