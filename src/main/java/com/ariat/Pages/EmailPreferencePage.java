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
	private By femaleCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[5]/div/div/div[2]/span");
	private By maleCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[5]/div/div/div[1]/span");
	private By countryCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[1]/div[2]/span");
	private By workCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[2]/div[2]/span");
	private By westernCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[2]/div[1]/span");
	private By englishCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[1]/div[1]/span");
	private By fashionCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[2]/div[3]/span");
	private By otherCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[5]/div/div/div[3]/span");
	
	private By apparelCheck = By.xpath("//*[@id=\"RegistrationForm\"]/div[1]/div[9]/div[1]/div[3]/span");
	private By saveEditsButton = By.name("dwfrm_profile_confirm");
	private By myAccountText = By.xpath("//*[contains(text(), 'My account']");

	protected EmailPreferencePage(WebDriver driver) {
		super(driver);
	}
	
	public void checkGender(String option) {
		switch(option) {
		case "Male":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, maleCheck);
		break;
		case "Female":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, femaleCheck);
		break;
		case "Other":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, otherCheck);
		default:
			logger.info("No option found");
		}		
	}
	
	public void ariatProductsCheck(String option) {
		
		switch(option) {
		
		case "English":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, englishCheck);
		break;	
		case "Country":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, countryCheck);
		break;	
		case "Apparel":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, apparelCheck);
		break;	
		case "Western":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, westernCheck);
		case "Work":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, workCheck);
			
		case "Fashion":
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, fashionCheck);
		default:
			logger.info("No option found");
		}			
	}


	public void saveEditsClick() {
		WebDriverUtils.clickOnElementWithWait(driver, saveEditsButton);
		logger.info("Changes were saved");
	}

	public void savePreferencesClick() {
		WebDriverUtils.clickOnElementWithWait(driver, savePreferencesButton);
	}

	public MyAccountPage returnMyAccountPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, saveEditsButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountText));
		return new MyAccountPage(driver);
	}

	
}
