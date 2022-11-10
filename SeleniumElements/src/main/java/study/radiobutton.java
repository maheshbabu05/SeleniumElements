package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/radio.xhtml");
		
		
		WebElement radio1 = Driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/div/div[2]/span"));
		radio1.click();
		

}
}
