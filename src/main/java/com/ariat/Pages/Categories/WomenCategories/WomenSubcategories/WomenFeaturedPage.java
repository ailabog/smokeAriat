package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedHeritageCollectionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedTriFactorBreechPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedWarmWeatherRidingPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Featured Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenFeaturedPage extends BasePage{
	
	private By womenFeaturedTriFactorBreechCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[8]/li/ul/li[1]/a");
	private By womenFeaturedTriFactorBreechText = By.xpath("");
	private By womenFeaturedHeritageCollectionCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[8]/li/ul/li[2]/a");
	private By womenFeaturedHeritageCollectionText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenWarmWeatherRidingCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[8]/li/ul/li[3]/a");
	private By womenWarmWeatherRidingCategoryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	 
		
	public void womenCategory() {
		WebDriverUtils.moveToElement(driver, womenCategory);
	}

	public WomenFeaturedPage(WebDriver driver) {
		super(driver);
	}
	
	public WomenFeaturedTriFactorBreechPage returWomenFeaturedTriFactorBreechPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedTriFactorBreechCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedTriFactorBreechText));
		return new WomenFeaturedTriFactorBreechPage(driver);
	}
	
	public WomenFeaturedHeritageCollectionPage returnWomenFeaturedHeritageCollectionPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenFeaturedHeritageCollectionCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenFeaturedHeritageCollectionText));
		return new WomenFeaturedHeritageCollectionPage(driver);
	}
	
	public WomenFeaturedWarmWeatherRidingPage returnWomenFeaturedWarmWeatherRidingPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenWarmWeatherRidingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenWarmWeatherRidingCategoryText));
		return new WomenFeaturedWarmWeatherRidingPage(driver);
	}
	
}
