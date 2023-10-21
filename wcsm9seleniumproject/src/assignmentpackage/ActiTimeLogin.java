package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-2lhagot/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("abc");
	driver.findElement(By.name("pwd")).sendKeys("1234");
	Thread.sleep(2000);
	driver.quit();
	}

}
