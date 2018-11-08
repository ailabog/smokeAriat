package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

/**
 * Links page Order details page with My orders
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class OrderDetailsPage extends BasePage {

	private By returnToMyOrdersLink = By.xpath("//a[text()='Return to My Orders']");
	private By myOrdersText = By.xpath("//*contains[text(),'My orders']");
	private By createReturnButton = By.xpath("//*[@id=\"newreturn\"]/button");

	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public MyOrdersPage returnMyOrdersPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, returnToMyOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myOrdersText));
		return new MyOrdersPage(driver);
	}
	
	public ReturnItemsPage returnReturnItemsPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, createReturnButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myOrdersText));
		return new ReturnItemsPage(driver);
	}

}
