package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;

/**
 * Test Find a retailer page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class FindARetailerFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private com.ariat.Pages.Header.FindARetailerPage findARetailerPage;
	
	public static final String COUNTRY = "United Kingdom";
	public static final String POST_CODE = "020232";
	public static final String RADIUS = "30 km";
	
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void findARetailerFooterTest() {
		logger.info("Starting checking Find a retailer page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		findARetailerPage = homePageUK.returnFindARetailer();
		findARetailerPage.selectCountry(COUNTRY);
		findARetailerPage.enterPostCode(POST_CODE);
		findARetailerPage.selectRadius(RADIUS);
		findARetailerPage.search();
		findARetailerPage.switchResults("Fashion");
		logger.info("Finishing checking Find a retailer test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		findARetailerPage.quit();
  }
}

