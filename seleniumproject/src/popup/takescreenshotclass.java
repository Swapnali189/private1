package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshotclass {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
//((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File dest=new File("C:\\Users\\Admin\\Pictures\\Capture.PNG");
	
	//FileHandler.copy(source, dest);
	
	
	
	}

}
