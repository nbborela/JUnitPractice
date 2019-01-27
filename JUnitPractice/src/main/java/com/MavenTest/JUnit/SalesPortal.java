package com.MavenTest.JUnit;

import java.util.Arrays;

public class SalesPortal {

	public static void main(String[] args) {
		PortalCalculator spCalc = new PortalCalculator();
		PortalAgeSpec	spASpec = new PortalAgeSpec();
		PortalNameSorter spNSort = new PortalNameSorter();
		
		System.out.println("Sales Protal!");
		
		/*
		 * for PortalCalculator
		int num1 = 5;
		int num2 = 10;
		System.out.println("added : " + spCalc.addition(num1, num2));*/
		
		int num1 = 10;
		int num2 = 0;
		System.out.println("added : " + spCalc.division(num1, num2));
		
		/*
		 * for PortalAgeSpec 
		if(spASpec.isAdult(10)) {
			System.out.println("He is already an Adult");
		}else {
			System.out.println("He is not an Adult");
		}*/
		
		/*
		 * for PortalNameSorter 
		String[] names = {"midoriya", "todoroki", "bakugo", "uraraka", "asui"};
		String[] sorted = spNSort.nameSorter(names);
		System.out.println("names : " + Arrays.toString(sorted));*/
	}

}
