package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 {
	public WebDriver s;
	
	@FindBy(xpath="//span[contains(text(),'Proceed ')]")
	private WebElement click;

	public Page5(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebElement getClick() {
		return click;
	}
	

}
