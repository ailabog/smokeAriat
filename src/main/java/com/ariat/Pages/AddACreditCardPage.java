package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ariat.Utils.WebDriverUtils;

/**
 * This contain specific locators and methods for Add a credit card page and
 * links to
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class AddACreditCardPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(AddACreditCardPage.class);

	private By cardNickNameTextBox = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_nickname");
	private By nameOnTheCardTextBox = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_owner");
	private By typeCardSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_type");
	private By cardNoTextBox = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_number");
	private By expirationMonthSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_expiration_month");
	private By expirationYearSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_expiration_year");
	private By securityCodeText = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
	private By applyButton = By.id("applyBtn");
	private By cancelButton = By.xpath("//button[text()='Cancel]");

	protected AddACreditCardPage(WebDriver driver) {
		super(driver);
	}

	public void enterCardId(String cardId) {
		logger.info("Entering card id...");
		WebDriverUtils.enterTextBox(driver, cardNickNameTextBox, cardId);
	}

	public void enterCardOwner(String cardOwner) {
		logger.info("Entering card owner...");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, nameOnTheCardTextBox, cardOwner);
	}

	public void selectTypeCard(String type) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.selectDropDown(driver, typeCardSelect, type);
	}

	public void enterCardNo(String number) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, cardNoTextBox, number);
	}

	public void selectExpirationMonthCard(String month) {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Selecting expiration month card...");
		WebDriverUtils.selectDropDown(driver, expirationMonthSelect, month);
	}

	public void selectExpirationYearCard(String year) {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Selecting expiration year card...");
		WebDriverUtils.selectDropDown(driver, expirationYearSelect, year);
	}

	public void enterSecurityCode(String cvs) {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Entering security code...");
		WebDriverUtils.enterTextBox(driver, securityCodeText, cvs);
	}
	public void applyCardCreation() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Creating new credit card");
		WebDriverUtils.clickOnElementWithWait(driver, applyButton);
	}

	public void cancelCardCreation() {
		logger.info("Canceling the card creation");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButton);
	}

}
