package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to launch chromebrowser we need to create obj of ChromeDriver();
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome is open!!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("chrome is Close!!");
	}

}
