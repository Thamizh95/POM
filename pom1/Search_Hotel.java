package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver s;
	
	@FindBy(id = "location")
	private WebElement location;
	
	public Search_Hotel(WebDriver s2) {
		this.s=s2;
		
		PageFactory.initElements(s,this);
				
				
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getButton() {
		return button;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[2]")
	private WebElement hotel;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement room;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement type;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement date;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement date1;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement num;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement child;
	
	@FindBy(xpath = "(//input[@class='reg_button'])[1]")
	private WebElement button;
	

}
