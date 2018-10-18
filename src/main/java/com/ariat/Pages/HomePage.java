package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

/**
 * This contains the Login page with all locators and methods associated
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomePage extends BasePage {

	private By ukLocation = By.xpath("//*[@id=\"countryMisMatch\"]/div/div[2]/div[2]/a/img");
	private By usaLocation = By.xpath("//*[@id=\"mycountryiscorrect\"]/img");
	private By closeLocationx = By.className("ui-icon ui-icon-closethick");
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By signIn = By.linkText("Sign In");
	private By emailAddressTextBox = By.id("dwfrm_login_username_d0okqmfasagn");

	protected HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage UKlocation() {
		WebDriverUtils.clickOnElementWithWait(driver, ukLocation);
		return new HomePage(driver);
	}

	public HomePage USlocation() {
		WebDriverUtils.clickOnElementWithWait(driver, usaLocation);
		return new HomePage(driver);
	}

	public HomePage closeLocation() {
		WebDriverUtils.clickOnElementWithWait(driver, closeLocationx);
		return new HomePage(driver);
	}

	public void getHomePage() {
		WebDriverUtils.getElementText(driver, ariatLogo);
	}

	public SignInPage returnSignInPage() {
		WebDriverUtils.clickOnElementWithWait(driver, signIn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_10_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailAddressTextBox));
		return new SignInPage(driver);
	}
}
