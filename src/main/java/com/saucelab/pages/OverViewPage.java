package com.saucelab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

public class OverViewPage extends BaseClass{
	

	@FindBy (xpath = "//a[@class='btn_action cart_button']") WebElement Finishbtn;
	@FindBy (xpath = "//a[@class='cart_cancel_link btn_secondary']") WebElement Cancelbtn;
	
	public OverViewPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CheckoutOverview()
	{
		Finishbtn.click();
		//return new finishPage();
	}
	
}
