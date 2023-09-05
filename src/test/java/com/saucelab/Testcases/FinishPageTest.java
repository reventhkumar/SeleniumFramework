package com.saucelab.Testcases;


import static org.testng.Assert.assertEquals;

import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;

import com.saucelab.pages.finishPage;
public class FinishPageTest extends BaseClass {
	
	finishPage fp = new finishPage();
	
	
	@Test
	public void FinishTest() {
		assertEquals(false, true);
		fp.Logout();

	}

}
