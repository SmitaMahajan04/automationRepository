package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("qwer");
	driver.findElement(By.name("pw")).sendKeys("122345");
	driver.findElement(By.name("rememberUn")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	}

}
