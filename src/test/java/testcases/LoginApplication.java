package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginApplication extends BaseClass
{
	
	LoginPage login;
	
	DashboardPage dashboard;
	
	@Test
	public void loginWithValidCredentials()
	{
		
	 login= new LoginPage(driver);
		
	 dashboard=login.LoginToApplication("admin@email.com", "admin@123");
		
		Assert.assertTrue(dashboard.getWelcomeText().contains("Welcome"), "Login Failed");
		
		dashboard.LogoutFromApplication();
		
		Assert.assertTrue(login.IsSignupPresent(), "Logout Failed");
		
		
	}
}
