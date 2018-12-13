package com.ariat.Pages.Main;

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

	private By logoutTopNav= By.xpath("//a[text()='Log out']");
	private By logoutTopNavFR= By.xpath("//a[text()='Se déconnecter']");
	private By logoutMiddle = By.id("account-overview__logout-link");
	private By logouttopNavFR = By.xpath("a[text()='Se déconnecter']");
	private By logoutTopNavDE = By.xpath("//a[text()='Abmelden']");
	private By signIn = By.xpath("//a[text()= 'Sign In']");
	private By signInDE = By.xpath("//a[text()='Einloggen']");
	private By signInFR = By.xpath("//a[text()='Connexion']");
	private By personalInfoLink = By.xpath("//a[text()= 'Personal Information']");
	private By personalInfoLinkDE = By.xpath("//a[text()= 'Persönliche Daten']");
	private By personalInfoText = By.xpath("//*[contains(text(),'Personal Information']");
	private By personalInfoLinkFR = By.xpath("//a[text()='Informations personnelles']");
	
	private By emailPreferencesText = By.xpath("//*[contains(text(), Email Preferences']");
	private By emailPreferencesLink = By.xpath("//a[text()='Email Preferences']");
	private By emailPreferencesLinkDE = By.xpath("//a[text()='E-Mail-Einstellungen']");
	private By emailPreferencesLinkFR = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[3]/a");
	
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");
	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesLinkDE = By.xpath("//a[text()='Adressen']");
	private By addressesTextDE = By.xpath("//*[contains(text(), 'Adressen']");

	
	private By paymentInformationLink = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[5]/a");
	private By paymentInformationText = By.className("//*contains[text(),'Credit card information']");
	
	private By myOrdersLink = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[6]/a");
	private By myOrdersLinkFR = By.xpath("//a[text()='Mes commandes']");
	private By noOrdersText = By.className("//*contains[text(), We have no order records for this account.']");
	private By yesOrdersText = By.xpath("//*contains[text(),'My orders']");
	
	private By orderStatusLink = By.xpath("//a[text()='Order status']");
	private By orderDetailsLink = By.xpath("//a[text()='Order details']");
	private By orderDetailsText = By.xpath("//*contains[text(),'Order details']");
	private By myWishListLink = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[7]/a");
	private By myWishListLinkFR = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[7]/a");
	private By myWishListText = By.xpath("//*contains[text(), 'Wish list']");

	private By myAccountLink = By.xpath("//a[text()='My account']");
	private By myAccountLinkDE = By.xpath("//a[text()='Mein Konto']");
	private By myAccountLinkFR = By.xpath("//a[text()='Mon compte']");

	private By editPersonalInfoLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/a");
	private By editPersonalInfoLinkUS = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/a");
	
	private By changePasswordLink = By.xpath(
			"//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/a");
	private By editEmailPreferenceLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a");
	private By editAddressesLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[3]/div[1]/a");
	private By addAddressLink = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/a");
	private By editPaymentInfoLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[4]/div[1]/a");
	private By addCardLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[4]/div[2]/div[2]/a");
	private By viewAllOrdersLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[5]/div[1]/a");
	private By viewAllOrdersLinkDE = By.xpath("//a[text()='Alle Anzeigen']");
	
	private By viewAllWishListLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[6]/div[1]/a");
	private By viewAllWishListLinkDE = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[6]/div[1]/a");

	private By addressesTextfromAddAddresses = By.xpath("//*[contains(text(),'Addresses']");
	private By addCreditCardText = By.xpath("//*[contains(text(),'Add a credit card']");
	private By addDeleteCardLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/div[4]/div[1]/a");
	
	private By myEmailPrefText = By.xpath("//*[contains(text(),'Email preferences']");
	
	private By ordersTopNavLink = By.xpath("//a[text()='Orders']");
	private By ordersTopNavLinkDE = By.xpath("//a[@title='Bestellungen']");
	private By ordersTopNavLinkFR = By.xpath("//a[text()='Commandes']");
	private By accountInfoTopNabLink = By.xpath("//a[text()='Account Info']");
	private By accountInfoTopNabLinkDE = By.xpath("//a[text()='Kontoinformationen']");
	private By accountInfoTopNabLinkFR = By.xpath("//a[text()='Informations du compte']");
	
	private By wishListTopNavLink = By.xpath("//a[text()='Wishlist']");
	private By wishListTopNavLinkDE = By.xpath("//a[@title='Wunschliste']");
	private By wishListTopNavLinkFR = By.xpath("//a[@title='Liste d’envies']");
	private By addressesLinkFR = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div/ul/li[4]/a");

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void logoutMiddle() {
		logger.info("Logging out from the application:");
		
			WebDriverUtils.clickOnElementWithWait(driver, logoutMiddle);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}
	
	public void logoutTop(String language) {
		logger.info("Logging out from the application:");
		switch (language) {
		case "English":
			WebDriverUtils.clickOnElementWithWait(driver, logoutTopNav);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			break;
			
		case "Deutsch":
			WebDriverUtils.clickOnElementWithWait(driver, logoutTopNavDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			break;
			
		case "Francais":
			WebDriverUtils.clickOnElementWithWait(driver, logouttopNavFR);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			break;	
		default:
			throw new RuntimeException("Language" + language + "not supported");
		}
	}
	
	
	public void myAccountClick() {
		logger.info("Going to My Account page...");
		WebDriverUtils.clickOnElementWithWait(driver, myAccountLink);
	}
	
	public void myAccountClickDE() {
		logger.info("Going to My Account page...");
		WebDriverUtils.clickOnElementWithWait(driver, myAccountLinkDE);
	}
	
	public void myAccountClickFR() {
		logger.info("Going to My Account page...");
		WebDriverUtils.clickOnElementWithWait(driver, myAccountLinkFR);
	}
	
	//Links with pages from My account core

	public PersonalnformationPage returnPersonalInfoPageMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, editPersonalInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public PersonalnformationPage returnPersonalInfoPageMiddleNavUS() {
		WebDriverUtils.clickOnElementWithWait(driver, editPersonalInfoLinkUS);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public PersonalnformationPage returnPersonalInfoPageChangePassMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, changePasswordLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public EmailPreferencePage returnEmailPreferencePageMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, editEmailPreferenceLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myEmailPrefText));
		return new EmailPreferencePage(driver);
	}

	public AddressesPage returnAddressesPageMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, editAddressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}

	public AddAddressesPage returnAddAddressesPageMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, addAddressLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesTextfromAddAddresses));
		return new AddAddressesPage(driver);
	}

	public PaymentInformationPage returnPaymentInformationPageMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, editPaymentInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(paymentInformationText));
		return new PaymentInformationPage(driver);
	}

	public AddACreditCardPage returnAddACreditCardMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, addCardLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addCreditCardText));
		return new AddACreditCardPage(driver);
	}
	
	public PaymentInformationPage returnPaymentInformationPageAddDeleteCardMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, addDeleteCardLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(paymentInformationText));
		return new PaymentInformationPage(driver);
	}

	public MyOrdersPage returnMyOrdersPageViewAllMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS, 
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public MyOrdersPage returnMyOrdersPageViewAllMiddleNavDE() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllOrdersLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS, 
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
		
		public MyOrdersPage returnMyOrdersPageOrderStatusMiddleNav() {
			WebDriverUtils.clickOnElementWithWait(driver, orderStatusLink);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS, 
					ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
			return new MyOrdersPage(driver);
	}
		public OrderDetailsPage returnOrderDetailsPagesMiddleNav() {
			WebDriverUtils.clickOnElementWithWait(driver, orderDetailsLink);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(orderDetailsText));
		return new OrderDetailsPage(driver);
	}

	public MyWishListPage returnMyWishListPageViewAllMiddleNav() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllWishListLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
	
	public MyWishListPage returnMyWishListPageViewAllMiddleNavDE() {
		WebDriverUtils.clickOnElementWithWait(driver, viewAllWishListLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}

//Links with pages from left navigation
	public PersonalnformationPage returnEditProfilePageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, personalInfoLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public PersonalnformationPage returnEditProfilePageLeftNavDE() {
		WebDriverUtils.clickOnElementWithWait(driver, personalInfoLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public PersonalnformationPage returnEditProfilePageLeftNavFR() {
		WebDriverUtils.clickOnElementWithWait(driver, personalInfoLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}

	public EmailPreferencePage returnEmailPreferencePageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, emailPreferencesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailPreferencesText));
		return new EmailPreferencePage(driver);
	}
	
	public EmailPreferencePage returnEmailPreferencePageLeftNavDE() {
		WebDriverUtils.clickOnElementWithWait(driver, emailPreferencesLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailPreferencesText));
		return new EmailPreferencePage(driver);
	}
	
	public EmailPreferencePage returnEmailPreferencePageLeftNavFR() {
		WebDriverUtils.clickOnElementWithWait(driver, emailPreferencesLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailPreferencesText));
		return new EmailPreferencePage(driver);
	}

	public AddressesPage returnAddressesPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}
	
	public AddressesPage returnAddressesPageLeftNavFR() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddressesPage(driver);
	}
	
	public AddressesPage returnAddressesPageLeftNavDE() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesTextDE));
		return new AddressesPage(driver);
	}
	
	public PaymentInformationPage returnPaymentInformationPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, paymentInformationLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(paymentInformationText));
		return new PaymentInformationPage(driver);
	}

	public MyOrdersPage returnMyOrdersPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, myOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public MyOrdersPage returnMyOrdersPageLeftNavFR() {
		WebDriverUtils.clickOnElementWithWait(driver, myOrdersLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}

	public MyWishListPage returnMyWishListPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, myWishListLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
	
	public MyWishListPage returnMyWishListPageLeftNavFR() {
		WebDriverUtils.clickOnElementWithWait(driver, myWishListLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}

	public LogoutPage returnLogoutPage() {
		WebDriverUtils.clickOnElementWithWait(driver, logoutMiddle);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(signIn));
		return new LogoutPage(driver);
	}
	
	
//My account right top navigation
	
	public MyOrdersPage returnMyOrdersPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, ordersTopNavLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public MyOrdersPage returnMyOrdersPageTopNavDE() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, ordersTopNavLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public MyOrdersPage returnMyOrdersPageTopNavFR() {
		WebDriverUtils.moveToElement(driver, myAccountLinkFR);
		WebDriverUtils.clickOnElementWithWait(driver, ordersTopNavLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(noOrdersText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(yesOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public PersonalnformationPage returnPersonalInformationPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, accountInfoTopNabLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public PersonalnformationPage returnPersonalInformationPageTopNavDE() {
		WebDriverUtils.moveToElement(driver, myAccountLinkDE);
		WebDriverUtils.clickOnElementWithWait(driver, accountInfoTopNabLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public PersonalnformationPage returnPersonalInformationPageTopNavFR() {
		WebDriverUtils.moveToElement(driver, myAccountLinkDE);
		WebDriverUtils.clickOnElementWithWait(driver, accountInfoTopNabLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(personalInfoText));
		return new PersonalnformationPage(driver);
	}
	
	public MyWishListPage returnWishListPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, wishListTopNavLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
	
	public MyWishListPage returnWishListPageTopNavDE() {
		WebDriverUtils.moveToElement(driver, myAccountLinkDE);
		WebDriverUtils.clickOnElementWithWait(driver, wishListTopNavLinkDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
	
	public MyWishListPage returnWishListPageTopNavFR() {
		WebDriverUtils.moveToElement(driver, myAccountLinkFR);
		WebDriverUtils.clickOnElementWithWait(driver, wishListTopNavLinkFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
	
	public LogoutPage returnLogoutFromMyAccountPageTopNav() {
		WebDriverUtils.moveToElement(driver, myAccountLink);
		WebDriverUtils.clickOnElementWithWait(driver, logoutTopNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(signIn));
		return new LogoutPage(driver);
	}
	
	public LogoutPage returnLogoutFromMyAccountPageTopNavFR() {
		WebDriverUtils.moveToElement(driver, myAccountLinkFR);
		WebDriverUtils.clickOnElementWithWait(driver, logoutTopNavFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(signInFR));
		return new LogoutPage(driver);
	}
	
	public LogoutPage returnLogoutFromMyAccountPageTopNavDE() {
		WebDriverUtils.moveToElement(driver, myAccountLinkDE);
		WebDriverUtils.clickOnElementWithWait(driver, logoutTopNavDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(signInDE));
		return new LogoutPage(driver);
	}
}
