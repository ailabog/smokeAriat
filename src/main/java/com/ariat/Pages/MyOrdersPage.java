package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

/**
 * Contain locators and methods for My Orders page and links with Order details and Return Policy pages
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyOrdersPage extends BasePage {

	private By orderDetailsLink = By.xpath("//*[@id=\"order-items\"]/div[1]/div[3]/a");
	private By returnPolicyLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/a");
	private By orderDetailsText = By.xpath("//*[contains[text(),'Order Details']");
	private By returnsPolicyText = By.xpath("//*contains[text(),'Returns']");

	protected MyOrdersPage(WebDriver driver) {
		super(driver);
	}

	public OrderDetailsPage returnOrderDetailsPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, orderDetailsLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(orderDetailsText));
		return new OrderDetailsPage(driver);
	}

	public ReturnPolicyPage returnReturnPolicyPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, returnPolicyLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(returnsPolicyText));
		return new ReturnPolicyPage(driver);
	}

}
