package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAjwjaWoBhAmEiwAXz8DBVQwisVcUzW5Hbg9OPar4RQ7tQminvbnMu2RDGLNZdol_RyOi2YsCBoCCksQAvD_BwE&utm_source=google&utm_medium=search&utm_campaign=Rx-Perfmax&utm_content=vistara&ef_id=CjwKCAjwjaWoBhAmEiwAXz8DBVQwisVcUzW5Hbg9OPar4RQ7tQminvbnMu2RDGLNZdol_RyOi2YsCBoCCksQAvD_BwE:G:s&s_kwcid=AL!596!3!!!!x!!&s_kwcid=AL!596!3!!!!x!!&gad=1");
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	driver.findElement(By.cssSelector("input[class='scombobox-display wcag-form-field ui-autocomplete-input valid']")).sendKeys("pune");
	
	
	}

}
