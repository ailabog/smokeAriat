package com.ariat.Tests.MyAccount.Countries.EmailPreferences;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.Main.EmailPreferencePage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class EmailPreferencesRUTest extends BaseTest {

	private HomePage homePage;
	private HomePageRU homePageRU;
	private Environments environment;
	private GlobalCountries country;
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
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		signInPage = homePageRU.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
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
		homePageRU.quit();
		signInPage.quit();
		myAccountPage.quit();
		emailPreferencesPage.quit();
	}
}
