package com.ariat.Tests.MyAccount.Countries.MyAccountLeftNavigation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageJE;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Include tests for My account left navigation Jersey
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountLeftNavigationJETest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageJE homePageJE;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@gmail.com";
	public static final String PASSWORD = "Parola12345!";
    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}


	@Test(priority = 0)
	public void myAccountAccessPersonalInfoJPTest() {
		logger.info("Starting personal info Jersey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEditProfilePageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info Jersey test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefJPTest() {
		logger.info("Starting email preferences Jersey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
	   signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences Jersey test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesJPTest() {
		logger.info("Starting addresses Jersey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses Jersey test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoJPTest() {
		logger.info("Starting payment info Jersey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info Jersey test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersJPTest() {
		logger.info("Starting orders Japan test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders Japan test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListJPTest() {
		logger.info("Starting wish list Jersey test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		signInPage = homePageJE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageLeftNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list Jersey test...");
	} 

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageJE.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
