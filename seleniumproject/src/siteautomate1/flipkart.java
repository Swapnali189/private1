package siteautomate1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement id=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	id.sendKeys("9665528512");
	
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("swapp189");
	
	WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	login.click();
	
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("smart watch");
	
	//WebElement search=driver.findElement(By.xpath("//img[@alt='Electronics']"));
	//search.click();
	
	}
}
