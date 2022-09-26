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
public class BasicLogin {

	public static void main(String[] args) throws IOException {
	
	    File file = new File("//C://Users//ei13073//Desktop//FacebookAuto.xlsx");
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook workBook = null; 
	    workBook = new XSSFWorkbook(inputStream);
	    Sheet sheet = workBook.getSheet("Sheet1");
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzOTMzNDA4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());		
		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());

	}

}
