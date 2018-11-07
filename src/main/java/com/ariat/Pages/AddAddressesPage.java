package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * This class contains specific locators, methods for Add Address page and link
 * with Addresses page
 * 
 * @author aila.bogasieru@ariat.com
 */

public class AddAddressesPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(AddAddressesPage.class);

	private By fNameTtextBox = By.id("dwfrm_profile_address_firstname");
	private By lNameTextBox = By.id("dwfrm_profile_address_lastname");
	private By address1TextBox = By.id("dwfrm_profile_address_address1");
	private By address2TextBox = By.id("dwfrm_profile_address_address2");
	private By cityTextBox = By.id("dwfrm_profile_address_city");
	private By countryTextBox = By.id("dwfrm_profile_address_country");
	private By postCodeTextBox = By.id("dwfrm_profile_address_zip");
	private By phoneTextBox = By.id("dwfrm_profile_address_phone");
	private By addressIdTextBox = By.id("dwfrm_profile_address_addressid");
	private By saveAddressButton = By.name("dwfrm_profile_address_create");
	private By saveAddressEditButton = By.name("dwfrm_profile_address_edit");
	private By cancelAddressButton = By.name("dwfrm_profile_address_cancel");
	private By deleteAddressButton = By.xpath("//button[@name='dwfrm_profile_address_remove']");
	private By editAddressButton = By.name("dwfrm_profile_address_edit");
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");

	protected AddAddressesPage(WebDriver driver) {
		super(driver);
	}

	public void enterFName(String name) {
		logger.info("Entering first name for Address :?");
		WebDriverUtils.enterTextBox(driver, fNameTtextBox, name);
	}

	public void enterLName(String last) {
		logger.info("Entering last name for Address :?");
		WebDriverUtils.enterTextBox(driver, lNameTextBox, last);
	}

	public void enterAddress1(String address1) {
		logger.info("Entering address1: ");
		WebDriverUtils.enterTextBox(driver, address1TextBox, address1);
	}

	public void enterAddress2(String address2) {
		logger.info("Entering address2: ");
		WebDriverUtils.enterTextBox(driver, address2TextBox, address2);
	}

	public void enterCity(String city) {
		logger.info("Entering city: ");
		WebDriverUtils.enterTextBox(driver, cityTextBox, city);
	}

	public void selectCountry(String country) {
		logger.info("Entering country: ");
		WebDriverUtils.selectDropDown(driver, countryTextBox, country);
	}

	public void enterPostCode(String zip) {
		logger.info("Entering poste code: ");
		WebDriverUtils.enterTextBox(driver, postCodeTextBox, zip);
	}

	public void enterPhone(String phone) {
		logger.info("Entering phone: ");
		WebDriverUtils.enterTextBox(driver, phoneTextBox, phone);
	}

	public void enterAddressId(String addressId) {
		logger.info("Entering poste code: ");
		WebDriverUtils.enterTextBox(driver, addressIdTextBox, addressId);
	}

	public void clearAddressId() {
		logger.info("Clearing text box Address Id:");
		WebDriverUtils.clearElement(driver, addressIdTextBox);
	}

	public void saveAddress() {
		logger.info("Saving this address: ");
		WebDriverUtils.clickOnElementWithWait(driver, saveAddressButton);
	}

	public void saveAddressEdit() {
		logger.info("Saving this address: ");
		WebDriverUtils.clickOnElementWithWait(driver, saveAddressEditButton);
	}

	public void editAddress() {
		logger.info("Editing this address: ");
		WebDriverUtils.clickOnElementWithWait(driver, editAddressButton);
	}

	public void cancelAddress() {
		logger.info("Canceling this address to be created: ");
		WebDriverUtils.clickOnElementWithWait(driver, cancelAddressButton);
	}

	public void deleteAddress() {
		logger.info("Deleteing this address ");
		WebDriverUtils.clickOnElementWithWait(driver, deleteAddressButton);
	}

	public AddressesPage returnAddressesPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, saveAddressButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}
	
	public AddressesPage returnAddressesFromEditPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, editAddressButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}
	
	public AddressesPage returnAddressesFromEditDeletePage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, deleteAddressButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}
}
