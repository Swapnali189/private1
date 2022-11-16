package siteautomate1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
 //WebElement email=driver.findElement(By.xpath("//input[@type='email']"));           
		//email.sendKeys("supu25588@gmail.com");
//driver.findElement(By.id("ap_email")).sendKeys("supu25588@gmail.com");
 //driver.findElement(By.xpath("//input[@id='continue']")).click();
 //driver.findElement(By.id("continue")).click();
//driver.findElement(By.name("password")).sendKeys("18@9@1996");
 //driver.findElement(By.id("signInSubmit")).click();
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("realme smart watch");
	WebElement enter=driver.findElement(By.id("nav-search-submit-button"));
		enter.click ();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,2000)")	; //scroll down
	
WebElement realmewatch=driver.findElement(By.xpath("(//img[@class='s-image'])[7]"));
		realmewatch.click();
///WebElement prodbuy=   driver.findElement(By.xpath("/input[@id='add-to-cart-button']"));
//prodbuy.click();
		
	WebElement buy=	driver.findElement(By.id("buy-now-button"));
	buy.click();
		

	   
	}
}
