package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTR;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Turkey test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchTRTest extends BaseTest {

	private HomePage homePage;
	private HomePageTR homePageTR;
	private GlobalCountries country;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Product results for: ";

	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Turkey test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		homePageTR.search(OPTION);
	    homePageTR.assertProductDisplayed(MESSAGE+OPTION);
		homePageTR.seeAllproducts();
		logger.info("Finishing search products Turkey test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTR.quit();
	}
}