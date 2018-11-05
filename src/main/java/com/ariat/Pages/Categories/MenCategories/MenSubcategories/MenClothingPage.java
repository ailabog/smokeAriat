package com.ariat.Pages.Categories.MenCategories.MenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingBreechesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingOuterwearPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingTopsAndTshirtsPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Clothing Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenClothingPage extends BasePage{
	
	private By menClothingOuterwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/ul/li[1]/a");
	private By menClothingOuterwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By menClothingSweatTshirtAndWoodiesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/ul/li[2]/a");
    private By menClothingSweatTshirtAndWoodiesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By menClothingTopsAndTshirtsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/ul/li[3]/a");
	private By menClothingTopsAndTshirtsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By menClothingBreechesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/ul/li[4]/a");
	
	

	public MenClothingPage(WebDriver driver) {
		super(driver);
		
	}
	
	public MenClothingOuterwearPage returnMenClothingOuterwearCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingOuterwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingOuterwearText));
		return new MenClothingOuterwearPage(driver);
	}
	
	public MenClothingSweatTshirtAndWoodiesPage returnMenClothingSweatTshirtAndWoodiesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingSweatTshirtAndWoodiesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingSweatTshirtAndWoodiesText));
		return new MenClothingSweatTshirtAndWoodiesPage(driver);
	}
	
	public MenClothingTopsAndTshirtsPage returnMenClothingTopsAndTshirtsCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingTopsAndTshirtsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingTopsAndTshirtsText));
		return new MenClothingTopsAndTshirtsPage(driver);
	}
	
	public MenClothingBreechesPage returnMenClothingBreechesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingBreechesCategory);
		return new MenClothingBreechesPage(driver);
	}

}
