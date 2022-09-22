package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")).click;

		
		

	}

}
