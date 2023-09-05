package com.saucelab.pages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

public class loginPage extends BaseClass {

	public static Logger logs = LogManager.getLogger(loginPage.class.getName());
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PassTab;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Loginbtn;
	@FindBy(xpath = "//img[@class='bot_column']")
	WebElement Logo;
	

	public loginPage() {
		PageFactory.initElements(driver, this);
		driver.get(fr.configData("TestURL"));
		logs.info("info Message");
		
	}
	
	public boolean IslogoDisplayed() {
		boolean Flag = Logo.isDisplayed();
		return Flag;
	}

	public String UsernameLable() {
		return Username.getAttribute("placeholder");
	}

	public String PasswordLable() {
		return PassTab.getAttribute("placeholder");
	}

	public void SignIn() throws IOException {
		Username.sendKeys(fr.configData("Username"));
		PassTab.sendKeys(fr.configData("Password"));
		Loginbtn.click();
		//return new ProductPage();
	}

}
