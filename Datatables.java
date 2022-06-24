package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Datatables {
	
	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//th[contains(@class,'asc')]")
	private WebElement youtoold;
	@FindBy(how=How.XPATH,using="//select[@name='example_length']")
	private WebElement drpelement;
	
	
	@FindBy(how=How.XPATH,using="//td[contains(.,'Tatyana Fitzpatrick')]")
	private WebElement one;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Shou Itou')]")
	private WebElement two;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Caesar Vance')]")
	private WebElement three;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Salary $103,500')]")
	private WebElement four;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Cedric Kelly')]")
	private WebElement five;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Salary $235,500')]")
	private WebElement six;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Quinn Flynn')]")
	private WebElement seven;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Doris Wilder')]")
	private WebElement eight;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Sonya Frost')]")
	private WebElement nine;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Donna Snider')]")
	private WebElement ten;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Prescott Bartlett')]")
	private WebElement eleven;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Brenden Wagner')]")
	private WebElement twelve;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Jennifer Chang')]")
	private WebElement thirteen;
	@FindBy(how=How.XPATH,using="//td[contains(.,'Michael Bruce')]")
	private WebElement fourteen;

	
	
	public WebElement getyoutoold() {
		return youtoold;
	}
	 
	
	public WebElement getDrpelement() {
		return drpelement;
	}


	public WebElement getOne() {
		return one;
	}


	


	public WebElement getTwo() {
		return two;
	}



	public WebElement getThree() {
		return three;
	}




	public WebElement getFour() {
		return four;
	}


	public WebElement getFive() {
		return five;
	}




	public WebElement getSix() {
		return six;
	}


	public WebElement getSeven() {
		return seven;
	}



	public WebElement getEight() {
		return eight;
	}

	public WebElement getNine() {
		return nine;
	}


	public WebElement getTen() {
		return ten;
	}



	public WebElement getEleven() {
		return eleven;
	}


	public WebElement getTwelve() {
		return twelve;
	}


	public WebElement getThirteen() {
		return thirteen;
	}

	public WebElement getFourteen() {
		return fourteen;
	}

	
	

	

}
