package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
	public Page3(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebDriver s;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;

	public WebElement getFrame() {
		return frame;
	}
	

}
