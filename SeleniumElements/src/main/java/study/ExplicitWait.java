package study;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://ephtesting.demo-ncmaas.com/home/login");
		
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Driver.findElement(By.id("email")).sendKeys("maheshbabu+flow1@captechin.com");
		
		Driver.findElement(By.name("password")).sendKeys("12345@Test");
		
		WebDriverWait waittime= new WebDriverWait(Driver, Duration.ofSeconds(30));
		
		WebElement p = waittime.until(ExpectedConditions.elementToBeClickable(By.name("reg_submit")));
		p.click();
		
		
		
		
	}
	
}
