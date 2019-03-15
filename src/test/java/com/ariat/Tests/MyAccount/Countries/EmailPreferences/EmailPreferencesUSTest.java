package com.ariat.Tests.MyAccount.Countries.EmailPreferences;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.EmailPreferencePage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

/**
 * Email Preferences test United States
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class EmailPreferencesUSTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private Environments environment;
	private EUCountries euCountry;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private EmailPreferencePage emailPreferencesPage;
	

	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test
	public void updatePersonalInformationTest() {
		logger.info("Starting update personal information test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		emailPreferencesPage = myAccountPage.returnEmailPreferencePageLeftNav();
		emailPreferencesPage.enterEmail(EMAIL);
		emailPreferencesPage.enterConfirmEmail(EMAIL);
		emailPreferencesPage.enterFName("Aila");
		emailPreferencesPage.enterLName("Bogasieru");
		emailPreferencesPage.checkGenderFemale();
		emailPreferencesPage.selectBirthData("May", "01", "1980");
		//emailPreferencesPage.ariatProductsCheck("FASHION");
		emailPreferencesPage.savePrefUS();
		logger.info("Update personal information test ended...");
	}
	
	@AfterMethod
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
		signInPage.quit();
		myAccountPage.quit();
		emailPreferencesPage.quit();
	}
}
