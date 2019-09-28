package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.ariat.Pages.Footer.FaqsPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;


/**
 * Test FAQs page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class FAQsFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private FaqsPage faqsPage;
	
	private static final String MSG1 = "CUSTOMER CARE";
	private static final String MSG2 = "REPLACEMENT OF PRODUCTS OR SHOE PARTS";
	private static final String MSG3 = "SIZING & FIT";
	private static final String MSG4 = "BOOT CARE";
	private static final String MSG5 = "RETAIL PARTNERSHIP";
	private static final String MSG6 = "MISCELLANEOUS";
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void deliveryFooterTest() {
		logger.info("Starting checking FAQs page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		faqsPage = homePageUK.returnFaqsPage();
		faqsPage.assertText(MSG1, MSG2, MSG3, MSG4, MSG5, MSG6);
		logger.info("Finishing checking FAQs test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		faqsPage.quit();
  }
}

