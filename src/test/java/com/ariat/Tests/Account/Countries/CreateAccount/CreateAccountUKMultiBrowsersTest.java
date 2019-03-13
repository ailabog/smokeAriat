package com.ariat.Tests.Account.Countries.CreateAccount;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.CreateAccountPage;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.OrderDetailsPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Utils.BrowserUtils;
import com.ariat.Utils.GenerateRandomDataUtils;
import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

/**
 * Test create account by instantiating the browser, go to Home page, and calls
 * all the methods such as: create account, login, check order status for United Kingdom
 * 
 * @author aila.bogasieru@ariat.com
 *
 */


public class CreateAccountUKMultiBrowsersTest extends BaseTest {

	private Environment environment;
	private EUCountries euCountry;
	private CreateAccountPage createAccountPage;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private OrderDetailsPage orderDetailsPage;
	private String device;
	private String browser;
	private int offset;

	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomString(5);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomString(7);
	public static final String BIRTH_MONTH = "March";
	public static final String BIRTH_DAY = "02";

	public static final String EMAIL = GenerateRandomDataUtils.generateEmail(12);
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomString(10);

	public static final String ORDER_NO = GenerateRandomDataUtils.generateRandomNumber(8);
	public static final String BILLING_ZIP_CODE = GenerateRandomDataUtils.generateRandomNumber(6);

	public static final String ERROR_MESSAGE = "Sorry this order number or postcode does not match our records. Check your records and try again.";
	public static final String URL = "https://development.ariat.com";
			
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @param offset
	 */
	public CreateAccountUKMultiBrowsersTest(String device, String browser, Environment environment, Integer offset) {
		this.device = device;
		this.browser = browser;
		this.environment = environment;
		this.offset = offset;
	}

	public CreateAccountUKMultiBrowsersTest() {
	}

	@Parameters({ "device", "browser", "environment", "offset" })
	@Factory
	public Object[] factoryMethod(String device, String browser, Environment environment, Integer offset) {

		List<CreateAccountUKMultiBrowsersTest> tests = Arrays.stream(device.split(","))
				.flatMap(x -> Arrays.stream(browser.split(",")).map(y -> new CreateAccountUKMultiBrowsersTest(x, y, environment, offset)))
				.collect(Collectors.toList());
		tests.removeIf(test -> test.device.equals("Mobile") && test.browser.equals("Firefox"));
		tests.removeIf(test -> test.device.equals("Mobile") && test.browser.equals("Internet Explorer"));
		tests.removeIf(test -> test.device.equals("Mobile") && test.offset != 0);
		return tests.toArray();
	}

	@Test(priority = 0)
	public void createAccountTest() {
		logger.info("Starting create account test");
		homePage = new HomePage(BrowserUtils.configureBrowser(device, browser, environment, offset));
		homePage.loadHomePage(HomePage.URL);
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.firstName(FIRST_NAME);
		createAccountPage.lastNameInfo(LAST_NAME);
		createAccountPage.selectBirthMonth(BIRTH_MONTH);
		createAccountPage.selectBirthDay(BIRTH_DAY);
		createAccountPage.enterEmail(EMAIL);
		createAccountPage.confirmEmail(EMAIL);
		createAccountPage.enterPassword(PASSWORD);
		createAccountPage.confirmPassword(PASSWORD);
		createAccountPage.createAccountClick();
	    logger.info("Finishing create new account test...");
	}

	/*@Test(priority = 1)
	public void returningCustomerTest() {
		logger.info("Starting returning customer test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUK");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		logger.info("Finishing returning customer test...");
	}

	@Test(priority = 2)
	public void checkInvalidOrderTest() {
		logger.info("Starting checking invalid order test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.checkOrder(ORDER_NO, EMAIL, BILLING_ZIP_CODE);
		signInPage.checkStatusClick();
		signInPage.assertErrorMessageInexistingOrderNo(ERROR_MESSAGE);
		logger.info("Finishing checking invalid order test...");
	}
	
	@Test(priority = 3)
	public void checkValidOrderTest() {
		logger.info("Starting checking valid order test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.checkOrder("10002432", "aila.bogasieru@ariat.com", "35435");
		orderDetailsPage = signInPage.returnOrderDetailsPage();
		logger.info("Finishing checking valid order test...");
	}
	
	
	@Test(priority = 4)
	public void forgotPasswordTest() {
		logger.info("Starting forgot password test...");
		homePage = new HomePage(new ChromeDriver());
	    homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		signInPage = homePageUK.returnSignInPage();
		signInPage.forgotPasswordClick();
		signInPage.forgotPasswordEmail(EMAIL);
		signInPage.ForgotPasswordSend();
		signInPage.closeForgotPassword();
		logger.info("Finishing forgot password test...");
	}*/
	

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		signInPage.quit();
		createAccountPage.quit();
		myAccountPage.quit();
		orderDetailsPage.quit();
	}
}
