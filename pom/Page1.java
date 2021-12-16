package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	

	public WebDriver s;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement click;
	
	public Page1(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
		
	}


	public WebElement getClick() {
		return click;
	}


}
