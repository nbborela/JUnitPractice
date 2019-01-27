package com.MavenTest.JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.MavenTest.JUnit.PortalNameSorter;

public class PortalNameSorterTest {

	PortalNameSorter spNSort;
	
	@Before
	public void before() {
		spNSort = new PortalNameSorter();
	}
	
	@Test
	public void testNameSorter_Proper() {
		String[] expected = {"a", "b", "c", "d"};
		assertArrayEquals(expected, spNSort.nameSorter(new String[]{"b", "a", "d", "c"}));
	}

}
