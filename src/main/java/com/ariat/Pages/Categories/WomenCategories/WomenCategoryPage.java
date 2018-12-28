package com.ariat.Pages.Categories.WomenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories.WomenFootwearRidingPage;
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

	private By womenFootwearCategory = By.xpath("//a[contains(text(),'Women')]");
	private By womenFootwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenClothingCategory = By.xpath("//a[contains(text(),'Clothing')]");

	private By womenClothingText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccesoriesCategory = By.xpath("//a[contains(text(),'Accessories')]");
	private By womenAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenFeaturedCategory = By.xpath("//a[contains(text(),'Featured')]");
	private By womenFeaturedText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");

	private By footwearCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By clothingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
	private By accessoriesCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
	private By ridingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
	private By countryCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[5]/a");
	private By westernCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[6]/a");
	private By fashionCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[8]/a");
	private By featuredCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[9]/a");
	private By ridingTextLeftNav = By.xpath("//*[contains(text(),'Riding']");
	private By countryTextLeftNav = By.xpath("//*[contains(text(),'Country']");
	private By westernTextLeftNav = By.xpath("//*[contains(text(),'Western']");
	private By fashionTextLeftNav = By.xpath("//*[contains(text(),'Fashion']");
	private By featuredTextLeftNav = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/h1");
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By womenText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By sortDropWomenCategoryUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/h3/p[1]/span");
	private By show36ItemLink = By.xpath("//a[text()='36 Items']");
	private By show72ItemLink = By.xpath("//a[text()='72 Items']");
	private By show72ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[4]/div[3]/ul/li[2]/a");
	private By show108ItemLink = By.xpath("//a[text()='108 Items']");
	private By show108ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[4]/div[3]/ul/li[3]/a");
	private By nextPaginationButtonUp = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[5]/ul/li[3]/a");
	private By prevPaginationButtonUp = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[1]/div[5]/ul/li[1]/a/span");
	private By backToTopButton = By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/a");
	private By sortDropWomenCategoryDown = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[1]/h3/p[1]/span");
	private By nextPaginationButtonDown = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[2]/div[4]/div[4]/ul/li[4]/a");
	private By prevPaginationButtonDown = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[4]/ul/li[7]/a");
		private By show36ItemLinkDown = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/div[4]/div[3]/ul/li[1]/a");
	private By heritageProductLink = By.xpath("//img[@title='Heritage II Ellipse Tall Riding Boot']");

	private By heritaheProductText = By.xpath("//*contains[text(),'Heritage II Ellipse Tall Riding Boot']");
	private By recommendedLink = By.linkText("Recommended");
	private By priceHighToLowLink = By.linkText("Price (High to Low)");
	private By priceLowToHighLink = By.linkText("Price (Low to High)");
	private By bestSellersLink = By.linkText("Best Sellers");
	private By leftnavClothing = By.linkText("Clothing");

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
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void sortProductWomenCategoryBestSellers() {
		WebDriverUtils.clickOnElementWithWait(driver, bestSellersLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void show36ItemsUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void show72ItemsUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void show108ItemLinkUp() {
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void nextPaginationUp() {
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void prevPaginationButtonUp() {
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonUp);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void backToTopClick() {
		WebDriverUtils.scrolltoElement(driver, backToTopButton);
		WebDriverUtils.clickOnElementWithWait(driver, backToTopButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void show36ItemsDown() {
		WebDriverUtils.scrolltoElement(driver, show36ItemLink);
		WebDriverUtils.clickOnElementWithWait(driver, show36ItemLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void show72ItemsDown() {
		WebDriverUtils.clickOnElementWithWait(driver, show72ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void show108ItemLinkDown() {
		WebDriverUtils.scrolltoElement(driver, show108ItemLink);
		WebDriverUtils.clickOnElementWithWait(driver, show108ItemLinkDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void nextPaginationDown() {
		WebDriverUtils.scrollElementToPosition(driver, nextPaginationButtonDown);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public void prevPaginationButtonDown() {
		WebDriverUtils.scrollElementToPosition(driver, prevPaginationButtonDown);
		WebDriverUtils.clickOnElementWithWait(driver, prevPaginationButtonDown);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}

	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenText));
		return new WomenCategoryPage(driver);
	}

//Top navigation
	public WomenFootwearPage returnWomenFootwearPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFootwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
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
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
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

	// Left navigation

	public WomenFootwearPage returnWomenFootwearPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, footwearCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFootwearText));
		return new WomenFootwearPage(driver);
	}

	public WomenClothingPage returnWomenClothingCategoryLeftNavPage() {
		WebDriverUtils.clickOnElementWithWait(driver, leftnavClothing);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
		return new WomenClothingPage(driver);
	}

	public WomenClothingPage returnWomenClothingPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, clothingCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
		return new WomenClothingPage(driver);
	}

	public WomenAccessoriesPage returnMenAccessoriesPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
		return new WomenAccessoriesPage(driver);
	}

	public WomenFootwearRidingPage returnMWomenFootwearRidingPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, ridingCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(ridingTextLeftNav));
		return new WomenFootwearRidingPage(driver);
	}

	public WomenCountryPage returnWomenCountryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, countryCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(countryTextLeftNav));
		return new WomenCountryPage(driver);
	}

	public WomenWesternPage returnWomenWesternPagePageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, westernCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(westernTextLeftNav));
		return new WomenWesternPage(driver);
	}

	public WomenFashionPage returnWomenFashionPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, fashionCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(fashionTextLeftNav));
		return new WomenFashionPage(driver);
	}

	public WomenFeaturedPage returnWomenFeaturedPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, featuredCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(featuredTextLeftNav));
		return new WomenFeaturedPage(driver);
	}
}
