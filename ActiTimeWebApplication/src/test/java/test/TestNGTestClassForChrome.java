package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;


public class TestNGTestClassForChrome extends Browser{
	
     WebDriver driver;
     ApplicationHeader applicationHeader;
     LoginPage loginPage;
     SoftAssert softAssert;
    
	//
	
    @BeforeClass
	public void launchBrowser()
	{
    	// here need to add code for reports, watch 12 Feb video
    	
    	System.out.println("before class method");
    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares & Jar Files\\Browser exe\\Chrome\\chromedriver.exe");  
 	    driver=new ChromeDriver();
 	    driver.manage().window().maximize();
	}
	
    @BeforeMethod
	public void loginToApplication()
	{
		System.out.println("before method");
		
		driver.get("http://localhost/login.do");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.clickOnLoginButton();
		
		// watch 10 feb class to complete screenshot and excel data fetch activity
		
	}
	
	@Test (priority=0)
	public void toVerifyTaskTab()
	{
		System.out.println("test 1");
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openTasksPage();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		//if both are same= pass    Both are diff= fail
		Assert.assertEquals(url, "http://localhost/tasks/otasklist.do", "url not found");
		//Assert.assertEquals(title, "actiTIME -  Open Tasks", "title not found");
		
//      no need to use if else
//		if(url.equals("http://localhost/tasks/otasklist.do"))
//		{
//			System.out.println("url is correct");
//		}
//		else
//		{
//			System.out.println("url is incorrect");
//		}
		
//		if(title.equals("actiTIME -  Open Tasks"))
//		{
//			System.out.println("Title is correct");
//		}
//		else
//		{
//			System.out.println("Title is incorrect");
//		}
	}
	
	@Test (priority= 1)
	public void toVerifyReportTab()
	{
		
		System.out.println("test 1");
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openReportsPage();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		Assert.assertEquals(url, "http://localhost/reports/reports.do");
		
		//Both are same= FAIL
		Assert.assertNotEquals(url, "http://localhost/administration/userlist.do");
		
	    boolean result= url.equals("http://localhost/reports/reports.do");
		Assert.assertTrue(result);
	}
	
	@Test (priority= 2)
	public void toVerifyUserTab()
	{
		
		System.out.println("test 1");
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openUsersPage();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		Assert.assertEquals(url, "http://localhost/administration/userlist.do");
	}
	
	@Test (priority= 3)
	public void toVerifyWorkScheduleTab()
	{
		
		System.out.println("test 1");
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openWorkSchedulePage();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		Assert.assertEquals(url, "http://localhost/administration/workingdays.do");
	}
	
	@Test (priority= 4)
	public void toVerifyTimeTrackTab()
	{
		
		
		System.out.println("test 1");
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openTimeTrackPage();
		String url= driver.getCurrentUrl();
		String title= driver.getTitle();
		
		softAssert= new SoftAssert();
		softAssert.assertEquals(url, "http://localhost/user/submit_tt.do");
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		
		System.out.println("after method");
        applicationHeader.clickOnLogout();
		
	}
	
	@AfterClass
	public void clearPOMObjects()
	{
		System.out.println("after class");
		driver.quit();
	}
	


}
