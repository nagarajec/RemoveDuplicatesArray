package com.datastructure.controller;

import com.datastructure.service.*;

/* Main class to have integer arrays and to display removed duplicates
 * 
 */
public class RemoveDuplicates {
	
	static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {
		
		RemoveDuplicateService service = new RemoveDuplicateService();
		
		//Remove duplicates using collections
		//This method preservers the insertion order as we are using linkedHashSet
		int[] randomIntegersCollections = randomIntegers;
		 service.removeDuplicatesUsingCollections(randomIntegersCollections);
		
		//Remove duplicates without using collections (primitive way)
		int[] randomIntegersPrimitives = randomIntegers;
		service.removeDuplicatesPrimitiveWay(randomIntegersPrimitives);
		
		//Remove duplicates using Java 8 Lambdas
		int[] randomIntegersLambda = randomIntegers;
		service.remmoveDuplicatesUsingLambda(randomIntegersLambda);

		
	}

}
