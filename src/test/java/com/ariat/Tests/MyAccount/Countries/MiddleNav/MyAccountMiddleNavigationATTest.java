package com.ariat.Tests.MyAccount.Countries.MiddleNav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageAT;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
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

public class MyAccountMiddleNavigationATTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageAT homePageAT;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoATTest() {
		logger.info("Starting personal info Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInfoPageMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.returnPersonalInfoPageChangePassMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info Austria test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefDETest() {
		logger.info("Starting email preferences Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences Austria test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesDETest() {
		logger.info("Starting addresses Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.returnAddAddressesPageMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses Austria test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoDETest() {
		logger.info("Starting payment info Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info Austria test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersDETest() {
		logger.info("Starting orders Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNavDE();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders Austria test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListDETest() {
		logger.info("Starting wish list Austria test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageViewAllMiddleNavDE();
		myAccountPage.myAccountClickDE();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list Austria test...");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageAT.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
