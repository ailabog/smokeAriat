package com.ariat.Tests.CreditCard.Countries.MakeDefaultCreditCard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageIT;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.PaymentInformationPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;


/**
 * Tests for delete credit card Italy
 * @author aila.bogasieru@ariat.com
 *
 */


public class MakeDefaultCreditCardITTest extends BaseTest{
	
	private HomePage homePage;
	private HomePageIT homePageIT;
	private HomePageUK homePageUK;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private EUCountries euCountry;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	
	 public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
		
		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", filePath);
		}

	@Test
	public void makeDefaultCreditCardFromPaymentInfoFITest() {
		logger.info("Starting make default credit card from Payment Info Finland test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageIT = (HomePageIT) homePage.chooseEULocation(euCountry.IT, euCountry.IT.getCurrencyISO());
		signInPage = homePageIT.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		paymentInfoPage = myAccountPage.returnPaymentInformationPageAddDeleteCardMiddleNav();
	    //paymentInfoPage.makeDefaultCreditCard("were", typeCard.VISA.getName(), "05/2016");
		logger.info("Finishing make default credit card from Payment info Finland test");
		
  }
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageIT.quit();
		homePageUK.quit();
		signInPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	}
}