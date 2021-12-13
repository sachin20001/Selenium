package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogleAssert {
	
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogleTest(){
		String title = driver.getTitle();
		Assert.assertEquals(title,"Google");

		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.google.co.in/?gws_rd=ssl");
		
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		Assert.assertEquals(innerText,"India");
		
		String attribClass = oelem.getAttribute("class");
		Assert.assertEquals(attribClass,"uU7dJb");
	
		
		List<WebElement> oList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		String expected[]= {"About","Advertising","Business","How Search works"};
		int i=0;
		for(WebElement oElem: oList){
			String innertext = oElem.getText();
			Assert.assertEquals(innertext,expected[i++]);
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}


}
