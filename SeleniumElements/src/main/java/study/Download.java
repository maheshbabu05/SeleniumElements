package study;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args)  throws InterruptedException {
	
		// TODO Auto-generated method stub
		
       WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://leafground.com/grid.xhtml");
		WebElement DWN  = Driver.findElement(By.id("form:j_idt93"));
		DWN.click();
		
		
		File Filelocation = new File("C:\\Users\\ephron\\Desktop\\RIA");
		
		File [] NoOfFile =Filelocation.listFiles();
		
		for (File file : NoOfFile) {
			file.getName().equals("products");
			System.out.println("The name is " + file);
			break;
			
		}
		

	}

}
