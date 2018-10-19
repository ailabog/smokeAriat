package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * This page contains all the elements on Create Account page and its methods:
 * create account, mark options
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class CreateAccountPage extends BasePage {
	
	private static final Logger logger = LoggerFactory.getLogger(CreateAccountPage.class);
	
	private By firstNameTextBox = By.id("dwfrm_profile_customer_firstname");
	private By lastNameTextBox = By.id("dwfrm_profile_customer_lastname");
	private By birthMonth = By.id("dwfrm_profile_customer_customProfile_birthdayMonth");
	private By birthDay = By.id("dwfrm_profile_customer_customProfile_birthdayDay");
	private By birthYear = By.id("dwfrm_profile_customer_customProfile_birthdayYear");
	private By MaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div[5]/div/span[1]/span");
	private By FemaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div[5]/div/span[2]/span");
	private By rideYes = By.xpath("//*[@id=\"RadioRide1\"]");
	private By rideNo = By.xpath("//*[@id=\"RadioRide0\"]");
	private By emailTextBox = By.id("dwfrm_profile_customer_email");
	private By confirmEmailTextBox = By.id("dwfrm_profile_customer_emailconfirm");
	private By passwordTextBox = By.id("dwfrm_profile_login_password");
	private By confirmPasswordTextBox = By.id("dwfrm_profile_login_passwordconfirm");
	private By checkWestern = By.xpath("//*[@id=\"RegistrationForm\"]/div[12]/div[2]/div[1]/span");
	private By checkWork = By.xpath("//*[@id=\"RegistrationForm\"]/div[12]/div[1]/div[2]/span");
	private By checkFashion = By.xpath("//*[@id=\"RegistrationForm\"]/div[12]/div[1]/div[3]/span");
	private By checkEnglish = By.xpath("//*[@id=\"RegistrationForm\"]/div[12]/div[2]/div[1]/span");
	private By checkOutdoor = By.xpath("//*[@id=\"RegistrationForm\"]/div[12]/div[2]/div[2]/span");
	private By checkAddToEmailList = By.xpath("//*[@id=\"RegistrationForm\"]/div[13]/div/span");
	private By createAccountButton = By.name("dwfrm_profile_confirm");

	public static final String FIRST_NAME = "Aila";
	public static final String LAST_NAME = "Bogasieru";
	public static final String BIRTH_MONTH = "March";
	public static final String BIRTH_DAY = "02";
	public static final String BIRTH_YEAR = "1985";
	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345";

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	public void createAccount() {
		logger.info("Start collecting information to create a new account");
		WebDriverUtils.enterTextBox(driver, firstNameTextBox, FIRST_NAME);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, lastNameTextBox, LAST_NAME);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	    WebDriverUtils.selectDropDown(driver, birthMonth, BIRTH_MONTH);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.selectDropDown(driver, birthDay, BIRTH_DAY);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.selectDropDown(driver, birthYear, BIRTH_YEAR);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, emailTextBox, EMAIL);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.scrollElementToPosition(driver, emailTextBox);
		WebDriverUtils.enterTextBox(driver, confirmEmailTextBox, EMAIL);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, passwordTextBox, PASSWORD);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, confirmPasswordTextBox, PASSWORD);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		logger.info("Finalize collecting information to create a new account");

	}

	public void GenderFemale() {
		logger.info("Choosing Female option");
		WebDriverUtils.clickOnElement(driver, FemaleRadio);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void GenderMale() {
		logger.info("Choosing Male option");
		WebDriverUtils.clickOnElement(driver, MaleRadio);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void rideYes() {
		logger.info("Choose I ride");
		WebDriverUtils.clickOnElement(driver, rideYes);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void rideNo() {
		logger.info("Choose I don't ride");
		WebDriverUtils.clickOnElement(driver, rideNo);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void productsWesternCheck() {
		logger.info("Check Western products");
		WebDriverUtils.clickOnElement(driver, checkWestern);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void productsFashionCheck() {
		logger.info("Check Fashion products");
		WebDriverUtils.clickOnElement(driver, checkFashion);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void productsWorkCheck() {
		logger.info("Check Work products");
		WebDriverUtils.clickOnElement(driver, checkWork);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void productsEnglishCheck() {
		logger.info("Check English products");
		WebDriverUtils.clickOnElement(driver, checkEnglish);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void productsOutdoorCheck() {
		logger.info("Check Outdoor products");
		WebDriverUtils.clickOnElement(driver, checkOutdoor);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public void addMeToAriatEmail() {
		logger.info("Add me to Ariat email list");
		WebDriverUtils.clickOnElement(driver, checkAddToEmailList);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );

	}

	public void createAccountClick() {
		WebDriverUtils.scrolltoElement(driver, createAccountButton);
		WebDriverUtils.clickOnElement(driver, createAccountButton);
		logger.info("New account was created with success");
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

}
