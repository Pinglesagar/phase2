package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.BasePage;
import pages.ForumsPage;
import pages.HomePage;

public class ForumsPageTest extends BasePage{
	
	@Test(priority=0)
	public void navigateToForumsPage() {
		HomePage homePage = new HomePage(driver);
		
	}
	
	@Test(priority=1, dependsOnMethods="navigateToForumsPage")
	public void verifyForumsHeaderPresent() {
		ForumsPage forumsPage = new ForumsPage(driver);		
		
	}
	
}
