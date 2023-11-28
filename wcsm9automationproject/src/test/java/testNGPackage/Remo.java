package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() {
	  Reporter.log("Method1 from Remo Class", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("Method2 from Remo Class", true); 
  }
}
