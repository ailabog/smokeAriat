package com.ariat.Pages.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Pages.MyAccountPage;
import com.ariat.Utils.WebDriverUtils;

public class CheckoutProcessPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(CheckoutProcessPage.class);

	private By editBagLink = By.xpath("//button[@class='el-button summary__edit el-button--text']");
	private By selectAddressFromSelected = By.xpath("//input[@placeholder='Select']");
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
	private By continueCheckout = By.xpath("//button//span[text()='Use this address for Billing']");
	private By standardCheck = By
			.xpath("//*[@id=\"el-collapse-content-240\"]/div/div/div[2]/form/div/div/div/div/div/label[1]/span[1]");
	private By expressCheck = By.xpath(
			"//*[@id=\"el-collapse-content-240\"]/div/div/div[2]/form/div/div/div/div/div/label[2]/span[1]/span");
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

	protected CheckoutProcessPage(WebDriver driver) {
		super(driver);
	}

	public void clickEditBag() {
		logger.info("Editing bag..");
		WebDriverUtils.clickOnElementWithWait(driver, editBagLink);

	}

	public void selectAddress(String optionAddress) {
		logger.info("Selecting address..");
		WebDriverUtils.selectVisibleText(driver, selectAddressFromSelected, optionAddress);

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
	
	public void checkStandard() {
		logger.info("Checking standard delivey..");
		WebDriverUtils.clickOnElementWithWait(driver, standardCheck);

	}
	
	public void checkExpress() {
		logger.info("Checking express delivery..");
		WebDriverUtils.clickOnElementWithWait(driver, expressCheck);

	}
	
	
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
}
