package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageCH;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Search product Cehia test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchCHTest extends BaseTest {

	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageCH homePageCH;
	private EUCountries euCountry;
	private Environments environment;
	private final String OPTION = "boot";
	private final String MESSAGE = "Produktergebnisse für: ";

    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Deutschland test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageCH = (HomePageCH) homePage.chooseEULocation(euCountry.CH, euCountry.CH.getCurrencyISO());
		homePageCH.searchDE(OPTION);
	    homePageCH.assertProductDisplayedDE(MESSAGE+OPTION);
		homePageCH.seeAllproducts();
		logger.info("Finishing search products Deutschland test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageCH.quit();
	}
}