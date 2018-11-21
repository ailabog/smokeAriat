package com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearWesternSubcategories.WomenFootwearWesternFashionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearWesternSubcategories.WomenFootwearWesternPerformancePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Footwear Western Category Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenFootwearWesternPage extends BasePage {

	private By performanceFootwearWesternText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By fashionFootwearWesternText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");

	private By performanceFootwearWesternCategoryLeftNav = By
			.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By fashionFootwearWesternCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");

	public WomenFootwearWesternPage(WebDriver driver) {
		super(driver);

	}

	public WomenFootwearWesternPerformancePage returnWomenFootwearWesternPerformanceCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, performanceFootwearWesternCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(performanceFootwearWesternText));
		return new WomenFootwearWesternPerformancePage(driver);
	}

	public WomenFootwearWesternFashionPage returnWomenFootwearWesternFashionCategoryLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, fashionFootwearWesternCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(fashionFootwearWesternText));
		return new WomenFootwearWesternFashionPage(driver);
	}
}
