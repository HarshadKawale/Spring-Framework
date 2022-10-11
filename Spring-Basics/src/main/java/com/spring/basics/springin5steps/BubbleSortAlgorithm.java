package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements sortAlgorithm{

	public int[] sort(int [] numbers) {
		
		
		System.out.println("Sorting using BubbleSortAlgorithm...");

		return numbers;
	}
}
