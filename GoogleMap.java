package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMap {

	
	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//input[@id='searchboxinput']")
	private WebElement Searchbox;
    @FindBy(how=How.XPATH,using="//button[@id='searchbox-searchbutton']")
    private WebElement Searchbutton;
	@FindBy(how=How.XPATH,using="//button[@jstcache='274']")
	private WebElement Map;
	@FindBy(how=How.XPATH,using="//span[@jstcache='828']")
	private WebElement Stadium;
	@FindBy(how=How.XPATH,using="//span[@aria-hidden='true'][contains(.,'4.5')]")
	private WebElement Ratings;
	@FindBy(how=How.XPATH,using="//span[@aria-label='32,951 reviews']")
	private WebElement Reviews;
	@FindBy(how=How.XPATH,using="//div[@jstcache='902'][contains(.,'mumbaicricket.com')]")
	private WebElement Mumbaicricket;
	@FindBy(how=How.XPATH,using="//div[@jstcache='902'][contains(.,'WRQG+G8R, Vinoo Mankad Rd, Churchgate, Mumbai, Maharashtra 400020')]")
	private WebElement Address;
	@FindBy(how=How.XPATH,using="//div[@jstcache='902'][contains(.,'022 2279 5500')]")
	private WebElement Phone;



	
	public GoogleMap(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement getSearchbox() {
		return Searchbox;
	}


	public WebElement getSearchbutton() {
		return Searchbutton;
	}


	public WebElement getMap() {
		return Map;
	}


	public WebElement getStadium() {
		return Stadium;
	}


	public WebElement getRatings() {
		return Ratings;
	}
	
	public WebElement getReviews() {
		return Reviews;
	}

	public WebElement getMumbaicricket() {
		return Mumbaicricket;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getPhone() {
		return Phone;
	}






	
	
	
	
	
	
	
	
	
	
	
	
	

}








