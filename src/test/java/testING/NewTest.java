package testING;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver = null; 
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Login details
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		this.driver = driver;
  }
  @Test
  public void logout() {
	  
		
		driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//li[4]/a[@role = 'menuitem']")).click();
		this.driver = driver;
  }
  
  @Test
  public void facebook() {
	  
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Facebook sign-up page
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007774%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeSfg4BPG3Dky9HyIVRDAWfw_O263a42MFGPfFy9yXJrsXpScR056fBoCj9IQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//First name and last name
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Vishisht");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Padiyar");
		
		//Email ID
		driver.findElement(By.name("reg_email__")).sendKeys("vishisy1111@gmail.com");
		
		//Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");
		
		//Birthday
		driver.findElement(By.id("day")).sendKeys("1");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("2002");
		
		//Select Gender
		driver.findElement(By.xpath("//span[2]/label")).click();
		
		
		//Confirm email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vishisy@gmail.com");
		
		
		//Sign-up button
		driver.findElement(By.name("websubmit")).click();
		this.driver = driver;
  }
  
  
  @Test
  public void table() {
	  
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		String a = driver.findElement(By.xpath("//tr[3]/td[1]")).getText();
		System.out.print(a);
		this.driver = driver;
  }
  
  
  @Test
  public void facebookInputExcel() throws IOException {
	  
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
