package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Hotel {

	public WebDriver s;
	
	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement last;

	public Booking_Hotel(WebDriver s2) {
		this.s=s2;
		PageFactory.initElements(s,this);
	}

	public WebElement getLast() {
		return last;
	}
}
