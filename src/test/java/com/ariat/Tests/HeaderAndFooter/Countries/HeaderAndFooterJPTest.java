package com.ariat.Tests.HeaderAndFooter.Countries;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageJP;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.Base.BaseTest;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies all elements on Home Page Japan
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterJPTest extends BaseTest{

	private Environments environment;
	private HomePageUK homePageUK;
	private HomePageJP homePageJP;
	private HomePage homePage;
	private GlobalCountries country;
    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}


	@Test(priority=0)
	public void JPHeader() {
		logger.info("Starting the check for Header Japan elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		homePageJP.checkElementsHeader();
		logger.info("Finishing the check for Header Japan elements:");
	}
	
	@Test(priority=1)
	public void JPFooter() {
		logger.info("Starting the check for Footer Japan elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		homePageJP.checkElementsFooter();
		logger.info("Finishing the check for Footer Japan elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageJP.quit();
	}
}