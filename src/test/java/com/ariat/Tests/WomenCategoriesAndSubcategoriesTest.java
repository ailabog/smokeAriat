package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesBagsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesScarfAndPonchosPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesSocksPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingBreechesAndTightsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingOuterwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingShowPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedHeritageCollectionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedTriFactorBreechPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedWarmWeatherRidingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearCasualShoesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearCountryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearRidingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearWesternPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test pages redirection from Women Category to all its sub-categories tree
 * structure
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoriesAndSubcategoriesTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private WomenCategoryPage womenCategoryPage;
	private WomenFootwearPage womenFootwearPage;
	private WomenFootwearCountryPage womenFootwearCountryPage;
	private WomenFootwearRidingPage womenFootwearRidingPage;
	private WomenFootwearWesternPage womenFootwearWesterenPage;
	private WomenFootwearCasualShoesPage womenFootwearCasualShoesPage;
	private WomenClothingPage  womenClothingPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenFeaturedPage womenFeaturedPage;
	private WomenClothingOuterwearPage womenClothingOuterwearPage;
	private WomenClothingBreechesAndTightsPage womenClothingBreechesAndTightsPage;
	private WomenClothingShowPage womenClothingShowPage;
	private WomenClothingSweatTshirtAndWoodiesPage womenClothingSweatTshirtAndWoodiesPage;
	private WomenClothingTopsAndTshirtsPage womenClothingTopsAndTshirtsPage;
	private WomenFeaturedHeritageCollectionPage womenFeaturedHeritageCollectionPage;
	private WomenFeaturedWarmWeatherRidingPage womenFeturedWarmWeatherRidingPage;
	private WomenFeaturedTriFactorBreechPage womenFeaturedTriFactorBreechPage;
	private WomenAccessoriesBagsPage womenAccessoriesBagsPage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private WomenAccessoriesHeadwearPage womenAccessoriesHeadwearPage;
	private WomenAccessoriesScarfAndPonchosPage womenAccessoriesScarfAndPonchosPage;
	private WomenAccessoriesSocksPage womenAccessoriesSocksPage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void navigateWomenFootwearCategories() {
		logger.info("Starting navigate Women Footwear sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenFootwearPage = womenCategoryPage.returnWomenFootwearPage();
		womenFootwearPage.womenCategory();
		womenFootwearRidingPage = womenFootwearPage.returnWomenFootwearRidingCategoryPage();
		womenFootwearPage.womenCategory();
		womenFootwearWesterenPage = womenFootwearPage.returnWomenFootwearWesternPage();
		womenFootwearPage.womenCategory();
		womenFootwearCountryPage = womenFootwearPage.returnWomenFootwearCountryPage();
		womenFootwearPage.womenCategory();
		womenFootwearCasualShoesPage = womenFootwearPage.returnWomenFootwearCasualShoesPage();
		logger.info("Finishing navigate Women Footwear sub-categories test.");
	}
	
		@Test(priority = 1)
	public void navigateWomenClothingCategoriesTest() {
		logger.info("Starting navigate Women Clothing sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingPage = womenCategoryPage.returnWomenClothingCategory();
		womenClothingPage.womenCategory();
		womenClothingOuterwearPage = womenClothingPage.returnWomenClothingOuterwearPage();
		womenClothingPage.womenCategory();
		womenClothingBreechesAndTightsPage = womenClothingPage.returnWomenClothingBreechesAndTightsPage();
		womenClothingPage.womenCategory();
		womenClothingShowPage = womenClothingPage.returnWomenClothingShowPage();
		womenClothingPage.womenCategory();
		womenClothingSweatTshirtAndWoodiesPage = womenClothingPage.returnWomenClothingSweatTshirtAndWoodiesPage();
		womenClothingPage.womenCategory();
		womenClothingTopsAndTshirtsPage = womenClothingPage.returnWomenClothingTopsAndTshirtsPage();
		logger.info("Finishing navigate Women Clothing sub-categories test.");
	} 
	
	 @Test(priority = 2)
	public void navigateWomenAccessoriesCategoriesTest() {
		logger.info("Starting navigate Women Accessories sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesPage = womenCategoryPage.returnWomenAccessoriesCategoryPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesBagsPage = womenAccessoriesPage.returnWomenAccessoriesBagsPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesGlovesPage = womenAccessoriesPage.returnWomenAccessoriesGlovesPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesHeadwearPage = womenAccessoriesPage.returnWomenAccessoriesHeadwearPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesScarfAndPonchosPage =womenAccessoriesPage.returnWomenAccessoriesScarfAndPonchosPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesSocksPage = womenAccessoriesPage.returnWomenAccessoriesSocksPage();
		logger.info("Finishing navigate Women Accessories sub-categories test.");
	} 
	
	@Test(priority = 3)
	public void navigateWomenFeaturedCategoriesTest() {
		logger.info("Starting navigate Women Featured sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenFeaturedPage = womenCategoryPage.returnWomenFeaturedCategoryPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedHeritageCollectionPage = womenFeaturedPage.returnWomenFeaturedHeritageCollectionPage();
		womenFeaturedPage.womenCategory();
		womenFeturedWarmWeatherRidingPage = womenFeaturedPage.returnWomenFeaturedWarmWeatherRidingPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedTriFactorBreechPage = womenFeaturedPage.returWomenFeaturedTriFactorBreechPage();
		logger.info("Finishing navigate Women Featured sub-categories test.");
	} 

	@AfterTest
	public void tearDown() {
		homePage.quit();
		womenCategoryPage.quit();
		womenFootwearPage.quit();
		womenFootwearRidingPage.quit();
		womenFootwearWesterenPage.quit();
		womenFootwearCasualShoesPage.quit();
		womenClothingOuterwearPage.quit();
		womenClothingBreechesAndTightsPage.quit();
		womenClothingShowPage.quit();
		womenClothingSweatTshirtAndWoodiesPage.quit();
		womenClothingTopsAndTshirtsPage.quit();
		womenAccessoriesBagsPage.quit();
		womenAccessoriesGlovesPage.quit();
		womenAccessoriesHeadwearPage.quit();
		womenAccessoriesScarfAndPonchosPage.quit();
		womenAccessoriesSocksPage.quit();
		womenFeaturedHeritageCollectionPage.quit();
		womenFeturedWarmWeatherRidingPage.quit();
		womenFeaturedTriFactorBreechPage.quit();
	}
}
