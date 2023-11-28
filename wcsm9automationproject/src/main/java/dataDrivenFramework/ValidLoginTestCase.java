package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("http://desktop-nadpcq4/login.do");
	//To read password data from excel file
	Flib flib = new Flib();
	String usnData = flib.readExcelData("./src/main/resource/ActiTimeTestData.xlsx", "validcreds", 1, 0);
	String passData = flib.readExcelData("./src/main/resource/ActiTimeTestData.xlsx", "validcreds", 1, 1);
	Thread.sleep(2000);

	driver.findElement(By.name("username")).sendKeys(usnData);
	driver.findElement(By.name("pwd")).sendKeys(passData);

	driver.findElement(By.id("loginButton")).click();

	}

}
