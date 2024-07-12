package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import pages.BasePage;
import pages.HomePage;

public class HomePageTest extends BasePage{

	@Test(priority=0)
	public void verifyTitle() {
		HomePage homePage = new HomePage(driver);
		logger.log(LogStatus.INFO, "Checking title matches string");
		Assert.assertEquals(homePage.getTitle(), "Meta Quest VR Headsets, Accessories & Equipment | Meta Quest | Meta Store", "Title does not match");
		logger.log(LogStatus.PASS, "Title matches with title from DOM");
	}

	@Test(priority=1)
	public void verifyLogo() {
		HomePage homePage = new HomePage(driver);
		logger.log(LogStatus.INFO, "Checking if logo is present");
		
	}

}
