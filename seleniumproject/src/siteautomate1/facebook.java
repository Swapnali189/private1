package siteautomate1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement emailid=driver.findElement(By.id("email"));
	emailid.sendKeys("supu25588@gmail.com");
	
WebElement passward=driver.findElement(By.id("pass"));
 passward.sendKeys("swap123");
 
 WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
	login.click();
	
	
WebElement search=driver.findElement(By.xpath("(//input[@aria-label='Search Facebook'])[1]"));
 search.sendKeys("vrushali"); search.click();
 
 //driver.findElement(By.xpath("//[@id='pagelet_welcome_box']")).click();
 
 
	}
	
}
