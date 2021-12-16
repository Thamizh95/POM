package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page7 {
	public Page7(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebDriver s;
	
	public WebElement getClick() {
		return click;
	}

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	
	private WebElement click;

}
