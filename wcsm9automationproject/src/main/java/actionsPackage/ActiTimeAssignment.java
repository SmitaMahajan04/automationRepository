package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAssignment {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-2lhagot/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).click();
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
	driver.findElement(By.linkText("Logo & Color Scheme")).click();
	
	
	
	}

}
