package assignmentpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("manager12345");
	driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
	}

}
