package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//to launch the self designed webpage
	driver.get("file:///C:/Users/admin/Desktop/wcsm9webelement/simplelogin.html");
	//identify username and pass input as "admin"
	driver.findElement(By.tagName("input")).sendKeys("admin");
	Thread.sleep(2000);
	//identify password and pass input as "manager"
	driver.findElement(By.tagName("input")).sendKeys("manager");
	Thread.sleep(2000);
	driver.quit();
	}

}
