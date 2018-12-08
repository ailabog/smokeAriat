package com.ariat.Tests.Search.CountriesTests.DE;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SearchDETest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private EUCountries euCountry;
	private Environments environment;
	private final String OPTION = "boot";
	private final String MESSAGE = "Produktergebnisse für: ";

	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void editAddressTest() {
		logger.info("Starting search products Deutschland test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		homePageDE.search(OPTION);
	    homePageDE.assertProductDisplayedDE(MESSAGE+OPTION);
		homePageDE.seeAllproducts();
		logger.info("Finishing search products Deutschland test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
	}
}