package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * This contains My Account page' locators, methods and links with pages:
 * EditProfilePage, EmailPreferencePage, AddressesPage, MyOrdersPage,
 * PaymentInformationPage, MyWishListPage, LogoutPage
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(MyAccountPage.class);

	private By logout = By.xpath("//a[text()='Log out']");
	private By signIn = By.xpath("//a[text()= 'Sign In']");
	private By personalInfoLink = By.xpath("//a[text()= 'Personal Information']");
	private By personalInfoText = By.xpath("//h2[text()='Personal Information']");
	private By emailPreferencesText = By.xpath("//*[@id=\"emailEdit\"]/div/h1");
	private By emailPreferencesLink = By.xpath("//a[text()='Email Preferences']");
	private By addressesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/h1");
	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By paymentInformationLink = By.xpath("//a[text() = 'Payment Information']");
	private By paymentInformationText = By.className("payment-info__title border-bottom");
	private By myOrdersLink = By.xpath("//a[text()='My orders']");
	private By noOrders = By.className("no_orders");
	private By myWishListLink = By.xpath("//a[text()='My wish list']");
	private By myWishListText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/h1");

	private By myAccountLink = By.xpath("//a[text()='My account']");
	private By logoutLink = By.xpath("//a[text()='Log out']");

	protected MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void logout() {
		logger.info("Logging out from the application:");
		WebDriverUtils.clickOnElementWithWait(driver, logout);
	}

	public PersonalnformationPage returnEditProfilePage() {
		WebDriverUtils.clickOnElementWithWait(driver, personalInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public EmailPreferencePage returnEmailPreferencePage() {
		WebDriverUtils.clickOnElementWithWait(driver, emailPreferencesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailPreferencesText));
		return new EmailPreferencePage(driver);
	}

	public AddressesPage returnAddressesPage() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}

	public PaymentInformationPage returnPaymentInformationPage() {
		WebDriverUtils.clickOnElementWithWait(driver, paymentInformationLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(paymentInformationText));
		return new PaymentInformationPage(driver);
	}

	public MyOrdersPage returnMyOrdersPage() {
		WebDriverUtils.clickOnElementWithWait(driver, myOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrders));
		return new MyOrdersPage(driver);
	}

	public MyWishListPage returnMyWishListPage() {
		WebDriverUtils.clickOnElementWithWait(driver, myWishListLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}

	public LogoutPage returnLogoutPage() {
		WebDriverUtils.clickOnElementWithWait(driver, logout);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(signIn));
		return new LogoutPage(driver);
	}

	public LogoutPage returnLogoutFromMyAccountPage() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(logoutLink));
		return new LogoutPage(driver);
	}
}
