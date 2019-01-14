package com.ariat.Pages.Products;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Main.BasePage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Utils.WebDriverUtils;

import Interfaces.ProductAttributes;

/**
 * Implements Product attributes methods for Gloves Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class GlovesProductPage extends BasePage{
	
	By selectSize = By.id("va-size");
	By addToBasket = By.cssSelector("#add-to-cart");
	By bonusDialog = By.id("bonus-choose-container product-content");
	
	public GlovesProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectAttributeSize(String size) {
		WebDriverUtils.selectVisibleText(driver, selectSize, size);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public MyBagPage returnMyBagPage() {
		WebDriverUtils.scrollLittDown(driver, addToBasket);
		WebDriverUtils.clickOnElementWithWait(driver, addToBasket);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(bonusDialog));
		return new MyBagPage(driver);
	}
}
