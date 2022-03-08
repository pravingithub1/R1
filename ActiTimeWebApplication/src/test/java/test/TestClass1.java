package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;

public class TestClass1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		// POM class LoginPage object
		
		LoginPage loginpage= new LoginPage(driver);
		
		loginpage.sendUserName("admin");
		loginpage.sendPassword("manager");
		loginpage.selectKeepMeLoginCheckbox();
		loginpage.clickOnLoginButton();
		
		// now we shifted to the next page hence create POM class ApplicationHeader object
		
		ApplicationHeader applicationHeader= new ApplicationHeader(driver);
		applicationHeader.openTimeTrackPage();
		applicationHeader.openTasksPage();
		applicationHeader.openReportsPage();
		applicationHeader.openUsersPage();
		applicationHeader.openWorkSchedulePage();
		applicationHeader.clickOnLogout();
		
	    
		// once task page is opened we have to create object of POM class
	}

}
