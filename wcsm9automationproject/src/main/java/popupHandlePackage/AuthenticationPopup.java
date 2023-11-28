package popupHandlePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(2000);
		//address of authentication page window
		String authenticationpopupwindow = driver.getWindowHandle();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);

		//get the address of all present window


		Set<String> allwindowhandles = driver.getWindowHandles();

		Thread.sleep(2000);
		//shift controls to authentication popup window page

		for(String wh:allwindowhandles)
		{
			Thread.sleep(2000);
			if(!authenticationpopupwindow.equals(wh))
			{
				driver.switchTo().window(wh);

			}
		}

		Thread.sleep(2000);
		//handle authentication popup
		handleAuthenticationPopup();

	}

	public static void handleAuthenticationPopup() throws AWTException
	{

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);


		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);


		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);


		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);




	}

}
