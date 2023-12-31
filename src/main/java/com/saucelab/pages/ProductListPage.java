package com.saucelab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.rev.selenium.base.BaseClass;

import utils.FileReaders;

public class ProductListPage extends BaseClass {
	
	FileReaders fr = new FileReaders();
	

	@FindBy(xpath = "//body//div[@id='page_wrapper']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]")
	WebElement P1AddtoCart;
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P2AddtoCart;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement Cartbtn;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement priceFilterddElement;
	@FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
	WebElement cartBatch;
	@FindBy(xpath = "(//div[@class='inventory_list']//div[1]//div[3]//div[1]")
	WebElement pricetags;
	
	

	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}

	public void filterPLH() {
		Select select = new Select(priceFilterddElement);
		select.selectByValue("lohi");
	}
	
	public void filterPHL() {
		Select select = new Select(priceFilterddElement);
		select.selectByValue("hilo");
	}
	public void filterNAZ() {
		Select select = new Select(priceFilterddElement);
		select.selectByValue("az");
	}
	public void filterNZA() {
		Select select = new Select(priceFilterddElement);
		select.selectByValue("za");
	}
	
	public void productSelection(){
		P1AddtoCart.click();
		P2AddtoCart.click();
		Cartbtn.click();
	}
	
	public boolean cartbatch() {
		return cartBatch.isDisplayed();
	}
	
	public void pricetags()
	{
		System.out.println(pricetags.getText());
		
	}

}
