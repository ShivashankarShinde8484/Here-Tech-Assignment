package com.test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pageobject.Datatables;
import com.utility.Baseclass1;

public class TcsDatatable extends Baseclass1 {
	
	
	@Test
	public void Verify_Datatables() {
		
		Datatables tab=PageFactory.initElements(driver, Datatables.class);
		Select s=new Select(tab.getDrpelement());
		s.selectByValue("25");
		
		Actions act=new Actions(driver);
		act.moveToElement(tab.getyoutoold()).click().build().perform();
		
		tab.getOne().click();
		tab.getTwo().click();
		tab.getThree().click();
		tab.getFour().click();
		tab.getFive().click();
		tab.getSix().click();
		tab.getSeven().click();
		tab.getEight().click();
		tab.getNine().click();
		tab.getTen().click();
		tab.getEleven().click();
		tab.getTwelve().click();
		tab.getThirteen().click();
		tab.getFourteen().click();
		
		
		
		
		
		
	}
	
	

}
