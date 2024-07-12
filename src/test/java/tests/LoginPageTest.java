package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;
import pages.BasePage;
import pages.HomePage;

public class LoginPageTest extends BasePage{
	
	@Test(priority=0)
	public void navigateToLoginPage() {
		HomePage homePage = new HomePage(driver);
	
	}
	
	
}	
