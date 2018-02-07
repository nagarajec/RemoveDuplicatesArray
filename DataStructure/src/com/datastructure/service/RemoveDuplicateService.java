package com.datastructure.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateService {

	public void removeDuplicatesUsingCollections(int[] arrayWithDuplicates) {
		System.out.println("------------------------ Remove Duplicates using Collections start --------------------------");
		System.out.println("Array With Duplicates : ");
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}
		Set<Integer> set = new LinkedHashSet<Integer>(); // Use HashSet if you don't want insertion order
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			set.add(arrayWithDuplicates[i]);
		}
		// Converting set into an array
		Object[] arrayWithoutDuplicates = set.toArray();
		// Printing arrayWithoutDuplicates
		System.out.println();
		System.out.println("Array Without Duplicates : ");
		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------ Remove Duplicates using Collections Ends ---------------------------");
	}

	public void removeDuplicatesPrimitiveWay(int[] arrayWithDuplicates) {
		System.out.println("------------------------ Remove Duplicates using Primitive way Start ------------------------");
		System.out.println("Array With Duplicates : ");
		for (int i = 0; i < arrayWithDuplicates.length; i++) {
			System.out.print(arrayWithDuplicates[i] + "\t");
		}
		// Assuming all elements in input array are unique
		int noOfUniqueElements = arrayWithDuplicates.length;
		// Comparing each element with all other elements
		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				// If any two elements are found equal
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					// Replace duplicate element with last unique element
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
					// Decrementing noOfUniqueElements
					noOfUniqueElements--;
					// Decrementing j
					j--;
				}
			}
		}
		// Copying only unique elements of arrayWithDuplicates into
		// arrayWithoutDuplicates
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		// Printing arrayWithoutDuplicates
		System.out.println();
		System.out.println("Array Without Duplicates : ");
		for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
			System.out.print(arrayWithoutDuplicates[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------- Remove Duplicates using Primitive way Ends --------------------");
	}

	@SuppressWarnings("deprecation")
	public void remmoveDuplicatesUsingLambda(int[] randomIntegers) {
		System.out.println("-------------------------- Remove Duplicates using Lambda functions start -----------------");
		System.out.println("Array With Duplicates : ");
		for (int i = 0; i < randomIntegers.length; i++) { 
			System.out.print(randomIntegers[i] + "\t");
		}
		System.out.println();
		
		List<Integer> arrayWithDuplicates = new ArrayList<Integer>();
		for(int i:randomIntegers)
		{
			arrayWithDuplicates.add(new Integer(i));
		}
		
	    List<Integer> listWithoutDuplicates = arrayWithDuplicates.stream()
	     .distinct()
	     .collect(Collectors.toList());
	    System.out.println("Array Without Duplicates : ");
	    for(Integer j : listWithoutDuplicates)
	    {
	    		System.out.print(j+"\t");
	    }
	    System.out.println();
	    System.out.println("------------------------- Remove Duplicates using Lambda functions End ---------------------");
	}

}
