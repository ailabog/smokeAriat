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

import com.ariat.Utils.WebDriverUtils;

public class SignInPage extends BasePage {

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
	private By firstNameTextBox = By.id("dwfrm_profile_customer_firstname");

	private static final String EMAIL = "aila.bogasieru@ariat.com";
	private static final String PASSWORD = "Parola12345";
	private static final String ORDER_NO = "1234";
	private static final String BILLING_CHECK = "026423";

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void returningCustomer() {
		WebDriverUtils.enterTextBox(driver, addressEmailTextBox, EMAIL);
		WebDriverUtils.enterTextBox(driver, passwordTextBox, PASSWORD);
		WebDriverUtils.clickOnElementWithWait(driver, loginButton);
	}

	public void returningCustomerRememberMe() {
		WebDriverUtils.enterTextBox(driver, addressEmailTextBox, EMAIL);
		WebDriverUtils.enterTextBox(driver, passwordTextBox, PASSWORD);
		WebDriverUtils.clickOnElement(driver, checkRememberMe);
		WebDriverUtils.clickOnElementWithWait(driver, loginButton);
	}

	public void forgotPassword() {
		WebDriverUtils.clickOnElementWithWait(driver, forgotPassword);
		WebDriverUtils.enterTextBox(driver, emailAddressForgot, EMAIL);
	}
		
	public void ForgotPasswordSend() {
		WebDriverUtils.clickOnElementWithWait(driver, sendForgotButton);
	}

	public void closeForgot() {
		WebDriverUtils.clickOnElementWithWait(driver, closeForgotButton);
	}

	public void checkOrder() {
		WebDriverUtils.enterTextBox(driver, checkOrderTextBox, ORDER_NO);
		WebDriverUtils.enterTextBox(driver, emailAddressCheckOrderTextBox, EMAIL);
		WebDriverUtils.enterTextBox(driver, billingCheckOrderTextBoxTextBox, BILLING_CHECK);
		WebDriverUtils.clickOnElementWithWait(driver, checkStatusButton);
	}

	public CreateAccountPage returnCreateAccountPage() {
		WebDriverUtils.clickOnElementWithWait(driver, createAccountButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_10_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(firstNameTextBox));
		return new CreateAccountPage(driver);
	}

}
