package com.ariat.Tests.MyAccount.Countries.MiddleNav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTR;
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

public class MyAccountMiddleNavigationTRTest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageTR homePageTR;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoTRTest() {
		logger.info("Starting personal info Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInfoPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnPersonalInfoPageChangePassMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info Turkey test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefTRTest() {
		logger.info("Starting email preferences Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences Turkey test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesTRTest() {
		logger.info("Starting addresses Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses Turkey test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoTRTest() {
		logger.info("Starting payment info Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info Turkey test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersTRTest() {
		logger.info("Starting orders Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders Turkey test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListTRTest() {
		logger.info("Starting wish list Turkey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list Turkey test...");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTR.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
