package keywordDrivenFramwork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resource/ActiTimeTestData1.xlsx", "invalidcreds");

		for(int i=1;i<rc;i++)
		{
		String invalidusn = (flib.readDataFromExcel("./src/main/resource/ActiTimeTestData1.xlsx", "invalidcreds", i,0));
		String invalidpwd = (flib.readDataFromExcel("./src/main/resource/ActiTimeTestData1.xlsx","invalidcreds",i, 1));

		Thread.sleep(2000);
		WebElement usnTb = driver.findElement(By.name("username"));
		usnTb.sendKeys(invalidusn);

	WebElement PassTb = driver.findElement(By.name("pwd"));
	PassTb.sendKeys(invalidpwd);
   driver.findElement(By.id("LoginButton")).click();
   Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
		 Thread.sleep(2000);
   bt.closeBrowser();

      	}

}
