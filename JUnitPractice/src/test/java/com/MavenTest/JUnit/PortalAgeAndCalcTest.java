package com.MavenTest.JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PortalAgeSpecTest.class, PortalCalculatorTest.class, PortalNameSorterTest.class })
public class PortalAgeAndCalcTest {

}
