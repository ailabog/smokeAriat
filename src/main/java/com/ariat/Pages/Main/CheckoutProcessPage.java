package com.ariat.Pages.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * Implements checkout process page with its locators and methods
 * 
 * @author aila.bogasieru@ariat.com
 */

public class CheckoutProcessPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(CheckoutProcessPage.class);

	private By editBagLink = By.xpath("//button[@class='el-button summary__edit el-button--text']");
	private By selectOption = By.xpath("//input[@placeholder='Select']");
	private By firstName = By.name("firstName");
	private By lastName = By.name("lastName");
	private By address = By.name("address1");
	private By address1 = By.name("address2");
	private By city = By.name("city");
	private By zipCode = By.name("zipcode");
	private By checkCheckBoxBilling = By.xpath("//input[@value='Use this address for Billing']");
	private By mobile = By.name("phone");
	private By email = By.name("email");
	private By confirmEmail = By.name("emailconfirm");
	private By addToAddressBoxCheck = By.xpath("//input[@vlaue='Add to Address Book']");
	private By stayInTouchCheck = By
			.xpath("//input[@vlaue='Stay in touch. Learn about our new products and special offers first!']");
	private By continueCheckout = By.xpath("//button//span[text()='Continue']");
	private By standardCheck = By.xpath("//input[@value='X-1']");
	private By expressCheck = By.xpath("//input[@value='U-1']");
	private By paypalCheck = By.xpath("//input[@vlaue='PAYPAL']");
	private By creditCardCheck = By.xpath("//input[@value='SA_SILENTPOST']");
	private By cardName = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[4]/div/div/div/div[1]/input");
	private By selectTypeCard = By.xpath("//div[@class='el-select checkout_input']");
	private By expirationDateMonth = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[7]/div[1]/div/div/div[1]/div/input");
	private By expirationDateYear = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[7]/div[2]/div/div/div[1]/div/input");
	private By securityCode = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[8]/div/div/div/div[1]/input");
	private By buyNowBtn = By.id("paymentbtncs");
	private By checkoutCompleteText = By.xpath("//h1[text()='Checkout Complete']");
	private By paypalBtn = By.id("paypal-animation-content");
	private By placeOrderBtn = By.id("paymentbtn");
	private By giftCardTxtBox = By.xpath("//input[@placeholder=Gift Card Code']");
	private By pinTxtBox = By.xpath("//input[@placeholder='Pin']");
	private By applyGifCard = By.xpath("//button//span[text()='Apply']");
	private By promoCodeTxtBox = By.xpath("//input[@placeholder='Promo code']");
	private By expandGiftCard = By.xpath("//i[text()='Gift card']");
	private By expandPromoCode = By.xpath("//i[text()='Promo code']");
	private By cardNo = By.xpath("");

	protected CheckoutProcessPage(WebDriver driver) {
		super(driver);
	}

	public void clickEditBag() {
		logger.info("Editing bag..");
		WebDriverUtils.clickOnElementWithWait(driver, editBagLink);
	}

	public void selectAddress(String optionAddress) {
		logger.info("Selecting address..");
		WebDriverUtils.selectVisibleText(driver, selectOption, optionAddress);
	}

	public void enterFName(String nameValue) {
		logger.info("Entering first name..");
		WebDriverUtils.enterTextBox(driver, firstName, nameValue);
	}

	public void enterLName(String lastValue) {
		logger.info("Entering last name..");
		WebDriverUtils.enterTextBox(driver, lastName, lastValue);
	}

	public void enterAddress(String addressValue) {
		logger.info("Entering address name..");
		WebDriverUtils.enterTextBox(driver, address, addressValue);
	}

	public void enterAddress1(String addressValue1) {
		logger.info("Entering address1 name..");
		WebDriverUtils.enterTextBox(driver, address1, addressValue1);

	}

	public void enterCity(String cityValue) {
		logger.info("Entering city name..");
		WebDriverUtils.enterTextBox(driver, city, cityValue);
	}

	public void enterZipCode(String zipCodeValue) {
		logger.info("Entering zip code..");
		WebDriverUtils.enterTextBox(driver, zipCode, zipCodeValue);
	}

	public void checkBillingCheckBox() {
		logger.info("Checking billing address the same..");
		WebDriverUtils.clickOnElementWithWait(driver, checkCheckBoxBilling);
	}

	public void enterMobile(String mobileValue) {
		logger.info("Entering mobile phone..");
		WebDriverUtils.enterTextBox(driver, mobile, mobileValue);
	}

	public void enterEmail(String emailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, email, emailValue);

	}

	public void enterConfirmEmail(String confirmEmailValue) {
		logger.info("Entering confirmation email..");
		WebDriverUtils.enterTextBox(driver, confirmEmail, confirmEmailValue);
	}

	public void checkAddToAddressBox() {
		logger.info("Checking add to address box..");
		WebDriverUtils.clickOnElementWithWait(driver, addToAddressBoxCheck);
	}

	public void checkStayInTouch() {
		logger.info("Checking stay in touch checkbox..");
		WebDriverUtils.clickOnElementWithWait(driver, stayInTouchCheck);

	}

	public void continueCheckout() {
		logger.info("Continue checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, continueCheckout);
	}

	public void checkStandardDelivery() {
		logger.info("Checking standard delivey..");
		WebDriverUtils.clickOnElementWithWait(driver, standardCheck);
	}

	public void checkExpressDelivery() {
		logger.info("Checking express delivery..");
		WebDriverUtils.clickOnElementWithWait(driver, expressCheck);

	}

	public void checkPayPal() {
		logger.info("Checking paypal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalCheck);
	}

	public void checkCreditCard() {
		logger.info("Checking credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, creditCardCheck);
	}

	public void enterCardName(String cardNameValue) {
		logger.info("Entering card name..");
		WebDriverUtils.enterTextBox(driver, cardName, cardNameValue);
	}
	
	public void enterCardNo(String cardNumberValue) {
		logger.info("Entering card number..");
		WebDriverUtils.enterTextBox(driver, cardNo, cardNumberValue);
	}

	public void selectTypeCard(String option) {
		logger.info("Selecting type of credit card..");
		WebDriverUtils.selectVisibleText(driver, selectTypeCard, option);
	}

	public void selectExpirationMonth(String option) {
		logger.info("Selecting expiration month credit card..");
		WebDriverUtils.selectVisibleText(driver, expirationDateMonth, option);
	}

	public void selectExpirationYear(String option) {
		logger.info("Selecting expiration year credit card..");
		WebDriverUtils.selectVisibleText(driver, expirationDateYear, option);
	}

	public void enterSecurityCode(String secutityCardValue) {
		logger.info("Entering security card..");
		WebDriverUtils.enterTextBox(driver, securityCode, secutityCardValue);
	}

	public void clickBuyNo() {
		logger.info("Buying now..");
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
	}

	public void gotoPayPal() {
		logger.info("Going to PayPal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalBtn);
	}

	public void placeOrder() {
		logger.info("Placing my order..");
		WebDriverUtils.clickOnElementWithWait(driver, placeOrderBtn);
	}

	public void expandPromoCode() {
		logger.info("Expanding promo code..");
		WebDriverUtils.clickOnElementWithWait(driver, expandPromoCode);
	}

	public void expandGiftCard() {
		logger.info("Expanding gift card..");
		WebDriverUtils.clickOnElementWithWait(driver, expandGiftCard);
	}

	public void apply() {
		logger.info("Apply..");
		WebDriverUtils.clickOnElementWithWait(driver, applyGifCard);
	}

	public void enterPin(String pinValue) {
		logger.info("Entering pin..");
		WebDriverUtils.enterTextBox(driver, pinTxtBox, pinValue);
	}

	public void enterGiftCard(String giftCardValue) {
		logger.info("Entering gift card..");
		WebDriverUtils.enterTextBox(driver, giftCardTxtBox, giftCardValue);
	}

	public void enterPromoCode(String promoCodeValue) {
		logger.info("Entering promo code..");
		WebDriverUtils.enterTextBox(driver, promoCodeTxtBox, promoCodeValue);
	}

	public CheckoutProcessCompletePage returnCheckoutProcessCompletePage() {
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(checkoutCompleteText));
		return new CheckoutProcessCompletePage(driver);
	}
}
