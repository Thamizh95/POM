package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver s;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement name1;
	
	public Book_Hotel(WebDriver s2) {
		this.s=s2;
		PageFactory.initElements(s,this);
	}

	public WebElement getName1() {
		return name1;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCread() {
		return cread;
	}

	public WebElement getA3() {
		return a3;
	}

	public WebElement getA4() {
		return a4;
	}

	public WebElement getA5() {
		return a5;
	}

	public WebElement getA6() {
		return a6;
	}

	public WebElement getA7() {
		return a7;
	}

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@rows='4']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@maxlength='16']")
	private WebElement cread;
	
	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement a3;
	
	@FindBy(xpath = "(//select[@class='select_combobox2'])[1]")
	private WebElement a4;
	
	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")
	private WebElement a5;
	
	@FindBy(xpath = "(//input[@class='reg_input'])[4]")
	private WebElement a6;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement a7;
	

}
