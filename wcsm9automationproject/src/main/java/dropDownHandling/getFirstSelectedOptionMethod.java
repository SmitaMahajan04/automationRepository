package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/admin/Documents/dropdown1.html");
	// single select dropdown
	
	WebElement dropdown1 = driver.findElement(By.id("id1"));
	
	//handle the dropdown
Select sel = new Select(dropdown1);

//select the option from drown
Thread.sleep(2000);
sel.selectByValue("v3");
WebElement firstopt = sel.getFirstSelectedOption();
System.out.println(firstopt.getText());
//identify dropdown

driver.get("file:///C:/Users/admin/Documents/dropdown1.html");

	
	
	}
	

}
