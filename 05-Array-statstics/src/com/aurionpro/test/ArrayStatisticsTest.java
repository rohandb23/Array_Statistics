package com.aurionpro.test;

import com.aurionpro.model.ArrayStatistics;

public class ArrayStatisticsTest {

	public static void main(String[] args) {
		ArrayStatistics obj = new ArrayStatistics();
		System.out.println("maximum element of arraqy is : "+obj.maxElementOfArray(args));
		System.out.println("minimum element of array is : "+obj.minElementOfArray(args));
		System.out.println("sum of all elements of arrays is : "+obj.sumOfArray(args));
		System.out.println("average of array is : "+obj.averageOfArray(args));
	}

}
