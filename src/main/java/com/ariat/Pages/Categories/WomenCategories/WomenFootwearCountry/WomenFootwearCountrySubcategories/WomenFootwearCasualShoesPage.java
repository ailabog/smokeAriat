package com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.WomenCategories.WomenFashionSubcategory.WomenFashionSneakersPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Footwear CasualShoes Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenFootwearCasualShoesPage extends BasePage{
	
	private By sneakersFootwearCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li/a");
	private By sneakersFootwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By casualLeftCategory = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
	private By casualText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/h1");

	public WomenFootwearCasualShoesPage(WebDriver driver) {
		super(driver);
		
	}
	
	public WomenFashionSneakersPage returnWomenFashionSneakersCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, sneakersFootwearCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(sneakersFootwearText));
		return new WomenFashionSneakersPage(driver);
	}
	
	
	public WomenFootwearCasualShoesPage returnWomenFootwearCasualShoesPageCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, casualLeftCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(casualText));
		return new WomenFootwearCasualShoesPage(driver);
	}

}
