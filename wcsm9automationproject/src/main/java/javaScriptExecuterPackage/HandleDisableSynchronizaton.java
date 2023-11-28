package javaScriptExecuterPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableSynchronizaton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		Thread.sleep(2000);		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		Thread.sleep(2000);

		WebElement entertimetxtbx = driver.findElement(By.xpath("//input[contains(@class,'b')]"));


	}

}
