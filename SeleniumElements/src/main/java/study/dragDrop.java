package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver Driver = new ChromeDriver();
			Driver.get("https://leafground.com/drag.xhtml;jsessionid=node01oa1yg2e0wzcodmjugoea5pw414339.node0");

			WebElement From = Driver.findElement(By.id("form:drag_content"));
			WebElement to = Driver.findElement(By.id("form:drop_header"));
			
			Actions Act = new Actions(Driver);
			
			//Act.clickAndHold(From).moveToElement(to).release(to).build().perform();
			Act.dragAndDrop(From, to).build().perform();
			
			
	}

}
