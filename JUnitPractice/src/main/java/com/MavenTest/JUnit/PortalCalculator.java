package com.MavenTest.JUnit;

public class PortalCalculator {
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public int division(int num1, int num2) {
		try {
			return num1 / num2;
		}catch(ArithmeticException e) {
			return -1;
		}
		
	}
}
