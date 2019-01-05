package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.ariat.Pages.Footer.SizeChartsPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Size Charts page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SizeChartsFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private SizeChartsPage sizeChartsPage;
	
	private static final String MSG1 = "BOOTS";
	private static final String MSG2 = "TALL BOOTS";
	private static final String MSG3 = "HALF CHAPS";
	private static final String MSG4 = "DENIM";
	private static final String MSG5 = "WESTERN APPAREL";
	private static final String MSG6 = "ENGLISH APPAREL";
	private static final String MSG7 = "BELTS";
					
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void deliveryFooterTest() {
		logger.info("Starting checking FAQs page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		sizeChartsPage = homePageUK.returnSizeChartsPage();
		sizeChartsPage.assertText(MSG1, MSG2, MSG3, MSG4, MSG5, MSG6, MSG7);
		logger.info("Finishing checking FAQs test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		sizeChartsPage.quit();
  }
}

