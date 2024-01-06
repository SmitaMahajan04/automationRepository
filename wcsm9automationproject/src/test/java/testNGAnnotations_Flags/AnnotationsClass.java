package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
	  Reporter.log("Test annotation",true);
	  
  }
  
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("Before Method annotation", true);
  }
  
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("BeforeClass annotation", true);  
  }
  
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("After Method annotation", true);
  }
  
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("AfterClass annotation", true);
  }
  
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("Before Test annotation", true);
  }
  
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("Before Suite annotation", true);
  }
  
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("After Test annotation", true);
  }
  
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("AfterSuite annotation", true);
  }

  @Test
  public void annotation_Test_Method1() {
	  Reporter.log("Test annotation 1",true);
	  
  }
  
  @Test
  public void annotation_Test_Method2() {
	  Reporter.log("Test annotation 2",true);
	  
  }
  @Test
  public void annotation_Test_Method3() {
	  Reporter.log("Test annotation 3",true);
	  
  }







  
}
