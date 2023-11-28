package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBlueStone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		//handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//switch the controls to frame
		WebElement webelement = driver.findElement(By.id(null));
		//driver.switchTo().frame(6); // int index
		//driver.switchTo().frame("fc_widget");//string name or id
		//driver.switchTo().frame(null)//webelement frameelement

		Thread.sleep(2000);

		//click on chat box

		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-name")).sendKeys("abcd");
	}

}
