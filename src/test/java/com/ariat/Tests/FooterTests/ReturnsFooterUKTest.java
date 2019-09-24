package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.ReturnPolicyPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;


/**
 * Test Returns page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ReturnsFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private ReturnPolicyPage returnPolicyPage;
	
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void returnsFooterTest() {
		logger.info("Starting checking Returns page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		returnPolicyPage = homePageUK.returnReturnPolicyPage();
		returnPolicyPage.assertText1("PURCHASES FROM ARIAT.COM");
		returnPolicyPage.assertText2("CHECK RETURN STATUS");
		returnPolicyPage.assertText3("OUR RETURN POLICY");
		returnPolicyPage.assertText4("PURCHASES FROM A RETAILER");
		logger.info("Finishing checking Returns test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		returnPolicyPage.quit();
  }
}

