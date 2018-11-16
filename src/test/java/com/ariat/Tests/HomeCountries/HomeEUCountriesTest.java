package com.ariat.Tests.HomeCountries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageAU;
import com.ariat.Pages.HomePagesCountries.HomePageBE;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageDK;
import com.ariat.Pages.HomePagesCountries.HomePageFI;
import com.ariat.Pages.HomePagesCountries.HomePageFR;
import com.ariat.Pages.HomePagesCountries.HomePageIE;
import com.ariat.Pages.HomePagesCountries.HomePageIT;
import com.ariat.Pages.HomePagesCountries.HomePageLU;
import com.ariat.Pages.HomePagesCountries.HomePageNL;
import com.ariat.Pages.HomePagesCountries.HomePageNO;
import com.ariat.Pages.HomePagesCountries.HomePageNZ;
import com.ariat.Pages.HomePagesCountries.HomePageSE;
import com.ariat.Pages.HomePagesCountries.HomePageSW;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Choose countries (EU Countries) selector tests
 * for US page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomeEUCountriesTest extends BaseTest {

	private Environments environment;
	private HomePageUS homePageUS;
	private HomePageUK homePageUK;
	private HomePageAU homePageAU;
	private HomePageIE homePageIE;
	private HomePageDK homePageDK;
	private HomePageFR homePageFR;
	private HomePageDE homePageDE;
	private HomePageBE homePageBE;
	private HomePageNZ homePageNZ;
	private HomePageSE homePageSE;
	private HomePageIT homePageIT;
	private HomePageLU homePageLU;
	private HomePageNL homePageNL;
	private HomePageSW homePageSW;
	private HomePageFI homePageFI;
	private HomePageNO homePageNO;
	private HomePage homePage;
	private EUCountries country;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void UKHeader() {
		logger.info("Start choosing United Kingdom as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(country.UK, country.UK.getCurrencyISO());
		logger.info("Finish choosing United Kingdom as country:");
	}

	@Test(priority = 1)
	public void BEHeader() {
		logger.info("Start choosing Belgium as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageBE = (HomePageBE) homePage.chooseEULocation(country.BE, country.BE.getCurrencyISO());
		logger.info("Finish choosing Belgium as country:");
	}

	@Test(priority = 1)
	public void AUHeader() {
		logger.info("Start choosing Australia as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageAU = (HomePageAU) homePage.chooseEULocation(country.AU, country.AU.getCurrencyISO());
		logger.info("Finish choosing Australia as country:");
	}

	@Test(priority = 3)
	public void IEHeader() {
		logger.info("Start choosing Ireland as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageIE = (HomePageIE) homePage.chooseEULocation(country.IE, country.IE.getCurrencyISO());
		logger.info("Finish choosing Ireland as country:");
	}

	@Test(priority = 4)
	public void DKHeader() {
		logger.info("Start choosing Denmark as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageDK = (HomePageDK) homePage.chooseEULocation(country.DK, country.DK.getCurrencyISO());
		logger.info("Finish choosing Denmark as country:");
	}

	@Test(priority = 5)
	public void FRHeader() {
		logger.info("Start choosing France as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageFR = (HomePageFR) homePage.chooseEULocation(country.FR, country.FR.getCurrencyISO());
		logger.info("Finish choosing France as country:");
	}

	@Test(priority = 6)
	public void DEHeader() {
		logger.info("Start choosing Deutschland as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageDE = (HomePageDE) homePage.chooseEULocation(country.DE, country.DE.getCurrencyISO());
		logger.info("Finish choosing Deutschland as country:");
	}

	@Test(priority = 7)
	public void NOHeader() {
		logger.info("Start choosing Norway as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageNO = (HomePageNO) homePage.chooseEULocation(country.NO, country.NO.getCurrencyISO());
		logger.info("Finish choosing Norway as country:");
	}

	@Test(priority = 8)
	public void FIHeader() {
		logger.info("Start choosing Finland as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageFI = (HomePageFI) homePage.chooseEULocation(country.FI, country.FI.getCurrencyISO());
		logger.info("Finish choosing Finland as country:");
	}

	@Test(priority = 9)
	public void SWHeader() {
		logger.info("Start choosing Schweiz as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageSW = (HomePageSW) homePage.chooseEULocation(country.SW, country.SW.getCurrencyISO());
		logger.info("Finish choosing Schweiz as country:");
	}

	@Test(priority = 10)
	public void NLHeader() {
		logger.info("Start choosing Netherlands as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageNL = (HomePageNL) homePage.chooseEULocation(country.NL, country.NL.getCurrencyISO());
		logger.info("Finish choosing Netherlands as country:");
	}

	@Test(priority = 11)
	public void LUHeader() {
		logger.info("Start choosing Luxembourg as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageLU = (HomePageLU) homePage.chooseEULocation(country.LU, country.LU.getCurrencyISO());
		logger.info("Finish choosing Luxembourg as country:");
	}

	@Test(priority = 12)
	public void ITHeader() {
		logger.info("Start choosing Italy as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageIT = (HomePageIT) homePage.chooseEULocation(country.IT, country.IT.getCurrencyISO());
		logger.info("Finish choosing Italy as country:");
	}

	@Test(priority = 13)
	public void SEHeader() {
		logger.info("Start choosing Sweden as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageSE = (HomePageSE) homePage.chooseEULocation(country.SE, country.SE.getCurrencyISO());
		logger.info("Finish choosing Sweden as country:");
	}

	@Test(priority = 14)
	public void NZHeader() {
		logger.info("Start choosing NZ as country");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageNZ = (HomePageNZ) homePage.chooseEULocation(country.NZ, country.NZ.getCurrencyISO());
		logger.info("Finish choosing New Zealand as country:");
	}

	@AfterTest
	public void tearDown() {
		homePageUS.quit();
		homePageUK.quit();
		homePageAU.quit();
		homePageIE.quit();
		homePageDK.quit();
		homePageFR.quit();
		homePageDE.quit();
		homePageBE.quit();
		homePageNZ.quit();
		homePageSE.quit();
		homePageIT.quit();
		homePageLU.quit();
		homePageNL.quit();
		homePageSW.quit();
		homePageFI.quit();
		homePageNO.quit();
		homePage.quit();
	}
}
