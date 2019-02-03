package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageJE;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Jersey test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchJETest extends BaseTest {

	private HomePage homePage;
	private HomePageJE homePageJE;
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
		logger.info("Starting search products Jersey test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJE = (HomePageJE) homePage.chooseGlobalLocation(country.JE, country.JE.getCurrencyISO());
		homePageJE.search(OPTION);
	    homePageJE.assertProductDisplayed(MESSAGE+OPTION);
		homePageJE.seeAllproducts();
		logger.info("Finishing search products Jersey test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageJE.quit();
	}
}