package com.ariat.Tests.Product.WomenCategory.Countries.AddToCart;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageJP;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Products.CasualShoeProductPage;
import com.ariat.Pages.Products.GlovesProductPage;
import com.ariat.Pages.Products.HeritageProductPage;
import com.ariat.Tests.Base.BaseTest;

import Interfaces.ProductAttributes;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category -> Add to cart test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ProductAddToCartWomenCategoryJPTest extends BaseTest {

	private Environments environment;
	private GlobalCountries country;
	private HomePage homePage;
	private HomePageJP homePageJP;
	private WomenCategoryPage womenCategoryPage;
	private MyBagPage myBagPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private GlovesProductPage glovesProductPage;
	private com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories.WomenFootwearCasualShoesPage womenFootwearCasualShoesCategoryPage;
	private WomenFootwearPage womenFootwearPage;
	private CasualShoeProductPage casualProductShoePage;
	private HeritageProductPage productPage;

		
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

    @Test(priority=0)
	public void productPageWomenCategoryAddToCartTest() {
		logger.info("Starting product page -> Women Category Gloves sub-category product glove add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		womenCategoryPage = homePageJP.returnWomenCategoryPage();
		womenAccessoriesPage = womenCategoryPage.returnWomenAccessoriesCategoryLeftNavPage();
		womenAccessoriesGlovesPage= womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryleftNavPage();
		glovesProductPage = womenAccessoriesGlovesPage.returnGlovesProductPagePage();
		ProductAttributes.selectAttributeSize("6");
		myBagPage = ProductAttributes.returnMyBagPage();
		logger.info("Finishing product page -> Women Category Gloves sub-category product glove add to cart test.");
	}
	
	@Test(priority=1)
	public void productPageWomenCategoryAddToCartNoFreeGiftTest() {
		logger.info("Starting product page -> Women Category Casual Shoe prduct category add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		womenCategoryPage = homePageJP.returnWomenCategoryPage();
		womenFootwearPage = womenCategoryPage.returnWomenFootwearPage();
		womenFootwearCasualShoesCategoryPage = womenFootwearPage.returnWomenFootwearCasualShoesCategoryPage();
		casualProductShoePage = womenFootwearCasualShoesCategoryPage.returnCasualShoeProductPage();
		ProductAttributes.selectAttributeSize("36");
		myBagPage = ProductAttributes.returnMyBagPage();
		myBagPage.cancelFreeGift();
		myBagPage.checkMyBagNoFreeGift();
		logger.info("Finishing product page -> Women Category Casual Shoe prduct category add to cart test.");
	}
	
	@Test(priority=2)
	public void productPageWomenCategoryAddToCartYesFreeGiftTest() {
		logger.info("Starting product page -> Women Category Add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageJP = (HomePageJP) homePage.chooseGlobalLocation(country.JP, country.JP.getCurrencyISO());
		womenCategoryPage = homePageJP.returnWomenCategoryPage();
		productPage = womenCategoryPage.returnHeritageProduct();
		ProductAttributes.selectAttributeSize("536");
		ProductAttributes.selectAttributeCalf("Slim");
		ProductAttributes.selectAttributeHeight("Medium");
		myBagPage = ProductAttributes.returnMyBagPage();
		logger.info("Finishing product page -> Women Category Add to cart  test.");
	}
	
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageJP.quit();
		womenCategoryPage.quit();
		myBagPage.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		glovesProductPage.quit();
		womenFootwearCasualShoesCategoryPage.quit();
		casualProductShoePage.quit();
		productPage.quit();
	}
}
