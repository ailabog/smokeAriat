package com.ariat.Tests.HeaderAndFooter.Countries;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;


/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies all elements on Home Page Russia
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterRUTest extends BaseTest{

	private Environments environment;
	private HomePageUK homePageUK;
	private HomePageRU homePageRU;
	private HomePage homePage;
	private GlobalCountries country;
    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test(priority=0)
	public void RUHeader() {
		logger.info("Starting the check for Header Russia elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		homePageRU.checkElementsHeader();
		logger.info("Finishing the check for Header Russia elements:");
	}
	
	@Test(priority=1)
	public void RUFooter() {
		logger.info("Starting the check for Footer Russia elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		homePageRU.checkElementsFooter();
		logger.info("Finishing the check for Footer Russia elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageRU.quit();
	}
}