package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod {
	
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	int window=1;
	driver.get("http://omayo.blogspot.com/");
	System.out.println("address of parent window: "+driver.getWindowHandle());
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	//driver.findElement(By.partialLinkText("compendiumdev")).click();
	driver.findElement(By.partialLinkText("Blogger")).click();
	
	driver.findElement(By.partialLinkText("SeleniumTutorial")).click();
	Set<String> allHandles=driver.getWindowHandles();
	//System.out.println("address of open window: "+driver.getWindowHandles());
	System.out.println("Here are all Windows address that are open");
	for(String wh:allHandles)
	{
		
		System.out.println(" address of Window"+window+" : "+wh);
	//System.out.println(wh);
		window++;
	}
	}
}
