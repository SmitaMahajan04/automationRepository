package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(2000);
	WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
	//use actions class mousehover
	Actions act = new Actions(driver);
	act.moveToElement(coinsTarget).perform();
	driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	
	

	}

}
