package com.ariat.Pages;

import org.openqa.selenium.By;

/**
 * Page that contains all the elements for Sign In page and its methods: 
 * returning customer, create account, forgot password & check order & links to Create Account page
 * 
 * @author aila.bogasieru@ariat.com
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

public class SignInPage extends BasePage {
	
	private static final Logger logger = LoggerFactory.getLogger(SignInPage.class);

	private By passwordTextBox = By.id("dwfrm_login_password");
	private By addressEmailTextBox = By.id("dwfrm_login_username_d0okqmfasagn");
	private By checkRememberMe = By.id("dwfrm_login_rememberme");
	private By loginButton = By.name("dwfrm_login_login");
	private By forgotPassword = By.id("password-reset");
	private By emailAddressForgot = By.id("dwfrm_requestpassword_email");
	private By sendForgotButton = By.name("dwfrm_requestpassword_send");
	private By closeForgotButton = By.xpath("//*[@id=\"ext-gen44\"]/body/div[9]/div[1]/a/span");
	private By checkOrderTextBox = By.id("dwfrm_ordertrack_orderNumber");
	private By emailAddressCheckOrderTextBox = By.id("dwfrm_ordertrack_email");
	private By billingCheckOrderTextBoxTextBox = By.id("dwfrm_ordertrack_postalCode");
	private By checkStatusButton = By.id("dwfrm_ordertrack_findorder");
	private By createAccountButton = By.name("dwfrm_login_register");
	private By createAccountTitle = By.xpath("//*id='main']/div/div/div/div[1]/h1");

	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345";
	private static final String ORDER_NO = "1234";
	private static final String BILLING_CHECK = "026423";

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void returningCustomer() {
		logger.info("Entering information for an existing customer");
		WebDriverUtils.enterTextBox(driver, addressEmailTextBox, EMAIL);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, passwordTextBox, PASSWORD);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void loginClick() {
		logger.info("Logging into your account...");
		WebDriverUtils.clickOnElementWithWait(driver, loginButton);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void returningCustomerRememberMe() {
		logger.info("Remeber me");
		WebDriverUtils.clickOnElement(driver, checkRememberMe);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);

	}

	public void forgotPasswordClick() {
		logger.info("Forgot password");
		WebDriverUtils.clickOnElementWithWait(driver, forgotPassword);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void forgotPasswordEmail() {
		logger.info("This is my email:");
		WebDriverUtils.enterTextBox(driver, emailAddressForgot, EMAIL);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void ForgotPasswordSend() {
		logger.info("Sending my email so the password is reset");
		WebDriverUtils.clickOnElementWithWait(driver, sendForgotButton);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void closeForgot() {
		logger.info("Closing the forgot password modal");
		WebDriverUtils.clickOnElementWithWait(driver, closeForgotButton);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void checkOrder() {
		logger.info("Start entering information to check order");
		WebDriverUtils.enterTextBox(driver, checkOrderTextBox, ORDER_NO);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, emailAddressCheckOrderTextBox, EMAIL);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, billingCheckOrderTextBoxTextBox, BILLING_CHECK);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void checkStatusClick() {
		WebDriverUtils.clickOnElementWithWait(driver, checkStatusButton);
		logger.info("Checking the order status");
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public CreateAccountPage returnCreateAccountPage() {
		WebDriverUtils.scrollElementToPosition(driver, createAccountButton);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, createAccountButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
			ExpectedConditions.invisibilityOfElementLocated(createAccountTitle));
		return new CreateAccountPage(driver);
	}

}
