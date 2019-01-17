package com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.TriFactorTopProductPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Clothing Tops And Tshirts Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenClothingTopsAndTshirtsPage extends BasePage {

	private By topsTshirtProduct = By.xpath("//img[contains(@title, 'Tri Factor 1/4 Zip Baselayer')]");
	private By topTshirtText = By.xpath("//*contains[text(), 'Tri Factor 1/4 Zip Baselayer']");

	public WomenClothingTopsAndTshirtsPage(WebDriver driver) {
		super(driver);
	}

	public TriFactorTopProductPage returnTriFactorTopProductPage() {
		WebDriverUtils.clickOnElementWithWait(driver, topsTshirtProduct);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(topTshirtText));
		return new TriFactorTopProductPage(driver);

	}
}
