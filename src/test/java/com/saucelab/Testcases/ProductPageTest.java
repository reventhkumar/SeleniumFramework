package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;

import com.saucelab.pages.ProductListPage;
import com.saucelab.pages.ProductPage;

public class ProductPageTest extends BaseClass {

	ProductPage pP = new ProductPage();
	ProductListPage pLP = new ProductListPage();

	@Test
	public void VerifyAddToCart() {
		pP.addTocart();
		assertEquals(pLP.cartbatch(), true);

	}
	@Test
	public void VerifyBackBtn() {
		pP.backbtn();
		String ActualURL = driver.getCurrentUrl();
		String expectedURL = fr.configData("ProductPageURL");
		assertEquals(ActualURL, expectedURL);
	}
}
