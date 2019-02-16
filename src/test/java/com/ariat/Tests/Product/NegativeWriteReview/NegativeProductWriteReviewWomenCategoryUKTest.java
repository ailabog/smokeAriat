package com.ariat.Tests.Product.NegativeWriteReview;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Products.BreechProductPage;
import com.ariat.Pages.Products.GlovesProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category test negative write review on Glove product
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class NegativeProductWriteReviewWomenCategoryUKTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private GlovesProductPage gloveProductPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private EUCountries euCountry;
	
    
    private static final String TITLE_REVIEW =  GenerateRandomDataUtils.generateRandomNumber(10);
	private static final String CONTENT_REVIEW = GenerateRandomDataUtils.generateRandomNumber(50);
    private static final String USER = GenerateRandomDataUtils.generateRandomNumber(5);
    private static final String EMAIL = "aila.bogasieru@gmail.com";
    private static final String CITY = "London";
    
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void productPageWomenCategoryWriteReviewYesRecommendTest() {
		logger.info("Starting product page -> Women Category write negative review product for Glove product test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		womenAccessoriesPage = homePageUK.returnAccessoriesCategoryPage();
		womenAccessoriesGlovesPage = womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryleftNavPage();
		gloveProductPage = womenAccessoriesGlovesPage.returnGlovesProductPagePage();
		gloveProductPage.writeReviewClick();
		gloveProductPage.writeReviewContent(TITLE_REVIEW, CONTENT_REVIEW);
		gloveProductPage.writeReviewStar("Excellent");
		gloveProductPage.recommendProductYes();
		gloveProductPage.userInfoReview(USER, CITY, EMAIL);
		gloveProductPage.postReview();
		logger.info("Finishing product page -> Women Category write negative review recommend product for Glove product test.");
	}



	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		gloveProductPage.quit();
	}
}
