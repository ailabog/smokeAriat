package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies ariat logo
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomeTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private GlobalCountries country;
	private EUCountries euCountry;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority=0)
	public void USHeader() {
		logger.info("Starting the check for Header elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
		homePage.checkElementsHeader();
		logger.info("Finishing the check for Header elements:");
	}
	
	@Test(priority=1)
	public void USFooter() {
		logger.info("Starting the check for Footer elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
		homePage.checkElementsFooter();
		logger.info("Finishing the check for Footer elements:");
	}


	@AfterTest
	public void tearDown() {
		homePage.quit();
	}
}
