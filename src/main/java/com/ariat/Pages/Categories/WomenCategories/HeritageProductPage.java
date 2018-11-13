package com.ariat.Pages.Categories.WomenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.MyBagPage;
import com.ariat.Pages.MyWishListPage;
import com.ariat.Utils.WebDriverUtils;

public class HeritageProductPage extends BasePage {

	private By selectSize = By.xpath("//*[@id=\"va-size-wrapper\"]/span/span[1]/span/span[1]");
	private By selectCalf = By.xpath("//*[@id=\"select2-va-calf-container\"]");
	private By selectHeight = By.xpath("//*[@id=\"select2-va-height-container\"]");
	private By increaseQty = By
			.xpath("//*[@id=\"dwfrm_product_addtocart_d0ogtbkhxbmr\"]/div[1]/div[1]/div/div/span[2]");
	private By decreaseQty = By
			.xpath("//*[@id=\"dwfrm_product_addtocart_d0ogtbkhxbmr\"]/div[1]/div[1]/div/div/span[1]");
	private By addToBasket = By.id("add-to-cart");
	private By productBonusDialog = By.id("bonus-product-dialog");
	private By wishList = By.linkText("Add to WishList");
	private By myWishListText = By.xpath("//*contains[text(), 'Wish list']");
	
	public HeritageProductPage(WebDriver driver) {
		super(driver);

	}

	public void selectAttributes(String size, String calf, String height) {
		WebDriverUtils.selectDropDown(driver, selectSize, size);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.selectDropDown(driver, selectCalf, calf);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.selectDropDown(driver, selectHeight, height);
	}

	public void setQtyIncrease(int n) {
		for (int i = 0; i <= n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, increaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		}
	}
	
	public void setQtyDecrease(int n) {
		for (int i = 0; i <= n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, decreaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		}
	}

	public MyBagPage returnMyBagPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addToBasket);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(productBonusDialog));
		return new MyBagPage(driver);
	}
	
	public MyWishListPage returnMyWishListPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, wishList);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
}
