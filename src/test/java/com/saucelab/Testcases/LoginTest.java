package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.rev.selenium.base.BaseClass;
import org.testng.annotations.Test;
import com.saucelab.pages.loginPage;

public class LoginTest extends BaseClass {

	public static Logger logs = LogManager.getLogger(LoginTest.class.getName());
	loginPage lp = new loginPage();

	@Test
	public void VerifyPageTitle() throws IOException, InterruptedException {
		String actualTitle = driver.getTitle();
		String ExpectedTitle = fr.configData("ExpectedTitle");
		assertEquals(actualTitle, ExpectedTitle);
		logs.info("Starting to veirfy page title");
	}

	@Test
	public void VerifyPageLogo() {
		boolean flag = lp.IslogoDisplayed();
		assertEquals(flag, true);
	}

	@Test
	public void VerifyPageURL() throws IOException {
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = fr.configData("ExpectedURLLoginPage");
		assertEquals(ActualURL, ExpectedURL);
	}

	@Test
	public void VerifyLabels() throws IOException {

		String ExpectedUserNameLabel = fr.configData("ExpectedUsernameLabel");
		String ExpectedPasswordLabel = fr.configData("ExpectedPasswordLabel");

		assertEquals(lp.UsernameLable(), ExpectedUserNameLabel);
		assertEquals(lp.PasswordLable(), ExpectedPasswordLabel);
	}

	// TC_Login_02 userNameError
	@Test
	public void Login_02() {
		lp.SignIn("", fr.configData("Password"));
		assertEquals(lp.userNameError(), true);
	}

	// TC_Login_03 passWordError
	@Test
	public void Login_03() {
		lp.SignIn(fr.configData("Username"), "");
		assertEquals(lp.passWordError(), true);
	}

	// TC_Login_01
	@Test(priority = 1)
	public void Login_01() {
		lp.SignIn(fr.configData("Username"), fr.configData("Password"));
	}

}
