package com.test;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.GoogleMap;
import com.utility.Baseclass;


public class TcsGmap extends Baseclass {
	
	@Test
	public void gpage() throws Exception {
		

		GoogleMap page=PageFactory.initElements(driver, GoogleMap.class);
		page.getSearchbox().sendKeys("Wankhede Stadium");
		page.getSearchbutton().click();
		page.getMap().click();
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\dailyprogram\\Demo_java\\PFA\\src\\main\\java\\com\\utility");
		FileHandler.copy(scr, dest);
		
		page.getStadium().isDisplayed();
		System.out.println(driver.getTitle());
		String titlepage=driver.getTitle();
		if(titlepage.equals("Wankhede stadium-Google Maps" )) {
			System.out.println("Test Case Pass");
		}else
			System.out.println("Test case Fail");
		

		System.out.println(page.getRatings().getText());
		System.out.println(page.getReviews().getText());
		
		Actions act=new Actions(driver);
       act.moveToElement(page.getMumbaicricket()).click().build().perform();
       driver.navigate().back();
       
       System.out.println(page.getAddress().getText());
       
       System.out.println(page.getPhone().getText());
       
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\dailyprogram\\Demo_java\\PFA\\src\\main\\java\\com\\utility");
		FileHandler.copy(source, destination);



	
	
	
	
	
	
	}
}
