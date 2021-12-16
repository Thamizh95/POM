package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page1 {
	
	public WebDriver s;
	
	 public Home_page1(WebDriver s2) {
			
		 this.s = s2;
		 
		 PageFactory.initElements(s, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	
	private WebElement a;
	
	@FindBy(xpath="//input[@type='password']")
	
	private WebElement a1;
	
	@FindBy(xpath="//input[@class='login_button']")
	
	private WebElement a2;
	
	public WebElement getA() {
		return a;
	}

	public WebElement getA1() {
		return a1;
	}

	public WebElement getA2() {
		return a2;
	}
	
	
	
	
	
	

}
