package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * This page is designed to logged the user from the account
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class LogoutPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(LogoutPage.class);

	private By logout = By.xpath("//a[text()='Log out']");
	
	protected LogoutPage(WebDriver driver) {
		super(driver);
	}

	public void logout() {
		logger.info("Now I am logging out from ariat.com");
		WebDriverUtils.clickOnElementWithWait(driver, logout);
		logger.info("I am succesfully logged out");
	}
}
