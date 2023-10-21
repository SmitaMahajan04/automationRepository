package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(2000);
 driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk0ODI3MDkyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
  Thread.sleep(2000);

  driver.findElement(By.id("email")).sendKeys("abc@123gmail.com");
  driver.findElement(By.id("pass")).sendKeys("12345");
  
Thread.sleep(2000);
driver.quit();
}
}
