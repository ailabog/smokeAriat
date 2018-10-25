package com.ariat.Pages;

import org.openqa.selenium.By;

/**
 * Contains Addresses page utility with locators, methods and links with pages: Add Address page
 * 
 * @author aila.bogasieru@ariat.com
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

public class AddressesPage extends BasePage{
	
	private static final Logger logger = LoggerFactory.getLogger(AddressesPage.class);
	
	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");
	private By editLink = By.xpath("//*[@id=\"addresses\"]/div[1]/div[1]/div[2]/a[1]");
	private By deleteLink = By.xpath("//a[text()='Delete']");

	protected AddressesPage(WebDriver driver) {
		super(driver);
	}
	
	public void delete() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteLink);
	}
	
	public AddAddressesPage returnAddAddresses() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
	
	public AddAddressesPage returnAddressesEdit() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, editLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
}
