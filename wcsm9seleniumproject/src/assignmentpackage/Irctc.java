package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("pune");
	//driver.switchTo().activeElement().sendKeys(" PUNE JN - PUNE ");
	driver.switchTo().activeElement().isSelected();
	driver.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
	
		
	driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("delhi");
	driver.switchTo().activeElement().isSelected();
	 driver.findElement(By.xpath("//span[text()=' DELHI - DLI ']")).click();
	 
	 
	// driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).sendKeys("29/09/2023");
	//driver.findElement(By.xpath("//div[contains(@class,'2 ui-dropdown ui-widget ui-state-default ui-corner-all')]")).sendKeys("ladies");
	//driver.findElement(By.xpath("//li[contains(@class,'ui-dropdown-item ui-corner-all ')]")).click();
	// driver.switchTo().activeElement().isSelected();
	// driver.findElement(By.xpath("//span[contains(@class,'ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12')]")).click();
	 //driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
	
	}

}
