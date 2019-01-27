package com.MavenTest.JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.MavenTest.JUnit.PortalCalculator;

@RunWith(Parameterized.class)
public class PortalCalculatorParameterizedTest {

	PortalCalculator spCalc;
	
	private int sum;
	private int num1;
	private int num2;
	
	
	public PortalCalculatorParameterizedTest(int sum, int num1, int num2) {
		this.sum = sum;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Parameters
	public static Collection<Integer[]> testConditions() {
		Integer expectedOutputs[][] = {
					{12, 2, 10}, 
					{8, 4, 4},
					{10, 25, -15}
				};
		return Arrays.asList(expectedOutputs);
	}
	
	@Before
	public void before() {
		spCalc = new PortalCalculator();
	}
	
	@Test
	public void testAddition_Parameterized() {
		System.out.println("addition-parameterized : " + sum + " " + num1 + " " + num2);
		//assertEquals(-12, spCalc.addition(-2, -10)); 
		assertEquals(sum, spCalc.addition(num1, num2));
	}

	@After
    public void after() {
		spCalc = null;
    }
}
