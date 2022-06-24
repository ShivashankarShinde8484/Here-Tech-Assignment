package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Papperfry {
	
	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//input[@name='q']")
	private WebElement Searchbox;
	@FindBy(how=How.XPATH,using="//input[@id='search']")
	private WebElement Searchbtn;
	@FindBy(how=How.XPATH,using="//label[contains(@for,'price-asc')]")
	private WebElement Asc;
	
	public WebElement getSearchbox() {
		return Searchbox;
	}
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	public WebElement getAsc() {
		return Asc;
	}
	

	
	
	
	
	
	
	

}
