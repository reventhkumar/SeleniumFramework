package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

import utils.FileReaders;

public class CheckoutInformationPage extends BaseClass {

	FileReaders fr = new FileReaders();

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement ZipCode;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement continueBtn;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameLable;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameLable;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	WebElement zipCodeLable;
	
	
	

	public CheckoutInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void Checkout() throws IOException {
		
		firstName.sendKeys(fr.configData("Name"));
		lastName.sendKeys(fr.configData("Last"));
		ZipCode.sendKeys(fr.configData("ZipCode"));
		continueBtn.click();

	}
	
	public String firstNameLabel() {
		return firstNameLable.getAttribute("placeholder");
	}
	public String lastNameLabel() {
		return lastNameLable.getAttribute("placeholder");
	}
	public String zipCodeLabel() {
		return zipCodeLable.getAttribute("placeholder");
	}

}
