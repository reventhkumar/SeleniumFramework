package com.saucelab.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rev.selenium.base.BaseClass;

import utils.ActionClass;

public class loginPage extends BaseClass {

	public static Logger logs = LogManager.getLogger(loginPage.class.getName());
	ActionClass ACT = new ActionClass();
		
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PassTab;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Loginbtn;
	@FindBy(xpath = "//img[@class='bot_column']")
	WebElement Logo;
	@FindBy(xpath = "//h3[normalize-space()='Epic sadface: Username is required']")
	WebElement userNameError;
	@FindBy(xpath = "//h3[normalize-space()='Epic sadface: Password is required']")
	WebElement passwordError;
	@FindBy(xpath = "(//*[name()='path'][@fill='currentColor'])[1]")
	WebElement CloseError;

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

	public void SignIn(String userName, String password) {
		ACT.ASendKeys(Username,userName);
		ACT.ASendKeys(PassTab,password);
		Loginbtn.click();
		
	}
	
	public void DSignIn() {
		ACT.ASendKeys(Username,fr.configData("Username"));
		ACT.ASendKeys(PassTab,fr.configData("Password"));
		Loginbtn.click();
		
	}
	
	public void clearFields() {

		Username.clear();
		PassTab.clear();
	}

	public boolean userNameError() {

		return userNameError.isDisplayed();
	}

	public boolean passWordError() {

		return passwordError.isDisplayed();
	}

}
