package com.ariat.Pages.HomePagesCountries;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.SignInPage;
import com.ariat.Pages.Categories.MenCategories.MenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;

import com.ariat.Utils.WebDriverUtils;

/**
 * This contains the Login page with all locators and methods associated and
 * links to SignIn page and Logout page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomePage extends BasePage implements List<HomePage> {

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
	private By saveAndContinueLocationButton = By.id("btnSaveContext");
	private By chooseLocationArrow = By.xpath("//*[@id=\"chooserTriggerHeader\"]/span/span");
	private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");
	private By womenText = By.xpath("//*contains(text(),'Women']");
	private By menCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/a");
	private By menText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By kidsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[3]/a");
	private By clearanceCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[4]/a");
	private By giftGuideMenu = By.xpath("//img[contains(@src, 'gift-guide-category-image.png')]");
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
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public HomePage USlocation() {
		logger.info("I choose US as a location");
		WebDriverUtils.clickOnElementWithWait(driver, usLocation);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
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

		public List<HomePage> chooseGlobalLocation(GlobalCountries country, String currency) {
		logger.info("Selecting global Ariat store country...");
		if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
			switch (country.getCountryName()) {
			case "United States":
				logger.info("I choose US as a location");
				WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				return new HomePageUS(driver);
			
				
		    case "United Kingdom":
				logger.info("I choose United Kingdom as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, country.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePageUK(driver);


			case "Belgium":
				logger.info("I choose Belgium as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				return new HomePageBE(driver);


			case "Canada":
				logger.info("I choose Canada as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				return  new HomePageCA(driver);


				case "France":
				logger.info("I choose France as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				return new HomePageFR(driver);

				
			case "Ireland":
				logger.info("I choose Ireland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				return new HomePageIE(driver);


			case "Denmark":
				logger.info("I choose Denmark as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				return new HomePageDK(driver);


			case "Australia":
				logger.info("I choose Australia as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
    			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				return new HomePageAU(driver);

				// TO DO ADD THE REST OF THE COUNTRIES FROM THE ENUM

			default:
				throw new RuntimeException("Country" + country + "not supported");
			}

		}
		return new HomePage(driver);
	}

	public List <HomePage> chooseEULocation(EUCountries euCountry, String currency) {
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
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.UK.getLocator());
				return new HomePageUK(driver);
				

			case "English (Belgium)":
				logger.info("I choose English Belgium as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
				return new HomePageBE(driver);


			case "English (Australia)":
				logger.info("I choose English Australia as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				return new HomePageAU(driver);


			case "English (Ireland)":
				logger.info("I choose English Ireland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.IE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				return new HomePageIE(driver);

		

			case "English (Denmark)":
				logger.info("I choose English Denmark as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.DK.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DK.getLocator());
				return new HomePageDK(driver);

			case "Francais(France)":
				logger.info("I choose Francais France as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.FR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FR.getLocator());
				return new HomePageFR(driver);


			case "Deutsch (Deutschland)":
				logger.info("I choose Deutsch Deutschland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);

				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DE.getLocator());
				return new HomePageDE(driver);


			case "English (Norway)":
				logger.info("I choose English Norway as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
				return new HomePageNO(driver);


			case "English (Finland)":
				logger.info("I choose English  Finland as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
				return new HomePageFI(driver);

				
			case "Deutsch (Schweiz)":
				logger.info("I choose Deutsch Schweiz as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.SW.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SW.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SW.getLocator());
				return new HomePageSW(driver);


			case "English (Netherlands)":
				logger.info("I choose English Netherlands as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.NL.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
		        WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
				return new HomePageNL(driver);


			case "English (Luxembourg)":
				logger.info("I choose English  Luxembourg as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.LU.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
				return new HomePageLU(driver);


			case "English (Italy)":
				logger.info("I choose English  Italy as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.IT.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				return new HomePageIT(driver);


			case "English (Sweden)":
				logger.info("I choose English  Sweden as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.SE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
				return new HomePageSE(driver);


			case "English (New Zealand)":
				logger.info("I choose New Zealand as location");
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrolltoElement(driver, euCountry.NZ.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NZ.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NZ.getLocator());
				return new HomePageNZ(driver);

			default:
				throw new RuntimeException("Country" + euCountry + "not supported");
			}
		}
		return new HomePage(driver);

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

	
	public WomenCategoryPage returnWomenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenText));
		return new WomenCategoryPage(driver);
	}
	
	public MenCategoryPage returnMenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menText));
		return new MenCategoryPage(driver);
	}

	@Override
	public boolean add(HomePage e) {
		
		return false;
	}

	@Override
	public void add(int index, HomePage element) {
		

	}

	@Override
	public boolean addAll(Collection<? extends HomePage> c) {
		
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends HomePage> c) {
		
		return false;
	}

	@Override
	public void clear() {
		

	}

	@Override
	public boolean contains(Object o) {
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public HomePage get(int index) {
		
		return null;
	}

	@Override
	public int indexOf(Object o) {
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public Iterator<HomePage> iterator() {
		
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		return 0;
	}

	@Override
	public ListIterator<HomePage> listIterator() {
		
		return null;
	}

	@Override
	public ListIterator<HomePage> listIterator(int index) {
		
		return null;
	}

	@Override
	public boolean remove(Object o) {
		
		return false;
	}

	@Override
	public HomePage remove(int index) {
		
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public HomePage set(int index, HomePage element) {
		
		return null;
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public List<HomePage> subList(int fromIndex, int toIndex) {
		
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;

	}

}
