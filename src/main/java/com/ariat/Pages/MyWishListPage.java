package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Contain locators, methods Wish List page and links to page:
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyWishListPage extends BasePage{
	
	private static final Logger logger = LoggerFactory.getLogger(MyWishListPage.class);
	
	private By sendToAFriendButton = By.id("send-to-friend");
	private By emailFriendTextBox = By.id("dwfrm_sendtofriend_friendsemail");
	private By shareEmailListButton = By.name("dwfrm_sendtofriend_send");
	private By closeSendFriendButton = By.xpath("//*[@id=\"ext-gen44\"]/body/div[7]/div[1]/a/span");
	private By startShoppingButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div/a");
	private By ukLocation = By.xpath("//img[contains(@src, 'GB.gif')]");
	private By usLocation = By.xpath("//img[contains(@src, 'US.gif')]");

	protected MyWishListPage(WebDriver driver) {
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

}
