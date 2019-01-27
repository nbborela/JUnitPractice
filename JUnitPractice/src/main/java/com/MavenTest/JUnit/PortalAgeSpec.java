package com.MavenTest.JUnit;

public class PortalAgeSpec {
	
	public boolean isAdult(int age) {
		return (age>14 && age<30) ? true : false;
	}
}
