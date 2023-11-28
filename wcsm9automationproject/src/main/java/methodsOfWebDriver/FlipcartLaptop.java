
package methodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartLaptop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
		WebElement cross=driver.findElement(By.xpath("//span[text()='✕']"));
	explicitWait(driver, 30, cross).click();

	driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
	//driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	Thread.sleep(2000);
	WebElement core=driver.findElement(By.xpath("//div[text()='Core i7']"));
	explicitWait(driver, 60, core).click();

	Thread.sleep(2000);

	WebElement flipCart=driver.findElement(By.xpath("//div[text()='Operating System']"));
	explicitWait(driver, 30, flipCart).click();

	WebElement os=driver.findElement(By.xpath("//div[text()='Windows 11']"));
	explicitWait(driver, 30, os).click();

	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);
	List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

	List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));


	Thread.sleep(2000);
	for(int i=1;i<allLaptops.size();i++)
{
	String laptop=allLaptops.get(i).getText();
	Thread.sleep(2000);
	for(int j=i;j<=i;j++)
	{
		String price = allprice.get(j).getText();
	System.out.println(laptop+"   :   "+price);
	System.out.println();
	}
}

	}

	public  static WebElement  explicitWait(WebDriver driver,long sec,WebElement ele)
	{
	WebDriverWait	wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	}

}
