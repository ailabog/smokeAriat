package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

public class MyBagPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(MyBagPage.class);

	private By cancelFreeGift = By.xpath("//*[@id=\"dwfrm_product_addtocart_d0iaabgptmzz\"]/button[1]");
	private By confirmFreeGift = By.xpath("//button[@value='Select']");
	private By miniCart = By.xpath("//*[@id=\"mini-cart\"]/div[2]/a/span");
	private By MyBagText = By.xpath("//*contains[text(),'My Bag']");
	private By productAdded = By.xpath("//img[@title='Heritage II Ellipse Tall Riding Boot']");
	private By freeGiftSocks = By.xpath("//img[@title='AriatTEK Performance Socks']");
	private By checkoutButton = By.xpath("//a[text()='Checkout']");
	private By continueShoppingButton = By.xpath("//a[text()='Continue shopping']");

	public MyBagPage(WebDriver driver) {
		super(driver);
	}

	public void cancelFreeGift() {
		WebDriverUtils.clickOnElementWithWait(driver, cancelFreeGift);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public void confirmFreeGift() {
		WebDriverUtils.clickOnElementWithWait(driver, confirmFreeGift);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkMyBagFreeGift() {
		WebDriverUtils.moveToElement(driver, miniCart);
		if (WebDriverUtils.findElement(driver, MyBagText) != null
				&& (WebDriverUtils.findElement(driver, productAdded) != null
						&& WebDriverUtils.findElement(driver, freeGiftSocks) != null
						&& WebDriverUtils.findElement(driver, checkoutButton) != null
						&& WebDriverUtils.findElement(driver, continueShoppingButton) != null)) {
			logger.info("My bag contains the right elements");
		} else {
			logger.info("My bag does not contain the right elements");
		}
	}

	public void checkMyBagNoFreeGift() {
		WebDriverUtils.moveToElement(driver, miniCart);
		if (WebDriverUtils.findElement(driver, MyBagText) != null
				&& (WebDriverUtils.findElement(driver, productAdded) != null
						&& WebDriverUtils.findElement(driver, checkoutButton) != null
						&& WebDriverUtils.findElement(driver, continueShoppingButton) != null)) {
			logger.info("My bag contains the right elements");
		} else {
			logger.info("My bag does not contain the right elements");
		}
	}
}
