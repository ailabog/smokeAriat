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

/**
 * Include tests for My account left navigation
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountTopRightNavigationTest extends BaseTest {

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
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInformationPageTopNav();
		// do something - if I want
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing personal info test...");
	}

	@Test(priority = 1)
	public void myAccountAccessOrdersTest() {
		logger.info("Starting orders test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageTopNav();
		// TO DO implementation for MyOrdersPage
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing orders test...");
	}

	@Test(priority = 2)
	public void myAccountAccessWishListTest() {
		logger.info("Starting wish list test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnWishListPageTopNav();
		// TO DO implementation for WishListPage
		myAccountPage.myAccountClick();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("Finishing wish list test...");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
