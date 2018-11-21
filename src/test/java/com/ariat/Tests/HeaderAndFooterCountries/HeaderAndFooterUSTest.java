package com.ariat.Tests.HeaderAndFooterCountries;


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
 * Choose home page US from the list of pages & checks header & footer elements for US page
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
		logger.info("Starting the check for Header US elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUS = (HomePageUS) homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
   		homePageUS.checkElementsHeader();
		logger.info("Finishing the check for Header US elements:");
	}
	
	@Test(priority=1)
	public void USFooter() {
		logger.info("Starting the check for Footer US elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUS = (HomePageUS) homePage.chooseGlobalLocation(country.USA, country.USA.getCurrencyISO());
		homePageUS.checkElementsFooter();
		logger.info("Finishing the check for Footer US elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUS.quit();
	}
}
