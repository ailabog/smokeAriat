package com.ariat.Tests.HeaderAndFooterTests.US;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Tests.BaseTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies all elements on Home Page UK
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HeaderAndFooterUSTest extends BaseTest{

	private Environments environment;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private HomePage homePage;
	private EUCountries euCountry;


	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority=0)
	public void UKHeader() {
		logger.info("Starting the check for Header UK elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		homePageUK.checkElementsHeader();
		logger.info("Finishing the check for Header UK elements:");
	}
	
	@Test(priority=1)
	public void UKFooter() {
		logger.info("Starting the check for Footer UK elements:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		homePageUK.checkElementsFooter();
		logger.info("Finishing the check for Footer UK elements:");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
	}
}