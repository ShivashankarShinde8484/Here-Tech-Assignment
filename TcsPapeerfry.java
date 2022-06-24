package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Datatables;
import com.pageobject.Papperfry;
import com.utility.Baseclass;
import com.utility.Baseclass4;

public class TcsPapeerfry extends Baseclass4 {
	
	
	@Test
	public void Verify_Papperfry1() throws IOException {
		
		File file=new File("C:\\dailyprogram\\Demo_java\\PFA\\Testdata\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		

		Papperfry pap=PageFactory.initElements(driver, Papperfry.class);
        pap.getSearchbox().sendKeys(data);
        
		pap.getSearchbtn().click();
		pap.getAsc().click();
	}
		
		@Test
		public void Verify_Papperfry2() throws IOException {
			
			File file=new File("C:\\dailyprogram\\Demo_java\\PFA\\Testdata\\Data.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			String data=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			

			Papperfry pap=PageFactory.initElements(driver, Papperfry.class);
	        pap.getSearchbox().sendKeys(data);
	        
			pap.getSearchbtn().click();
			pap.getAsc().click();
		
		
		
	}
	
		public void Verify_Papperfry3() throws IOException {
			
			File file=new File("C:\\dailyprogram\\Demo_java\\PFA\\Testdata\\Data.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			String data=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
			

			Papperfry pap=PageFactory.initElements(driver, Papperfry.class);
	        pap.getSearchbox().sendKeys(data);
	        
			pap.getSearchbtn().click();
			pap.getAsc().click();

	
		}
	
	
	
	
	
	

}
