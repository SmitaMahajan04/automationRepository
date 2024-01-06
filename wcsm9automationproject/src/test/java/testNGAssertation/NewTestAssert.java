package testNGAssertation;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  
	  Reporter.log("Launch Browsers", true);
	  Reporter.log("Launch webApplication by using URL", true);

	  
	  Reporter.log("Verify and validate loginpage", true);
	  
	  //Apply SoftAssert
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(false, false);

  }
}
