package com.ariat.Tests.Product.WriteReview.WomenCategory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.GlovesProductPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.BreechProductPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category test write review on Glove product
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ProductWriteReviewWomenCategoryTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private GlovesProductPage gloveProductPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenCategoryPage womenCategoryPage;
	private WomenClothingPage womenClothingPage;
	private BreechProductPage breechProductPage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void productPageWomenCategoryWriteReviewYesRecommendTest() {
		logger.info("Starting product page -> Women Category write review for Glove product test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenAccessoriesPage = homePage.returnAccessoriesCategoryPage();
		womenAccessoriesGlovesPage = womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryleftNavPage();
		gloveProductPage = womenAccessoriesGlovesPage.returnGlovesProductPagePage();
		gloveProductPage.writeReviewClick();
		gloveProductPage.writeReviewContent("This is my review", "Absolutely gorgeous");
		gloveProductPage.writeReviewStar("Excellent");
		gloveProductPage.recommendProductYes();
		gloveProductPage.userInfoReview("aila", "London", "aila.bogasieru.gmail.com");
		gloveProductPage.postReview();
		logger.info("Finishing product page -> Women Category write review recommend product for Glove product test.");
	}

	@Test
	public void productPageWomenCategoryWriteReviewNoRecommendTest() {
		logger.info("Starting product page -> Women Category write review recommend product for Glove product test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenClothingPage = womenCategoryPage.returnWomenClothingCategoryLeftNavPage();
		breechProductPage = womenClothingPage.returnBreechProductPage();
		gloveProductPage.writeReviewClick();
		gloveProductPage.writeReviewContent("This is my review", "Absolutely gorgeous");
		gloveProductPage.writeReviewStar("Poor");
		gloveProductPage.recommendProductNo();
		gloveProductPage.userInfoReview("aila", "London", "aila.bogasieru.gmail.com");
		gloveProductPage.postReview();
		logger.info("Finishing product page -> Women Category write review for Glove product test.");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		gloveProductPage.quit();
	}
}
