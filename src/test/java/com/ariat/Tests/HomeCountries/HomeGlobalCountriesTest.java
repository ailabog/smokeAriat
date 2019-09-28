package com.ariat.Tests.HomeCountries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageAT;
import com.ariat.Pages.HomePagesCountries.HomePageBE;
import com.ariat.Pages.HomePagesCountries.HomePageBR;
import com.ariat.Pages.HomePagesCountries.HomePageCA;
import com.ariat.Pages.HomePagesCountries.HomePageCN;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageDK;
import com.ariat.Pages.HomePagesCountries.HomePageFI;
import com.ariat.Pages.HomePagesCountries.HomePageFR;
import com.ariat.Pages.HomePagesCountries.HomePageIE;
import com.ariat.Pages.HomePagesCountries.HomePageIT;
import com.ariat.Pages.HomePagesCountries.HomePageJP;
import com.ariat.Pages.HomePagesCountries.HomePageKR;
import com.ariat.Pages.HomePagesCountries.HomePageLU;
import com.ariat.Pages.HomePagesCountries.HomePageNL;
import com.ariat.Pages.HomePagesCountries.HomePageNO;
import com.ariat.Pages.HomePagesCountries.HomePageNZ;
import com.ariat.Pages.HomePagesCountries.HomePageQA;
import com.ariat.Pages.HomePagesCountries.HomePageRO;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.HomePagesCountries.HomePageSE;
import com.ariat.Pages.HomePagesCountries.HomePageTR;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Tests.Base.BaseTest;


/**
 * Choose countries (EU Countries) selector tests for US page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomeGlobalCountriesTest extends BaseTest {

	private Environments environment;
	private HomePageUS homePageUS;
	private HomePageUK homePageUK;
	private HomePageIE homePageIE;
	private HomePageDK homePageDK;
	private HomePageFR homePageFR;
	private HomePageAT homePageAT;
	private HomePageBE homePageBE;
	private HomePageRU homePageRU;
	private HomePageRO homePageRO;
	private HomePageCN homePageCN;
	private HomePageKR homePageKR;
	private HomePageJP homePageJP;
	private HomePageCA homePageCA;
	private HomePageDE homePageDE;
	private HomePageNO homePageNO;
	private HomePageFI homePageFI;
	private HomePageNL homePageNL;
	private HomePageLU homePageLU;
	private HomePageSE homePageSE;
	private HomePageIT homePageIT;
	private HomePageNZ homePageNZ;
	private HomePageBR homePageBR;
	private HomePageTW homePageTW;
	private HomePageQA homePageQA;
	private HomePageTR homePageTR;
	private HomePage homePage;
	private GlobalCountries country;
	private EUCountries euCountry;
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test
	public void EULocations() {
		logger.info(
				"Start choosing EU countries one by one from the list starting with United Kingdom & finishing with United States...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageBE = (HomePageBE) homePage.chooseEULocation(euCountry.BE, euCountry.BE.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		homePageNO = (HomePageNO) homePage.chooseEULocation(euCountry.NO, euCountry.NO.getCurrencyISO());
		homePageFI = (HomePageFI) homePage.chooseEULocation(euCountry.FI, euCountry.FI.getCurrencyISO());
		homePageIE = (HomePageIE) homePage.chooseEULocation(euCountry.IE, euCountry.IE.getCurrencyISO());
		homePageDK = (HomePageDK) homePage.chooseEULocation(euCountry.DK, euCountry.DK.getCurrencyISO());
		homePageFR = (HomePageFR) homePage.chooseEULocation(euCountry.FR, euCountry.FR.getCurrencyISO());
		homePageAT = (HomePageAT) homePage.chooseEULocation(euCountry.AT, euCountry.AT.getCurrencyISO());
		homePageNL = (HomePageNL) homePage.chooseEULocation(euCountry.NL, euCountry.NL.getCurrencyISO());
		homePageLU = (HomePageLU) homePage.chooseEULocation(euCountry.LU, euCountry.LU.getCurrencyISO());
		homePageSE = (HomePageSE) homePage.chooseEULocation(euCountry.SE, euCountry.SE.getCurrencyISO());
		homePageIT = (HomePageIT) homePage.chooseEULocation(euCountry.IT, euCountry.IT.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		logger.info(
				"Finish choosing EU countries one by one from the list starting with United Kingdom & finishing with United States.");
	}

	@Test
	public void GlobalLocations() {
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		logger.info(
				"Start choosing global countries one by one from the list starting with United Stated & finishing with Taiwan...");
		homePageCA = (HomePageCA) homePage.chooseGlobalLocation(country.CA, country.CA.getCurrencyISO());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		homePageBR = (HomePageBR) homePage.chooseGlobalLocation(country.BR, country.BR.getCurrencyISO());
		homePageQA = (HomePageQA) homePage.chooseGlobalLocation(country.QA, country.QA.getCurrencyISO());
		homePageTR = (HomePageTR) homePage.chooseGlobalLocation(country.TR, country.TR.getCurrencyISO());
		homePageRO = (HomePageRO) homePage.chooseGlobalLocation(country.RO, country.RO.getCurrencyISO());
		homePageCN = (HomePageCN) homePage.chooseGlobalLocation(country.CN, country.CN.getCurrencyISO());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		homePageKR = (HomePageKR) homePage.chooseGlobalLocation(country.KR, country.KR.getCurrencyISO());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		logger.info(
				"Finish choosing global countries one by one from the list starting with United Stated & finishing with Iaiwan.");
	}

	@AfterTest
	public void tearDown() {

		homePageUK.quit();
		homePageBE.quit();
		homePageDE.quit();
		homePageNO.quit();
		homePageFI.quit();
		homePageNL.quit();
		homePageSE.quit();
		homePageLU.quit();
		homePageIT.quit();
		homePageNZ.quit();
		homePageUS.quit();
	    homePageCA.quit();
		homePageFR.quit();
		homePageIE.quit();
		homePageDK.quit();
		homePageAT.quit();
		homePageRU.quit();
		homePageQA.quit();
		homePageTR.quit();
		homePageRO.quit();
		homePageBR.quit();
		homePageCN.quit();
		homePageJP.quit();
		homePageKR.quit();
		homePageTW.quit();
		homePage.quit();
	}
}
