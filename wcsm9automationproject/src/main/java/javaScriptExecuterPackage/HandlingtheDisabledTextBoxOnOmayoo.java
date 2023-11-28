package javaScriptExecuterPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandlingtheDisabledTextBoxOnOmayoo {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(2000);

		WebElement disabletxtbx = driver.findElement(By.id("tb2"));
		Point loc = disabletxtbx.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();


		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");


		Thread.sleep(2000);

		jse.executeScript("document.getElementById('tb2').value='automation testing'\r\n"
				+ "");

		Thread.sleep(2000);

		File src = disabletxtbx.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/auto.jpg");
		Files.copy(src, dest);












	}

}
