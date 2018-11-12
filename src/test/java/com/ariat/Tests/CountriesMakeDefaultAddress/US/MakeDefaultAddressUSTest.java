package com.ariat.Tests.CountriesMakeDefaultAddress.US;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.AddressesPage;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.LogoutPage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Make default test US
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MakeDefaultAddressUSTest extends BaseTest {

	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddressesPage addressesPage;
	private LogoutPage logoutPage;
	private Environments environment;

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
	public void editAddressUSTest() {
		logger.info("Starting make default address US test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.USlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage= myAccountPage.returnAddressesPageMiddleNav();
		addressesPage.makeDefaultAddressCreated("B1TGL");
		addressesPage.assertMakeDefault("DEFAULT | B1TGL");
		logoutPage = myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logoutPage.logout();
		logger.info("Finishing make default address US test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		addressesPage.quit();
		logoutPage.quit();
	}
}