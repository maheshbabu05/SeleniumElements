package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.browserstack.com/guide/verify-tooltip-in-selenium");
		
		WebElement name = Driver.findElement(By.xpath("//*[@id=\"product-nav\"]/ul/li[4]/a"));
		String obj =name.getAttribute("title");
		
		System.out.println("The title is"  + obj) ;

}}
