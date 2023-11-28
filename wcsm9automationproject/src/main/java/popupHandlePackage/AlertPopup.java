package popupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demoapps.qspiders.com/");


		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		//generate alert popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default Alert']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();


		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String txtofalert = alert.getText();
		Thread.sleep(2000);
		System.out.println(txtofalert);

		alert.accept();



	}

}
