package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class MyAccountTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeMethod
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoTest() {
		logger.info("Starting personal info test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInfoPage();
		// do something - if I want
		myAccountPage.myAccountClick();
		myAccountPage.returnPersonalInfoPageChangePass();
		// do something - If I want
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing personal info test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefTest() {
		logger.info("Starting email preferences test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageEdit();
		// do something - if I want
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing email preferences test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesTest() {
		logger.info("Starting addresses test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageEdit();
		// TO DO implementation for AddressesPage
		myAccountPage.myAccountClick();
		myAccountPage.returnAddAddressesPage();
		// TO DO implementation for AddAddressPage
		// do something - if I want
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing addresses test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoTest() {
		logger.info("Starting payment info test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageEdit();
		// TO DO implementation for PaymentInformationPage
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCard();
		// TO DO implementation for AddACreditCardPage
		// do something - if I want
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing payment info test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersTest() {
		logger.info("Starting orders test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAll();
		// TO DO implementation for MyOrdersPage
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing orders test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListTest() {
		logger.info("Starting wish list test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageViewAll();
		// TO DO implementation for WishListPage
		myAccountPage.myAccountClick();
		myAccountPage.logout();
		logger.info("Finishing wish list test...");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
