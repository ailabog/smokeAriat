package com.ariat.Tests.Logout.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCN;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;


/**
 * Logout test China
 * 
 * @author aila.bogasieru@ariat.com
 *
 */
public class LogoutCNTest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageCN homePageCN;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	private static final String EMAIL = "aila.bogasieru@gmail.com";
	private static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void logoutFromMyAccountMiddleCNTest() {
		logger.info("Starting the logout China test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageCN = (HomePageCN) homePage.chooseGlobalLocation(country.CN, country.CN.getCurrencyISO());
		signInPage = homePageCN.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.logoutMiddle();
		logger.info("I was succesfully logged out from the application!");
	}
	
	@Test
	public void logoutFromMyAccountTopCNTest() {
		logger.info("Starting the logout China test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageCN = (HomePageCN) homePage.chooseGlobalLocation(country.CN, country.CN.getCurrencyISO());
		signInPage = homePageCN.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.logoutTop("English");
		logger.info("I was succesfully logged out from the application!");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		homePageCN.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
