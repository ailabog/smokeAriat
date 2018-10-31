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
	
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By menCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/a");
	private By kidsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[3]/a");
	private By clearanceCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[4]/a");
	private By searchIcon = By.xpath("//*[@id=\"header-main-content\"]/div/div[5]/div/div[1]/span[1]");
	private By basket = By.xpath("//*[@id=\"header-main-content\"]/div/div[5]/div/div[2]/a/span[1]");
	private By bannerDeliveryText = By.xpath("//*[@id=\"ar-global-utility-promo\"]/div/div");
    private By closeSearchIcon = By.xpath("//*[@id=\"header-main-content\"]/div/div[6]/div[2]/form/div/div[1]/span/span");
   
    private By emailSubscriptionTextBoxFooter = By.name("email");
    private By subscribeButtonFooter = By.name("submit");
    private By facebookIcon = By.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[1]/span");
    private By twitterIcon = By.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[2]/span");
    private By pinterestIcon = By.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[3]/span");
    private By instagramIcon = By.xpath("//*[@id=\"ar-footer-wrapper\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/p/a[4]/span");
        
    private By orderStatusFooter = By.linkText("Order Status");
    private By returnsFooter = By.linkText("Returns");
    private By trackYourOrderFooter = By.linkText("Track Your Order");
    private By warrantyFooter = By.linkText("Warranty");
    private By shippingFooter = By.linkText("Shipping");
    private By faqsFooter = By.linkText("FAQs");
    private By sizeChartsFooter = By.linkText("Size Charts");
    private By productRegistrationFooter = By.linkText("Product Registration");
    private By shopByCountryFooter = By.linkText("Shop By Country");
    private By findARetailerFooter = By.linkText("Find a Retailer");
    private By brandShopFooter = By.linkText("Brand Shop");
    private By contactUsFooter = By.linkText("Contact Us");
    private By emailSignUpFooter = By.linkText("Email Sign Up");
    private By internationalFooter = By.linkText("International");
    private By pressRoomFooter = By.linkText("Press Room");
    private By aboutUsFooter = By.linkText("About Us");
    private By careersFooter = By.linkText("Careers");
    private By privacyFooter = By.linkText("Privacy");
    private By CAnoticeFooter = By.linkText("CA Notice");
    private By giftCardFooter = By.linkText("Gift Card");
    private By myAccountsFooter = By.linkText("My Accounts");
    private By prositeAriatFooter = By.linkText("Prosite Ariat");
    private By wishListFooter = By.linkText("Wish List");
    private By partnersFeiFooter = By.xpath("//*[@id=\"footer-accordion\"]/ul[5]/li[1]/a/span");
    private By partnersEquestrianFooter = By.xpath("//*[@id=\"footer-accordion\"]/ul[5]/li[2]/a/span");
    private By partnersRodeoFooter = By.xpath("//*[@id=\"footer-accordion\"]/ul[5]/li[3]/a/span");
    
      
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyLogo() {
		logger.info("Ariat Logo is being displayed");
		WebDriverUtils.getElementText(driver, ariatLogo);
	}
	
	public void checkElementsHeader() {
		if(WebDriverUtils.findElement(driver, ariatLogo) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, ariatLogo);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + ariatLogo + "was not found");
		}
		
		if(WebDriverUtils.findElement(driver, womenCategory) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + womenCategory + "was not found");
		}
		if(WebDriverUtils.findElement(driver, menCategory) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, menCategory);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + menCategory + "was not found");
		}
		if(WebDriverUtils.findElement(driver, kidsCategory) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, kidsCategory);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + kidsCategory + "was not found");
		}
		if(WebDriverUtils.findElement(driver, clearanceCategory) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, clearanceCategory);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + clearanceCategory + "was not found");
		}
				
		if(WebDriverUtils.findElement(driver, basket) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, basket);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + basket + "was not found");
		}
		if(WebDriverUtils.findElement(driver, signIn) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, signIn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + signIn + "was not found");
		}
		if(WebDriverUtils.findElement(driver, bannerDeliveryText) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, bannerDeliveryText);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + bannerDeliveryText + "was not found");
		}
		if(WebDriverUtils.findElement(driver, chooseLocationArrow) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			if(WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			} else {
				logger.info("Country selector window did not show up");
			}
		} else {
			logger.info("This element {}" + chooseLocationArrow + "was not found");
		}
		if(WebDriverUtils.findElement(driver, searchIcon) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, searchIcon);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, closeSearchIcon);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + searchIcon + "was not found");
		}
	}
	
	public void checkElementsFooter() {
		if(WebDriverUtils.findElement(driver, emailSubscriptionTextBoxFooter) != null 
				&& WebDriverUtils.findElement(driver, subscribeButtonFooter) != null) {
			logger.info("These elements {}" + emailSubscriptionTextBoxFooter + subscribeButtonFooter + "were found");
			} else {
			logger.info("These elements {}" + emailSubscriptionTextBoxFooter + subscribeButtonFooter + "were not found");
		}
		if(WebDriverUtils.findElement(driver, facebookIcon) != null
				&& WebDriverUtils.findElement(driver, twitterIcon) != null
				&& WebDriverUtils.findElement(driver, pinterestIcon) != null
				&& WebDriverUtils.findElement(driver, instagramIcon) != null)
				{
			logger.info("Elements {}" + facebookIcon + twitterIcon + pinterestIcon + instagramIcon + "were found");
			} else {
			logger.info("Elements {}" + facebookIcon + twitterIcon + pinterestIcon + instagramIcon + "were not found");
		}
		
	if(WebDriverUtils.findElement(driver, orderStatusFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, orderStatusFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.scrollDown(driver, orderStatusFooter);
		} else {
			logger.info("This element {}" + orderStatusFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, returnsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, returnsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + returnsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, trackYourOrderFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, trackYourOrderFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + trackYourOrderFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, warrantyFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, warrantyFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + warrantyFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, shippingFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, shippingFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + shippingFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, faqsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, faqsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + faqsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, sizeChartsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, sizeChartsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + sizeChartsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, productRegistrationFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, productRegistrationFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + productRegistrationFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, shopByCountryFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, shopByCountryFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + shopByCountryFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, findARetailerFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, findARetailerFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + findARetailerFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, brandShopFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, brandShopFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + brandShopFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, contactUsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, contactUsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + contactUsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, emailSignUpFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, emailSignUpFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + emailSignUpFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, internationalFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, internationalFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + internationalFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, pressRoomFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, pressRoomFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + pressRoomFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, aboutUsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, aboutUsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + aboutUsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, careersFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, careersFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + careersFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, privacyFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, privacyFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + privacyFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, CAnoticeFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, CAnoticeFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + CAnoticeFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, giftCardFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, giftCardFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + giftCardFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, myAccountsFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, myAccountsFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + myAccountsFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, prositeAriatFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, prositeAriatFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + prositeAriatFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, wishListFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, wishListFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + wishListFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, partnersFeiFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, partnersFeiFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + partnersFeiFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, partnersEquestrianFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, partnersEquestrianFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + partnersEquestrianFooter + "was not found");
		}
		if(WebDriverUtils.findElement(driver, partnersRodeoFooter) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, partnersRodeoFooter);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		} else {
			logger.info("This element {}" + partnersRodeoFooter + "was not found");
		}
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

	public HomePage USlocation() {
		logger.info("I choose US as a location");
		WebDriverUtils.clickOnElementWithWait(driver, usLocation);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_2000_SECONDS);
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
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				return new HomePage(driver);
			
			case "United Kingdom":
				logger.info("I choose United Kingdom as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, country.UK.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.UK.getLocator());
				return new HomePage(driver);
			
			case "Belgium":
				logger.info("I choose Belgium as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				return new HomePage(driver);
			
			case "Canada":
				logger.info("I choose Canada as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				return new HomePage(driver);
			
			case "France":
				logger.info("I choose France as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				return new HomePage(driver);
			

			case "Ireland":
				logger.info("I choose Ireland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
				return new HomePage(driver);
			

			case "Denmark":
				logger.info("I choose Denmark as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				return new HomePage(driver);
			

			case "Australia":
				logger.info("I choose Australia as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePage(driver);
			

			case "Romania":
				logger.info("I choose Romania as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.RO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.RO.getLocator());

				return new HomePage(driver);
			
				
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
			case "English (United Kingdom)":
				logger.info("I choose English United Kingdom as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);
			case "English (Belgium)":
				logger.info("I choose English Belgium as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePage(driver);

			case "English (Australia)":
				logger.info("I choose English Australia as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				 WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				return new HomePage(driver);

			case "English (Ireland)":
				logger.info("I choose English Ireland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				 WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				return new HomePage(driver);

			case "English (Denmark)":
				logger.info("I choose English Denmark as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "Francais(France)":
				logger.info("I choose Francais France as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "Deutsch (Deutschland)":
				logger.info("I choose Deutsch Deutschland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Norway)":
				logger.info("I choose English Norway as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Finland)":
				logger.info("I choose English  Finland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "Deutsch (Schweiz)":
				logger.info("I choose Deutsch Schweiz as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SW.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Netherlands)":
				logger.info("I choose English Netherlands as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Luxembourg)":
				logger.info("I choose English  Luxembourg as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Italy)":
				logger.info("I choose English  Italy as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (Sweden)":
				logger.info("I choose English  Sweden as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				return new HomePage(driver);

			case "English (New Zealand)":
				logger.info("I choose New Zealand as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
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
