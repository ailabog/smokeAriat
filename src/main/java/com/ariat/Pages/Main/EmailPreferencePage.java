package com.ariat.Pages.Main;

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
	private By emailTxtBox = By.name("ctl00_cphContent_txtEmail");
	private By confirmEmailTxtBox = By.id("ctl00_cphContent_txtConfirmEmail");
	private By fNameTxtBox = By.id("ctl00_cphContent_firstname");
	private By lNameTxtBox = By.id("ctl00_cphContent_lastname");
	private By genderCheck = By.id("ctl00_cphContent_Female");
	private By monthSelect = By.id("ctl00_cphContent_ddlBMonth");
	private By daySelect = By.id("ctl00_cphContent_ddlBDay");
	private By yearSelect = By.id("ctl00_cphContent_ddlBYear");
	private By saveprefBtn = By.xpath("//input[@value='SAVE PREFERENCES']");

	public EmailPreferencePage(WebDriver driver) {
		super(driver);
	}
	
	public void checkGender(String option) {
		switch(option) {
		case "Male":
			WebDriverUtils.clickOnElementWithWait(driver, maleCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		break;
		case "Female":
			WebDriverUtils.clickOnElementWithWait(driver, femaleCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		break;
		case "Other":
			WebDriverUtils.clickOnElementWithWait(driver, otherCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		default:
			logger.info("No option found");
		}		
	}
	
	public void ariatProductsCheck(String option) {
		switch(option) {
		case "English":
			WebDriverUtils.clickOnElementWithWait(driver, englishCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		break;	
		case "Country":
			WebDriverUtils.clickOnElementWithWait(driver, countryCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		break;	
		case "Apparel":
			WebDriverUtils.clickOnElementWithWait(driver, apparelCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		break;	
		case "Western":
			WebDriverUtils.clickOnElementWithWait(driver, westernCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		case "Work":
			WebDriverUtils.clickOnElementWithWait(driver, workCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
			
		case "Fashion":
			WebDriverUtils.clickOnElementWithWait(driver, fashionCheck);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		default:
			logger.info("No option found");
		}			
	}
	
	public void enterEmail(String emailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, emailTxtBox, emailValue);
	}
	
	public void enterConfirmEmail(String confirmEmailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, confirmEmailTxtBox, confirmEmailValue);
	}
	
	public void enterFName(String fName) {
		logger.info("Entering First name..");
		WebDriverUtils.enterTextBox(driver, fNameTxtBox, fName);
	}
	
	public void enterLName(String lName) {
		logger.info("Entering Last name..");
		WebDriverUtils.enterTextBox(driver, lNameTxtBox, lName);
	}

	public void checkGenderFemale() {
		WebDriverUtils.clickOnElementWithWait(driver, genderCheck);
	}
	
	public void selectBirthData(String monthValue, String dayValue, String yearValue) {
		logger.info("Selecting month of birth..");
		WebDriverUtils.selectVisibleText(driver, monthSelect, monthValue);
		logger.info("Selecting day of birth..");
		WebDriverUtils.selectVisibleText(driver, daySelect, dayValue);
		logger.info("Selecting year of birth..");
		WebDriverUtils.selectVisibleText(driver, yearSelect, yearValue);
	}
	
	public void savePrefUS() {
		logger.info("Saving email preferences..");
		WebDriverUtils.clickOnElementWithWait(driver, saveprefBtn);
	}
	
	
	public void saveEditsClick() {
		WebDriverUtils.clickOnElementWithWait(driver, saveEditsButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Changes were saved");
	}

	public void savePreferencesClick() {
		WebDriverUtils.clickOnElementWithWait(driver, savePreferencesButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public MyAccountPage returnMyAccountPage() {
		WebDriverUtils.clickOnElementWithWait(driver, saveEditsButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountText));
		return new MyAccountPage(driver);
	}
}
