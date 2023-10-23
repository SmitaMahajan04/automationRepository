package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex_SelectByValu_SelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com/dropdown/multiSelect");
	Thread.sleep(2000);
	WebElement dropdown = driver.findElement(By.xpath("//section[@class='flex gap-3']"));
	Select sel=new Select(dropdown);
	sel.selectByIndex(0);
	
	
	
	 WebElement dropDown = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	 Select ele = new Select(dropDown);
	 
	 ele.selectByValue("india");

	}

}
