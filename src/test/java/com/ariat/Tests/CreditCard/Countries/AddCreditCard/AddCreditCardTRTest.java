package com.ariat.Tests.CreditCard.Countries.AddCreditCard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTR;
import com.ariat.Pages.Main.AddACreditCardPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.PaymentInformationPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Tests for Add Credit card Turkey
 * @author aila.bogasieru@ariat.com
 *
 */


public class AddCreditCardTRTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageTR homePageTR;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private GlobalCountries country;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = "XX";
	private static final String CARD_OWNER = "Aila B";
	private static final String YEAR = "2023";
	private static final String MONTH = "January";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void addCreditCardTRTest() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add a credit card Turkey test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.VISA.getName());
		addACreditCardPage.enterCardNo(typeCard.VISA.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.VISA.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.VISA.getName(), expirationDate);
		logger.info("Finishing add a credit card Turkey test");
  } 
	
	@Test(priority = 1)
	public void addCreditCardFromPaymentInfoTRTest() {
		logger.info("Starting add credit card from Payment Info Turkey test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		signInPage = homePageTR.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "English");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		paymentInfoPage = myAccountPage.returnPaymentInformationPageLeftNav();
		addACreditCardPage = paymentInfoPage.returnAddACreditCardPage();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.MASTER_CARDSpace.getName());
		addACreditCardPage.enterCardNo(typeCard.MASTER_CARDSpace.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.MASTER_CARDSpace.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		addACreditCardPage.applyCardCreation();
		logger.info("Finishing add credit card from Payment info Turkey test");
		
  }
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTR.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	}
}