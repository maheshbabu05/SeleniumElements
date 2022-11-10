package study;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	
	public static void main(String[] args)  throws InterruptedException {
		
		// TODO Auto-generated method stub
		
       WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://leafground.com/grid.xhtml");
		
		WebElement Up = Driver.findElement(By.xpath("//input[@type='file']"));
		
		File f = new File ("./bondpatbox.pdf");
		System.out.println(f.getAbsolutePath());

		Up.sendKeys(f.getAbsolutePath());
		
		

}
}
