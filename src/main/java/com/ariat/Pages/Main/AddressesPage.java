package com.ariat.Pages.Main;

import static org.testng.Assert.assertEquals;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

/**
 * Contains Addresses page utility with locators, methods and links with pages: Add Address page
 * 
 * @author aila.bogasieru@ariat.com
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Addresses Page
 * @author aila.bogasieru@ariat.com
 *
 */


public class AddressesPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(AddressesPage.class);

	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesText = By.xpath("//h1[text()='Addresses']");
	private By addressTextDE = By.xpath("//*[contains(text(), Adressen']");
	private By editLink = By.xpath("//*[@id=\"addresses\"]/div[1]/div[1]/div[2]/a[1]");
	private By deleteLink = By.xpath("//a[text()='Delete']");
	private By makeDefaultLink = By.xpath("a[text()='Make default']");
	private By deleteButton = By.name("dwfrm_profile_address_remove");
	private By cancelButtonDialog = By.xpath("//span[text()='Cancel']");
	private By deleteButtonDialog = By.xpath("//span[(text()='Delete']");
	private By AddAddressButton = By.xpath("//*[@id=\"addresses\"]/div[29]/a");
	private By addressesTable = By.xpath("//*[@id=\\\"main\\\"]/div/div[2]/div[1]");
	private By addressNickname = By.xpath("//*[@id=\"addresses\"]/div[3]/div[1]/div[1]/h3/span");
	private By addressNicknameUS = By.xpath("//*[@id=\"addresses\"]/div[1]/div[1]/div[1]/h3/span");
	// private By loadMoreButton = By.xpath("//button[@title='Load More']");
	private By loadMoreButton = By.xpath("//div[@id='addresses']/div[127]/button");
	private By loadMoreButtonDE = By.xpath("//button[@title='Weitere laden']");
	private By loadMoreButtonFR = By.xpath("//button[@title='Afficher plus']");

	private boolean checkAddress;

	public AddressesPage(WebDriver driver) {
		super(driver);
	}

	public void deleteFromEdit() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public void clickDeleteYes() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialog);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);

	}

	public void clickDeleteNo() {
		logger.info("Canceling delete the address...");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialog);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void makeDefaultAddress() {
		logger.info("Making default the address...");
		WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public boolean checkAddress(String addressValue) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable
				.findElements((SearchContext) By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				while (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, editLink) != null
							&& WebDriverUtils.findElement(driver, deleteLink) != null) {
						logger.info("Address {}" + addressValue
								+ "was created with success and actions as Edit and Delete can de done");

					} else {
						boolean checkAddress = false;
						logger.info("Something went wrong");
					}
				}
			}

		}
		return checkAddress;
	}

	public void makeDefaultAddressCreated(String addressValue) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable
				.findElements((SearchContext) By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, makeDefaultLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLink);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						logger.info("Make default {}" + addressValue + "was done with success");

					} else {

						logger.info("Make default {}" + addressValue + "was not possible");
					}
				} else {
					logger.info("Address {}" + addressValue + "was not found");
				}
			}
		}
	}

	public void deleteAddressCreatedNo(String addressValue) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable
				.findElements((SearchContext) By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, deleteLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteLink);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialog);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						logger.info("Cancel deleting {}" + addressValue + "was done with success");

					} else {

						logger.info("Cancel deleting {}" + addressValue + "was not possible");
					}
				} else {
					logger.info("Address {}" + addressValue + "was not found");
				}
			}
		}
	}

	public void deleteAddressCreatedYes(String addressValue) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable
				.findElements((SearchContext) By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, deleteLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteLink);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialog);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						logger.info("Delete {}" + addressValue + "was done with success");

					} else {

						logger.info("Delete {}" + addressValue + "was not possible");
					}
				} else {
					logger.info("Address {}" + addressValue + "was not found");
				}
			}
		}
	}

	public void editAddressCreated(String addressValue) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable
				.findElements((SearchContext) By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, editLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, editLink);
						WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
						logger.info("Edit address {}" + addressValue + "was done with success");

					} else {

						logger.info("Edit address {}" + addressValue + "was not possible");
					}
				} else {
					logger.info("Address {}" + addressValue + "was not found");
				}
			}
		}
	}

	public void assertMakeDefaultDE(String expectedAddress) {
		String addressLabel = WebDriverUtils.getElementText(driver, addressNickname);
		String substring = "STANDARD | ";
		String makeDefault = substring + addressLabel;
		assertEquals(makeDefault, expectedAddress, "Address made as default is being displayed");
	}

	public void assertMakeDefault(String expectedAddress) {
		String addressLabel = WebDriverUtils.getElementText(driver, addressNickname);
		String substring = "DEFAULT | ";
		String makeDefault = substring + addressLabel;
		assertEquals(makeDefault, expectedAddress, "Address made as default is being displayed");
	}

	public void assertMakeDefaultUS(String expectedAddress) {
		String addressLabel = WebDriverUtils.getElementText(driver, addressNicknameUS);
		String substring = "DEFAULT | ";
		String makeDefault = substring + addressLabel;
		assertEquals(makeDefault, expectedAddress, "Address made as default is being displayed");
	}

	public void loadMoreAddesses() {
		do {
			logger.info("Loading more addresses...");
			WebDriverUtils.scrollMiddlePage(driver, loadMoreButton);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, loadMoreButton);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		} while (WebDriverUtils.findElement(driver, loadMoreButton) == null);
		while (!WebDriverUtils.isElementDisplayed(driver, addressesText)) {
			WebDriverUtils.scrollUp(driver, addressesText);
		}
	}

	public void loadMoreAddessesDE() {
		do {
			logger.info("Loading more addresses...");
			WebDriverUtils.scrollMiddlePage(driver, loadMoreButtonDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, loadMoreButtonDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		} while (WebDriverUtils.findElement(driver, loadMoreButtonDE) == null);
		while (!WebDriverUtils.isElementDisplayed(driver, addressTextDE)) {
			WebDriverUtils.scrollUp(driver, addressTextDE);
		}
	}

	public void loadMoreAddessesFR() {
		do {
			logger.info("Loading more addresses...");
			WebDriverUtils.scrollMiddlePage(driver, loadMoreButtonFR);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, loadMoreButtonFR);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		} while (WebDriverUtils.findElement(driver, loadMoreButton) == null);
		while (!WebDriverUtils.isElementDisplayed(driver, addressesText)) {
			WebDriverUtils.scrollUp(driver, addressesText);
		}
	}

	public void addAddress() {
		logger.info("Adding new address...");
		WebDriverUtils.scrolltoElement(driver, AddAddressButton);
		WebDriverUtils.clickOnElementWithWait(driver, AddAddressButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public AddAddressesPage returnAddAddresses() {
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}

	public AddAddressesPage returnAddressesEdit() {
		WebDriverUtils.clickOnElementWithWait(driver, editLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
}
