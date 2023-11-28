package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();

	//launch the browser
	driver.navigate().to("https://www.selenium.dev/");
	driver.manage().window().maximize();
	Thread.sleep(2000);

	//to perform backward operation
	driver.navigate().back();
	Thread.sleep(2000);

	//to perform forward operation
	driver.navigate().forward();
	Thread.sleep(2000);

	//to perform refresh operation
	driver.navigate().refresh();
	Thread.sleep(2000);

	driver.quit();
	}

}
