package com.saucelab.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

public class YourCartPage extends BaseClass {
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement Checkoutbtn;
	@FindBy(xpath = "//button[@class='btn_secondary cart_button']")
	WebElement removebtn;
	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement continueshoppingbtn;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement cartbtn;
	

	public YourCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void proccedToCheckout(){
		Checkoutbtn.click();
	}
	
	public void removeCartItem(){
		removebtn.click();
	}
	
	public void openCart() {
		cartbtn.click();
	}
	
	public void continueShopping() {
		continueshoppingbtn.click();
		cartbtn.click();
	}

}
