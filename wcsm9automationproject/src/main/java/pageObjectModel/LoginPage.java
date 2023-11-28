package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
// store all WebElements of login page
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement keepMeLoggedInCheckBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	@FindBy(partialLinkText = "License") private WebElement liscenceLink;

	//Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);



	}

	//utilization

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	public WebElement getLiscenceLink() {
		return liscenceLink;
	}

	//operational methods
	public void validLogin(String Validusn,String Validpass)
	{
		usnTB.sendKeys(Validusn);
		passTB.sendKeys(Validpass);
		loginButton.click();


	}

	public void inValidLogin(String inValidusn,String inValidpass)
	{
		usnTB.sendKeys(inValidusn);
		passTB.sendKeys(inValidpass);
		loginButton.click();

		usnTB.clear();


	}




}
