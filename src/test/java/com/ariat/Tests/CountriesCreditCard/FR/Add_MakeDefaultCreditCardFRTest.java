package com.ariat.Tests.CountriesCreditCard.FR;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.AddACreditCardPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageFR;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.PaymentInformationPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Tests for add & make default credit card France
 * @author aila.bogasieru@ariat.com
 *
 */


public class Add_MakeDefaultCreditCardFRTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageFR homePageFR;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private EUCountries euCountry;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = "XX";
	private static final String defaultCredit = "DEFAULT | ";
	private static final String CARD_OWNER = "Aila B";
	private static final String YEAR = "2023";
	private static final String MONTH = "Novembre";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void add_makeDefaultCreditCardFRTest() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add credit card & make it default France test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageFR = (HomePageFR) homePage.chooseEULocation(euCountry.FR, euCountry.FR.getCurrencyISO());
		signInPage = homePageFR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Francais");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.MASTER_CARD.getName());
		addACreditCardPage.enterCardNo(typeCard.MASTER_CARD.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.MASTER_CARD.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.makeDefaultCreditCard(CARD_OWNER, typeCard.MASTER_CARD.getName(), expirationDate);
		paymentInfoPage.assertMakeDefaultCreditCard(defaultCredit.concat(CARD_ID));
		logger.info("Finishing add credit card & make it default France test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageFR.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
		
	}
}