package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;
import com.saucelab.pages.CheckoutInformationPage;

public class CheckoutInformationPageTest extends BaseClass {

	CheckoutInformationPage cip = new CheckoutInformationPage();
	
	
	@Test
	public void yourinformationTest() throws IOException {
		cip.Checkout();
	}
	
	@Test
	public void verifylabels() {
		String expectedfirstNameLabel = fr.configData("firstNameLabel");
		String expectedlastNameLabel = fr.configData("lastNameLabel");
		String expectedzipCodeLabel = fr.configData("zipCodeLabel");
		
		assertEquals(cip.firstNameLabel(), expectedfirstNameLabel);
		assertEquals(cip.lastNameLabel(), expectedlastNameLabel);
		assertEquals(cip.zipCodeLabel(), expectedzipCodeLabel);
		
	}

}
