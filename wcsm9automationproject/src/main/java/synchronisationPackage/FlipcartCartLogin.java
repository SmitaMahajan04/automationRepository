package synchronisationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartCartLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	driver.findElement(By.xpath("//a[@class='_3RX0a-'  and (@title='Cart')]")).click();
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//div[@class='_38VF5e']/descendant::a[@class='_3RX0a-'])[2]")).click();
	//Thread.sleep(2000);
	}

}
