package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='username']") 
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password;
	
	@FindBy (xpath = "//input[@name='remember']") 
	private WebElement keepMeLoginCheckbox;
	
	@FindBy (xpath ="//a[@id=\"loginButton\"]" ) 
	private WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String userid) {
		username.sendKeys("admin");
	}
	
	
	public void sendPassword(String pass) {
		password.sendKeys("manager");
	}
	
	public void selectKeepMeLoginCheckbox() {
		keepMeLoginCheckbox.click();
	}
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	public void loginToApplication()
	{
		username.sendKeys("admin");
		password.sendKeys("manager");
		keepMeLoginCheckbox.click();
		login.click();
	}


	

}
