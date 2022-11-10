package study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver Driver = new ChromeDriver();
			Driver.get("https://leafground.com/frame.xhtml");
			
			Driver.switchTo().frame(0);
			WebElement F = Driver.findElement(By.id("Click"));
			
			F.click();
			
			String t = Driver.findElement(By.id("Click")).getText();
			System.out.println(t);
			
//			Driver.switchTo().defaultContent();
//			Driver.switchTo().frame(1);
//			Driver.switchTo().frame("frame2");
//			WebElement F2 = Driver.findElement(By.xpath("//*[@id=\"Click\"]"));
//			F2.click();
			
			Driver.switchTo().defaultContent();
			
			List <WebElement> Total =Driver.findElements(By.tagName("iframe"));
			Total.size();
			System.out.println("Total rr" +Total);
			
			

	}

}
