package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.rev.selenium.base.BaseClass;

import utils.FileReaders;

public class ProductPage extends BaseClass {
	
	FileReaders fr = new FileReaders();
	

	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P1AddtoCart;
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P2AddtoCart;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement Cartbtn;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement priceFilterddElement;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void PriceFilterDropdown() {
		Select select = new Select(priceFilterddElement);
		select.selectByValue("lohi");
	}

	public void productSelection() throws IOException {
		P1AddtoCart.click();
		P2AddtoCart.click();
		Cartbtn.click();

	}

}
