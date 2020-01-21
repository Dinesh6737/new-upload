package org.tk;

import java.util.Date;
import java.util.Set;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchAmazon extends Base {
	@BeforeClass
	public void launching() {
		launch("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void m2() {
		Pojo1 p1 =new Pojo1();
		type(p1.getAmazon_search(),"Iphonexr 64gb yellow" );
		press(p1.getAmazon_btn());
		press(p1.getAmaz_iphone());
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> c = driver.getWindowHandles();
		System.out.println(c);
		for(String x:c) {
			if(!(x.equals(pw))) {
				driver.switchTo().window(x);
			}
		}
		aztxt(p1.getAmzprice());
		compare();
	}
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	public void EndBrowser() {
		System.out.println("End");
		driver.quit();
		
	}

			
		
	

}
