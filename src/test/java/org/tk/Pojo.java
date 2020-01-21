package org.tk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo {
	public Pojo() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search_btn;
	@FindBy(xpath="(//div[@class='_3wU53n'])[1]")
	private WebElement iphone;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement user;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement login;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']")
	private WebElement price;
	
	public WebElement getPrice() {
		return price;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearch_btn() {
		return search_btn;
	}
	public WebElement getIphone() {
		return iphone;
	}
	

}
