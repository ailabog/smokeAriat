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

	//private By proGripGloveProduct = By.xpath("//img[contains(@title, 'Insulated Pro Grip')]");
	private By proGripGloveProduct = By.cssSelector("#\\36 443f3fa79844ccecd49e2138b .psd-4-full-width-video-module-1__image");
	//private By proGripGloveProduct = By.cssSelector("#\\33 32482af8202e6efe14800a649 .psd-4-full-width-video-module-1__image");
	//xpath=//img[@alt='Insulated Pro Grip']
	private By proGripText = By.xpath("//*contains[text()='Pro Grip']");

	public WomenAccessoriesGlovesPage(WebDriver driver) {
		super(driver);
	}

	public GlovesProductPage returnGlovesProductPagePage() {
		WebDriverUtils.scroll750Down(driver, proGripGloveProduct);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_1_MINUTE);
		WebDriverUtils.clickOnElementWithWait(driver, proGripGloveProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(proGripText));
		return new GlovesProductPage(driver);
	}
}
