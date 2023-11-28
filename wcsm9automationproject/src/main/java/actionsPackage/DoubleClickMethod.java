package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");


	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Double Click']")).click();

	WebElement btn1 = driver.findElement(By.xpath("(//BUTTON[text()='Yes'])[1]"));
	WebElement btn2 = driver.findElement(By.xpath("(//BUTTON[text()='No'])[2]"));
	WebElement btn3 = driver.findElement(By.xpath("//BUTTON[text()='3']"));


	Actions act = new Actions(driver);
	act.doubleClick(btn1).perform();
	Thread.sleep(2000);
	act.doubleClick(btn2).perform();
	Thread.sleep(2000);
	act.doubleClick(btn3).perform();
	Thread.sleep(2000);



}
}
