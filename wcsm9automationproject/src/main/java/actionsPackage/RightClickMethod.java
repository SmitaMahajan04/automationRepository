package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(2000);
		WebElement rightClickButton1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		WebElement rightClickButton2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
		WebElement rightClickButton3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));

		Actions act = new Actions(driver);
	act.moveToElement(rightClickButton1).contextClick().perform();
	Thread.sleep(2000);
	/*if(driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed())
	{
		Thread.sleep(2000);
		System.out.println("displayed");
		
	}
	else
	{
		System.out.println("displayed");
	}*/
	Thread.sleep(2000);
	act.moveToElement(rightClickButton2).contextClick().perform();
	Thread.sleep(2000);
	
	act.moveToElement(rightClickButton3).contextClick().perform();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//div[text()='Yes']")).click();
	//Thread.sleep(2000);
	
	
	
	}

}
