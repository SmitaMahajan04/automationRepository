package javaScriptExecuterPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		 
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='Smita'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='smita2@gmail.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='Pass@123'\r\n"
				+ "");
		
		WebElement registerbtn = driver.findElement(By.xpath("//button[text()='Register']"));
		WebElement loginbtn = driver.findElement(By.xpath("//a[contains(@class,'bg-orange-5')]"));
		
		//for resgister btn
		Thread.sleep(2000);
		if(registerbtn.isDisplayed())
		{
			
		jse.executeScript("arguments[0].click()",registerbtn);
		System.out.println("click");
		}
		else
		{
			System.out.println("not click");
			
		}
		
		//for login btn
		Thread.sleep(2000);
		if(loginbtn.isDisplayed())
		{
			
		jse.executeScript("arguments[0].click()",loginbtn);
		System.out.println("click");
		}
		else
		{
			System.out.println("not click");
			
		}
		
		
	}

}
