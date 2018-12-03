package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	private By creditCardInfoText = By.xpath("//*contains[text(), 'Credit card information']");
	private By typeCardSelectUS = By.xpath("//*[@id=\"c-ct\"]");

	protected AddACreditCardPage(WebDriver driver) {
		super(driver);
	}

	public void enterCardId(String cardId) {
		logger.info("Entering card id...");
		WebDriverUtils.enterTextBox(driver, cardNickNameTextBox, cardId);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterCardOwner(String cardOwner) {
		logger.info("Entering card owner...");
		WebDriverUtils.enterTextBox(driver, nameOnTheCardTextBox, cardOwner);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectTypeCard(String type) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.selectDropDown(driver, typeCardSelect, type);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectTypeCardUS(String type) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.selectDropDown(driver, typeCardSelectUS, type);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}


	public void enterCardNo(String number) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, cardNoTextBox, number);
	}

	public void selectExpirationMonthCard(String month) {
		logger.info("Selecting expiration month card...");
		WebDriverUtils.selectDropDown(driver, expirationMonthSelect, month);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectExpirationYearCard(String year) {
		logger.info("Selecting expiration year card...");
		WebDriverUtils.selectDropDown(driver, expirationYearSelect, year);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterSecurityCode(String cvs) {
		logger.info("Entering security code...");
		WebDriverUtils.enterTextBox(driver, securityCodeText, cvs);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	public void applyCardCreation() {
		logger.info("Creating new credit card");
		WebDriverUtils.clickOnElementWithWait(driver, applyButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void cancelCardCreation() {
		logger.info("Canceling the card creation");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
     public PaymentInformationPage returnPaymentInformationPage() {
		WebDriverUtils.clickOnElementWithWait(driver, applyButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(creditCardInfoText));
		return new PaymentInformationPage(driver);
	}
}
