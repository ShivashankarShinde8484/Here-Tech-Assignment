package com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobject.Redbus;
import com.utility.Baseclass3;

public class TcsRedbus extends Baseclass3  {
	
	public void Verify_Redbus() {
		
		Redbus red=PageFactory.initElements(driver,Redbus.class);
		red.getFrom().sendKeys("Mumbai");
		red.getTo().sendKeys("Pune");
	
		red.getDate().sendKeys("22062022");
		red.getDate().sendKeys(Keys.ENTER);
		
		red.getSearchbtn().click();
		
		
		
		
	}
	
	
	

}
