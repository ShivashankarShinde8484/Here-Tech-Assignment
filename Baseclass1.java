package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("http://www.allmovie.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();


	}
}
