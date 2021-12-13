package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {
	
org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp() {
		sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority=1)
	public void softAssertTest() {
		
		sf.assertEquals("stefen", "stefen");
		sf.assertEquals("salvatore", "salvatore");
		sf.assertEquals("tvd@gmail.com", "tvd@gmail.com");
		sf.assertEquals("", "9211921101");
		sf.assertEquals("", "Automation");
		sf.assertAll();
	}
	
	@Test(priority=2)
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}

}
