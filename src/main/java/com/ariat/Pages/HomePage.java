package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Utils.WebDriverUtils;

/**
 * This contains the Login page with all locators and methods associated and
 * links to SignIn page and Logout page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomePage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

	private By ukLocation = By.xpath("//img[contains(@src, 'GB.gif')]");
	private By usLocation = By.xpath("//img[contains(@src, 'US.gif')]");
	private By closeLocationx = By.xpath("//*[@id=\"ext-gen44\"]/body/div[6]/div[1]/a/span");
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By signIn = By.xpath("//a[text()= 'Sign In']");
	private By returningCustomerText = By.xpath("//*text()='Returning customer']");
	private By checkOrderText = By.xpath("//*text()='Check an order / request return']");
	private By newcustomerText = By.xpath("//*text()='New Customer']");
	private By closeSubscription = By.xpath("//*[@id=\"subscriptionPopup\"]/div[1]/div[2]/a/span");
	private By emailSubscriptionTextBox = By.id("subscriptionEmail");
	private By firstNameSubscriptionTextBox = By.id("subscriptionName");
	private By lastNameSubscriptionTextBox = By.id("subscriptionLastName");
	private By SubscriptionSignUpButton = By.id("subscriptionSubmit");
	private By saveAndContinueLocationButton = By.id("btnSaveContext");
	private By chooseLocationArrow = By.xpath("//*[@id=\"chooserTriggerHeader\"]/span/span");

	private By listCountries = By.xpath("//*[@id=\"contextChooser\"]/ul[1]");
	private By countrySelectorWindow = By.xpath("//*[@id=\"ext-gen44\"]/body/div[10]");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyLogo() {
		logger.info("Ariat Logo is being displayed");
		WebDriverUtils.getElementText(driver, ariatLogo);
	}

	public HomePage UKlocation() {
		logger.info("I choose UK as a location");
		WebDriverUtils.clickOnElementWithWait(driver, ukLocation);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		return new HomePage(driver);
	}

	public void saveAndContinueLocation() {
		logger.info("Saving location...");
		WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);

	}

	public void USlocation() {
		logger.info("I choose US as a location");
		WebDriverUtils.clickOnElementWithWait(driver, usLocation);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
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

	public HomePage chooseGlobalLocation(GlobalCountries country, String currency) {
		logger.info("Selecting global Ariat store country...");
		WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
		if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
			switch (country.getCountryName()) {
			case "United States":
				logger.info("I choose US as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;
			case "United Kingdom":
				logger.info("I choose United Kingdom as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, country.UK.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;
			case "Belgium":
				logger.info("I choose Belgium as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;
			case "Canada":
				logger.info("I choose Canada as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;
			case "France":
				logger.info("I choose France as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;

			case "Ireland":
				logger.info("I choose Ireland as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			// break;

			case "Denmark":
				logger.info("I choose Denmark as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				return new HomePage(driver);
			// break;

			case "Australia":
				logger.info("I choose Australia as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);
			// break;

			case "Romania":
				logger.info("I choose Romania as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.RO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);

				return new HomePage(driver);
			// break;
				
				//TO DO ADD THE REST OF THE COUNTRIES FROM THE ENUM
			default:
				throw new RuntimeException("Country" + country + "not supported");

			}
		}
		return new HomePage(driver);

	}

	public HomePage chooseEULocation(EUCountries euCountry, String currency) {
		logger.info("Selecting EU  Ariat store country...");
		WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
		if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
			switch (euCountry.getLanguageCountryName()) {
			case "English (Belgium)":
				logger.info("I choose English Belgium as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);

			case "English (Australia)":
				logger.info("I choose English Australia as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Ireland)":
				logger.info("I choose English Ireland as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Denmark)":
				logger.info("I choose English Denmark as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "Francais(France)":
				logger.info("I choose Francais France as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "Deutsch (Deutschland)":
				logger.info("I choose Deutsch Deutschland as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Norway)":
				logger.info("I choose English Norway as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Finland)":
				logger.info("I choose English  Finland as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "Deutsch (Schweiz)":
				logger.info("I choose Deutsch Schweiz as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SW.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Netherlands)":
				logger.info("I choose English Netherlands as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Luxembourg)":
				logger.info("I choose English  Luxembourg as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Italy)":
				logger.info("I choose English  Italy as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (Sweden)":
				logger.info("I choose English  Sweden as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);

			case "English (New Zealand)":
				logger.info("I choose New Zealand as a location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				// WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);
			default:
				throw new RuntimeException("Country" + euCountry + "not supported");
			}
		}
		return new HomePage(driver);

	}

	public void setSubscription() {
		logger.info("Start collecting information for the subscription..");
		WebDriverUtils.enterTextBox(driver, emailSubscriptionTextBox, "aila.bogasieru@yahoo.com");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, firstNameSubscriptionTextBox, "Aila");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
		WebDriverUtils.enterTextBox(driver, lastNameSubscriptionTextBox, "Bogasieru");
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
	}

	public void signUpSubscription() {
		WebDriverUtils.clickOnElementWithWait(driver, SubscriptionSignUpButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
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
