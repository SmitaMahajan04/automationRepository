package testNGAnnotations_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {
  @Test
  public void searchJava() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void searchSelenium() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	  Thread.sleep(2000);
  }

}
