package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Leave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Login details
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		
		//Leave button
		driver.findElement(By.xpath("//li[3]/a/span")).click();
		
		
		//Apply button
		driver.findElement(By.xpath("//header/div[2]/nav/ul/li")).click();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Leave type
		driver.findElement(By.xpath("//div[@class = \"oxd-select-text-input\"]")).click();
		
		//
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-09-26");
		
		driver.findElement(By.xpath("//div/textarea")).sendKeys("Work from home application");
		
		driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();
		
		
		

	}

}
