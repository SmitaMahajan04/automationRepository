package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	 @Test
	  public void fmethod1() {
		  Reporter.log("method1 from Test2 Class", true);
	  }
	  
	  @Test
	  public void fmethod2() {
		  
		  int a=5,b=1;
		  int res=a/b;
		  Reporter.log("method2 from Test2 Class"+res, true);
	  }

}
