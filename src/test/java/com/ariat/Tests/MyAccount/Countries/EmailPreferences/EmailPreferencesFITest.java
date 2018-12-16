package com.ariat.Tests.MyAccount.Countries.EmailPreferences;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageFI;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.EmailPreferencePage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class EmailPreferencesFITest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageFI homePageFI;
	private Environments environment;
	private EUCountries euCountry;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private EmailPreferencePage emailPreferencesPage;
	

	private static final String EMAIL = "aila.bogasieru@ariat.com";
	private static final String PASSWORD = "Parola12345!";


	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void updatePersonalInformationTest() {
		logger.info("Starting update personal information test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageFI = (HomePageFI) homePage.chooseEULocation(euCountry.FI, euCountry.FI.getCurrencyISO());
		signInPage = homePageFI.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		emailPreferencesPage = myAccountPage.returnEmailPreferencePageLeftNav();
		emailPreferencesPage.ariatProductsCheck("FASHION");
		emailPreferencesPage.saveEditsClick();
		logger.info("Update personal information test ended...");
	}
	
	@AfterMethod
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageFI.quit();
		signInPage.quit();
		myAccountPage.quit();
		emailPreferencesPage.quit();
	}
}
