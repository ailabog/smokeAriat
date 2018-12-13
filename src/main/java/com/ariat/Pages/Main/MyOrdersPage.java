package com.ariat.Pages.Main;

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
	private By returnsText = By.xpath("//*contains[text(),'Returns']");

	protected MyOrdersPage(WebDriver driver) {
		super(driver);
	}

	public OrderDetailsPage returnOrderDetailsPage() {
		WebDriverUtils.clickOnElementWithWait(driver, orderDetailsLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(orderDetailsText));
		return new OrderDetailsPage(driver);
	}

	public ReturnPolicyPage returnReturnPolicyPage() {
		WebDriverUtils.clickOnElementWithWait(driver, returnPolicyLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(returnsText));
		return new ReturnPolicyPage(driver);
	}

}
