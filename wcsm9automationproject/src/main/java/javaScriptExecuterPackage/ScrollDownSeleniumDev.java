package javaScriptExecuterPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollDownSeleniumDev {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		WebElement twitterLogo = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		
		Thread.sleep(2000);
		
		Point loc = twitterLogo.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		Thread.sleep(2000);
		
		//take screenshot of twitterlogo
			File src = twitterLogo.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/twitter.jpg");
			Files.copy(src, dest);
			
						
			
	}

}
