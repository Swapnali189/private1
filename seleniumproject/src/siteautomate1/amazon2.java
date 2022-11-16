package siteautomate1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//WebElement mobile=driver.findElement(By.xpath("//a[text()='mobiles']"));
	//mobile.click();
	
	driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	 WebElement emailid=driver.findElement(By.xpath("//input[@type='email']"));           
			emailid.sendKeys("supu25588@gmail.com");
	WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
			continuebutton.click();
WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("supu189");
WebElement submit= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			 submit.click(); //login']
	
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("melton water bottle");
	WebElement enter=driver.findElement(By.id("nav-search-submit-button"));
	enter.click ();  //searchproduct

	JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,2000)")	; //scroll down
	
WebElement bottle= driver.findElement(By.xpath("(//img[@class='s-image'])[4]"));
 bottle.click();
 //driver.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).click();
//WebElement quantity=driver.findElement(By.xpath("//select[@name='quantity']"));
//quantity.sendKeys("2");
	
	
	
	
	}
  
}
