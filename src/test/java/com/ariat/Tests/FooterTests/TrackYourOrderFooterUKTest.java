package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ariat.Pages.Footer.TrackYourOrderPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;

/**
 * Test Track your order page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class TrackYourOrderFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private TrackYourOrderPage trackYourOrderPage;
	
	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String ORDER_NO = "10003202";
	public static final String BILLING_ZIP_CODE = "41641";
	
    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test(priority = 0)
	public void trackYourOrderFooterTest() {
		logger.info("Starting checking Track your order page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		trackYourOrderPage = homePageUK.returnTrackYourOrderPage();
		trackYourOrderPage.assertText1("CHECK AN ORDER / REQUEST RETURN");
		trackYourOrderPage.assertText2("You'll receive your order number in an email confirmation within 15 minutes of placing an order. Once your order has shipped, you will also receive an email with the UPS tracking number for your package.");
		trackYourOrderPage.assertText3("If you have any questions or need help with your account and/or order, please contact us to assist you. Our representatives are available Monday to Friday 8.30 AM - 5PM GMT at +44 (0)1367 242818 or customer.care@ariat.com");
		trackYourOrderPage.enterOrderNo(ORDER_NO);
		trackYourOrderPage.enterEmail(EMAIL);
		trackYourOrderPage.enterPostalCode(BILLING_ZIP_CODE);
		trackYourOrderPage.checkStatus();
		logger.info("Finishing checking Track your order test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		trackYourOrderPage.quit();
  }
}

