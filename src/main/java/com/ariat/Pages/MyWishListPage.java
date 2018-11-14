package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * Contain locators, methods Wish List page and links to page:
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyWishListPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(MyWishListPage.class);

	private By sendToAFriendButton = By.id("send-to-friend");
	private By emailFriendTextBox = By.id("dwfrm_sendtofriend_friendsemail");
	private By shareEmailListButton = By.name("dwfrm_sendtofriend_send");
	private By closeSendFriendButton = By.xpath("//*[@id=\"ext-gen44\"]/body/div[7]/div[1]/a/span");
	private By startShoppingButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div/a");
	private By ukLocation = By.xpath("//img[contains(@src, 'GB.gif')]");
	private By usLocation = By.xpath("//img[contains(@src, 'US.gif')]");
	private By increaseQty = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[1]/div[5]/form/div[3]/div[1]/div/div/span[2]");
	private By decreaseQty = By
			.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[1]/div[5]/form/div[3]/div[1]/div/div/span[1]");
	private By prioritySelect = By.id("dwfrm_wishlist_items_i0_priority");
	private By updateItemWishList = By.name("dwfrm_wishlist_items_i0_updateItem");
	private By removeItemWishList = By.name("dwfrm_wishlist_items_i0_deleteItem");
	private By editItemWishList = By.name("701e2dd5bba4a3b17470d0c755");
	private By addToCartWishList = By.name("dwfrm_wishlist_items_i0_addItemToCart");
	private By shareIcon = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div/div[5]/form/div[2]/a/span");

	public MyWishListPage(WebDriver driver) {
		super(driver);
	}

	public void sendListToAFriend(String email) {
		logger.info("Sending my wish list to a friend");
		WebDriverUtils.clickOnElementWithWait(driver, sendToAFriendButton);
		WebDriverUtils.enterTextBox(driver, emailFriendTextBox, email);
		WebDriverUtils.clickOnElementWithWait(driver, shareEmailListButton);
	}

	public void closeSendToAFriend() {
		logger.info("Closing the sharing wish list with a friend window");
		WebDriverUtils.clickOnElement(driver, closeSendFriendButton);
	}

	public HomePage returnHomePage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, startShoppingButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(ukLocation));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(usLocation));
		return new HomePage(driver);
	}

	public void increaseQtyWishList(int n) {
		for (int i = 0; i < n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, increaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		}
	}

	public void decreaseQtyWishList(int n) {
		for (int i = 0; i < n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, decreaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		}
	}

	public void setPriorityWishList(String priority) {
		WebDriverUtils.selectDropDown(driver, prioritySelect, priority);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}

	public void updateItemWishList() {
		WebDriverUtils.clickOnElementWithWait(driver, updateItemWishList);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}

	public void removeItemWishList() {
		WebDriverUtils.clickOnElementWithWait(driver, removeItemWishList);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}

	public void editItemWishList() {
		WebDriverUtils.clickOnElementWithWait(driver, editItemWishList);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}

	public void addToCartItemWishList() {
		WebDriverUtils.clickOnElementWithWait(driver, addToCartWishList);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
	}
	
	public void shareToAFriend() {
		WebDriverUtils.clickOnElementWithWait(driver, shareIcon);
	}

}
