package com.ariat.Tests.Checkout.CreateOrder;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.CheckoutPage;
import com.ariat.Pages.Main.CheckoutProcessCompletePage;
import com.ariat.Pages.Main.CheckoutProcessPage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Products.BagsProductPage;
import com.ariat.Pages.Products.HeritageProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

/**
 * Checkout -> Create new order
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class CheckoutCreateOrderUSTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private MyBagPage myBagPage;
	private BagsProductPage bagsProductPage;
	private SignInPage signInPage;
	private CheckoutPage checkoutPage;
	private CheckoutProcessPage checkoutProcessPage;
	private CheckoutProcessCompletePage checkoutProcessCompletePage;
	private com.ariat.Pages.Main.MyAccountPage myAccountPage;

	public static final String CARD_NAME = GenerateRandomDataUtils.generateRandomString(5);
	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomString(5);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomString(7);
	public static final String ADDRESS = "Aday Drive SE";
	public static final String CITY = "Alabama";
	public static final String STATE = "Alabama";
	public static final String ZIP_CODE = "35803";
	public static final String MOBILE = "208252-7991";
	public static final String EMAIL = GenerateRandomDataUtils.generateEmail(12);
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomString(10);
	public static final String EMAILEXISTENT = "aila.bogasieru@ariat.com";
	public static final String PASSWORDEXISTENT = "Parola12345!";
	private ListOfCreditCards typeCard;
	private static final String YEAR = "2023";
	private static final String MONTH = "January";

	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
    public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
			
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void checkoutCreateNewOrderNotBeingLoggedMasterCard() {
		logger.info("Starting checkout -> create new order without being logged test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.enterFName(FIRST_NAME);
		checkoutProcessPage.enterLName(LAST_NAME);
		checkoutProcessPage.enterAddress(ADDRESS);
		checkoutProcessPage.enterCity(CITY);
		checkoutProcessPage.enterZipCode(ZIP_CODE);
		checkoutProcessPage.selectState();
		checkoutProcessPage.enterMobile(MOBILE);
		checkoutProcessPage.enterEmail("aila.bogasieru@gmail.com");
		checkoutProcessPage.clickNextPayment();
		checkoutProcessPage.enterCardNameNotlogged(CARD_NAME);
		checkoutProcessPage.enterCardNo(typeCard.MASTER_CARD.getNumber());
		checkoutProcessPage.selectTypeCardMasterCard();
		checkoutProcessPage.selectExpirationMonth();
		checkoutProcessPage.selectExpirationYear();
		checkoutProcessPage.enterSecurityCode(typeCard.MASTER_CARD.getCvs());
		checkoutProcessCompletePage = checkoutProcessPage.returnCheckoutProcessCompletePage();
		checkoutProcessCompletePage.placeOrder();
		//checkoutProcessCompletePage.checkItem();
		checkoutProcessCompletePage.enterPassword(PASSWORD);
		checkoutProcessCompletePage.confirmPassword(PASSWORD);
		myAccountPage = checkoutProcessCompletePage.returnMyAccountPage();
		logger.info("Finishing checkout -> create new order without being logged test.");
	} 
	
	
	@Test(priority = 1)
	public void checkoutCreateNewOrderNotBeingLoggedVisa() {
		logger.info("Starting checkout -> create new order without being logged credit card Visa test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.enterFName(FIRST_NAME);
		checkoutProcessPage.enterLName(LAST_NAME);
		checkoutProcessPage.enterAddress(ADDRESS);
		checkoutProcessPage.enterCity(CITY);
		checkoutProcessPage.enterZipCode(ZIP_CODE);
		checkoutProcessPage.selectState();
		checkoutProcessPage.enterMobile(MOBILE);
		checkoutProcessPage.enterEmail("aila.bogasieru@gmail.com");
		checkoutProcessPage.clickNextPayment();
		checkoutProcessPage.enterCardNameNotlogged(CARD_NAME);
		checkoutProcessPage.enterCardNo(typeCard.VISA.getNumber());
		checkoutProcessPage.selectTypeCardVisa();
		checkoutProcessPage.selectExpirationMonth();
		checkoutProcessPage.selectExpirationYear();
		checkoutProcessPage.enterSecurityCode(typeCard.VISA.getCvs());
		checkoutProcessCompletePage = checkoutProcessPage.returnCheckoutProcessCompletePage();
		checkoutProcessCompletePage.placeOrder();
		//checkoutProcessCompletePage.checkItem();
		checkoutProcessCompletePage.enterPassword(PASSWORD);
		checkoutProcessCompletePage.confirmPassword(PASSWORD);
		myAccountPage = checkoutProcessCompletePage.returnMyAccountPage();
		logger.info("Finishing checkout -> create new order without being logged credit card Visa test.");
	} 

	@Test(priority = 2)
	public void checkoutCreateNewOrderNotBeingLoggedPayPal() {
		logger.info(
				"Starting checkout -> create new order without being logged using paypal as payment method test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		// checkoutPage.checkProductImage();
		// checkoutPage.enterPromoCode("CSA25HNJ-X3DE684");
		// checkoutPage.clickApply();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.enterFName(FIRST_NAME);
		checkoutProcessPage.enterLName(LAST_NAME);
		checkoutProcessPage.enterAddress(ADDRESS);
		checkoutProcessPage.enterCity(CITY);
		checkoutProcessPage.enterZipCode(ZIP_CODE);
		checkoutProcessPage.selectState();
		checkoutProcessPage.enterMobile(MOBILE);
		checkoutProcessPage.enterEmail("aila.bogasieru@yahoo.com");
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPayPalPage();
		checkoutProcessPage.enterEmailPayPal("aila.bogasieru@gmail.com");
		checkoutProcessPage.enterPasswordPayPal("Ariat123!");
		checkoutProcessPage.clickLoginPayPal();
		checkoutProcessPage.clickContinuePayPal();
		checkoutProcessPage.clickConfirmPayPal();
		logger.info("Finishing checkout -> create new order without being logged using paypal as payment method test.");
	}

    @Test(priority = 3)
	public void checkoutCreateNewOrderBeingLogged() {
		logger.info("Starting checkout -> create new order without being logged test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAILEXISTENT, "EnglishUK");
		signInPage.returningPassword(PASSWORDEXISTENT);
		myAccountPage = signInPage.returnMyAccountPage();
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.continueCheckout1();
		checkoutProcessPage.enterCardName(CARD_NAME);
		checkoutProcessPage.enterSecurityCode(typeCard.MASTER_CARD.getCvs());
		checkoutProcessCompletePage = checkoutProcessPage.returnCheckoutProcessCompletePage();
		checkoutProcessCompletePage.checkItem();
		// checkoutProcessCompletePage.enterPassword(PASSWORD);
		// checkoutProcessCompletePage.confirmPassword(PASSWORD);
		myAccountPage = checkoutProcessCompletePage.returnMyAccountPage();
		logger.info("Finishing checkout -> create new order without being logged test.");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
		myBagPage.quit();
		checkoutProcessPage.quit();
		checkoutPage.quit();
		checkoutProcessCompletePage.quit();
		bagsProductPage.quit();
		myAccountPage.quit();
	}
}
