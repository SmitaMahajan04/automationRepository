package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://www.google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	Thread.sleep(2000);
	for(WebElement phone:allPhones)
	{
		System.out.println(phone.getText());
	}




	}

}
