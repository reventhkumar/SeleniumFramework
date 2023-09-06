package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;
import org.rev.selenium.base.BaseClass;
import org.testng.annotations.BeforeClass;
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
	
	//TC_ProductList_01
	@Test(priority = 1)
	public void AddItemToCartTest(){
		pr.productSelection();
		assertEquals(pr.cartbatch(), true);
	}
	@Test
	public void verifyURL(){
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
}
