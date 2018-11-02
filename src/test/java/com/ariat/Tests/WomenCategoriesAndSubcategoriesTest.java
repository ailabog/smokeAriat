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
		womenFootwearPage.returnWomenFootwearRidingCategoryPage();
		womenFootwearPage.womenCategory();
		womenFootwearPage.returnWomenFootwearWesternPage();
		womenFootwearPage.womenCategory();
		womenFootwearPage.returnWomenFootwearCountryPage();
		womenFootwearPage.womenCategory();
		womenFootwearPage.returnWomenFootwearCasualShoesPage();
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
		womenClothingPage.returnWomenClothingOuterwearPage();
		womenClothingPage.womenCategory();
		womenClothingPage.returnWomenClothingBreechesAndTightsPage();
		womenClothingPage.womenCategory();
		womenClothingPage.returnWomenClothingShowPage();
		womenClothingPage.womenCategory();
		womenClothingPage.returnWomenClothingSweatTshirtAndWoodiesPage();
		womenClothingPage.womenCategory();
		womenClothingPage.returnWomenClothingTopsAndTshirtsPage();
		logger.info("Finishing navigate Women Clothing sub-categories test.");
	}
	
	@Test(priority = 2)
	public void navigateWomenAccessoriesCategoriesTest() {
		logger.info("Starting navigate Women Accessories sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage = womenCategoryPage.returnWomenAccessoriesCategoryPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage.returnWomenAccessoriesBagsPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage.returnWomenAccessoriesGlovesCategory();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage.returnWomenAccessoriesHeadwearPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage.returnWomenAccessoriesScarfAndPonchosPage();
		womenAccessoriesPage.womenCategory();
		womenAccessoriesPage.returnWomenAccessoriesSocksPage();
		logger.info("Finishing navigate Women Accessories sub-categories test.");
	}
	
	@Test(priority = 3)
	public void navigateWomenFeaturedCategoriesTest() {
		logger.info("Starting navigate Women Featured sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedPage = womenCategoryPage.returnWomenFeaturedCategoryPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedPage.returnWomenFeaturedHeritageCollectionPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedPage.returnWomenWarmWeatherRidingPage();
		womenFeaturedPage.womenCategory();
		womenFeaturedPage.returWomenFeaturedTriFactorBreechPage();
		logger.info("Finishing navigate Women Featured sub-categories test.");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();

	}
}
