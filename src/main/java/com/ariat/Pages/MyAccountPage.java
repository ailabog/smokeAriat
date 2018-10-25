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
 * PaymentInformationPage, MyWishListPage, LogoutPage, AddAddressesPage, 
 * AddACreditCardPage from My Account core page and from left navigation
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(MyAccountPage.class);

	private By logout = By.xpath("//a[text()='Log out']");
	private By signIn = By.xpath("//a[text()= 'Sign In']");
	private By personalInfoLink = By.xpath("//a[text()= 'Personal Information']");
	private By personalInfoText = By.xpath("//*[contains(text(),'Personal Information']");
	
	private By emailPreferencesText = By.xpath("//*[contains(text(), Email Preferences']");
	private By emailPreferencesLink = By.xpath("//a[text()='Email Preferences']");
	
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");
	private By addressesLink = By.xpath("//a[text()='Addresses']");
	
	private By paymentInformationLink = By.xpath("//a[text() = 'Payment Information']");
	private By paymentInformationText = By.className("//*contains[text(),'Credit card information']");
	
	private By myOrdersLink = By.xpath("//a[text()='My orders']");
	private By noOrders = By.className("//*contains[text(), We have no order records for this account.']");
	
	private By myWishListLink = By.xpath("//a[text()='My wish list']");
	private By myWishListText = By.xpath("//*contains[text(), 'Wish list']");

	private By myAccountLink = By.xpath("//a[text()='My account']");
	

	private By editPersonalInfoLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/a");
	private By changePasswordLink = By.xpath(
			"//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/a");
	private By editEmailPreferenceLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a");
	private By editAddressesLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[3]/div[1]/a");
	private By addAddressLink = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/a");
	private By editPaymentInfoLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[4]/div[1]/a");
	private By addCardLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[4]/div[2]/div[2]/a");
	private By viewAllOrdersLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[5]/div[1]/a");
	private By viewAllWishListLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[6]/div[1]/a");

	private By addressesTextfromAddAddresses = By.xpath("//*[contains(text(),'Addresses']");
	private By addCreditCardText = By.xpath("//*[contains(text(),'Add a credit card']");
	
	private By myEmailPrefText = By.xpath("//*[contains(text(),'Email preferences']");
	
	private By ordersTopNavLink = By.xpath("//*[@id=\"pg-container\"]/nav/div[1]/div[1]/div[3]/div/div[5]/ul/li[2]/a");
	private By accountInfoTopNabLink = By.xpath("//*[@id=\"pg-container\"]/nav/div[1]/div[1]/div[3]/div/div[5]/ul/li[3]/a");
	private By wishListTopNavLink = By.xpath("//*[@id=\"pg-container\"]/nav/div[1]/div[1]/div[3]/div/div[5]/ul/li[4]/a");
	private By logoutTopnavLink = By.xpath("//a[text()='Log out']");

	protected MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void logout() {
		logger.info("Logging out from the application:");
		WebDriverUtils.clickOnElementWithWait(driver, logout);
	}
	
	public void myAccountClick() {
		logger.info("Going to My Account page...");
		WebDriverUtils.clickOnElementWithWait(driver, myAccountLink);
	}
	
	//Links with pages from My account core

	public PersonalnformationPage returnPersonalInfoPage() {
		WebDriverUtils.clickOnElementWithWait(driver, editPersonalInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public PersonalnformationPage returnPersonalInfoPageChangePass() {
		WebDriverUtils.clickOnElementWithWait(driver, changePasswordLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public EmailPreferencePage returnEmailPreferencePageEdit() {
		WebDriverUtils.clickOnElementWithWait(driver, editEmailPreferenceLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myEmailPrefText));
		return new EmailPreferencePage(driver);
	}

	public AddressesPage returnAddressesPageEdit() {
		WebDriverUtils.clickOnElementWithWait(driver, editAddressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}

	public AddAddressesPage returnAddAddressesPage() {
		WebDriverUtils.clickOnElementWithWait(driver, addAddressLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesTextfromAddAddresses));
		return new AddAddressesPage(driver);
	}

	public PaymentInformationPage returnPaymentInformationPageEdit() {
		WebDriverUtils.clickOnElementWithWait(driver, editPaymentInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(paymentInformationText));
		return new PaymentInformationPage(driver);
	}

	public AddACreditCardPage returnAddACreditCard() {
		WebDriverUtils.clickOnElementWithWait(driver, addCardLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addCreditCardText));
		return new AddACreditCardPage(driver);
	}

	public MyOrdersPage returnMyOrdersPageViewAll() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrders));
		return new MyOrdersPage(driver);
	}

	public MyWishListPage returnMyWishListPageViewAll() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllWishListLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}

//Links with pages from left navigation
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
	
	
//My account right top navigation
	
	public MyOrdersPage returnMyOrdersPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, ordersTopNavLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrders));
		return new MyOrdersPage(driver);
	}
	
	public PersonalnformationPage returnPersonalInformationPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, accountInfoTopNabLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public MyWishListPage returnWishListPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, wishListTopNavLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new MyWishListPage(driver);
	}
	
	public LogoutPage returnLogoutFromMyAccountPage() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new LogoutPage(driver);
	}
}
