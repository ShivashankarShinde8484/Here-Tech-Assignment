package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Homeaddress;
import com.utility.Baseclass;

public class Tcshomeaddress extends Baseclass {
	
	@Test
	public void verify_homeadd() throws IOException {
		
		Homeaddress add=PageFactory.initElements(driver, Homeaddress.class);
        add.getSearchbox().sendKeys("Ambethan Chowk Chakan");
        add.getSearchboxbutton().click();
        System.out.println(add.getHlmadd().getText());
        
		File scrs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dests=new File("C:\\dailyprogram\\Demo_java\\PFA\\src\\main\\java\\com\\utility");
		FileHandler.copy(scrs, dests);

		add.getDirectionbutton().click();
		
		add.getSearchhboxofficeadd().sendKeys("Drogenide Softwares Pvt Ltd Maan Pune");
		
		add.getTimeanddist().click();
		System.out.println(add.getTimeanddist().getText());
		
	}
	
	
	

}
