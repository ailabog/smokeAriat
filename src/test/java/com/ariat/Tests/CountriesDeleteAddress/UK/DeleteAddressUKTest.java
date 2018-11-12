package com.ariat.Tests.CountriesDeleteAddress.UK;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.AddAddressesPage;
import com.ariat.Pages.AddressesPage;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.LogoutPage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.CountriesDeleteAddress.US.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class DeleteAddressUKTest extends BaseTest {

	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddAddressesPage addAddressPage;
	private AddressesPage addressesPage;
	private LogoutPage logoutPage;
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

	@Test(priority = 0)
	public void deleteAddressUKTest() {
		logger.info("Starting deleting address UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage = myAccountPage.returnAddressesPageMiddleNav();
		addressesPage.deleteAddressCreatedNo("nnn");
		addressesPage.deleteAddressCreated("nn");
		addressesPage.checkAddress("nnn");
		logoutPage = myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logoutPage.logout();
		logger.info("Finishing deleting address UK test");
	}

	@Test(priority = 1)
	public void deleteAddressFromEditUKTest() {
		logger.info("Starting deleting address from Edit address UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addressesPage = myAccountPage.returnAddressesPageMiddleNav();
		addAddressPage = addressesPage.returnAddressesEdit();
		addAddressPage.deleteAddress();
		addressesPage = addAddressPage.returnAddressesFromEditDeletePage();
		addressesPage.checkAddress("ccc");
		logoutPage = myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logoutPage.logout();
		logger.info("Finishing deleting address from Edit address UK test");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		addressesPage.quit();
		addAddressPage.quit();
		logoutPage.quit();
	}
}