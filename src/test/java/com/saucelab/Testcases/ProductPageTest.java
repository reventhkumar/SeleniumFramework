package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;
import com.saucelab.pages.ProductPage;

public class ProductPageTest extends BaseClass{


	ProductPage pr = new ProductPage();

	//TC_ProductList_01
	@Test(priority = 1)
	public void AddItemToCartTest() throws IOException {
		pr.productSelection();
		assertEquals(pr.cartbatch(), true);
	}
	@Test
	public void verifyURL() throws IOException
	{
		String ExpectedURL = fr.configData("ExpectedURLProductPage");
		String ActualURL = driver.getCurrentUrl();
		assertEquals(ActualURL, ExpectedURL);
		
	}
	@Test
	public void VerifyFilterDropDown() {
		pr.PriceFilterDropdown();
		
	}
	
	@Test
	public void pricetagTest() {
		pr.pricetags();
	}
}
