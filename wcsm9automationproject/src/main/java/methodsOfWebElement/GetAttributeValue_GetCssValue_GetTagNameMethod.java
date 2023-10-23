package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue_GetCssValue_GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
	
	Thread.sleep(2000);
	String atrributeValue = loginButton.getAttribute("class");
	System.out.println(atrributeValue);
	
Thread.sleep(2000);

String cssValue = loginButton.getCssValue("color");
System.out.println(cssValue);
Thread.sleep(2000);

loginButton.getTagName();

	}

}
