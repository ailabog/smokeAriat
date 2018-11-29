package com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearCountrySubcategories.WomenFootwearCountryFashionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearCountrySubcategories.WomenFootwearCountryRubberPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearCountrySubcategories.WomenFootwearCountryToolBootsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearCountrySubcategories.WomenFootwearCountryWalkingPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Footwear Country Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenFootwearCountryPage extends BasePage{
	
	private By tallBootsFootwearCountryCategoryleftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By walkingFootwearCountryCategoryleftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
	private By outdoorFootwearCountryCategoryleftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
	private By rubberFootwearCountryCategoryleftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
	
	private By tallBootsFootwearCountryText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By rubberFootwearCountryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By outdoorFootwearCountryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By walkingFootwearCountryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");

	public WomenFootwearCountryPage(WebDriver driver) {
		super(driver);
	}
	
	public WomenFootwearCountryFashionPage returnWomenFootwearCountryFashionCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, outdoorFootwearCountryCategoryleftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(outdoorFootwearCountryText));
		return new WomenFootwearCountryFashionPage(driver);
	}
	
	public WomenFootwearCountryRubberPage returnWomenFootwearCountryRubberCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, rubberFootwearCountryCategoryleftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(rubberFootwearCountryText));
		return new WomenFootwearCountryRubberPage(driver);
	}
	
	public WomenFootwearCountryToolBootsPage returnWomenFootwearCountryTallBootsCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, tallBootsFootwearCountryCategoryleftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(tallBootsFootwearCountryText));
		return new WomenFootwearCountryToolBootsPage(driver);
	}
	
	public WomenFootwearCountryWalkingPage returnWomenFootwearCountryWalkingCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, walkingFootwearCountryCategoryleftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(walkingFootwearCountryText));
		return new WomenFootwearCountryWalkingPage(driver);
	}
}
