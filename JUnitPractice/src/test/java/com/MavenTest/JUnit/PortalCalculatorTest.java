package com.MavenTest.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.MavenTest.JUnit.PortalCalculator;

public class PortalCalculatorTest {

	//fail method
	//fail("Not yet implemented");
	
	//assertEquals("ABC", "ABCD");
	//assertEquals(12, 123);
	PortalCalculator spCalc = new PortalCalculator();
	
	@Test
	public void testAddition_Positive() { //naming convention
		System.out.println("addition-positive");
		//PortalCalculator spCalc = new PortalCalculator();
		
		int expected = 23;
		int actual = spCalc.addition(15, 8);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testAddition_Negative() { //refactored
		System.out.println("addition-negative");
		//PortalCalculator spCalc = new PortalCalculator();
		assertEquals(-12, spCalc.addition(-2, -10)); 
	}
	
	@Test
	public void testDivision_Positve() {
		System.out.println("division-positive");
		assertEquals(2, spCalc.division(10, 5)); 
	}
	
	/*
	 * do this if exception not handled
	@Test(expected=ArithmeticException.class)
	public void testDivision_DivZero() {
		System.out.println("division-positive");
		spCalc.division(10, 0); 
	}*/
	
	@Test
	public void testDivision_DivZero2() {
		System.out.println("division-positive");
		assertEquals(-1,spCalc.division(8, 0));
	}
	
}
