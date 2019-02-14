package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageIT;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Italy test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchITTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageIT homePageIT;
	private EUCountries euCountry;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Product results for: ";

	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Italy test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageIT = (HomePageIT) homePage.chooseEULocation(euCountry.IT, euCountry.IT.getCurrencyISO());
		homePageIT.search(OPTION);
	    homePageIT.assertProductDisplayed(MESSAGE+OPTION);
		homePageIT.seeAllproducts();
		logger.info("Finishing search products Italy test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageIT.quit();
	}
}