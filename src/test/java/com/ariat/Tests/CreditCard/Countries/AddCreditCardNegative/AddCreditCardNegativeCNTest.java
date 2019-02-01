package com.ariat.Tests.CreditCard.Countries.AddCreditCardNegative;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCN;
import com.ariat.Pages.Main.AddACreditCardPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.GenerateRandomDataUtils;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Add credit card negative test China
 * @author aila.bogasieru@ariat.com
 *
 */


public class AddCreditCardNegativeCNTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageCN homePageCN;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private AddACreditCardPage addACreditCardPage;
	private Environments environment;
	private GlobalCountries country;
	private ListOfCreditCards typeCard;
		
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String CARD_ID = GenerateRandomDataUtils.generateRandomString(5);
	private static final String CARD_OWNER = GenerateRandomDataUtils.generateRandomNumber(5);
	private static final String YEAR = "2018";
	private static final String MONTH = "May";
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void addCreditCardNegativeJPTest() {
		logger.info("Starting add a credit card negative China test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageCN = (HomePageCN) homePage.chooseGlobalLocation(country.CN, country.CN.getCurrencyISO());
		signInPage = homePageCN.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
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
		logger.info("Finishing add a credit card negative China test");
  } 
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageCN.quit();
		signInPage.quit();
		addACreditCardPage.quit();
		myAccountPage.quit();
		}
}