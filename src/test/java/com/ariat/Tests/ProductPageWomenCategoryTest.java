package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyBagPage;
import com.ariat.Pages.MyWishListPage;
import com.ariat.Pages.Categories.WomenCategories.HeritageProductPage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Catgeory test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ProductPageWomenCategoryTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private WomenCategoryPage womenCategoryPage;
	private HeritageProductPage productPage;
	private MyBagPage myBagPage;
	private MyWishListPage myWishListPage;
	
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void productPageWomenCategoryAddToCartTest() {
		logger.info("Starting product page -> Women Category Add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		productPage = womenCategoryPage.returnHeritageProduct();
		productPage.selectAttributes("7", "Regular", "Medium");
		productPage.setQtyIncrease(2);
		productPage.setQtyDecrease(1);
		myBagPage = productPage.returnMyBagPage();
		logger.info("Finishing product page -> Women Category Add to cart  test.");
	}
	
	@Test
	public void productPageWomenCatgeoryAddToWishListTest() {
		logger.info("Starting product page -> Women Category Add to Wishlist test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		productPage = womenCategoryPage.returnHeritageProduct();
		productPage.selectAttributes("6", "Slim", "Tall");
		productPage.setQtyIncrease(1);
		myWishListPage = productPage.returnMyWishListPage();
		logger.info("Finishing product page -> Women Category Add to WishList test.");
	}
		
	@AfterTest
	public void tearDown() {
		homePage.quit();
		womenCategoryPage.quit();
		productPage.quit();
		myBagPage.quit();
		myWishListPage.quit();
	}
}
