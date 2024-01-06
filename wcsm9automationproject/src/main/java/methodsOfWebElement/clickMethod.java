package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://smitamahajan/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement passTB = driver.findElement(By.name("pwd"));
		usnTB.sendKeys("admin");
		passTB.sendKeys("admin@123");
		driver.findElement(By.id("loginButton")).click();
	}


}
