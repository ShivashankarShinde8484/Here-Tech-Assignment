package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Allmovie {

	WebDriver driver; 
	
	@FindBy(how=How.XPATH,using="//input[@name='term']")
	private WebElement Searchbox;
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement Searchbutton;
	@FindBy(how=How.XPATH,using="//h1[contains(.,'102 search results for the godfather')]")
	private WebElement Allresults;
	@FindBy(how=How.XPATH,using="(//a[contains(.,'The Godfather')])[2]")
	private WebElement Godfather;
	@FindBy(how=How.XPATH,using="//span[@class='header-movie-genres']")
	private WebElement Gener;
	@FindBy(how=How.XPATH,using="//span[contains(.,'MPAA Rating - R')]")
	private WebElement MPAArating;
	@FindBy(how=How.XPATH,using="//a[@title='Cast & Crew']")
	private WebElement CastandCrew;
	@FindBy(how=How.XPATH,using="//a[@data-hasqtip='1']")
	private WebElement CastandCrewname;
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'cast_container')])[2]")
	private WebElement Alpareconame;
	
	public Allmovie(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public WebElement getSearchbox() {
		return Searchbox;
	}
	
	public WebElement getSearchbutton() {
		return Searchbutton;
	}
	
	public WebElement getAllresults() {
		return Allresults;
	}

	public WebElement getGodfather() {
		return Godfather;
	}

	public WebElement getGener() {
		return Gener;
	}
	
	public WebElement getMPAArating() {
		return MPAArating;
	}

	public WebElement getCastandCrew() {
		return CastandCrew;
	}

	public WebElement getCastandCrewname() {
		return CastandCrewname;
	}
	public WebElement getAlpareconame() {
		return Alpareconame;
	}

	
}
