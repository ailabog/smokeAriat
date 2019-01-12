package com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.GlovesProductPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Accessories Gloves Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenAccessoriesGlovesPage extends BasePage {

	private By proGripGloveProduct = By.xpath("//*[@id=\"332482af8202e6efe14800a649\"]/div[1]/a/picture/img");
	private By proGripText = By.xpath("//*contains[text()='Pro Grip']");

	public WomenAccessoriesGlovesPage(WebDriver driver) {
		super(driver);
	}

	public GlovesProductPage returnGlovesProductPagePage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, proGripGloveProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(proGripText));
		return new GlovesProductPage(driver);
	}
}
