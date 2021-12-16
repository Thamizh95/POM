package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page8 {
	public Page8(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebDriver s;
	
	@FindBy(xpath="//div[@id='uniform-cgv']/span/input")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

}
