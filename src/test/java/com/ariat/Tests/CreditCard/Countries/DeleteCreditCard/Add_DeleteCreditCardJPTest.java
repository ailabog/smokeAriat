package com.ariat.Tests.CreditCard.Countries.DeleteCreditCard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageJP;
import com.ariat.Pages.Main.AddACreditCardPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.PaymentInformationPage;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Tests for add & deletet credit card UK
 * @author aila.bogasieru@ariat.com
 *
 */


public class Add_DeleteCreditCardJPTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageJP homePageJP;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private GlobalCountries country;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = "MASTER_ID123";
	private static final String CARD_OWNER = "Aila B";
	private static final String YEAR = "2023";
	private static final String MONTH = "December";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void add_deleteCreditCardJPTest() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add credit card & delete it Japan test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		signInPage = homePageJP.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		addACreditCardPage = myAccountPage.returnAddACreditCardMiddleNav();
		addACreditCardPage.enterCardId(CARD_ID);
		addACreditCardPage.enterCardOwner(CARD_OWNER);
		addACreditCardPage.selectTypeCard(typeCard.MASTER_CARD1Space.getName());
		addACreditCardPage.enterCardNo(typeCard.MASTER_CARD1Space.getNumber());
		addACreditCardPage.enterSecurityCode(typeCard.MASTER_CARD1Space.getCvs());
		addACreditCardPage.selectExpirationYearCard(YEAR);
		addACreditCardPage.selectExpirationMonthCard(MONTH);
		paymentInfoPage = addACreditCardPage.returnPaymentInformationPage();
		paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.MASTER_CARD1Space.getName(), expirationDate);
		paymentInfoPage.deleteCreditCardYes(CARD_OWNER, typeCard.MASTER_CARD1Space.getName(), expirationDate);
		logger.info("Finishing add credit card & delete it Japan test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageJP.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	
	}
}