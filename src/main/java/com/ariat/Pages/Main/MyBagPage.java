package com.ariat.Pages.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

public class MyBagPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(MyBagPage.class);

	private By cancelFreeGift = By.xpath("(//button[@type='button'])[12]");
	private By confirmFreeGift = By.xpath("//button[@value='Select']");
	private By miniCart = By.xpath("//div[@id='header-main-content']/div/div[5]/div/div[2]/a/span");
	//private By miniCart = css=span.icon-cart-2.mini-cart-icon
	private By myBagText = By.xpath("//section[@id='app']/main/div/div/div/div/div/div/div/p");
	private By productAdded = By.xpath("//img[@title='Heritage II Ellipse Tall Riding Boot']");
	private By freeGiftSocks = By.xpath("//img[@title='AriatTEK Performance Socks']");
	private By checkoutButton = By.xpath("//a[text()='Checkout']");
	private By continueShoppingButton = By.xpath("//a[contains(text(),'Continue shopping')]");
	private By bonusDialog = By.id("bonus-product-dialog");
	private By checkoutBtn = By.xpath("//a[contains(text(),'Checkout')]");

	public MyBagPage(WebDriver driver) {
		super(driver);
	}

	public void cancelFreeGift() {
		if(WebDriverUtils.findElement(driver, bonusDialog) !=null){
		WebDriverUtils.clickOnElementWithWait(driver, cancelFreeGift);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		}else {
			logger.info("Dialog not able to be displayed");
		}
	}

	public void confirmFreeGift() {
		if(WebDriverUtils.findElement(driver, bonusDialog) !=null){
		WebDriverUtils.clickOnElementWithWait(driver, confirmFreeGift);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	 }else {
			logger.info("Dialog not able to be displayed");
		}
	}

	public void checkMyBagFreeGift() {
		WebDriverUtils.moveToElement(driver, miniCart);
		if (WebDriverUtils.findElement(driver, myBagText) != null
			&& WebDriverUtils.findElement(driver, checkoutBtn) !=null
			&& WebDriverUtils.findElement(driver, freeGiftSocks) != null
			&& WebDriverUtils.findElement(driver, continueShoppingButton) != null) {
			logger.info("My bag contains the right elements");
		} else {
			logger.info("My bag does not contain the right elements");
		}
	}

	public void checkMyBagNoFreeGift() {
		WebDriverUtils.moveToElement(driver, miniCart);
		if (WebDriverUtils.findElement(driver, myBagText) != null
		 && WebDriverUtils.findElement(driver, checkoutButton) != null
		 && WebDriverUtils.findElement(driver, continueShoppingButton) != null) {
			logger.info("My bag contains the right elements");
		} else {
			logger.info("My bag does not contain the right elements");
		}
	}
}
