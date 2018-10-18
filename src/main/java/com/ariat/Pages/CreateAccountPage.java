package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ariat.Utils.WebDriverUtils;

/**
 * This page contains all the elements on Create Account page and its methods: create account, mark options
 * @author aila.bogasieru@ariat.com
 *
 */

public class CreateAccountPage extends BasePage{
	
	private By firstNameTextBox = By.id("dwfrm_profile_customer_firstname");
	private By lastNameTextBox = By.id("dwfrm_profile_customer_lastname");
	private By birthMonth = By.id("dwfrm_profile_customer_customProfile_birthdayMonth");
	private By birthDay = By.id("dwfrm_profile_customer_customProfile_birthdayDay");
	private By birthYear = By.id("dwfrm_profile_customer_customProfile_birthdayYear");
	private By MaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div[5]/div/span[1]/span");
	private By FemaleRadio = By.xpath("//*[@id=\"RegistrationForm\"]/div[5]/div/span[2]/span");
	private By rideYes = By.xpath("//*[@id=\"RegistrationForm\"]/div[6]/div/span[1]/span");
	private By rideNo = By.xpath("//*[@id=\"RegistrationForm\"]/div[6]/div/span[1]/span");
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
		WebDriverUtils.enterTextBox(driver, firstNameTextBox, FIRST_NAME);
		WebDriverUtils.enterTextBox(driver, lastNameTextBox, LAST_NAME);
		WebDriverUtils.selectDropDown(driver, birthMonth, "March");
		WebDriverUtils.selectDropDown(driver, birthMonth, "BIRTH_MONTH");
		WebDriverUtils.selectDropDown(driver, birthDay, "BIRTH_DAY");
		WebDriverUtils.selectDropDown(driver, birthYear, "BIRTH_YEAR");
		WebDriverUtils.enterTextBox(driver, emailTextBox, EMAIL);
		WebDriverUtils.enterTextBox(driver, confirmEmailTextBox, EMAIL);
		WebDriverUtils.enterTextBox(driver, passwordTextBox, PASSWORD);
		WebDriverUtils.enterTextBox(driver, confirmPasswordTextBox, PASSWORD);
		
	}
	
	public void GenderFemale() {
		WebDriverUtils.clickOnElement(driver, FemaleRadio);
	}
	
	public void GenderMale() {
		WebDriverUtils.clickOnElement(driver, MaleRadio);
	}
	
	
	public void rideYes() {
		WebDriverUtils.clickOnElement(driver, rideYes);
	}
	
	
	public void rideNo() {
		WebDriverUtils.clickOnElement(driver, rideNo);
	}
	
	
	public void productsWesternCheck() {
		WebDriverUtils.clickOnElement(driver, checkWestern);
	}
	
	public void productsFashionCheck() {
		WebDriverUtils.clickOnElement(driver, checkFashion);
	}
	
	
	public void productsWorkCheck() {
		WebDriverUtils.clickOnElement(driver, checkWork);
	}
	
	public void productsEnglishCheck() {
		WebDriverUtils.clickOnElement(driver, checkEnglish);
	}
	
	
	public void productsOutdoorCheck() {
		WebDriverUtils.clickOnElement(driver, checkOutdoor);
	}
	
	public void addMeToAriatEmail() {
		WebDriverUtils.clickOnElement(driver, checkAddToEmailList);
		
	}
	
	public void createAccountClick() {
		WebDriverUtils.clickOnElement(driver, createAccountButton);
		
	}

}
