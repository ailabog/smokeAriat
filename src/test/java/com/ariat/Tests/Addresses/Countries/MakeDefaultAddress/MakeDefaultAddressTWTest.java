package com.ariat.Tests.Addresses.Countries.MakeDefaultAddress;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Pages.Main.AddressesPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;


/**
 * Make default test Taiwan
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MakeDefaultAddressTWTest extends BaseTest {

	private HomePage homePage;
	private HomePageTW homePageTW;
   private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddressesPage addressesPage;
	private Environments environment;
	private GlobalCountries country;

	public static final String ADDRESS = GenerateRandomDataUtils.generateRandomString(5);
	public static final String CITY = GenerateRandomDataUtils.generateRandomString(5);
	public static final String POST_CODE = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String PHONE = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String ADDRESS_ID = GenerateRandomDataUtils.generateRandomAlphaNumeric(5);
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test
	public void makeDefaultAddressTWTest() {
		logger.info("Starting make default address Taiwan test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage= myAccountPage.returnAddressesPageMiddleNav();
		addressesPage.makeDefaultAddressCreated("235432");
		addressesPage.assertMakeDefault("DEFAULT | 235432");
		logger.info("Finishing make default address Taiwan test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTW.quit();
		signInPage.quit();
		myAccountPage.quit();
		addressesPage.quit();
	}
}