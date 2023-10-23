package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTask {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-2lhagot/login.do");
	WebElement userNameTB = driver.findElement(By.name("username"));
	WebElement passTB = driver.findElement(By.name("pwd"));
	userNameTB.sendKeys("admin");
	passTB.sendKeys("admin123");
	Thread.sleep(2000);
	userNameTB.click();
	//Sysout(userNameTB.getText());
System.out.println(userNameTB.getText());
	System.out.println(passTB.getText());
	}

}
