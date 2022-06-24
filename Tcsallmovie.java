package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Allmovie;
import com.utility.Baseclass1;

public class Tcsallmovie extends Baseclass1 {
	@Test
	public void verifyallmovie() {
	
	Allmovie alm=PageFactory.initElements(driver, Allmovie.class);
    alm.getSearchbox().sendKeys("The GodFather");
    alm.getSearchbutton().click();
    
	System.out.println(alm.getAllresults().getText());
	
	alm.getGodfather().click();
	
	String gener=alm.getGener().getText();
	if(gener.equals("Crime")) {
		System.out.println(gener);
	}else {
		System.out.println("Test casefail");
	}
	
      String rating=alm.getMPAArating().getText();
	if(rating.equals("A")) {
		System.out.println(rating); 
		}else {
			System.out.println("Test case fail");
		}
	
	alm.getCastandCrew().click();
	String cac=alm.getCastandCrewname().getText();
	if(cac.equals("“Francis Ford Coppola")) {
		System.out.println(cac);
	}else {
		System.out.println("Test case fail");
	}
	
	 Boolean name=alm.getAlpareconame().isDisplayed();
	if(name==true) {
		System.out.println("Michael Corleone");
	}else {
		System.out.println("Test case fail");
	}
	
	}
}
