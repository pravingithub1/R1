package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy (xpath = "//div[contains(text(),'Time-Track')]") 
	private WebElement timeTrack;
	
	@FindBy (xpath = "//div[contains(text(),'Tasks')]") 
	private WebElement tasks;
	
	@FindBy (xpath ="(//div[contains(text(),'Reports')])[1]" ) 
	private WebElement reports;
	
	@FindBy (xpath = "//div[contains(text(),'Users')]") 
	private WebElement users;
	
	@FindBy (xpath ="//div[contains(text(),'Work Schedule')]") 
	private WebElement workSchedule;
	
	@FindBy (xpath ="//a[text()='Logout']") 
	private WebElement logout;
	
	public ApplicationHeader(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		this.driver=driver;
		
	}
	
	public void openTimeTrackPage() {
		timeTrack.click();
	}
	
	public void openTasksPage() {
		tasks.click();
	}
	
	public void openReportsPage() {
		
//		WebElement reports= driver.findElement(By.xpath("(//div[contains(text(),'Reports')])[1]"));
//		Actions act= new Actions(driver);
//		
//		act.moveToElement(reports).click().perform();
		
	    reports.click();
	}
	
	public void openUsersPage() {
		users.click();
	}
	
	public void openWorkSchedulePage() {
		workSchedule.click();
	}
	
	public void clickOnLogout() {
		
	//	act.moveToElement(logout).click().perform();
		
		logout.click();
		
	}

}
