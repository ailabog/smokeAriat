package com.ariat.Pages.Categories.MenCategories.MenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements returns methods to pages: 
 * Men Category Page
 * Men Footwear Page
 * Men Clothing Page
 * Men Accessories Page
 * Men Featured Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenCategoryPage extends BasePage{
	
	private By menFootwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/a");

	private By menFootwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menClothingCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/a");
	private By menClothingText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    private By menAccesoriesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/a");
    private By menAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By menFeaturedCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[9]/li/a");
    private By menFeaturedText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    
    private By menCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/a");
    private By menText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    
	public MenCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	public void menCategory() {
		WebDriverUtils.moveToElement(driver, menCategory);
	}

	
	public MenCategoryPage returnMenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menText));
		return new MenCategoryPage(driver);
	}
	
	public MenFootwearPage returnMenFootwearPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearText));
		return new MenFootwearPage(driver);
	}
	
	public MenClothingPage returnMenClothingCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingText));
		return new MenClothingPage(driver);
	}
	
	public MenAccessoriesPage returnMenAccessoriesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccesoriesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesText));
		return new MenAccessoriesPage(driver);
	}
	
	public MenFeaturedPage returnMenFeaturedCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFeaturedCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFeaturedText));
		return new MenFeaturedPage(driver);
	}

} 
