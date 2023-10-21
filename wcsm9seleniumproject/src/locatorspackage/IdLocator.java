package locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=	new ChromeDriver();
		driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/admin/Desktop/wcsm9webelement/simplelogin.html");
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.id("i2")).sendKeys("manager");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
