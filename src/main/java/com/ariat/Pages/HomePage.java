package com.ariat.Pages.HomePagesCountries;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePageAT;
import com.ariat.Pages.HomePagesCountries.HomePageAU;
import com.ariat.Pages.HomePagesCountries.HomePageBE;
import com.ariat.Pages.HomePagesCountries.HomePageBR;
import com.ariat.Pages.HomePagesCountries.HomePageCA;
import com.ariat.Pages.HomePagesCountries.HomePageCH;
import com.ariat.Pages.HomePagesCountries.HomePageCN;
import com.ariat.Pages.HomePagesCountries.HomePageDE;
import com.ariat.Pages.HomePagesCountries.HomePageDK;
import com.ariat.Pages.HomePagesCountries.HomePageFI;
import com.ariat.Pages.HomePagesCountries.HomePageFR;
import com.ariat.Pages.HomePagesCountries.HomePageIE;
import com.ariat.Pages.HomePagesCountries.HomePageIT;
import com.ariat.Pages.HomePagesCountries.HomePageJE;
import com.ariat.Pages.HomePagesCountries.HomePageJP;
import com.ariat.Pages.HomePagesCountries.HomePageKR;
import com.ariat.Pages.HomePagesCountries.HomePageLU;
import com.ariat.Pages.HomePagesCountries.HomePageNL;
import com.ariat.Pages.HomePagesCountries.HomePageNO;
import com.ariat.Pages.HomePagesCountries.HomePageNZ;
import com.ariat.Pages.HomePagesCountries.HomePageQA;
import com.ariat.Pages.HomePagesCountries.HomePageRO;
import com.ariat.Pages.HomePagesCountries.HomePageRU;
import com.ariat.Pages.HomePagesCountries.HomePageSE;
import com.ariat.Pages.HomePagesCountries.HomePageTR;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.BasePage;
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

	private By closeLocationx = By.xpath("//*[@id=\"ext-gen44\"]/body/div[6]/div[1]/a/span");
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By saveAndContinueLocationButton = By.id("btnSaveContext");
	private By chooseLocationArrow = By.xpath("//*[@id=\"chooserTriggerHeader\"]/span/span");
	private By listCountries = By.xpath("//*[@id=\"contextChooser\"]/ul[1]");
	private By countrySelectorWindow = By.xpath("//*[@id=\"ext-gen44\"]/body/div[10]");
	private By continueShoppingButton = By.xpath("//*[@id=\"button\"]/button");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyLogo() {
		logger.info("Ariat Logo is being displayed");
		WebDriverUtils.getElementText(driver, ariatLogo);
	}

	public HomePage closeLocation() {
		logger.info("Closing the location..");
		WebDriverUtils.clickOnElementWithWait(driver, closeLocationx);
		return new HomePage(driver);
	}

	public List<HomePage> chooseGlobalLocation(GlobalCountries country, String currency) {
		logger.info("Selecting global Ariat store country...");
		switch (country.getCountryName()) {
		case "United States":
			logger.info("I choose US as a location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.USA.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.USA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			}
			return new HomePageUS(driver);

		case "United Kingdom":
			logger.info("I choose United Kingdom as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.UK.getLocator());
				WebDriverUtils.scrolltoElement(driver, country.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.UK.getLocator());
			}
			return new HomePageUK(driver);

		case "Belgium":
			logger.info("I choose Belgium as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.BE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.BE.getLocator());
			}
			return new HomePageBE(driver);

		case "Canada":
			logger.info("I choose Canada as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.CA.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.CA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, continueShoppingButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

			}
			return new HomePageCA(driver);

		case "France":
			logger.info("I choose France as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.FR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.FR.getLocator());
			}
			return new HomePageFR(driver);

		case "Ireland":
			logger.info("I choose Ireland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.IE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.IE.getLocator());
			}
			return new HomePageIE(driver);

		case "Denmark":
			logger.info("I choose Denmark as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.DK.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.DK.getLocator());
				return new HomePageDK(driver);
			}
		case "Australia":
			logger.info("I choose Australia as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.AU.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.AU.getLocator());
			}
			return new HomePageAU(driver);

		case "Austria":
			logger.info("I choose Austria as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.AT.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.AT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.AT.getLocator());
			}
			return new HomePageAT(driver);

		case "Switzerland":
			logger.info("I choose Switzerland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.CH.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.CH.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.CH.getLocator());
			}
			return new HomePageCH(driver);

		case "Finland":
			logger.info("I choose Finland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.FI.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.FI.getLocator());
			}
			return new HomePageFI(driver);

		case "China":
			logger.info("I choose China as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.CN.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.CN.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.CN.getLocator());
			}
			return new HomePageCN(driver);

		case "Korea":
			logger.info("I choose Koreea as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.KR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.KR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.KR.getLocator());
			}
			return new HomePageKR(driver);

		case "Brazil":
			logger.info("I choose Brazil as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.BR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.BR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.BR.getLocator());
			}
			return new HomePageBR(driver);

		case "Jersey":
			logger.info("I choose Jersey as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.JE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.JE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);

			}
			return new HomePageJE(driver);

		case "Qatar":
			logger.info("I choose Qatar as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.QA.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.QA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.QA.getLocator());
			}
			return new HomePageQA(driver);

		case "Turkey":
			logger.info("I choose Turkey as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.TR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.TR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.TR.getLocator());
			}
			return new HomePageTR(driver);

		case "Romania":
			logger.info("I choose Romania as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.RO.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.RO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.RO.getLocator());
			}
			return new HomePageRO(driver);

		case "Russia":
			logger.info("I choose Russia as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.RU.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.RU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				// WebDriverUtils.clickOnElementWithWait(driver, country.RU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, continueShoppingButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

			}
			return new HomePageRU(driver);

		case "Japan":
			logger.info("I choose Japan as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.JP.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, country.JP.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, continueShoppingButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			}
			return new HomePageJP(driver);

		case "Taiwan":
			logger.info("I choose Taiwan as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, country.TW.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, country.TW.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, country.TW.getLocator());
			}
			return new HomePageTW(driver);

		// TO DO ADD THE REST OF THE COUNTRIES FROM THE ENUM
		default:
			throw new RuntimeException("Country" + country + "not supported");
		}
	}

	public List<HomePage> chooseEULocation(EUCountries euCountry, String currency) {
		logger.info("Selecting EU  Ariat store country...");

		switch (euCountry.getCountryName()) {
		case "(United States)":
			logger.info("I choose United States as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.USA.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.USA.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			}
			return new HomePageUS(driver);

		case "(United Kingdom)":
			logger.info("I choose English United Kingdom as location");
			logger.info("I choose United Kingdom as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.UK.getLocator());
				WebDriverUtils.scrolltoElement(driver, euCountry.UK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.UK.getLocator());
			}
			return new HomePageUK(driver);
		case "(Belgium)":
			logger.info("I choose English Belgium as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.BE.getLocator());
			}
			return new HomePageBE(driver);

		case "(Österreich)":
			logger.info("I choose Deutsch Österreich as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.AT.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AT.getLocator());
			}
			return new HomePageAT(driver);

		case "(Australia)":
			logger.info("I choose English Australia as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.AU.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.AU.getLocator());
			}
			return new HomePageAU(driver);

		case "(Ireland)":
			logger.info("I choose English Ireland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.IE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			}
			return new HomePageIE(driver);

		case "(Denmark)":
			logger.info("I choose English Denmark as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.DK.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DK.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			}
			return new HomePageDK(driver);

		case "(France)":
			logger.info("I choose Francais France as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.FR.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FR.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			}
			return new HomePageFR(driver);

		case "(Deutschland)":
			logger.info("I choose Deutsch Deutschland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.DE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			}
			return new HomePageDE(driver);

		case "(Norway)":
			logger.info("I choose English Norway as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NO.getLocator());
			}
			return new HomePageNO(driver);

		case "(Finland)":
			logger.info("I choose English  Finland as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				// WebDriverUtils.clickOnElementWithWait(driver, euCountry.FI.getLocator());
			}
			return new HomePageFI(driver);

		case "(Schweiz)":
			logger.info("I choose Deutsch Schweiz as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.CH.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.CH.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.CH.getLocator());
			}
			return new HomePageCH(driver);

		case "(Netherlands)":
			logger.info("I choose English Netherlands as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.NL.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NL.getLocator());
			}
			return new HomePageNL(driver);

		case "(Luxembourg)":
			logger.info("I choose English  Luxembourg as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.LU.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.LU.getLocator());
			}
			return new HomePageLU(driver);

		case "(Italy)":
			logger.info("I choose English  Italy as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.IT.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.IT.getLocator());
			}
			return new HomePageIT(driver);

		case "(Sweden)":
			logger.info("I choose English  Sweden as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.SE.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.SE.getLocator());
			}
			return new HomePageSE(driver);

		case "(New Zealand)":
			logger.info("I choose New Zealand as location");
			WebDriverUtils.clickOnElementWithWait(driver, chooseLocationArrow);
			if (WebDriverUtils.findElement(driver, countrySelectorWindow) != null) {
				WebDriverUtils.clickOnElementWithWait(driver, listCountries);
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				WebDriverUtils.scrollDown(driver, euCountry.NZ.getLocator());
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NZ.getLocator());
				WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				logger.info("Saving location...");
				WebDriverUtils.clickOnElementWithWait(driver, saveAndContinueLocationButton);
				WebDriverUtils.clickOnElementWithWait(driver, euCountry.NZ.getLocator());
			}
			return new HomePageNZ(driver);
		default:
			throw new RuntimeException("Country" + euCountry + "not supported");
		}
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
