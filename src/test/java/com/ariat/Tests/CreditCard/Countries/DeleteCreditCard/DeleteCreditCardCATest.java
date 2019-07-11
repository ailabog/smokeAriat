package com.ariat.Tests.CreditCard.Countries.DeleteCreditCard;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCA;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.PaymentInformationPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;


/**
 * Tests for delete credit card Canada
 * @author aila.bogasieru@ariat.com
 *
 */


public class DeleteCreditCardCATest extends BaseTest{
	
	private HomePage homePage;
	private HomePageCA homePageCA;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private PaymentInformationPage paymentInfoPage;
	private Environments environment;
	private GlobalCountries country;
	private ListOfCreditCards typeCard;
	
	private static final String EMAIL = "aila.bogasieru@yahoo.com";
	private static final String PASSWORD = "Parola12345!";
	
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}
	@Test
	public void deleteCreditCardFromPaymentInfoCATest() {
		logger.info("Starting delete credit card from Payment Info Canada test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageCA = (HomePageCA) homePage.chooseGlobalLocation(country.CA, country.CA.getCurrencyISO());
		signInPage = homePageCA.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		paymentInfoPage = myAccountPage.returnPaymentInformationPageAddDeleteCardMiddleNav();
	    paymentInfoPage.deleteCreditCardNo("name",typeCard.VISA.getName() , "01/2029");
	    paymentInfoPage.deleteCreditCardYes("name", typeCard.VISA.getName(), "01/2029");
		logger.info("Finishing delete credit card from Payment info Canada test");
		
  }
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageCA.quit();
		signInPage.quit();
		paymentInfoPage.quit();
		myAccountPage.quit();
	}
}