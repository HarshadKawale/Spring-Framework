package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements sortAlgorithm {

	public int[] sort(int [] numbers) {
		
		
		System.out.println("Sorting using QuickSort Algorithm...");
		
		return numbers;
	}
}
