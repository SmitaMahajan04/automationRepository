package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesOnGoogleOnMaps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.com/");
		//click on google apps link
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();

		Thread.sleep(2000);

		//before clicking on maps switch controls to frame
		//identify frame and store it as webelement

		WebElement webelement = driver.findElement(By.name("app"));
		Thread.sleep(2000);
		driver.switchTo().frame(webelement);

		Thread.sleep(2000);

		//click on google map
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
