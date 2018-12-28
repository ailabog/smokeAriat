package com.ariat.Pages.Categories.WomenCategories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements returns methods to pages: Women Category Page Women Footwear Page
 * Women Clothing Page Women Accessories Page Women Featured Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoryPage extends BasePage {

	private By womenFootwearCategory = By.linkText("Footwear");
	private By womenFootwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenClothingCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/a");

	private By womenClothingText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccesoriesCategory = By
			.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/a");
	private By womenAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenFeaturedCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[8]/li/a");
	private By womenFeaturedText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");

	private By leftnavFootwear = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By leftnavClothing = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
	private By leftnavAccessories = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
	private By leftnavRiding = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
	private By leftnavCountry = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[5]/a");
	private By leftnavWestern = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[6]/a");
	private By leftnavFashion = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[7]/a");
	private By leftnavFeatured = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[8]/a");
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By womenText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By sortDropWomenCategoryUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[2]/h3/p[1]/span");
	private By show36ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[1]/a");
	private By show72ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[2]/a");
	private By show108ItemLinkUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[4]/ul/li[3]/a");
	private By nextPaginationButtonUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[5]/ul/li[5]");
	private By prevPaginationButtonUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[1]/div[5]/ul/li[1]/a/span");
	private By backToTopButton = By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/a");
	private By sortDropWomenCategoryDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[1]/h3/p[1]/span");
	private By show36ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[1]/a");
	private By show72ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[2]/a");
    private By show108ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[3]/a");
	private By nextPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[5]/a");
	private By prevPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[7]/a");
	private By heritageProductLink = By.xpath("//img[@title='Heritage II Ellipse Tall Riding Boot']");
	private By heritaheProductText = By.xpath("//*contains[text(),'Heritage II Ellipse Tall Riding Boot']");
	private By recommendedLink = By.linkText("Recommended");
	private By priceHighToLowLink = By.linkText("Price (High to Low)");
	private By priceLowToHighLink = By.linkText("Price (Low to High)");
	private By bestSellersLink = By.linkText("Best Sellers");
	private By womenAccesoriesCategoryLefytNav = By.linkText("Accessories");
	
	public WomenCategoryPage(WebDriver driver) {
		super(driver);
	}

	public void womenCategory() {
		WebDriverUtils.moveToElement(driver, womenCategory);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickSortUp() {
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickSortDown() {
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void sortProductWomenCategoryRecommended() {
		WebDriverUtils.clickOnElementWithWait(driver, recommendedLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void sortProductWomenCategoryPriceHighToLow() {
		WebDriverUtils.clickOnElementWithWait(driver, priceHighToLowLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void sortProductWomenCategoryPriceLowToHigh() {
		WebDriverUtils.clickOnElementWithWait(driver, priceLowToHighLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void sortProductWomenCategoryBestSellers() {
		WebDriverUtils.clickOnElementWithWait(driver, bestSellersLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void show36ItemsUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLinkUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void show72ItemsUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLinkUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void show108ItemLinkUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void nextPaginationUp() {
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void prevPaginationButtonUp() {
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void backToTopClick() {
		WebDriverUtils.scrolltoElement(driver, backToTopButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, backToTopButton);
	}

	public void show36ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show36ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLinkDown);
	}

	public void show72ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show72ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void show108ItemLinkDown() {
		WebDriverUtils.scrolltoElement(driver, show108ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void nextPaginationDown() {
		WebDriverUtils.scrollElementToPosition(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void prevPaginationButtonDown() {
		WebDriverUtils.scrollElementToPosition(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}


	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenText));
		return new WomenCategoryPage(driver);
	}

	public WomenFootwearPage returnWomenFootwearPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFootwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFootwearText));
		return new WomenFootwearPage(driver);
	}

	public WomenClothingPage returnWomenClothingCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
		return new WomenClothingPage(driver);
	}

	public WomenAccessoriesPage returnWomenAccessoriesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}
	
	
	public WomenAccessoriesPage returnWomenAccessoriesCategoryLeftNavPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategoryLefytNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}

	public WomenFeaturedPage returnWomenFeaturedCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedText));
		return new WomenFeaturedPage(driver);
	}
	
	public HeritageProductPage returnHeritageProduct() {
		WebDriverUtils.clickOnElementWithWait(driver, heritageProductLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(heritaheProductText));
		return new HeritageProductPage(driver);
		
	}
	
	
	public WomenClothingPage returnWomenClothingCategoryLeftNavPage() {
		WebDriverUtils.clickOnElementWithWait(driver, leftnavClothing);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
		return new WomenClothingPage(driver);
	}
}
