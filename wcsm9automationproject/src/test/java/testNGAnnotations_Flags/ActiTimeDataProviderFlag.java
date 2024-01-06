package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProviderFlag {
  @Test(dataProvider="TestData")
  public void invalidLoginmethod(String usn,String pass) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("http://smitamahajan/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys(usn);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).clear();
	  
	driver.quit();
  }
  
  
  @DataProvider(name="TestData")
  public Object[][]  actiTimeTestDataMethod()
  {
	  Object[][] testData = new Object[5][2];
	 
	 testData[0][0]="ad_min";
	 testData[0][1]="mana_ger";
	 
	 testData[1][0]="ad123";
	 testData[1][1]="mana123";
	 
	 testData[2][0]="456min";
	 testData[2][1]="456ger";
	 
	 testData[3][0]="min";
	 testData[3][1]="add";
	 
	 testData[4][0]="manager";
	 testData[4][1]="admin";
	 
	 return testData;
  }
}
