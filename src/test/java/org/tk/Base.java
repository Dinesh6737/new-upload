package org.tk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 static WebDriver driver;
	 static  int amzval=0,ftval=0;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\Dinesh\\Task\\Driver up\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public void press(WebElement w) {
		w.click();
	}
	public static void aztxt(WebElement w) {
		String az = w.getText();
		System.out.println("Amazon Price: "+az);
		int index = az.indexOf(".");
		String sub= az.substring(0, index);
		String trim = sub.trim();
		String act = trim.replaceAll("[^0-9]", "");
		amzval=Integer.parseInt(act);
		
	}
	public static void fptxt(WebElement w) {
		String ft = w.getText();
		System.out.println("Flipkart Price: "+ft);
		String act = ft.replaceAll("[^0-9]", "");
		ftval=Integer.parseInt(act);
		
	}
	public static void compare() {
		if(amzval<ftval) {
			System.out.println("Amazon pricae is low");
		}else {
			System.out.println("Flipkart pricae is low");
		}
	}
	

}
