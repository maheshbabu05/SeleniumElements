package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	
		
		public static void main(String[] args)  throws InterruptedException {
			
			// TODO Auto-generated method stub
			
	       WebDriver Driver = new ChromeDriver();
			
			Driver.get("https://leafground.com/grid.xhtml");
			
//			WebElement image = Driver.findElement(By.xpath("//*[@id=\"j_idt13\"]"));
//			image.click();
			
			WebElement image2 = Driver.findElement(By.id("j_idt13"));
			
			if(image2.getAttribute("naturalwidth").equals("0")){
				
				System.out.println("Iamage is broken");
			}else {
				System.out.println("Iamge is not broken");
			}
			
			
			
			

	}

}
