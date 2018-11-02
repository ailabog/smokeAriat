package com.ariat.Tests.HeaderAndFooterCountries;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies ariat logo
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterUSTest extends BaseTest{

	private Environments environment;
	private HomePageUS homePageUS;
	private HomePage homePage;
	private GlobalCountries country;


	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority=0)
	public void USHeader() {
		logger.info("Starting the check for Header elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
        homePageUS = new HomePageUS(new ChromeDriver());
		homePageUS.checkElementsHeader();
		logger.info("Finishing the check for Header elements:");
	}
	
	@Test(priority=1)
	public void USFooter() {
		logger.info("Starting the check for Footer elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
        homePageUS = new HomePageUS(new ChromeDriver());
		homePageUS.checkElementsFooter();
		logger.info("Finishing the check for Footer elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
	}
}
