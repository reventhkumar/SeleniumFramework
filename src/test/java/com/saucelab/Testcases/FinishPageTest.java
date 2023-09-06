package com.saucelab.Testcases;


import static org.testng.Assert.assertEquals;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucelab.pages.CheckoutInformationPage;
import com.saucelab.pages.OverViewPage;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.finishPage;
import com.saucelab.pages.loginPage;
public class FinishPageTest extends BaseClass {
	
	OverViewPage ovp = new OverViewPage();
	finishPage fp = new finishPage();
	loginPage lp = new loginPage();
	ProductPage pP = new ProductPage();
	YourCartPage yCP = new YourCartPage();
	CheckoutInformationPage cIP = new CheckoutInformationPage();
	
	@BeforeClass
	public void testSetup() {
		lp.DSignIn();
		pP.addTocart();
		yCP.openCart();
		yCP.proccedToCheckout();
		ovp.CheckoutOverview();
		
	}
	
	@Test
	public void FinishTest() {
		assertEquals(false, true);
		fp.Logout();

	}

}
