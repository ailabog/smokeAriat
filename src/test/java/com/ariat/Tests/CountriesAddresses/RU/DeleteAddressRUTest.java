package com.ariat.Tests.CountriesAddresses.RU;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.AddAddressesPage;
import com.ariat.Pages.AddressesPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class DeleteAddressRUTest extends BaseTest {

	private HomePage homePage;
	private HomePageRU homePageRU;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddAddressesPage addAddressPage;
	private AddressesPage addressesPage;
	private Environments environment;
	private GlobalCountries country;

	public static final String ADDRESS = GenerateRandomDataUtils.generateRandomString(5);
	public static final String CITY = GenerateRandomDataUtils.generateRandomString(5);
	public static final String POST_CODE = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String PHONE = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String ADDRESS_ID = GenerateRandomDataUtils.generateRandomAlphaNumeric(5);
	private static final String EMAIL = "aila.bogasieru@ariat.com";
	private static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void deleteAddressUKTest() {
		logger.info("Starting deleting address Russia test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		signInPage = homePageRU.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "English");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage = myAccountPage.returnAddressesPageMiddleNav();
		addressesPage.deleteAddressCreatedNo("nnn");
		addressesPage.deleteAddressCreatedYes("nn");
		addressesPage.checkAddress("nnn");
		logger.info("Finishing deleting address Russia test");
	}

	@Test(priority = 1)
	public void deleteAddressFromEditUKTest() {
		logger.info("Starting deleting address from Edit address Russia test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		signInPage = homePageRU.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "English");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage = myAccountPage.returnAddressesPageMiddleNav();
		addAddressPage = addressesPage.returnAddressesEdit();
		addressesPage = addAddressPage.returnAddressesFromEditDeletePage();
		addressesPage.checkAddress("ccc");
		logger.info("Finishing deleting address from Edit address Russia test");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageRU.quit();
		signInPage.quit();
		myAccountPage.quit();
		addressesPage.quit();
		addAddressPage.quit();
	}
}