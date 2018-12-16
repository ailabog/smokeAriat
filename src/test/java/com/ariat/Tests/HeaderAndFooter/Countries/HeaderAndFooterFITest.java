package com.ariat.Tests.HeaderAndFooter.Countries;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageFI;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Tests.BaseTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies all elements on Home Page UK
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterFITest extends BaseTest{

	private Environments environment;
	private HomePageUK homePageUK;
	private HomePageFI homePageFI;
	private HomePage homePage;
	private EUCountries euCountry;


	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority=0)
	public void FIHeader() {
		logger.info("Starting the check for Header Finland elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageFI = (HomePageFI) homePage.chooseEULocation(euCountry.FI, euCountry.FI.getCurrencyISO());
		homePageFI.checkElementsHeader();
		logger.info("Finishing the check for Header Finland elements:");
	}
	
	@Test(priority=1)
	public void FIFooter() {
		logger.info("Starting the check for Footer Finland elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageFI = (HomePageFI) homePage.chooseEULocation(euCountry.FI, euCountry.FI.getCurrencyISO());
		homePageFI.checkElementsFooter();
		logger.info("Finishing the check for Footer Finland elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageFI.quit();
	}
}