package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {

	public WebDriver s;
	
	public Final_Page(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getClick() {
		return click;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	
	private WebElement button;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	
	private WebElement click;
}
