package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass4{

public static WebDriver driver;
@Parameters({"Browsername"})
@BeforeMethod
public void setup(String Browsername){
	
	if(Browsername.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("http://www.pepperfry.com/,");}
	
    if(Browsername.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("http://www.pepperfry.com/,");
}

   else if(Browsername.equalsIgnoreCase("Edgedriver")) {
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
		driver.get("http://www.pepperfry.com/,");
   }

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

      @AfterMethod
      public  void tearDown() {
	    driver.quit();



}
}



