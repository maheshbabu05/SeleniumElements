package study;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/window.xhtml");
		
		// getWindowHandle used to fetch the first parent window
		String ParentWindow =Driver.getWindowHandle();
		
		
		 // Select the Element on parent Window
		WebElement Win = Driver.findElement(By.id("j_idt88:new"));
		Win.click();
		
		
		// getWindowHandle used to fetch the second window
		Set<String> window2 = Driver.getWindowHandles();
		
		//Her , we close the child window and redirect to parent window
		for (String STR : window2) {
			
			Driver.switchTo().window(STR);
			
			
		}
		
		WebElement second =Driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]"));
		second.click();
		Driver.close();
		Driver.switchTo().defaultContent();
		
		//MultipleWindow
		
		WebElement Multiple = Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		Multiple.click();
		
		int noOfWin=Driver.getWindowHandles().size();
		
        System.out.println("the total is"+noOfWin);
		
		
		
		
		
	}

}
