package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.rev.selenium.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.saucelab.pages.ProductListPage;
import com.saucelab.pages.loginPage;

public class ProductListTest extends BaseClass{


	ProductListPage pr = new ProductListPage();
	loginPage lp = new loginPage();
	
	@BeforeClass
	public void Teststart() {
		lp.DSignIn();
	}
	
	//@AfterClass
	public void Testend() {
		
	}

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
		pr.filterPLH();
		pr.filterPHL();
		pr.filterNZA();
		pr.filterNAZ();
	}
	
	//@Test
	public void pricetagTest() {
		pr.pricetags();
	}
}
