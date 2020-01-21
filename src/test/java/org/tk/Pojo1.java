package org.tk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 {
	public Pojo1() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement amazon_search;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement amazon_btn;
	@FindBy(xpath="(//span[text()='Apple iPhone XR (64GB) - Yellow'])[1]")
	private WebElement amaz_iphone;
	@FindBy(id="priceblock_ourprice")
	private WebElement amzprice;
	public WebElement getAmzprice() {
		return amzprice;
	}
	public WebElement getAmazon_search() {
		return amazon_search;
	}
	public WebElement getAmazon_btn() {
		return amazon_btn;
	}
	public WebElement getAmaz_iphone() {
		return amaz_iphone;
	}
	

}
