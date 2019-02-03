package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageKR;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Korea test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchKRTest extends BaseTest {

	private HomePage homePage;
	private HomePageKR homePageKR;
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
		logger.info("Starting search products Korea test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageKR = (HomePageKR) homePage.chooseGlobalLocation(country.KR, country.KR.getCurrencyISO());
		homePageKR.search(OPTION);
	    homePageKR.assertProductDisplayed(MESSAGE+OPTION);
		homePageKR.seeAllproducts();
		logger.info("Finishing search products Korea test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageKR.quit();
	}
}