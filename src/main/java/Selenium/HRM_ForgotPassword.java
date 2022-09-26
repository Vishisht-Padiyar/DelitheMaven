package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/p[@class = \"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		
		driver.findElement(By.xpath("//button")).click();
		
		String url = driver.getCurrentUrl();  
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("After assertion");

	}

}
