package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	driver.findElement(By.name("flightSearchFrom")).sendKeys("pune");
	driver.findElement(By.cssSelector("input[name*='flightSearchTo']")).sendKeys("goa");
	driver.findElement(By.cssSelector("input[id*='departCalendar']")).click();
	driver.findElement(By.cssSelector("a[data-date='29']")).submit();
	
	//driver.findElement(By.xpath("//p[@id='ui-id-250']")).click();
	
	
	}
	
	

}
