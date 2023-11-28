package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1() {
	  Reporter.log("Method1 from Sumo Class", true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("Method2 from Smo Class", true);
  }
}
