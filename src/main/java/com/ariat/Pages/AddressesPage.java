package com.ariat.Pages;

import org.openqa.selenium.By;

/**
 * Contain Addresses page utility with locators, methods and links with pages:
 * 
 * @author aila.bogasieru@ariat.com
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

public class AddressesPage extends BasePage{
	
	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");

	protected AddressesPage(WebDriver driver) {
		super(driver);
	}
	
	public AddAddressesPage returnAddAddresses() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
}
