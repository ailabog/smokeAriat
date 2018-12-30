package com.ariat.Pages.Categories.WomenCategories.WomenAccessories.WomenAccessoriesSubcategories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;


/**
 * Implements Women Accessories Bags Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenAccessoriesBagsPage extends BasePage{
	
	private By garmentBagProduct = By.xpath("//*[@id=\"6637647889b5b1522cd5df99b6\"]/div[1]/a/picture/img");
	private By garmentText = By.xpath("//*contains[text()='Garment Bag']");
	
	public WomenAccessoriesBagsPage(WebDriver driver) {
		super(driver);
	}
	
	public BagsProductPage returnBagsProductPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, garmentBagProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(garmentText));
		return new BagsProductPage(driver);
	}
}
