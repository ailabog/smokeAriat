package com.ariat.Tests.CountriesAddresses.USAddress;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.AddAddressesPage;
import com.ariat.Pages.AddressesPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.LogoutPage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Adds a new address and checks the address was created for US
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class AddAddressUSTest extends BaseTest {

	private HomePage homePage;
	private HomePageUS homePageUS;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddAddressesPage addAddressPage;
	private AddressesPage addressesPage;
	private LogoutPage logoutPage;
	private Environments environment;
	private EUCountries euCountry;

	public static final String ADDRESS = GenerateRandomDataUtils.generateRandomString(5);
	public static final String CITY = GenerateRandomDataUtils.generateRandomString(5);
	public static final String POST_CODE = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String PHONE = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String ADDRESS_ID = GenerateRandomDataUtils.generateRandomAlphaNumeric(5);
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void addAddressUSTest() {
		logger.info("Starting add address US test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addAddressPage = myAccountPage.returnAddAddressesPageMiddleNav();
		addAddressPage.enterFName("A");
		addAddressPage.enterLName("B");
		addAddressPage.enterAddress1("Basarabia Blvd, No 62");
		addAddressPage.enterCity(CITY);
		addAddressPage.selectCountry("Romania");
		addAddressPage.enterPostCode(POST_CODE);
		addAddressPage.enterPhone(PHONE);
		addAddressPage.enterAddressId(ADDRESS_ID);
		addressesPage = addAddressPage.returnAddressesPage();
		addressesPage.checkAddress(ADDRESS_ID);
		logoutPage = myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logoutPage.logout();
		logger.info("Finishing add address US test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUS.quit();
		signInPage.quit();
		myAccountPage.quit();
		addAddressPage.quit();
		addressesPage.quit();
		logoutPage.quit();
	}

}