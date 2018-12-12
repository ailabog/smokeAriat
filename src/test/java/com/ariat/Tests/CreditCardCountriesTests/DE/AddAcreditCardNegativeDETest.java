package com.ariat.Tests.CreditCardCountriesTests.DE;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.AddACreditCardPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Add credit card negative test Deutschland
 * @author aila.bogasieru@ariat.com
 *
 */


public class AddAcreditCardNegativeDETest extends BaseTest{
	
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private Environments environment;
	private EUCountries euCountry;
	private ListOfCreditCards typeCard;
		
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = GenerateRandomDataUtils.generateRandomString(5);
	private static final String CARD_OWNER = GenerateRandomDataUtils.generateRandomNumber(5);
	private static final String YEAR = "2018";
	private static final String MONTH = "Dezember";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void addCreditCardNegativeDETest() {
		logger.info("Starting add a credit card negative Germany test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		signInPage = homePageDE.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.INVALID_CARD.getName());
		addACreditCardPage.enterCardNo(typeCard.INVALID_CARD.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.INVALID_CARD.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		addACreditCardPage.applyCardCreation();
		logger.info("Finishing add a credit card negative Germany test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageDE.quit();
		homePageUK.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		myAccountPage.quit();
		}
}