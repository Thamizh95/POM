package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver s;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	public Select_Hotel(WebDriver s2) {
		this.s=s2;
		PageFactory.initElements(s,this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getC_button() {
		return c_button;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement c_button;
	
	

}
