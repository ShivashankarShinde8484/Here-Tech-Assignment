package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Redbus {
	
	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//input[contains(@id,'searchboxinput')]")
	private WebElement From;
	@FindBy(how=How.XPATH,using="//input[@id='dest']")
	private WebElement To;
	@FindBy(how=How.XPATH,using="//input[@id='onward_cal']")
	private WebElement Date;
	@FindBy(how=How.XPATH,using="//button[contains(@id,'btn')]")
	private WebElement Searchbtn;
	
	
	
	public WebElement getFrom() {
		return From;
	}
	
	public WebElement getTo() {
		return To;
	}

	public WebElement getDate() {
		return Date;
	}
	
	public WebElement getSearchbtn() {
		return Searchbtn;
	}



	
	
	
	
	
	

}
