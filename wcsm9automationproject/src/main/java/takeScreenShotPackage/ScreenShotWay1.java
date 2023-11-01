package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	//directly creates the obj of browser specific classe
	public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapps.qspiders.com/");
	
	//take ascreenshot of demoapps
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/demoapps.jpg");
	Thread.sleep(2000);
	Files.copy(src, dest);
	
	
	}

}
