package presentation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1644122055%3A1664205411605857&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWp83nZdhDf8lKaCvq-h8yZlcCCE8lVse5y14NFO-gV32TXZ4XpuBJ6IbhD5B3qvMfuzF8vLFA");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		driver.findElement(By.xpath("//input[@type = \"email\"]")).sendKeys("vishisy@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();

	}

}
