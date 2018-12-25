package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ariat.Utils.WebDriverUtils;

/**
 * This page contains all the elements on Create Account page and its methods:
 * create account, mark options and links with My Account page
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
	private By MaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div/div[5]/div/div/div[1]/span");
	private By FemaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div/div[5]/div/div/div[2]/span");
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
	private By checkAddToEmailList = By.xpath("//*[@id=\"RegistrationForm\"]/div/div[10]/div/span");
	private By createAccountButton = By.xpath("//*[@id=\"RegistrationForm\"]/div/div[12]/div/button");
	private By myAccountTitle = By.className("/account-overview__title ms-font--proxima_nova_semibold");
	private By wishList = By.cssSelector(".add-to-wishlist");
	private By myAccountText = By.xpath("//*contains[text()='My account']");
	private By myWishlistText = By.xpath("//*contains[text()='Wishlist']");

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	public void firstName(String firstName) {
		logger.info("Start collecting information to create a new account: First Name");
		WebDriverUtils.enterTextBox(driver, firstNameTextBox, firstName);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void clearFirstName() {
		logger.info("Clearing text box First Name:");
		WebDriverUtils.clearElement(driver, firstNameTextBox);
	}

	public void lastNameInfo(String lastName) {
		logger.info("Start collecting information to create a new account: Last Name");
		WebDriverUtils.enterTextBox(driver, lastNameTextBox, lastName);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void clearLastName() {
		logger.info("Clearing text box Last Name:");
		WebDriverUtils.clearElement(driver, lastNameTextBox);
	}

	public void selectBirthMonth(String month) {
		logger.info("Start collecting information to create a new account: Month of birth");
		WebDriverUtils.selectDropDown(driver, birthMonth, month);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void selectBirthDay(String day) {
		logger.info("Start collecting information to create a new account: Day of birth");
		WebDriverUtils.selectDropDown(driver, birthDay, day);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void enterEmail(String email) {
		logger.info("Start collecting information to create a new account: enter email");
		WebDriverUtils.enterTextBox(driver, emailTextBox, email);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void clearEmail() {
		logger.info("Clearing text box Email:");
		WebDriverUtils.clearElement(driver, emailTextBox);
	}

	public void confirmEmail(String email) {
		logger.info("Start collecting information to create a new account: confirm email");
		WebDriverUtils.enterTextBox(driver, confirmEmailTextBox, email);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void enterPassword(String password) {
		logger.info("Start collecting information to create a new account: enter passsword");
		WebDriverUtils.enterTextBox(driver, passwordTextBox, password);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void confirmPassword(String password) {
		logger.info("Start collecting information to create a new account: confirm email");
		WebDriverUtils.enterTextBox(driver, confirmPasswordTextBox, password);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		logger.info("Finalize collecting information to create a new account");

	}

	public void GenderFemale() {
		logger.info("Choosing Female option:");
		WebDriverUtils.clickOnElement(driver, FemaleRadio);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void GenderMale() {
		logger.info("Choosing Male option:");
		WebDriverUtils.clickOnElement(driver, MaleRadio);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void rideYes() {
		logger.info("Choose I ride");
		WebDriverUtils.clickOnElement(driver, rideYes);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void rideNo() {
		logger.info("Choose I don't ride");
		WebDriverUtils.clickOnElement(driver, rideNo);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void productsWesternCheck() {
		logger.info("Check Western products");
		WebDriverUtils.clickOnElement(driver, checkWestern);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void productsFashionCheck() {
		logger.info("Check Fashion products");
		WebDriverUtils.clickOnElement(driver, checkFashion);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void productsWorkCheck() {
		logger.info("Check Work products");
		WebDriverUtils.clickOnElement(driver, checkWork);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void productsEnglishCheck() {
		logger.info("Check English products");
		WebDriverUtils.clickOnElement(driver, checkEnglish);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void productsOutdoorCheck() {
		logger.info("Check Outdoor products");
		WebDriverUtils.clickOnElement(driver, checkOutdoor);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void addMeToAriatEmail() {
		logger.info("Add me to Ariat email list");
		WebDriverUtils.clickOnElementWithWait(driver, checkAddToEmailList);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);

	}

	public void createAccountClick() {
		WebDriverUtils.clickOnElementWithWait(driver, createAccountButton);
		logger.info("New account was created with success");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public MyAccountPage returnMyAccountPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, createAccountButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountTitle));
		return new MyAccountPage(driver);

	}
	
	public MyAccountWishListPage returnMyAccountWishListPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, createAccountButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishlistText));
		return new MyAccountWishListPage(driver);
	}

	}

