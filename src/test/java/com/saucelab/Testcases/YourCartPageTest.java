package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.loginPage;


public class YourCartPageTest extends BaseClass{
	
	loginPage lp = new loginPage();
	ProductPage pP = new ProductPage();
	YourCartPage yCP = new YourCartPage();
	
	@BeforeClass
	public void testSetup() {
		lp.DSignIn();
		pP.addTocart();
		yCP.openCart();
	}
	
	
	@Test(priority = -2)
	public void verifyPageURL() {
		String expectedURL = fr.configData("ExpectedURLYourCartPage");
		String actualURL = driver.getCurrentUrl();
		assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority = 1)
	public void shoppingCartTest() {
		yCP.proccedToCheckout();
	}
	@Test(priority = -1)
	public void removeItemTest() {
		yCP.removeCartItem();
	}
	@Test
	public void continueShopping() {
		yCP.continueShopping();
	}

}
