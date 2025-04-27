package testcases;

import java.sql.Driver;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RegisterUser extends BaseClass
{
	LoginPage login;
	@Test
	public void registernewUser()
	{
		login=new LoginPage(driver);
		login.ClickOnSignUpLink();
		
	}
}
