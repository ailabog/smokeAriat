package com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.BagsProductPage;
import com.ariat.Utils.WebDriverUtils;


/**
 * Implements Women Accessories Bags Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenAccessoriesBagsPage extends BasePage{
	
	private By garmentBagProduct = By.xpath("//img[@class='psd-4-full-width-video-module-1__image ms-image-responsive ms-full-width lazyloaded' and @title='Ring Backpack']");
	private By garmentText = By.xpath("//*contains[text()='Garment Bag']");
	
	public WomenAccessoriesBagsPage(WebDriver driver) {
		super(driver);
	}
	
	public BagsProductPage returnBagsProductPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, garmentBagProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(garmentText));
		return new BagsProductPage(driver);
	}
}
