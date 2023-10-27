package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(2000);
	WebElement wtchjwell = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	Actions act = new Actions(driver);
	act.moveToElement(wtchjwell).perform();
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	WebElement wtchbndjwell = driver.findElement(By.xpath("//span[text()='WATCH BAND JEWELLERY']"));
	System.out.println(wtchbndjwell.isDisplayed());
	driver.quit();
	}

}
