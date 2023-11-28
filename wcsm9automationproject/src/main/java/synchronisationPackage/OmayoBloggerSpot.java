package synchronisationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoBloggerSpot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
		//driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

		WebElement dropDown = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		explicitWait(driver,30,dropDown).click();

		WebElement flipCart=driver.findElement(By.xpath("//a[text()='Flipkart']"));
		explicitWait(driver, 30, flipCart).click();

	}
	public  static WebElement  explicitWait(WebDriver driver,long sec,WebElement ele)
	{
	WebDriverWait	wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	}

}
