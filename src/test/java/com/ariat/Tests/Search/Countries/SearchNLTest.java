package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageNL;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Netherlands test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchNLTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageNL homePageNL;
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
		logger.info("Starting search products Netherlands test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageNL = (HomePageNL) homePage.chooseEULocation(euCountry.NL, euCountry.NL.getCurrencyISO());
		homePageNL.search(OPTION);
	    homePageNL.assertProductDisplayed(MESSAGE+OPTION);
		homePageNL.seeAllproducts();
		logger.info("Finishing search products Netherlands test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageNL.quit();
	}
}