package com.ariat.Tests.Categories.Countries.MenCategory.Sorting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.Categories.MenCategories.MenCategoryPage;
import com.ariat.Tests.BaseTest;


/**
 * Pagination and sorting for Men Category
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenCategoryPaginationSortingRUTest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageRU homePageRU;
	private MenCategoryPage menCategoryPage;
	
	public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test
	public void navigateWomenFootwearCategories() {
		logger.info("Starting sort and navigate pagination test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		menCategoryPage = homePageRU.returnMenCategoryPage();
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
		homePageRU.quit();
		menCategoryPage.quit();
		
	}
}
