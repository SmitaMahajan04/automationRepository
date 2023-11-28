package synchronisationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartEndToEndFlow {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//get the Address of parent window
		String parentHandle=driver.getWindowHandle();

		driver.findElement(By.xpath("(//div[@class='_4rR01T' ])[2]")).click();
		//get the Address of all the window

		 Set<String> allHandles = driver.getWindowHandles();
		 for(String wh:allHandles)
		 {
			 if(!parentHandle.equals(wh))
			 {
				 driver.switchTo().window(wh);

			 }
		 }

		 driver.findElement(By.xpath("(//div[@class='_2C41yO'])[2]")).click();
		 driver.findElement(By.xpath("//a[text()='256 GB']")).click();
		 driver.findElement(By.id("pincodeInputId")).clear();
		 driver.findElement(By.id("pincodeInputId")).sendKeys("411033",Keys.ENTER);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		// driver.findElement(By.xpath("//div[text()='Remove']")).click();

	}

}
