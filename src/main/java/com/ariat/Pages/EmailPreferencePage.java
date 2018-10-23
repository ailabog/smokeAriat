package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * This page contains methods for preferences in email and links to
 * EmailPreferencesInfo
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class EmailPreferencePage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(EmailPreferencePage.class);

	private By savePreferencesButton = By.name("ctl00$cphContent$submitButton");
	private By unsubscribeTextBox = By.id("ctl00_cphContent_txtUnsubEmail");
	private By unsubscribeMeButton = By.id("ctl00_cphContent_unsubscribeButton");
	private By goBackButton = By.xpath("//*[@id=\"container\"]/div[2]/div/a[1]");
	private By goShoppingButton = By.xpath("//*[@id=\"container\"]/div[2]/div/a[2]");

	private By femaleCheck = By.id("female");
	private By maleCheck = By.name("Male");
	private By westernCheck = By.name("Western");
	private By englishCheck = By.name("English");
	private By neitherCheck = By.name("Neither");
	private By footWearCheck = By.name("Footwear");
	private By apparelCheck = By.name("Apparel");
	private By accessoriesCheck = By.name("Accessories");
	private By saveEditsButton = By.xpath("//a[text()='Save edits']");

	protected EmailPreferencePage(WebDriver driver) {
		super(driver);
	}

	public void checkFemale() {
		WebDriverUtils.clickOnElementWithWait(driver, femaleCheck);
	}

	public void checkMale() {
		WebDriverUtils.clickOnElementWithWait(driver, maleCheck);
	}

	public void checkWestern() {
		WebDriverUtils.clickOnElementWithWait(driver, westernCheck);
	}

	public void checkEnglish() {
		WebDriverUtils.clickOnElementWithWait(driver, englishCheck);
	}

	public void checkNeither() {
		WebDriverUtils.clickOnElementWithWait(driver, neitherCheck);
	}

	public void checkFootWear() {
		WebDriverUtils.clickOnElementWithWait(driver, footWearCheck);
	}

	public void checkApparel() {
		WebDriverUtils.clickOnElementWithWait(driver, apparelCheck);
	}

	public void checkAccessoriesCheck() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesCheck);
	}

	public void saveEditsClick() {
		WebDriverUtils.clickOnElementWithWait(driver, saveEditsButton);
		logger.info("Changes were saved");
	}

	public void savePreferencesClick() {
		WebDriverUtils.clickOnElementWithWait(driver, savePreferencesButton);
	}

	public void unsubscribe(String email) {
		logger.info("I am unsubscribing from Ariat email list:");
		WebDriverUtils.enterTextBox(driver, unsubscribeTextBox, email);
	}

	public void unsubscribeClick() {
		WebDriverUtils.clickOnElement(driver, unsubscribeMeButton);
	}

	public EmailPreferencesInfoPage returnEmailPreferencesInfoPage() {
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(goBackButton));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(goShoppingButton));
		return new EmailPreferencesInfoPage(driver);

	}

}
