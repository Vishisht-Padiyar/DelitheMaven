package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmMethodOverrloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HrmMethodOverrloading.search("Anthony.Nolan");
		
		HrmMethodOverrloading.search( "Anthony.Nolan", "Anthony Nolan");
		
	}
		
		static void search(String name) {
			System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			
			driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
			
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//div/div/div/div/input")).sendKeys(name);
			driver.findElement(By.xpath("//form/div/button[2]")).click();
			
		
		}
		static void search(String name, String empname) {
			System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			
			driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
			
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			driver.findElement(By.xpath("//span")).click();
			driver.findElement(By.xpath("//div/div/div/div/input")).sendKeys(name);
			driver.findElement(By.xpath("//form/div/button[2]")).click();
			driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empname);
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//form/div/button[2]")).click();
		
		}

}
