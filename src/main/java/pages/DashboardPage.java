package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}	
	By menu=By.xpath("//img[@alt='menu']");
	
	By signout= By.xpath("//button[normalize-space()='Sign out']");
	
	By welcomeText=By.xpath("//h4");
	
	public String getWelcomeText() 
	{
	String text=driver.findElement(welcomeText).getText();
	
	return text;
	}
	
	public void LogoutFromApplication() 
	{
		driver.findElement(menu).click();
		
		driver.findElement(signout).click();
		
	}
	
}
