package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("userid")).sendKeys("abc");
	driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(2000);
	driver.quit();
	}

}
