package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Cucumber1 {
	private static WebDriver driver = null;
	
		// TODO Auto-generated method stub
		@Given("browser is open and application is in login page") 
		public void browser_is_open_and_application_is_in_login_page(){
			System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//throw new io.cucumber.java.PendingException();
		}
		@When("user enters user name and password") 
		public void user_enters_user_name_and_password() {
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
			//throw new io.cucumber.java.PendingException();
		}
		@Then ("home page is displayed") 
		public void home_page_is_displayed() {
			String actualResult, expectedResult = "PIM";
			actualResult = driver.findElement(By.xpath("//img[@alt = \"client brand banner\"]")).getText();
			
			//Assert.assertEquals(actualResult, expectedResult);
			//throw new io.cucumber.java.PendingException();
		}
//		@Then ("user logs out") 
//		public void user_logs_out() {
//			
//			driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
//			driver.findElement(By.xpath("//li[4]/a[@class = 'oxd-userdropdown-link']")).click();
//			
//			
//			
//		}

	

}
