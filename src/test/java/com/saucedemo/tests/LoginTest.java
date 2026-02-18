package com.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.login("standard_user", "secret_sauce");
	    
	    String CurrentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(CurrentUrl.contains("inventory.html"), "Login failed, not on inventory page.");
	}

}
