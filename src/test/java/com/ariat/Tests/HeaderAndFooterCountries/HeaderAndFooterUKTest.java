package com.ariat.Tests.HeaderAndFooterCountries;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Choose home page UK from the list of pages & checks header & footer elements for UK page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterUKTest extends BaseTest{

	private Environments environment;
	private HomePageUK homePageUK;
	private HomePage homePage;
	private GlobalCountries country;


	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority=0)
	public void UKHeader() {
		logger.info("Starting the check for Header UK elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseGlobalLocation(country.UK, country.UK.getCurrencyISO());
	    homePageUK.checkElementsHeader();
		logger.info("Finishing the check for Header UK elements:");
	}
	
	@Test(priority=1)
	public void UKFooter() {
		logger.info("Starting the check for Footer UK elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseGlobalLocation(country.UK, country.UK.getCurrencyISO());
     	homePageUK.checkElementsFooter();
		logger.info("Finishing the check for Footer UK elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
	}
}
