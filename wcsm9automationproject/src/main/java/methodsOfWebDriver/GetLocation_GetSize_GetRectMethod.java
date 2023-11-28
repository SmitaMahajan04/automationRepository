package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRectMethod {
	public static void main(String[] args) {
WebDriver	driver=	new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://demoapps.qspiders.com/");
WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));


Point loc = emailTextBox.getLocation();
int xaxis=loc.getX();
  int yxis = loc.getY();
  System.out.println("position of email textbox "+xaxis+": "+yxis);
  Dimension size = emailTextBox.getSize();
  int height = size.getHeight();
  int width = size.getWidth();
  System.out.println("Size of email textbox "+height+": "+width);
  //below line is extra line for more information
  System.out.println(emailTextBox.getCssValue("height")+"  "+emailTextBox.getCssValue("width"));


  Rectangle rect = emailTextBox.getRect();
  System.out.println(rect.getX()+":"+rect.getY());
  System.out.println(rect.getHeight()+":"+rect.getWidth());



	}

}
