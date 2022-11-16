package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();


	Thread.sleep(2000);
	driver.manage().window().maximize(); //to maximize browser
	Options option=driver.manage();
	Window window=option.window();
	window.maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Dimension d1=new Dimension(200,400);//height&width
	driver.manage().window().setSize(d1);//to setsize the browser
	//Thread.sleep(2000);
	//Point point=new Point(400,600);
	//driver.manage().window().setPosition(point); //to setposition
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);

	driver.close();
	driver.quit();
	//driver.get("https://web.whatsapp.com/");	
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://web.whatsapp.com/");

	}
}
