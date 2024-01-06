package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void fmethod1() {
	  Reporter.log("method1 from Test1 Class", true);
  }
  
  @Test
  public void fmethod2() {
	  Reporter.log("method2 from Test1 Class", true);
  }

}
