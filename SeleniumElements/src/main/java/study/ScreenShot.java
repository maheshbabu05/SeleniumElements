package study;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		TakesScreenshot scrShot =((TakesScreenshot)Driver);
		
		Driver.get("https://demoqa.com/select");
		
		File takeSS= scrShot.getScreenshotAs(OutputType.FILE);
		
		
		File destination = new File("C:\\Users\\ephron\\Desktop\\GIT");
	
		Files.copy(takeSS, destination);
		ImageIO.write(null, null, destination);
}
}

