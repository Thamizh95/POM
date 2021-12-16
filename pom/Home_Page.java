package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver s;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign;
	

	public Home_Page(WebDriver s2) {
		
		this.s =s2;
		
		PageFactory.initElements(s, this);
	}

	public WebElement getSign() {
		return sign;
	}
	
	
	
	
	
	
	

}
