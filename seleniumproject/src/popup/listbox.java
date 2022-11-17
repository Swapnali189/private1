package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/login.php");
	
	WebElement signin=driver.findElement(By.xpath("//a[@rel='nofollow']"));
	signin.click();
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	month.click();
 Select s=new Select (month);
 s.selectByVisibleText("Sep");
 
 //s.selectByValue("18");
		
		s.o.p("month");
	}

}
