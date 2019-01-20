package com.ariat.Tests.Product.WomenCategory.WriteReview;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.Products.BreechProductPage;
import com.ariat.Pages.Products.GlovesProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category test write review on Glove product
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ProductWriteReviewWomenCategoryRUTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private HomePageRU homePageRU;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private GlovesProductPage gloveProductPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenCategoryPage womenCategoryPage;
	private WomenClothingPage womenClothingPage;
	private BreechProductPage breechProductPage;
	private GlobalCountries country;
	
	private static final String TITLE_REVIEW = "This is my review";
	private static final String CONTENT_REVIEW = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam a porttitor nisl, id rhoncus massa. Nunc imperdiet luctus porta. Sed consequat eros quis pellentesque pulvinar. Nulla facilisi. Vestibulum at dui ac elit laoreet suscipit. Suspendisse erat turpis, aliquet id mauris vitae, viverra iaculis massa. Proin ullamcorper enim quis orci tempor consectetur quis vel augue. Aliquam rutrum nibh arcu, at vestibulum urna blandit at. Quisque at dapibus erat. Donec id sapien eu massa interdum laoreet a non libero. Nunc finibus, odio quis laoreet pretium, velit ante imperdiet nisl, id volutpat elit nisl sit amet mi. Aenean aliquet, elit tincidunt ullamcorper suscipit, nisi felis malesuada eros, in vehicula ipsum urna ac felis.";
    private static final String USER = GenerateRandomDataUtils.generateRandomString(5);
    private static final String EMAIL = "aila.bogasieru@gmail.com";
    private static final String CITY = "Moscow";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void productPageWomenCategoryWriteReviewYesRecommendTest() {
		logger.info("Starting product page -> Women Category write review recommend product for Glove product test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		womenAccessoriesPage = homePageRU.returnAccessoriesCategoryPage();
		womenAccessoriesGlovesPage = womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryleftNavPage();
		gloveProductPage = womenAccessoriesGlovesPage.returnGlovesProductPagePage();
		gloveProductPage.writeReviewClick();
		gloveProductPage.writeReviewContent(TITLE_REVIEW, CONTENT_REVIEW);
		gloveProductPage.writeReviewStar("Excellent");
		gloveProductPage.recommendProductYes();
		gloveProductPage.userInfoReview(USER, CITY, EMAIL);
		gloveProductPage.postReview();
		logger.info("Finishing product page -> Women Category write review recommend product for Glove product test.");
	}

@Test
	public void productPageWomenCategoryWriteReviewNoRecommendTest() {
		logger.info("Starting product page -> Women Category write review don't recommend product for Breech product test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageRU = (HomePageRU) homePage.chooseGlobalLocation(country.RU, country.RU.getCurrencyISO());
		womenCategoryPage = homePageRU.returnWomenCategoryPage();
		womenClothingPage = womenCategoryPage.returnWomenClothingCategoryLeftNavPage();
		breechProductPage = womenClothingPage.returnBreechProductPage();
		breechProductPage.writeReviewClick();
		breechProductPage.writeReviewContent(TITLE_REVIEW, CONTENT_REVIEW);
		breechProductPage.writeReviewStar("Poor");
		//breechProductPage.recommendProductNo();
		breechProductPage.userInfoReview(USER, CITY, EMAIL);
		breechProductPage.postReview();
		logger.info("Finishing product page -> Women Category don't recommend product for Breech product test.");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageRU.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		gloveProductPage.quit();
		breechProductPage.quit();
	}
}
