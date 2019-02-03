package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCN;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product China test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchCNTest extends BaseTest {

	private HomePage homePage;
	private HomePageCN homePageCN;
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
		logger.info("Starting search products China test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageCN = (HomePageCN) homePage.chooseGlobalLocation(country.CN, country.CN.getCurrencyISO());
		homePageCN.search(OPTION);
	    homePageCN.assertProductDisplayed(MESSAGE+OPTION);
		homePageCN.seeAllproducts();
		logger.info("Finishing search products China test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageCN.quit();
	}
}