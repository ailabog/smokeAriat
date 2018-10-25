package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Enums.CardMethod;
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
	private By typeCardSelect = By.name("Card Type");
	private By cardNoTextBox = By.id("c-cardnumber");
	private By expirationMonthSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_month");
	private By expirationYearSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_year");
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
		WebDriverUtils.enterTextBox(driver, nameOnTheCardTextBox, cardOwner);
	}

	public void selectTypeCard(CardMethod typeCard) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.selectDropDown(driver, typeCardSelect, typeCard.getName());
	}

	public void enterCardNo(CardMethod typeCard) {
		logger.info("Selecting the type of the card...");
		WebDriverUtils.enterTextBox(driver, cardNoTextBox, typeCard.getNumber());
	}

	public void selectExpirationMonthCard(String month) {
		logger.info("Selecting expiration month card...");
		WebDriverUtils.selectDropDown(driver, expirationMonthSelect, month);
	}

	public void selectExpirationYearCard(String year) {
		logger.info("Selecting expiration year card...");
		WebDriverUtils.selectDropDown(driver, expirationYearSelect, year);
	}

	public void applyCardCreation() {
		logger.info("Creating new credit card");
		WebDriverUtils.clickOnElementWithWait(driver, applyButton);
	}

	public void cancelCardCreation() {
		logger.info("Canceling the card creation");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButton);
	}

}
