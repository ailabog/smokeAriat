package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageAT;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

/**
 * Search product Austria test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchATTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageAT homePageAT;
	private EUCountries euCountry;
	private Environments environment;
	private final String OPTION = "boot";
	private final String MESSAGE = "Produktergebnisse für: ";

	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}
	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Deutschland test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		homePageAT.searchDE(OPTION);
	    homePageAT.assertProductDisplayedDE(MESSAGE+OPTION);
		homePageAT.seeAllproducts();
		logger.info("Finishing search products Deutschland test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageAT.quit();
	}
}