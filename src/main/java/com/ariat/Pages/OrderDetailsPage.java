package com.ariat.Pages;

import static org.testng.Assert.assertEquals;
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
	private By backToMyOrdersLink = By.xpath("//*[@id=\"main\"]/div/div[1]/div/a/span[2]");
	private By orderNo = By.xpath("//span[@value='10002432']");
	private By date = By.xpath("//span[@value='30 Oct 2018']");
	private By status = By.xpath("//span[text()='Not Shipped']");
	private By total = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[1]/div/div/div/div[4]/div/table/tbody/tr[4]/td[2]");

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
	
	public MyOrdersPage returnMyOrdersBackFromOrderDetailsPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, backToMyOrdersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myOrdersText));
		return new MyOrdersPage(driver);
	}
	
	
	public void assertInfoOrderDetails(String expectedOrderNo, String expectedDate, String expectedStatus, String expectedTotal) {
		String orderNoLabel = WebDriverUtils.getElementText(driver, orderNo);
		assertEquals(expectedOrderNo, orderNoLabel, "Order no is as expected");
		
		String dateNoLabel = WebDriverUtils.getElementText(driver, date);
		assertEquals(expectedDate, dateNoLabel, "Date is as expected");
		
		String statusLabel = WebDriverUtils.getElementText(driver, status);
		assertEquals(expectedStatus, statusLabel, "Status is as expected");
		
		String totalLabel = WebDriverUtils.getElementText(driver, total);
		assertEquals(expectedTotal, totalLabel, "Total is as expected");
	}
}
