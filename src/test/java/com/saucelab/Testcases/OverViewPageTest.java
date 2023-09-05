package com.saucelab.Testcases;


import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;
import com.saucelab.pages.OverViewPage;


public class OverViewPageTest extends BaseClass{
	
	OverViewPage ovp = new OverViewPage();
	
	
	@Test
	public void OverviewTest() {
		ovp.CheckoutOverview();
	}

}
