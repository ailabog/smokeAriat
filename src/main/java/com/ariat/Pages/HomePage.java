package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ariat.Utils.WebDriverUtils;

/**
 * This contains the Login page with all locators and methods associated and links to SignIn page and Logout page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomePage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(HomePage.class);
	
   	private By ukLocation = By.xpath("//img[contains(@src, 'GB.gif')]");
	private By usaLocation = By.xpath("//img[contains(@src, 'US.gif')]");
	private By closeLocationx = By.xpath("//*[@id=\"ext-gen44\"]/body/div[6]/div[1]/a/span");
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By signIn = By.xpath("//a[text()= 'Sign In']");
	private By returningCustomerText = By.xpath("//*text()='Returning customer']");
	private By checkOrderText = By.xpath("//*text()='Check an order / request return']");
	private By newcustomerText = By.xpath("//*text()='New Customer']");
	private By closeSubscription = By.xpath("//*[@id=\"ext-gen44\"]/body");
	private By emailSubscriptionTextBox =By.id("subscriptionEmail");
	private By firstNameSubscriptionTextBox = By.id("subscriptionName");
	private By lastNameSubscriptionTextBox = By.id("subscriptionLastName");
	private By SubscriptionSignUpButton = By.id("subscriptionSubmit");
	private By saveAndContinueLocationButton = By.id("btnSaveContext");
	private By chooseLocationArrow = By.xpath("//*[@id=\"chooserTriggerHeader\"]/span/span");
	
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyLogo() {
		logger.info("Ariat Logo is being displayed");
		WebDriverUtils.getElementText(driver, ariatLogo);
	}
	
	public void chooseLocation() {
		WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
	}
	
	public HomePage UKlocation() {
		logger.info("I choose UK as a location");
		WebDriverUtils.clickOnElementWithWait(driver, ukLocation);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		return new HomePage(driver);
	}
	
	public void saveAndContinueLocation() {
		logger.info("Saving location...");
		WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
		
	}

	public HomePage USlocation() {
		logger.info("I choose US as a location");
		WebDriverUtils.clickOnElementWithWait(driver, usaLocation);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		return new HomePage(driver);
	}

	public HomePage closeLocation() {
		logger.info("Closing the location..");
		WebDriverUtils.clickOnElementWithWait(driver, closeLocationx);
		return new HomePage(driver);
	}

	public void closeSubscription() {
		logger.info("Closing the subscription..");
		WebDriverUtils.clickOnElementWithWait(driver, closeSubscription);
	}
	
	public void setSubscription() {
		logger.info("Start collecting information for the subscription..");
		WebDriverUtils.enterTextBox(driver, emailSubscriptionTextBox, "aila.bogasieru@yahoo.com");
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, firstNameSubscriptionTextBox, "Aila");
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
		WebDriverUtils.enterTextBox(driver, lastNameSubscriptionTextBox, "Bogasieru");
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}
	
	public void signUpSubscription() {
		WebDriverUtils.clickOnElementWithWait(driver, SubscriptionSignUpButton);
		WebDriverUtils.explicitWait(driver,  WebDriverUtils.WAIT_2000_SECONDS );
	}

	public SignInPage returnSignInPage() {
		WebDriverUtils.clickOnElementWithWait(driver, signIn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(returningCustomerText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(checkOrderText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(newcustomerText));
		return new SignInPage(driver);
	}
}
