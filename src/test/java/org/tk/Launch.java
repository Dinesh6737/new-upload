package org.tk;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch extends Base{
	
		
	
	
	@BeforeClass
	public void launchBrowser() {
		launch("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		
	}
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	@Test
	public void m1() {
		
		
		Pojo p = new Pojo();
		press(p.getClose());
		type(p.getSearch(), "Iphonexr 64gb yellow");
		press(p.getSearch_btn());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		press(p.getIphone());
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> c = driver.getWindowHandles();
		System.out.println(c);
		for(String x:c) {
			if(!(x.equals(pw))) {
				driver.switchTo().window(x);
			}
		}
		fptxt(p.getPrice());
		
		
	}
		@AfterMethod
		public void endTime() {
			Date d= new Date();
			System.out.println(d);
		}
		@AfterClass
		public void closeBrowser() {
			System.out.println("End");
			driver.quit();
			
			
		}
		
		
	
}
