package com.ariat.Tests.CreditCard.Countries.AddCreditCardNegative;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageAT;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.AddACreditCardPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Add credit card negative test Austria
 * @author aila.bogasieru@ariat.com
 *
 */


public class AddCreditCardNegativeATTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageAT homePageAT;
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
	public void addCreditCardNegativeATTest() {
		logger.info("Starting add a credit card negative Austria test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		signInPage = homePageAT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNavDE();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.INVALID_CARD.getName());
		addACreditCardPage.enterCardNo(typeCard.INVALID_CARD.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.INVALID_CARD.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		addACreditCardPage.applyCardCreation();
		logger.info("Finishing add a credit card negative Austria test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageAT.quit();
		homePageUK.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		myAccountPage.quit();
		}
}