package com.ariat.Pages.Categories.MenCategories.MenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesBagsPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesSocksPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Men Accessories Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenAccessoriesPage extends BasePage{
	
	private By menAccessoriesHeadwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/ul/li[1]/a");
	private By menAccessoriesHeadwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesGlovesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/ul/li[3]/a");
	private By menAccessoriesGlovesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesBagsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/ul/li[2]/a");
	private By menAccessoriesBagsText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menAccessoriesSocksCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/ul/li[4]/a");
	private By menAccessoriesSocksText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");

	public MenAccessoriesPage(WebDriver driver) {
		super(driver);
		
	}
	
	public MenAccessoriesHeadwearPage returnMenAccessoriesHeadwearCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesHeadwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesHeadwearText));
		return new MenAccessoriesHeadwearPage(driver);
	}
	
	public MenAccessoriesGlovesPage returnMenAccessoriesGlovesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesGlovesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesGlovesText));
		return new MenAccessoriesGlovesPage(driver);
	}
	
	public MenAccessoriesBagsPage returnMenAccessoriesBagsCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesBagsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesBagsText));
		return new MenAccessoriesBagsPage(driver);
	}
	
	public MenAccessoriesSocksPage returnMenAccessoriesSocksCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccessoriesSocksCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesSocksText));
		return new MenAccessoriesSocksPage(driver);
	}

}
