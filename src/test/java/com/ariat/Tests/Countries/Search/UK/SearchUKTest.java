package com.ariat.Tests.Countries.Search.UK;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class SearchUKTest extends BaseTest {

	private HomePage homePage;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Product results for:";

	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void editAddressTest() {
		logger.info("Starting search products UK test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		homePage.search(OPTION);
	    homePage.assertProductDisplayed(MESSAGE, OPTION);
		homePage.seeAllproducts();
		logger.info("Finishing search products UK test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
	}
}