package popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(1000);

	 List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	System.out.println("Count of Rows:-"+rows.size());
	for (int i=0;i<rows.size();i++) {
		System.out.println(rows.get(i).getText());
	}
	}
}
