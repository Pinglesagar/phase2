package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.BasePage;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BasePage{

	@Test(priority=0)
	public void navigateToCart() {
		HomePage homePage = new HomePage(driver);
		
	}

}
