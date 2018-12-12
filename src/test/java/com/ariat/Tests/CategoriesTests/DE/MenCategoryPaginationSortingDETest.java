package com.ariat.Tests.CategoriesTests.DE;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Categories.MenCategories.MenCategoryPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Pagination and sorting for Men Category
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenCategoryPaginationSortingDETest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageDE homePageDE;
	private MenCategoryPage menCategoryPage;
	
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void navigateWomenFootwearCategories() {
		logger.info("Starting sort and navigate pagination test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageDE = (HomePageDE) homePage.chooseEULocation(euCountry.DE, euCountry.DE.getCurrencyISO());
		menCategoryPage = homePageDE.returnMenCategoryPage();
		menCategoryPage.clickSortUp();
		menCategoryPage.sortProductWomenCategoryRecommended();
		menCategoryPage.clickSortUp();
		menCategoryPage.sortProductWomenCategoryBestSellers();
		menCategoryPage.clickSortUp();
		menCategoryPage.sortProductWomenCategoryPriceHighToLow();
		menCategoryPage.show72ItemsUp();
		menCategoryPage.show108ItemLinkUp();
		menCategoryPage.show36ItemsUp();
		menCategoryPage.nextPaginationUp();
		menCategoryPage.prevPaginationButtonUp();
		menCategoryPage.show72ItemsDown();
		menCategoryPage.show108ItemLinkDown();
		menCategoryPage.nextPaginationDown();
		menCategoryPage.backToTopClick();
		logger.info("Finishing  sort and navigate pagination test.");
	}
		
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageDE.quit();
		menCategoryPage.quit();
		
	}
}
