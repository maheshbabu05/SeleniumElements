package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/alerts");
		
		//Click Button to see alert and give Okay
		
		WebElement Al = Driver.findElement(By.id("alertButton"));
		Al.click();
		org.openqa.selenium.Alert alert1 = Driver.switchTo().alert();
		alert1.accept();
		
		
		//Click Button to see alert and give Cancel
		
		WebElement A2 = Driver.findElement(By.id("confirmButton"));
		Al.click();
		org.openqa.selenium.Alert confirm = Driver.switchTo().alert();
		Thread.sleep(3000);
		confirm.dismiss();
		
		
		//Click Button and add text on Popup
		
		WebElement A3 = Driver.findElement(By.id("promtButton"));
		Al.click();
		
		org.openqa.selenium.Alert promtButton1 = Driver.switchTo().alert();
		promtButton1.sendKeys("Mahesh");
		Thread.sleep(3000);
		promtButton1.accept();
		
		
	}

}
