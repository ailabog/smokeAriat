package com.ariat.Tests.CountriesMyAccount.US;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Include tests for My account left navigation US
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountTopRightNavigationUSTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@yahoo.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoUSTest() {
		logger.info("Starting personal info US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.USlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInformationPageTopNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing personal info US test...");
	}

	@Test(priority = 1)
	public void myAccountAccessOrdersUSTest() {
		logger.info("Starting orders US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageTopNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing orders US test...");
	}

	@Test(priority = 2)
	public void myAccountAccessWishListUSTest() {
		logger.info("Starting wish list US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnWishListPageTopNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing wish list US test...");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
