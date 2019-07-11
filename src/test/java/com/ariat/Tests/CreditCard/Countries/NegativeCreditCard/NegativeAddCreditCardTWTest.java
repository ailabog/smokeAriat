package com.ariat.Tests.CreditCard.Countries.NegativeCreditCard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Pages.Main.AddACreditCardPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.PaymentInformationPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;

/**
 * Tests for Negative Add Credit card Taiwan
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class NegativeAddCreditCardTWTest extends BaseTest {

	private HomePage homePage;
	private HomePageTW homePageTW;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private GlobalCountries country;
	private ListOfCreditCards typeCard;

	private static final String EMAIL = "aila.bogasieru@ariat.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = "ryttrytry";
	private static final String CARD_OWNER = "5654657665";
	private static final String YEAR = "2023";
	private static final String MONTH = "January";

	private static final String YEAR1 = "2009";
	private static final String MONTH1 = "January";

	private static final String CARD_IDWILD = "#$%^&*(";
	private static final String CARD_OWNERWILD = "@#$%^&*(";

	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void negativeAddCreditCardUKTest() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add negative credit card UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.VISA.getName());
		addACreditCardPage.enterCardNo("dghdfjghdfkghdf");
		addACreditCardPage.enterSecurityCode(typeCard.VISA.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.VISA.getName(), expirationDate);
		logger.info("Finishing add negative credit card UK test");
	}

	@Test(priority = 1)
	public void negativeAddCreditCardUKTestWildCard() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add negative credit card UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_IDWILD);
		addACreditCardPage.enterCardOwner(CARD_OWNERWILD);
		addACreditCardPage.selectTypeCard(typeCard.VISA.getName());
		addACreditCardPage.enterCardNo("@#$%^&*(");
		addACreditCardPage.enterSecurityCode(typeCard.VISA.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.VISA.getName(), expirationDate);
		logger.info("Finishing add negative credit card UK test");
	}

	@Test(priority = 2)
	public void negativeAddCreditCardUKTestMissingValues() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add negative credit card UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.selectTypeCard(typeCard.VISA.getName());
		addACreditCardPage.enterSecurityCode(typeCard.VISA.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.VISA.getName(), expirationDate);
		logger.info("Finishing add negative credit card UK test");
	}

	@Test(priority = 3)
	public void negativeAddCreditCardUKTestExpirationDate() {
		String expirationDate = "MONTH1/YEAR1";
		logger.info("Starting add a credit card UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		signInPage = homePageTW.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.VISA.getName());
		addACreditCardPage.enterCardNo(typeCard.VISA.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.VISA.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR1);
		addACreditCardPage.selectExpirationMonthCard(MONTH1);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.VISA.getName(), expirationDate);
		logger.info("Finishing add a credit card UK test");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTW.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	}
}