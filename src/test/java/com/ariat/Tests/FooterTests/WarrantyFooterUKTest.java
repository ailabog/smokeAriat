package com.ariat.Tests.FooterTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ariat.Pages.Footer.WarrantyPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Tests.Base.BaseTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Warranty page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WarrantyFooterUKTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private WarrantyPage warrantyPage;
	private static final String MESSAGE1= "Ariat guarantees all of its products to be free of defects in materials and workmanship. We firmly stand behind everything we produce. This, however, is not a guarantee against normal wear and tear. Nor does it apply to product that has been damaged by misuse, accident, modification or unauthorised repair. If you believe you have purchased a defective Ariat product, please follow the specific guidelines below, depending upon where the product was purchased.";
	private static final String MESSAGE2 ="If you believe you have purchased a defective Ariat product from our website, www.ariat.com, please visit https://www.ariat.com/order-status to initiate a warranty return.";
	private static final String MESSAGE3 = "Contact Customer Care by calling +44 (0)1367 242818 or email customer.care@ariat.com Mon-Fri 8am-5pm (UK Time)";
	private static final String MESSAGE4 = "If you have a warranty issue with a product purchased through one of our retailers, contact the Ariat retailer where the product was purchased. Make sure to have your original receipt with you. Upon inspection from your Ariat authorised retailer, consumers may be offered a credit, replacement or repair depending on the defect.";
	
				
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void warrantyFooterTest() {
		logger.info("Starting checking Warranty page test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		warrantyPage = homePageUK.returnWarrantyPage();
		warrantyPage.assertText(MESSAGE1,MESSAGE2, MESSAGE3, MESSAGE4);
		logger.info("Finishing checking Warranty test...");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		warrantyPage.quit();
  }
}

