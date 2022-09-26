package SeleniumCont;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFacebook1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		//Prepare the path of excel file
		String filePath="//C://Users//ei13073//Desktop";
		String fileName="FacebookAuto.xlsx";
		String sheetName="Sheet1";
		//Create an object of File class to open xlsx file

	    File file = new File(filePath+"//"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet sheet = workBook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);

	    //Create a loop over all the rows of excel file to read it
	    //String a[] = {};
	    //int b = 0;
//	    for (int i = 0; i < rowCount+1; i++) {
//
//	        Row row = sheet.getRow(i);
//
//	        //Create a loop to print cell values in a row
//
//	        for (int j = 0; j < row.getLastCellNum(); j++) {
//
//	            //Print Excel data in console
//	        	//a[b] = (row.getCell(j).getStringCellValue());
//
//	            System.out.print(row.getCell(1).getStringCellValue()+"|| ");
//	            //b++;
//
//	        }
//
//	        System.out.println();
//	    } 
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Facebook sign-up page
		driver.get(" https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzOTMzNDA4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		
		
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
	   
	  
		

	}

}
