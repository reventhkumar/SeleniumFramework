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
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addTocart() {
		addToCart.click();
		
	}
	
	public void backbtn() {
		backBtn.click();
		
	}

}
