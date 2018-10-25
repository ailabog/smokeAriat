package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

/**
 * links with Add a credit card page
 * @author aila.bogasieru@ariat.com
 *
 */

public class PaymentInformationPage extends BasePage{
	
	private By addACreditCardButton = By.xpath("//a[text()='Add a credit card']");
	private By addAcReditCardText = By.xpath("//*contains[text(), 'Add a credit card']");

	protected PaymentInformationPage(WebDriver driver) {
		super(driver);
    }
	
	public AddACreditCardPage returnAddACreditCardPage() {
		
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addACreditCardButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addAcReditCardText));
		return new AddACreditCardPage(driver);
	}
}
