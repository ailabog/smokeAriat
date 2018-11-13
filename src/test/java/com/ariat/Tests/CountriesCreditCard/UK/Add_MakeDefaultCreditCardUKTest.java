package com.ariat.Tests.CountriesCreditCard.UK;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.AddACreditCardPage;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.LogoutPage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.PaymentInformationPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Tests for add & make default credit card UK
 * @author aila.bogasieru@ariat.com
 *
 */


public class Add_MakeDefaultCreditCardUKTest extends BaseTest{
	
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private LogoutPage logoutPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = "MASTER_ID123";
	private static final String defaultCredit = "DEFAULT | ";
	private static final String CARD_OWNER = "Aila B";
	private static final String YEAR = "2023";
	private static final String MONTH = "December";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void add_makeDefaultCreditCardUKTest() {
		String expirationDate = "MONTH/YEAR";
		logger.info("Starting add credit card & make it default UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
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
		//paymentInfoPage.checkCreditCard(CARD_OWNER, typeCard.MASTER_CARD.getName(), expirationDate);
		paymentInfoPage.makeDefaultCreditCard(CARD_OWNER, typeCard.MASTER_CARD.getName(), expirationDate);
		paymentInfoPage.assertMakeDefaultCreditCard(defaultCredit.concat(CARD_ID));
		logoutPage = myAccountPage.returnLogoutFromMyAccountPageTopNav();
		logoutPage.logout();
		logger.info("Finishing add credit card & make it default UK test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
		logoutPage.quit();
	}
}