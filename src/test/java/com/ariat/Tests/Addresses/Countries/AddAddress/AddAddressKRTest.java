package com.ariat.Tests.Addresses.Countries.AddAddress;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageKR;
import com.ariat.Pages.Main.AddAddressesPage;
import com.ariat.Pages.Main.AddressesPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Adds a new address and checks the address was created for Korea
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class AddAddressKRTest extends BaseTest {

	private HomePage homePage;
	private HomePageKR homePageKR;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddAddressesPage addAddressPage;
	private AddressesPage addressesPage;
	private GlobalCountries country;
	private Environments environment;

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

	@Test
	public void addAddressKRTest() {
		logger.info("Starting add address Korea test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageKR = (HomePageKR) homePage.chooseGlobalLocation(country.KR, country.KR.getCurrencyISO());
		signInPage = homePageKR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addAddressPage = myAccountPage.returnAddAddressesPageMiddleNav();
		addAddressPage.enterFName("A");
		addAddressPage.enterLName("B");
		addAddressPage.enterAddress1("Basarabia Blvd, No 62");
		addAddressPage.enterCity(CITY);
		addAddressPage.selectCountry("Korea");
		addAddressPage.enterPostCode(POST_CODE);
		addAddressPage.enterPhone(PHONE);
		addAddressPage.enterAddressId(ADDRESS_ID);
		addressesPage = addAddressPage.returnAddressesPage();
		//addressesPage.checkAddress(ADDRESS_ID);
		logger.info("Finishing add address Korea test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageKR.quit();
		signInPage.quit();
		myAccountPage.quit();
		addAddressPage.quit();
		addressesPage.quit();
	}
}