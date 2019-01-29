package com.ariat.Tests.MyAccount.Countries.MiddleNav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Include tests for My account middle navigation
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountMiddleNavigationTWTest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageTW homePageTW;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoTWTest() {
		logger.info("Starting personal info Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInfoPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnPersonalInfoPageChangePassMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info Japan test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefTWTest() {
		logger.info("Starting email preferences Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences Japan test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesTWTest() {
		logger.info("Starting addresses Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses Japan test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoTWTest() {
		logger.info("Starting payment info Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info Japan test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersTWTest() {
		logger.info("Starting orders UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders Japan test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListTWTest() {
		logger.info("Starting wish list Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list Japan test...");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTW.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
