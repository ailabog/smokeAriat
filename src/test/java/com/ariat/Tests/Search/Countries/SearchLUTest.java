package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageLU;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

/**
 * Search product Luxembourg test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchLUTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageLU homePageLU;
	private EUCountries euCountry;
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
		logger.info("Starting search products Luxembourg test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageLU = (HomePageLU) homePage.chooseEULocation(euCountry.LU, euCountry.LU.getCurrencyISO());
		homePageLU.search(OPTION);
	    homePageLU.assertProductDisplayed(MESSAGE+OPTION);
		homePageLU.seeAllproducts();
		logger.info("Finishing search products Luxembourg test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageLU.quit();
	}
}