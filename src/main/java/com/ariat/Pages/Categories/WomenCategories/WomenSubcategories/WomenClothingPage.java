package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingBreechesAndTightsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingOuterwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingShowPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Clothing Category Page and return methods for
 * Women Clothing Outerwear Page
 * Women Clothing Sweat Tshirt And Woodies Page
 * Women Clothing Tops And Tshirts Page
 * Women Clothing Show Page
 * Women Clothing Breeches And Tights Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenClothingPage extends BasePage{
	
	private By womenClothingOuterwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/ul/li[1]/a");
	private By womenClothingOuterwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By womenClothingSweatTshirtAndWoodiesCatagory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/ul/li[2]/a");
    private By womenClothingSweatTshirtAndWoodiesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenClothingTopsAndTshirtsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/ul/li[3]/a");
	private By womenClothingTopsAndTshirtsText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenClothingShowCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/ul/li[4]/a");
	private By womenClothingShowText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenClothingBreechesAndTightsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[2]/li/ul/li[5]/a");
	private By womenClothingBreechesAndTightsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	
	 
	public WomenClothingPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WomenClothingOuterwearPage returnWomenClothingOuterwearCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingOuterwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingOuterwearText));
		return new WomenClothingOuterwearPage(driver);
	}
	
	public WomenClothingSweatTshirtAndWoodiesPage returnWomenClothingSweatTshirtAndWoodiesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingSweatTshirtAndWoodiesCatagory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingSweatTshirtAndWoodiesText));
		return new WomenClothingSweatTshirtAndWoodiesPage(driver);
	}
	
	public WomenClothingTopsAndTshirtsPage returnWomenClothingTopsAndTshirtsCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingTopsAndTshirtsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingTopsAndTshirtsText));
		return new WomenClothingTopsAndTshirtsPage(driver);
	}
	
	public WomenClothingShowPage returnWomenClothingShowCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingShowCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingShowText));
		return new WomenClothingShowPage(driver);
	}
	
	public WomenClothingBreechesAndTightsPage returnWomenClothingBreechesAndTightsCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenClothingBreechesAndTightsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenClothingBreechesAndTightsText));
		return new WomenClothingBreechesAndTightsPage(driver);
	}
}
