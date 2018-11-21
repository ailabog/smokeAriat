package com.ariat.Pages.Categories.WomenCategories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements returns methods to pages: Women Category Page Women Footwear Page
 * Women Clothing Page Women Accessories Page Women Featured Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoryPage extends BasePage {

	private By womenFootwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[1]/li/a");
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
			.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/h3/p[1]/span");
	private By show36ItemLink = By.xpath("//a[text()='36 Items']");
	private By show72ItemLink = By.xpath("//a[text()='72 Items']");
	private By show108ItemLink = By.xpath("//a[text()='108 Items']");
	private By show108ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[4]/div[3]/ul/li[3]/a");
	private By nextPaginationButtonUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[5]/ul/li[5]/a");
	private By prevPaginationButtonUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[5]/ul/li[1]/a/span");
	private By backToTopButton = By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/a");
	private By sortDropWomenCategoryDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[1]/h3/p[1]/span");
	private By nextPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[4]/div[4]/ul/li[4]/a");
	private By prevPaginationButtonDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[7]/a");
	private By heritageProductLink = By.xpath("//*[@id=\"026613ca2d03c726cde6054af3\"]/div[1]/a/picture/img");
	private By heritaheProductText = By.xpath("//*contains[text(),'Heritage II Ellipse Tall Riding Boot']");
	private By recommendedLink = By.linkText("Recommended");
	private By priceHighToLowLink = By.linkText("Price (High to Low)");
	private By priceLowToHighLink = By.linkText("Price (Low to High)");
	private By bestSellersLink = By.linkText("Best Sellers");
	
	public WomenCategoryPage(WebDriver driver) {
		super(driver);
	}

	public void womenCategory() {
		WebDriverUtils.moveToElement(driver, womenCategory);
	}
	
	public void clickSortUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryUp);
	}
	
	public void clickSortDown() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, sortDropWomenCategoryDown);
	}

	public void sortProductWomenCategoryRecommended() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, recommendedLink);
	}
	
	public void sortProductWomenCategoryPriceHighToLow() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, priceHighToLowLink);
	}
	
	public void sortProductWomenCategoryPriceLowToHigh() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, priceLowToHighLink);
	}
	
	public void sortProductWomenCategoryBestSellers() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, bestSellersLink);
	}
	
	public void show36ItemsUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLink);
	}

	public void show72ItemsUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLink);
	}

	public void show108ItemLinkUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLink);
	}

	public void nextPaginationUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonUp);
	}

	public void prevPaginationButtonUp() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonUp);
	}

	public void backToTopClick() {
		WebDriverUtils.scrolltoElement(driver, backToTopButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, backToTopButton);
	}

	public void show36ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show36ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLink);
	}

	public void show72ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show72ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLink);
	}

	public void show108ItemLinkDown() {
		WebDriverUtils.scrolltoElement(driver, show108ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkDown);
	}
	
	public void nextPaginationDown() {
		WebDriverUtils.scrollElementToPosition(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonDown);
	}

	public void prevPaginationButtonDown() {
		WebDriverUtils.scrollElementToPosition(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonDown);
	}


	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
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
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
		return new WomenClothingPage(driver);
	}

	public WomenAccessoriesPage returnWomenAccessoriesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccesoriesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}

	public WomenFeaturedPage returnWomenFeaturedCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedText));
		return new WomenFeaturedPage(driver);
	}
	
	public HeritageProductPage returnHeritageProduct() {
		WebDriverUtils.clickOnElementWithWait(driver, heritageProductLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(heritaheProductText));
		return new HeritageProductPage(driver);
		
	}
}
