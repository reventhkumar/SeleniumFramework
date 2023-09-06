package com.saucelab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

public class ProductPage extends BaseClass{
	
	ProductListPage pLP = new ProductListPage();

	@FindBy(xpath = "//button[normalize-space()='ADD TO CART']")
	WebElement addToCart;
	@FindBy(xpath = "//button[normalize-space()='<- Back']")
	WebElement backBtn;
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement selectproduct;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addTocart() {
		selectproduct.click();
		addToCart.click();
		
	}
	
	public void backbtn() {
		selectproduct.click();
		backBtn.click();
		
	}

}
