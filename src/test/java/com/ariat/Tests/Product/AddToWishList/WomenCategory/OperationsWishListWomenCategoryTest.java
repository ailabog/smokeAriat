package com.ariat.Tests.Product.AddToWishList.WomenCategory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.MyWishListPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.TriFactorTopProductPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Tests.BaseTest;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Product page - > Women Category -> Add to wishlist update, edit, set
 * priority, remove product test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class OperationsWishListWomenCategoryTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private WomenClothingTopsAndTshirtsPage womenClothingTopsAndTshirtsPage;
	private TriFactorTopProductPage triFactorTopProductPage;
	private MyWishListPage myWishListPage;

	public static final String F_NAME = "Aila";
	public static final String L_NAME = "Bogasieru";
	public static final String EMAIL_WISHLIST = "aila.bogasieru@ariat.com";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	/*@Test(priority = 0)
	public void productPageWomenCategoryAddToWishListShareToAFriendTest() {
		logger.info("Starting product page -> Women Category Add to Wishlist & share it to a friend test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer("aila.bogasieru@ariat.com");
		signInPage.returningPassword("Parola12345!");
		myAccountPage = signInPage.returnMyAccountPage();
		womenClothingTopsAndTshirtsPage = homePage.returnWomenClothingTopsAndTshirtsPage();
		triFactorTopProductPage = womenClothingTopsAndTshirtsPage.returnTriFactorTopProductPage();
		triFactorTopProductPage.selectAttributeSize("Small");
		myWishListPage = triFactorTopProductPage.returnMyWishListPage();
		myWishListPage.sendListToAFriend("Ana", "aila.bogasieru@yahoo.com");
		logger.info("Finishing product page -> Women Category Add to WishList & share it to a friend test.");
	}*/

	@Test(priority = 1)
	public void productPageWomenCategoryAddToWishListDifferentActionsTest() {
		logger.info("Starting product page -> Women Category Add to Wishlist & different actions test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer("aila.bogasieru@ariat.com");
		signInPage.returningPassword("Parola12345!");
		myAccountPage = signInPage.returnMyAccountPage();
		womenClothingTopsAndTshirtsPage = homePage.returnWomenClothingTopsAndTshirtsPage();
		triFactorTopProductPage = womenClothingTopsAndTshirtsPage.returnTriFactorTopProductPage();
		triFactorTopProductPage.selectAttributeSize("Small");
		myWishListPage = triFactorTopProductPage.returnMyWishListPage();
		myWishListPage.setPriorityWishList("Medium");
		myWishListPage.increaseQtyWishList(3);
		myWishListPage.decreaseQtyWishList(2);
		myWishListPage.editItemWishList();
		triFactorTopProductPage.selectAttributeSizeTShirt("Medium");
		triFactorTopProductPage.update();
		myWishListPage.goBackFromEditToWishlist();
		logger.info("Finishing product page -> Women Category Add to WishList  & different actions test.");
	}
	/*@Test(priority = 2)
	public void productPageWomenCategoryAddToWishListAddToCartTest() {
		logger.info("Starting product page -> Women Category Add to Wishlist & add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer("aila.bogasieru@ariat.com");
		signInPage.returningPassword("Parola12345!");
		myAccountPage = signInPage.returnMyAccountPage();
		womenClothingTopsAndTshirtsPage = homePage.returnWomenClothingTopsAndTshirtsPage();
		triFactorTopProductPage = womenClothingTopsAndTshirtsPage.returnTriFactorTopProductPage();
		triFactorTopProductPage.selectAttributeSize("Small");
		myWishListPage = triFactorTopProductPage.returnMyWishListPage();
		myWishListPage.addToCartItemWishList();
		logger.info("Finishing product page -> Women Category Add to WishList& add to cart test."
				+ homePage.minicartShow());

	}

	@Test(priority = 3)
	public void productPageWomenCategoryAddToWishListRemoveItemTest() {
		logger.info("Starting product page -> Women Category Add to Wishlist & add to cart test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer("aila.bogasieru@ariat.com");
		signInPage.returningPassword("Parola12345!");
		myAccountPage = signInPage.returnMyAccountPage();
		womenClothingTopsAndTshirtsPage = homePage.returnWomenClothingTopsAndTshirtsPage();
		triFactorTopProductPage = womenClothingTopsAndTshirtsPage.returnTriFactorTopProductPage();
		triFactorTopProductPage.selectAttributeSize("Small");
		myWishListPage = triFactorTopProductPage.returnMyWishListPage();
		myWishListPage.removeItemWishList();
		logger.info("Finishing product page -> Women Category Add to WishList& add to cart test."
				+ myWishListPage.noItemWishList());
	}*/

	@AfterTest
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		womenClothingTopsAndTshirtsPage.quit();
		myWishListPage.quit();
		triFactorTopProductPage.quit();
	}
}
