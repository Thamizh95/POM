package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
			public WebDriver s;//--------null
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="passwd")
	private WebElement passwd;
	
	@FindBy(xpath="(//i[contains(@class,'left')])[3]")
	private WebElement signin_btn;
	
	
	public Login_Page(WebDriver s2) {
		
		this.s=s2;
		
		PageFactory.initElements(s, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}

}

