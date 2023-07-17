package com.aurionpro.model;

public class ArrayStatistics {
	private int sum;
	private int average;
	private int maxElement;
	private int minElement;
	
	public int maxElementOfArray(String[] a) {
		int maxElement = Integer.parseInt(a[0]);
		for (int i = 0; i < a.length; i++) {
			if(Integer.parseInt(a[i])>maxElement) {
				maxElement=Integer.parseInt(a[i]);
			}
		}
		return maxElement;
	}
	
	public int minElementOfArray(String[] a) {
		int minElement = Integer.parseInt(a[0]);
		for (int i = 0; i < a.length; i++) {
			if(Integer.parseInt(a[i])<minElement) {
				minElement=Integer.parseInt(a[i]);
			}
		}
		return minElement;
	}
	
	public int sumOfArray(String[] a) {
		int sumOfAllElements = 0;
		for (int i = 0; i < a.length; i++) {
			sumOfAllElements+=Integer.parseInt(a[i]);
		}
		return sumOfAllElements;
	}
	
	public int averageOfArray(String[] a) {
		int average = 0;
		int totalOfArrayElements=0;
		for (int i = 0; i < a.length; i++) {
			totalOfArrayElements+=Integer.parseInt(a[i]);
		}
		average=(totalOfArrayElements/a.length);
		return average;
	}
}
