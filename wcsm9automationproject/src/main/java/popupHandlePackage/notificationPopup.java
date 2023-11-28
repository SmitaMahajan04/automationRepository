package popupHandlePackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notificationPopup {
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter BrowserValue");
		String browserValue = sc.next();

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(co);
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			 FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			 FirefoxDriver driver = new FirefoxDriver(fo);

		}


		else if(browserValue.equalsIgnoreCase("edge"))
		{
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
		 EdgeDriver driver = new EdgeDriver(eo);
		}

		else
		{
		System.out.println("Enter valid browservalue");
		}

		driver.get("https://www.irctc.co.in/nget/");

	}

}
