package com.ariat.Tests.Checkout.CreateOrder.PayPal;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.CheckoutPage;
import com.ariat.Pages.Main.CheckoutProcessCompletePage;
import com.ariat.Pages.Main.CheckoutProcessPage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Products.BagsProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;

/**
 * Checkout -> Create new order
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class CheckoutCreateOrderPayPalUSTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private MyBagPage myBagPage;
	private BagsProductPage bagsProductPage;
	private CheckoutPage checkoutPage;
	private CheckoutProcessPage checkoutProcessPage;
	private CheckoutProcessCompletePage checkoutProcessCompletePage;
	private com.ariat.Pages.Main.MyAccountPage myAccountPage;

	private static final String PAYPAL_URL="https://www.sandbox.paypal.com/checkoutnow?locale.x=en_GB&fundingSource=paypal&sessionID=c58a3e1a50_mtg6ntu6nty&buttonSessionID=04ed06f251_mtg6ntu6ntg&env=sandbox&fundingOffered=paypal&logLevel=warn&sdkMeta=eyJ1cmwiOiJodHRwczovL3d3dy5wYXlwYWxvYmplY3RzLmNvbS9hcGkvY2hlY2tvdXQuanMifQ%3D%3D&uid=91536abcc4&version=4&token=EC-7FC97998ME054642E&xcomponent=1";
	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomString(5);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomString(7);
	public static final String ADDRESS1 = GenerateRandomDataUtils.generateRandomString(5);
	public static final String ADDRESS = "W. Adams St.";
	public static final String CITY = "Phoenix";
	public static final String STATE = "Arizona";
	public static final String ZIP_CODE = "85007";
	public static final String MOBILE = "(602) 364-2722";
	public static final String EMAIL = "aila.bogasieru@gmail.com";

	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
    public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
			
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	
	@Test(priority = 0)
	public void checkoutCreateNewOrderPayPal() {
		logger.info(
				"Starting checkout -> create new order without being logged using paypal as payment method test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		bagsProductPage = homePageUS.returnBagsProductPage();
		myBagPage = bagsProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPayPalPage();
		checkoutProcessPage.load(PAYPAL_URL);
		checkoutProcessPage.enterEmailPayPal("aila.bogasieru@gmail.com");
		checkoutProcessPage.enterPasswordPayPal("Ariat123!");
		checkoutProcessPage.clickLoginPayPal();
		checkoutProcessPage.clickContinuePayPal();
		checkoutProcessPage.clickConfirmPayPal();
		logger.info("Finishing checkout -> create new order without being logged using paypal as payment method test.");
	} 
	
	@Test(priority = 1)
    public void checkoutCreateNewOrderPayPalFromShipping() {
	   logger.info("Starting checkout -> create new order without being logged credit card PayPal test...");
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
		checkoutProcessPage.enterAddress1(ADDRESS1);
		checkoutProcessPage.selectArrow();
		checkoutProcessPage.selectCountry("Deutschland");
		checkoutProcessPage.enterCity(CITY);
		checkoutProcessPage.enterZipCode(ZIP_CODE);
		checkoutProcessPage.enterMobile(MOBILE);
		checkoutProcessPage.enterEmail(EMAIL);
		checkoutProcessPage.clickNextPayment();
		checkoutProcessPage.pressPaymentMethods("PayPal");
		checkoutProcessPage.clickBuyNow();
		checkoutProcessPage.enterEmailPayPal("aila.bogasieru@gmail.com");
		checkoutProcessPage.nextBtnPayPal();
		checkoutProcessPage.enterPasswordPayPal("Ariat123!");
		checkoutProcessPage.nextBtnPayPal();
		checkoutProcessPage.clickLoginPayPal();
		checkoutProcessCompletePage = checkoutProcessPage.returnCheckoutProcessCompletePage();
		logger.info("Finishing checkout -> create new order without being logged PayPal test.");
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
