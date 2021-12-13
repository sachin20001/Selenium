package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test(priority=1)
	public void hardAssertTest() {
		Assert.assertEquals("Sachin", "Sachin");
		Assert.assertEquals("Kumar", "Kumar");
	
	}
	
	@Test(priority=2)
	public void hardAssertTest2() {
		Assert.assertEquals("ironman@gmail.com", "ironman@gmail.com");
	}

}
