package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.saucelab.pages.ProductListPage;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.loginPage;

public class ProductPageTest extends BaseClass {

	ProductPage pP = new ProductPage();
	ProductListPage pLP = new ProductListPage();
	loginPage lp = new loginPage();

	@BeforeClass
	public void teststart() {
		lp.DSignIn();
	}
	
	@Test()
	public void VerifyAddToCart() {
		pP.addTocart();
		assertEquals(pLP.cartbatch(), true);

	}
	@Test(priority = 1)
	public void VerifyBackBtn() {
		pP.backbtn();
		String ActualURL = driver.getCurrentUrl();
		String expectedURL = fr.configData("ProductPageURL");
		assertEquals(ActualURL, expectedURL);
	}
}
