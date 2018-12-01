package com.ariat.Tests.CountriesCreditCard.DE;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.PaymentInformationPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Tests for delete credit card Deutschland
 * @author aila.bogasieru@ariat.com
 *
 */


public class MakeDefaultCreditCardDETest extends BaseTest{
	
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private EUCountries euCountry;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void makeDefaultCreditCardFromPaymentInfoDETest() {
		logger.info("Starting make default credit card from Payment Info Germany test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "Deutsch");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		paymentInfoPage = myAccountPage.returnPaymentInformationPageAddDeleteCardMiddleNav();
	    paymentInfoPage.makeDefaultCreditCard("were", typeCard.VISA.getName(), "05/2016");
		logger.info("Finishing make default credit card from Payment info Germany test");
		
  }
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
		signInPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	}
}