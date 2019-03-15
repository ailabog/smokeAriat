package com.ariat.Tests.Checkout.NegativeCreateOrder;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Enums.ListOfCreditCards;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Pages.Header.SignInPage;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageNL;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.Main.CheckoutPage;
import com.ariat.Pages.Main.CheckoutProcessCompletePage;
import com.ariat.Pages.Main.CheckoutProcessPage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Products.CasualShoeProductPage;
import com.ariat.Pages.Products.GlovesProductPage;
import com.ariat.Pages.Products.HeritageProductPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.GenerateRandomDataUtils;


/**
 * Checkout -> Negative Create new order
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class NegativeCheckoutCreateOrderNLTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageNL homePageNL;
	private WomenCategoryPage womenCategoryPage;
	private MyBagPage myBagPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private GlovesProductPage glovesProductPage;
	private com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories.WomenFootwearCasualShoesPage womenFootwearCasualShoesCategoryPage;
	private WomenFootwearPage womenFootwearPage;
	private SignInPage signInPage;
	private CasualShoeProductPage casualProductShoePage;
	private HeritageProductPage productPage;
	private CheckoutPage checkoutPage;
	private CheckoutProcessPage checkoutProcessPage;
	private CheckoutProcessCompletePage checkoutProcessCompletePage;
	private com.ariat.Pages.Main.MyAccountPage myAccountPage;
	
	public static final String CARD_NAME = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String FIRST_NAME = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String LAST_NAME = GenerateRandomDataUtils.generateRandomNumber(7);
	public static final String ADDRESS = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String ADDRESS1 = GenerateRandomDataUtils.generateRandomNumber(5);
	public static final String CITY = "24534543";
	public static final String COUNTRY = "United Kingdom";
	public static final String ZIP_CODE = GenerateRandomDataUtils.generateRandomString(5);
	public static final String MOBILE = GenerateRandomDataUtils.generateRandomString(7);
	public static final String EMAIL = GenerateRandomDataUtils.generateRandomNumber(12);
	public static final String PASSWORD = GenerateRandomDataUtils.generateRandomString(10);
	public static final String EMAILEXISTENT = "aila.bogasieru@ariat.com";
	public static final String PASSWORDEXISTENT = "Parola12345!";
	private ListOfCreditCards typeCard;
	private static final String YEAR = "2023";
	private static final String MONTH = "January";

	public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

  @Test(priority=0)
	public void checkoutCreateNewOrderNotBeingLogged() {
		logger.info("Starting checkout -> create negative order without being logged test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageNL = (HomePageNL) homePage.chooseEULocation(euCountry.NL, euCountry.NL.getCurrencyISO());
		womenCategoryPage = homePageNL.returnWomenCategoryPage();
		womenAccessoriesPage = womenCategoryPage.returnWomenAccessoriesCategoryLeftNavPage();
		womenAccessoriesGlovesPage= womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryleftNavPage();
		glovesProductPage = womenAccessoriesGlovesPage.returnGlovesProductPagePage();
		glovesProductPage.selectAttributeSize("7");
		myBagPage = glovesProductPage.returnMyBagPage();
		checkoutPage = myBagPage.returnCheckoutPage();
		checkoutProcessPage = checkoutPage.returnCheckoutProcessPage();
		checkoutProcessPage.enterFName(FIRST_NAME);
		checkoutProcessPage.enterLName(LAST_NAME);
		checkoutProcessPage.enterAddress(ADDRESS);
		checkoutProcessPage.enterAddress1(ADDRESS1);
		checkoutProcessPage.enterCity(CITY);
		checkoutProcessPage.enterZipCode(ZIP_CODE);
		checkoutProcessPage.selectAddress();
		checkoutProcessPage.enterMobile(MOBILE);
		checkoutProcessPage.enterEmail(EMAIL);
		checkoutProcessPage.enterConfirmEmail(EMAIL);
		checkoutProcessPage.continueCheckout();
		checkoutProcessPage.continueCheckout();
		checkoutProcessPage.enterCardName(CARD_NAME);
		checkoutProcessPage.enterCardNo(typeCard.MASTER_CARD.getNumber());
		checkoutProcessPage.selectTypeCard(typeCard.MASTER_CARD.getName());
		checkoutProcessPage.selectExpirationMonth(MONTH);
		checkoutProcessPage.selectExpirationYear(YEAR);
		checkoutProcessPage.enterSecurityCode(typeCard.MASTER_CARD.getCvs());
		checkoutProcessCompletePage = checkoutProcessPage.returnCheckoutProcessCompletePage();
		checkoutProcessCompletePage.checkItem();
		checkoutProcessCompletePage.enterPassword(PASSWORD);
		checkoutProcessCompletePage.confirmPassword(PASSWORD);
		myAccountPage = checkoutProcessCompletePage.returnMyAccountPage();
		logger.info("Finishing checkout -> create negative order without being logged test.");
	}
    
  

	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageNL.quit();
		womenCategoryPage.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesGlovesPage.quit();
		myBagPage.quit();
		checkoutProcessPage.quit();
		checkoutPage.quit();
		checkoutProcessCompletePage.quit();
		glovesProductPage.quit();
		womenFootwearCasualShoesCategoryPage.quit();
		casualProductShoePage.quit();
		productPage.quit();
		myAccountPage.quit();
	}
}
