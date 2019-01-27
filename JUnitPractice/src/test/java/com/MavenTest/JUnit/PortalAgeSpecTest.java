package com.MavenTest.JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.MavenTest.JUnit.PortalAgeSpec;

public class PortalAgeSpecTest {

	PortalAgeSpec spASpec;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("isAdult-beforeAll");
	}
	
	@Before
	public void before() {
		System.out.println("isAdult-before");
		spASpec = new PortalAgeSpec();
	}
	
	@Test
	public void testIsAdult_Student() {
		System.out.println("isAdult-Student");
		assertTrue(spASpec.isAdult(18));
	}
	
	@Test
	public void testIsAdult_Employee() {
		System.out.println("isAdult-Employee");
		assertFalse(spASpec.isAdult(45));
	}

	@After
	public void tearDown() {
		spASpec = null;
		System.out.println("isAdult-after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("isAdult-afterAll");
	}
}
