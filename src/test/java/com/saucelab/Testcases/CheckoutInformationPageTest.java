package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;
import org.rev.selenium.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.saucelab.pages.CheckoutInformationPage;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.loginPage;

public class CheckoutInformationPageTest extends BaseClass {

	CheckoutInformationPage cip = new CheckoutInformationPage();
	loginPage lp = new loginPage();
	ProductPage pP = new ProductPage();
	YourCartPage yCP = new YourCartPage();
	
	@BeforeClass
	public void testSetup() {
		lp.DSignIn();
		yCP.openCart();
		
	}
	
	@Test(priority = -2)
	public void proceedCheckout() {
		yCP.proccedToCheckout();
		assertEquals(driver.getCurrentUrl(),fr.configData("ExpectedCheckoutYourInfoURL"));
	}
	@Test
	public void yourinformationTest(){
		cip.Checkout();
		
	}
	
	@Test(priority = -1)
	public void verifylabels() {
		String expectedfirstNameLabel = fr.configData("firstNameLabel");
		String expectedlastNameLabel = fr.configData("lastNameLabel");
		String expectedzipCodeLabel = fr.configData("zipCodeLabel");
		
		assertEquals(cip.firstNameLabel(), expectedfirstNameLabel);
		assertEquals(cip.lastNameLabel(), expectedlastNameLabel);
		assertEquals(cip.zipCodeLabel(), expectedzipCodeLabel);
		
	}

}
