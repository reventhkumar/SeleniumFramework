package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.Test;
import com.saucelab.pages.YourCartPage;
public class YourCartPageTest extends YourCartPage{
	
	@Test
	public void verifyPageURL() {
		String expectedURL = fr.configData("ExpectedURLYourCartPage");
		String actualURL = driver.getCurrentUrl();
		assertEquals(actualURL, expectedURL);
	}
	
	
	@Test
	public void shoppingCartTest() throws IOException {
		 proccedToCheckout();
	}
	public void removeItemTest() {
		removeCartItem();
	}
	public void continueShopping() {
		continueShopping();
	}

}
