package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

public class VerifyReturnItemsPage extends BasePage{
	
	private By editReturnButton = By.name("dwfrm_returns_verifyreturn_edit");
	private By returnItemsText = By.xpath("//*contains[text(),'Return items']");
	private By confirmContinueButton = By.name("dwfrm_returns_verifyreturn_confirm");
	private By salesConfirmationText = By.xpath("//*contains[text(),'Sales return confirmation']");

	protected VerifyReturnItemsPage(WebDriver driver) {
		super(driver);
		
	}

	public void confirmContinueClick() {
		WebDriverUtils.clickOnElementWithWait(driver, confirmContinueButton);
	}
	
	public void editReturn() {
		WebDriverUtils.clickOnElementWithWait(driver, editReturnButton);
	}
	
		
	public ReturnItemsPage returnReturnItemsPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, editReturnButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(returnItemsText));
		return new ReturnItemsPage(driver);
	}
	
	public SalesReturnConfirmationPage returnSalesReturnConfirmationPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, confirmContinueButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(salesConfirmationText));
		return new SalesReturnConfirmationPage(driver);
	}
	
	
}
