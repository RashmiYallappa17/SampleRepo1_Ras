package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	public LoginPage (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@id='email1']");
	
	By password = By.xpath("(//input[@id='password1'])[1]");
	
	By loginButton = By.xpath("//button[normalize-space()='Sign in']");
	
	By signIn=By.xpath("//h2[normalize-space()='Sign In']");
	
	By footerIcon=By.xpath("//div[@class='footer')]//a");
	
	By signUpLink= By.linkText("New user? Signup");
	
	public int CountFooterLinks() 
	{
		
	System.out.println("Footer count ");
	
	int count=	driver.findElements(footerIcon).size();
	
	return count;
	}
	
	public boolean IsSignupPresent()
	{
		boolean status=driver.findElement(signIn).isDisplayed();
		
		return status;
	}
	
	public void ClickOnSignUpLink()
	{
		driver.findElement(signIn).click();
		
	}
	
	
	public DashboardPage LoginToApplication(String user,String pass) 
	{
		driver.findElement(username).sendKeys(user);
		
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(loginButton).click();
		
		DashboardPage dashboard=new DashboardPage(driver);
		
		return dashboard;
		
	}
}
