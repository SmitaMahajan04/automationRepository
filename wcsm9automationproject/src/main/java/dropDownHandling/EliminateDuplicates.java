package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/admin/Documents/dropdown.html");
	
	//identify the dropdown and store it in ref variable
	WebElement menuDropDown = driver.findElement(By.id("iddd"));
	
	//get all the options of menuDropDown
	Select sel = new Select(menuDropDown);
	List<WebElement> allOps = sel.getOptions();
	
	//to eliminate duplicates we use hashset
	HashSet<String> hs = new HashSet<String>();
	
	//read the list by using for loop and eliminate duplicates
	for(int i=0;i<allOps.size();i++)
	{
		WebElement op = allOps.get(i);
		
		//get the text of webelement
		String dropDownOption = op.getText();
		
		//add the dropdownoption into hashset and remove duplicates
		hs.add(dropDownOption);
		
		
		
	}
	Thread.sleep(2000);
	//READ THE OPTIONS FROM HASHSET BY USING FOR EACH LOOP
	for(String opt:hs)
		
	{
		Thread.sleep(2000);
		System.out.println(opt);
	}
	
	
	
	
	}

}
