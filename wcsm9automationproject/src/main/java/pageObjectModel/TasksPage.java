package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
//Store all the webelements of tasks page
	@FindBy(partialLinkText = "Projects & Customers")private WebElement   Projects_And_Customer_SubModule;
	@FindBy(xpath  ="//input[@value='Create New Customer']")private WebElement Create_new_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement Create_Ne_Project_Button;


	//initalization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	//getter setter


	//operational method

	public void createCustomer_CreateProject_Method() throws InterruptedException {
		Projects_And_Customer_SubModule.click();
		Thread.sleep(1000);
		Create_new_Customer_Button.click();
		Thread.sleep(1000);

	}

}
