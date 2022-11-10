package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement jj = Driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		jj.click();
		
		WebElement checkEnable = Driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
	    boolean ischeck=	checkEnable.isDisplayed();
	    System.out.println(ischeck);
	    
	    
	}

}
