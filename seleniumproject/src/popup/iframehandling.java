package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(1000);
		
	driver.switchTo().frame("iframeresult");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
	driver.switchTo().frame(iframe);
}
}
