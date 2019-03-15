package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCA;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Tests.Base.BaseTest;

/**
 * Search product Russia test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchRUTest extends BaseTest {

	private HomePage homePage;
	private HomePageCA homePageCA;
	private HomePageRU homePageRU;
	private GlobalCountries country;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Product results for: ";

    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Canada test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		homePageRU.search(OPTION);
	    homePageRU.assertProductDisplayed(MESSAGE+OPTION);
		homePageRU.seeAllproducts();
		logger.info("Finishing search products Canada test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageCA.quit();
	}
}