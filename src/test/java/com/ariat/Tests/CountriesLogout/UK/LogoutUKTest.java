package com.ariat.Tests.CountriesLogout.UK;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class LogoutUKTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	private static final String EMAIL = "aila.bogasieru@gmail.com";
	private static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void logoutFromMyAccountMiddleUKTest() {
		logger.info("Starting the logout UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.logoutMiddle();
		logger.info("I was succesfully logged out from the application!");
	}
	
	@Test
	public void logoutFromMyAccountTopUKTest() {
		logger.info("Starting the logout UK test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logger.info("I was succesfully logged out from the application!");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
	}

}
