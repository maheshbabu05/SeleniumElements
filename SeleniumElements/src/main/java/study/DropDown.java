package study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/select-menu");
		
		// SelectByIndex
		//SelectByValue
		//SelectByvisibleText
		//SendKey Via Drop Select
		// Find how many data on drop dowm(Size of Drop)
		// MultiSelect
		
		WebElement drop1 = Driver.findElement(By.id("oldSelectMenu"));
		Select Sc = new Select(drop1);
		Sc.selectByIndex(1);
		System.out.println("index is" + Sc);
		Thread.sleep(3000);
		
		WebElement drop2 = Driver.findElement(By.className("css-yk16xz-control"));
		Select Sc1 = new Select(drop1);
		Sc.selectByVisibleText("Green");
		System.out.println("Text is" + Sc1);
		Thread.sleep(3000);
		
		WebElement drop3 = Driver.findElement(By.className("css-yk16xz-control"));
		Select Sc2 = new Select(drop1);
		Sc.selectByValue("7");
		System.out.println("value is" + Sc2);
		Thread.sleep(3000);
		
		
		// Find how many data on drop dowm(Size of Drop)
		List<WebElement> data = Sc2.getOptions();
		int size = data.size();
		System.out.println("value is" + size);
		
		//SendKey Via Drop Select
		drop3.sendKeys("Aqua");
		
		// MultiSelect
		
		
		WebElement drop11 = Driver.findElement(By.id("oldSelectMenu"));
		Select MultiSelect = new Select(drop11);
		MultiSelect.selectByIndex(1);
		MultiSelect.selectByIndex(2);
		MultiSelect.selectByIndex(3);
		
		
		

	}

}
