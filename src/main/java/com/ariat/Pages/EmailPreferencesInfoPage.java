package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

/**
 * This contains specific methods and locators for EmailPreferencesInfoPaged
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class EmailPreferencesInfoPage extends BasePage{
	
	private By goBackButton = By.xpath("//*[@id=\"container\"]/div[2]/div/a[1]");
	private By goShoppingButton = By.xpath("//*[@id=\"container\"]/div[2]/div/a[2]");
	private By ariatInsiderTitle = By.xpath("//*[@id=\"container\"]/div[2]/div/div[1]/h2");


	public EmailPreferencesInfoPage(WebDriver driver) {
		super(driver);
	}
	
	public void goBackClick() {
		WebDriverUtils.clickOnElementWithWait(driver, goBackButton);
	}
	
	public void goShoppingClick() {
		WebDriverUtils.clickOnElementWithWait(driver, goShoppingButton);
	}
	
	public EmailPreferencePage returnEmailPreferencePage() {
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(ariatInsiderTitle));
	return new EmailPreferencePage(driver);
	}

}
