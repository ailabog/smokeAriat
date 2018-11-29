package com.ariat.Tests.CountriesMyAccount.UK;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Include tests for My account left navigation UK
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountLeftNavigationUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}


	@Test(priority = 0)
	public void myAccountAccessPersonalInfoUKTest() {
		logger.info("Starting personal info UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEditProfilePageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info UK test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefUKTest() {
		logger.info("Starting email preferences UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences UK test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesUKTest() {
		logger.info("Starting addresses UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses UK test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoUKTest() {
		logger.info("Starting payment info UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info UK test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersUKTest() {
		logger.info("Starting orders UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders UK test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListUKTest() {
		logger.info("Starting wish list UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list UK test...");
	} 

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
