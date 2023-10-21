package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver	= new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Chrome Open");
		driver.close();
		System.out.println("Chrome Close");
	}

}
