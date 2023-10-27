package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		//store all the drag elements
		WebElement source1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement source2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement source3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement source4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(2000);
		
		//store all the drop elements
		WebElement target1 = driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[1]"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[2]"));
		Thread.sleep(2000);
		
		//perform drag and drop for mobile
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2, target1).perform();
		
		
		Thread.sleep(2000);
		act.dragAndDrop(source3, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source4, target2).perform();
		

	}
	

}
