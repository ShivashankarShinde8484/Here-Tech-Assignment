package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homeaddress {
	
	
	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//input[contains(@id,'searchboxinput')]")
	private WebElement Searchbox;
	@FindBy(how=How.XPATH,using="//button[contains(@id,'searchbox-searchbutton')]")
	private WebElement Searchboxbutton;
	@FindBy(how=How.XPATH,using="//img[@alt='Directions']")
	private WebElement Directionbutton;
	@FindBy(how=How.XPATH,using="//input[@aria-controls='sbsg51']")
	private WebElement Searchhboxofficeadd;
	@FindBy(how=How.XPATH,using="//div[contains(@id,'section-directions-trip-0')]")
	private WebElement timeanddist;
	@FindBy(how=How.XPATH,using="//div[@class='lMbq3e']")
	private WebElement hlmadd;

	
	public WebElement getSearchbox() {
		return Searchbox;
	}
	
	public WebElement getSearchboxbutton() {
		return Searchboxbutton;
	}
	
	public WebElement getDirectionbutton() {
		return Directionbutton;
	}

	public WebElement getSearchhboxofficeadd() {
		return Searchhboxofficeadd;
	}

	public WebElement getTimeanddist() {
		return timeanddist;
	}

	public WebElement getHlmadd() {
		return hlmadd;
	}






	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
