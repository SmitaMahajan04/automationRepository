package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();

		//maximize the browser/window
	driver.manage().window().maximize();
	Thread.sleep(2000);

	//minimize the browser
	driver.manage().window().minimize();
	Thread.sleep(2000);

	//to fullscreen the browser
	driver.manage().window().fullscreen();
	Thread.sleep(2000);

	//set the size of browser
	Dimension targetSize = new Dimension(450, 350);
	driver.manage().window().setSize(targetSize);
	Thread.sleep(2000);


	//set the position to browser
	Point targetPosition = new Point(450, 250);
	driver.manage().window().setPosition(targetPosition);
	Thread.sleep(2000);
	driver.quit();

	}

}
