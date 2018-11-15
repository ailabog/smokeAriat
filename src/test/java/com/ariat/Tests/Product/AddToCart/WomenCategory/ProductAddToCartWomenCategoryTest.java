package com.ariat.Tests.Product.AddToCart.WomenCategory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.WomenCategories.HeritageProductPage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category -> Add to cart test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ProductAddToCartWomenCategoryTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private WomenCategoryPage womenCategoryPage;
	private HeritageProductPage productPage;

		
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
		productPage.selectAttributeSize("5");
		productPage.selectAttributeCalf("Slim");
		productPage.selectAttributeHeight("Medium");
		//productPage.setQtyIncrease(2);
		//productPage.setQtyDecrease(1);
		productPage.addToCart();
		logger.info("Finishing product page -> Women Category Add to cart  test.");
	}
	
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		womenCategoryPage.quit();
		productPage.quit();
		
	}
}
