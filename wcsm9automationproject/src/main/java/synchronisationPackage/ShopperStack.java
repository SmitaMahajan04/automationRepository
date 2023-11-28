package synchronisationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/products_page/5");

	//driver.findElement(By.id("Check Delivery")).sendKeys("411033");


	WebDriverWait	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeSelected(By.id("Check Delivery",Keys.ENTER)));
 wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();


	//driver.findElement(By.id("Check")).click();
	}

}
