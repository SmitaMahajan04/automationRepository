package synchronisationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEntToEnd {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("women",Keys.ENTER);
	String parentHandle = driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@class='img-responsive' and contains (@ title,'SI')]")).click();
	Set<String> allHandles = driver.getWindowHandles();
	for(String wh:allHandles)
	{
		if(!parentHandle.equals(wh))
		{
			driver.switchTo().window(wh);
		}
	}
	Thread.sleep(2000);
	WebElement xl = driver.findElement(By.xpath("//p[text()='XL']"));
	explicitWait(driver, 30, xl).click();
	
	driver.findElement(By.name("pincode")).sendKeys("411033");
	driver.findElement(By.xpath("//input[@value='Check']")).click();
	}
	
	public  static WebElement  explicitWait(WebDriver driver,long sec,WebElement ele)
	{
	WebDriverWait	wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	}


}
