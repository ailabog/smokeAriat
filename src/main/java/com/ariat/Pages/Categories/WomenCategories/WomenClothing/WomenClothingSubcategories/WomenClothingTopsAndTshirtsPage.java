package com.ariat.Pages.Categories.WomenCategories.WomenClothing.WomenClothingSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Products.RebarTopProductPage;
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

	private By topsTshirtProductDE = By.xpath("//img[contains(@title, 'Tri Factor 1/4 Zip Baselayer')]");
	private By topTshirtText = By.xpath("//*contains[text(), 'Tri Factor 1/4 Zip Top']");
	private By topsTshirtProductFR = By.xpath("//img[contains(@title, 'Tri Factor 1/4 Zip Top')]");
	private By rebarTShirt = By.xpath("//img[@alt='Rebar Sunstopper Top']");
	private By rebarTShirtText = By.xpath("//*contains[text(), 'Rebar Sunstopper Top']");
	
	public WomenClothingTopsAndTshirtsPage(WebDriver driver) {
		super(driver);
	}

	public TriFactorTopProductPage returnTriFactorTopProductPageDE() {
		WebDriverUtils.clickOnElementWithWait(driver, topsTshirtProductDE);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(topTshirtText));
		return new TriFactorTopProductPage(driver);
	}
	
	public TriFactorTopProductPage returnTriFactorTopProductPageFR() {
		WebDriverUtils.clickOnElementWithWait(driver, topsTshirtProductFR);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(topTshirtText));
		return new TriFactorTopProductPage(driver);

	}
	
	public RebarTopProductPage returnRebarToptPage() {
		WebDriverUtils.clickOnElementWithWait(driver, rebarTShirt);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(rebarTShirtText));
		return new RebarTopProductPage(driver);

	}
}
