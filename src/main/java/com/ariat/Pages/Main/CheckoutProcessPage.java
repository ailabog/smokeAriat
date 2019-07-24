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
	private By arrowCountry = By.xpath("//span[@class='el-input__suffix']");
    private By selectOption = By.xpath("//span[text()='Austria']");
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
			.xpath("//input[@value='Stay in touch. Learn about our new products and special offers first!']");
	private By continueCheckout = By.xpath("//button[@class='el-button checkout_button el-button--primary']//span[text()='Continue']");
	private By continueCheckoutDE = By.xpath("//button[@class='el-button checkout_button el-button--primary']//span[text()='Fortsetzen']");
	private By continueCheckout1 = By.cssSelector(".el-button--primary:nth-child(1)");
	private By standardCheck = By.xpath("//input[@value='X-1']");
	private By expressCheck = By.xpath("//input[@value='U-1']");
	private By paypalCheck = By.xpath("//input[@vlaue='PAYPAL']");
	private By creditCardCheck = By.xpath("//input[@value='SA_SILENTPOST']");
	private By cardArrow = By.cssSelector(".el-row:nth-child(4) .el-select__caret");
	private By selectCard = By.xpath("//span[text()='(MasterCard) ************4444 1.2033']");
	private By cardName = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[4]/div/div/div/div[1]/input");
	
	private By selectTypeCard = By.xpath("//div[@class='el-select checkout_input']");
	
	private By expirationDateMonth = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[7]/div[1]/div/div/div[1]/div/input");
	private By expirationDateYear = By.xpath(
			"//*[@id=\"el-collapse-content-7604\"]/div/div/form/div/form/div[2]/div/div[1]/form/div[7]/div[2]/div/div/div[1]/div/input");
	private By securityCode = By.xpath("//label[@for='cvn']//div[@class='el-form-item__content']//div[@class='checkout_input ms-padding-right-10 el-input']");
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
	private By cardNo = By.xpath("//label[@for='number']");
    private By selectState = By.xpath("//input[@placeholder='Alabama']");
	private By checkoutBtn=By.xpath("//div[@data-funding-source='paypal']");
	private By emailTxtBoxPayPal=By.id("email");
	private By passwordTxtBoxPaypal=By.id("password");
	private By loginPayPal=By.id("btnLogin");
	private By continueBtnPayPal=By.xpath("//button[text()='Continue']");
	private By confirmPayPal=By.id("confirmButtonTop");
	private By nextPaymentButton = By.xpath("//span[text()='Next: Payment']");
	
	private By nameText =  By.xpath("//label[@for='name']//div[@class='el-form-item__content']//div[@class='checkout_input el-input']");
	

	protected CheckoutProcessPage(WebDriver driver) {
		super(driver);
	}

	public void clickEditBag() {
		logger.info("Editing bag..");
		WebDriverUtils.clickOnElementWithWait(driver, editBagLink);
	}

	
	public void clickCheckoutBtn() {
		WebDriverUtils.scrollLittDown(driver, checkoutBtn);
		WebDriverUtils.clickOnElementWithWait(driver, checkoutBtn);
	}
	
	public void enterEmailPayPal(String emailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, emailTxtBoxPayPal, emailValue);
	}
	
	public void enterPasswordPayPal(String passwordValue) {
		logger.info("Entering password..");
		WebDriverUtils.enterTextBox(driver, passwordTxtBoxPaypal, passwordValue);
	}
	
	
	public void clickLoginPayPal() {
		logger.info("Loging into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, loginPayPal);
	}
	
	public void clickContinuePayPal() {
		logger.info("Continue into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, continueBtnPayPal);
	}
	
	public void clickConfirmPayPal() {
		logger.info("Confirm paypal payment into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, confirmPayPal);
	}
	
	public void selectCountry() {
		logger.info("Selecting country..");
		WebDriverUtils.clickOnElementWithWait(driver, arrowCountry);
		WebDriverUtils.clickOnElementWithWait(driver, selectOption);
	}
	
	public void selectState() {
		logger.info("Selecting state..");
		WebDriverUtils.clickOnElementWithWait(driver, arrowCountry);
		WebDriverUtils.clickOnElementWithWait(driver, selectState);
	}

	public void enterFName(String nameValue) {
		logger.info("Entering first name..");
		WebDriverUtils.enterTextBox(driver, firstName, nameValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterLName(String lastValue) {
		logger.info("Entering last name..");
		WebDriverUtils.enterTextBox(driver, lastName, lastValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterAddress(String addressValue) {
		logger.info("Entering address address..");
		WebDriverUtils.enterTextBox(driver, address, addressValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterAddress1(String addressValue1) {
		logger.info("Entering address1 name..");
		WebDriverUtils.enterTextBox(driver, address1, addressValue1);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public void enterCity(String cityValue) {
		logger.info("Entering city name..");
		WebDriverUtils.enterTextBox(driver, city, cityValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterZipCode(String zipCodeValue) {
		logger.info("Entering zip code..");
		WebDriverUtils.enterTextBox(driver, zipCode, zipCodeValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkBillingCheckBox() {
		logger.info("Checking billing address the same..");
		WebDriverUtils.clickOnElementWithWait(driver, checkCheckBoxBilling);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterMobile(String mobileValue) {
		logger.info("Entering mobile phone..");
		WebDriverUtils.enterTextBox(driver, mobile, mobileValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterEmail(String emailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, email, emailValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkAddToAddressBox() {
		logger.info("Checking add to address box..");
		WebDriverUtils.clickOnElementWithWait(driver, addToAddressBoxCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkStayInTouch() {
		logger.info("Checking stay in touch checkbox..");
		WebDriverUtils.clickOnElementWithWait(driver, stayInTouchCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void continueCheckoutDE() {
		logger.info("Continue checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, continueCheckoutDE);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}
	
	public void continueCheckout1() {
		logger.info("Continue checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, continueCheckout1);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkStandardDelivery() {
		logger.info("Checking standard delivey..");
		WebDriverUtils.clickOnElementWithWait(driver, standardCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkExpressDelivery() {
		logger.info("Checking express delivery..");
		WebDriverUtils.clickOnElementWithWait(driver, expressCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public void checkPayPal() {
		logger.info("Checking paypal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkCreditCard() {
		logger.info("Checking credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, creditCardCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterCardName(String cardNameValue) {
		logger.info("Entering card name..");
		//WebDriverUtils.enterTextBox(driver, cardName, cardNameValue);
		WebDriverUtils.clickOnElementWithWait(driver, cardArrow);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, selectCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterCardNameNotlogged(String cardNameValue) {
		logger.info("Entering card name..");
		WebDriverUtils.scroll150(driver, nameText);
		WebDriverUtils.enterTextBox(driver, nameText, cardNameValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterCardNo(String cardNumberValue) {
		logger.info("Entering card number..");
		WebDriverUtils.enterTextBox(driver, cardNo, cardNumberValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectTypeCard(String option) {
		logger.info("Selecting type of credit card..");
		WebDriverUtils.selectVisibleText(driver, selectTypeCard, option);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectExpirationMonth(String option) {
		logger.info("Selecting expiration month credit card..");
		WebDriverUtils.selectVisibleText(driver, expirationDateMonth, option);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectExpirationYear(String option) {
		logger.info("Selecting expiration year credit card..");
		WebDriverUtils.selectVisibleText(driver, expirationDateYear, option);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterSecurityCode(String securityCardValue) {
		logger.info("Entering security card..");
		WebDriverUtils.scroll500Down(driver, securityCode);
		WebDriverUtils.enterTextBox(driver, securityCode, securityCardValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void clickBuyNo() {
		logger.info("Buying now..");
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void gotoPayPal() {
		logger.info("Going to PayPal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void placeOrder() {
		logger.info("Placing my order..");
		WebDriverUtils.clickOnElementWithWait(driver, placeOrderBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void expandPromoCode() {
		logger.info("Expanding promo code..");
		WebDriverUtils.clickOnElementWithWait(driver, expandPromoCode);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void expandGiftCard() {
		logger.info("Expanding gift card..");
		WebDriverUtils.clickOnElementWithWait(driver, expandGiftCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void apply() {
		logger.info("Apply..");
		WebDriverUtils.clickOnElementWithWait(driver, applyGifCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterPin(String pinValue) {
		logger.info("Entering pin..");
		WebDriverUtils.enterTextBox(driver, pinTxtBox, pinValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterGiftCard(String giftCardValue) {
		logger.info("Entering gift card..");
		WebDriverUtils.enterTextBox(driver, giftCardTxtBox, giftCardValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterPromoCode(String promoCodeValue) {
		logger.info("Entering promo code..");
		WebDriverUtils.enterTextBox(driver, promoCodeTxtBox, promoCodeValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickNextPayment() {
		logger.info("Going to the payment section..");
		WebDriverUtils.scroll300(driver, nextPaymentButton);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaymentButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public CheckoutProcessCompletePage returnCheckoutProcessCompletePage() {
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(checkoutCompleteText));
		return new CheckoutProcessCompletePage(driver);
	}

}
