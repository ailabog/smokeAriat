package com.ariat.Pages;



import java.util.ArrayList;
import org.openqa.selenium.By;


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

public class AddressesPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(AddressesPage.class);

	private By addressesLink = By.xpath("//a[text()='Addresses']");
	private By addressesText = By.xpath("//*[contains(text(), 'Addresses']");
	private By editLink = By.xpath("//a[text()='Edit']");
	private By deleteLink = By.xpath("//a[text()='Delete']");
	private By makeDefaultLink = By.xpath("a[text()='Make default']");
	private By deleteButton = By.name("dwfrm_profile_address_remove");
	private By cancelButtonDialog = By.xpath("//span[text()='Cancel']");
	private By deleteButtonDialog = By.xpath("//span[(text()='Delete']");
    private By AddAddressButton = By.xpath("//*[@id=\"addresses\"]/div[29]/a");
    WebElement addressesTable = driver.findElement(By.id("addresses"));

	private boolean checkAddress;

	protected AddressesPage(WebDriver driver) {
		super(driver);
	}

	public void deleteFromEdit() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButton);

	}
	
	public void clickDeleteYes() {
		logger.info("Deleting the address...");
		WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDialog);

	}
	public void clickDeleteNo() {
		logger.info("Canceling delete the address...");
		WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDialog);
	}

	public void makeDefaultAddress() {
		logger.info("Making default the address...");
		WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLink);
	}

	public boolean checkAddress(String addressValue) {
		 ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable.findElements(By.tagName("tr"));
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
	
	public void editAddressCreated(String addressValue) {
		 ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable.findElements(By.tagName("tr"));
		    for (WebElement row : rows) {
		        ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
		        for (WebElement cell : cells) {
				while (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, editLink) != null){
						WebDriverUtils.clickOnElementWithWait(driver, editLink);
						logger.info("Edit the {}" + addressValue + "was done with success");
		
					} else {
						
						logger.info("The editing action was not possible");
					}
				}
		    }
		}
	}
	
	
	public void deleteAddressCreated(String addressValue) {
		 ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable.findElements(By.tagName("tr"));
		    for (WebElement row : rows) {
		        ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
		        for (WebElement cell : cells) {
				while (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, deleteLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteLink);
						logger.info("Deleting of the {}" + addressValue + "was made with success");
						

					} else {
						logger.info("The address was not deleted");
					}
				}
		    }
		}
	}
	
	public void makeDefaultAddressCreated(String addressValue) {
		 ArrayList<WebElement> rows = (ArrayList<WebElement>) addressesTable.findElements(By.tagName("tr"));
		    for (WebElement row : rows) {
		        ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
		        for (WebElement cell : cells) {
				while (cell.getText() == addressValue) {
					if (WebDriverUtils.findElement(driver, makeDefaultLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, makeDefaultLink);
						logger.info("Make default of {}" + addressValue + "is done");
						

					} else {
						logger.info("The address was not made as default");
					}
				}
		    }
		}
	}
	
	public void addAddress() {
		logger.info("Addingnew address...");
		WebDriverUtils.scrolltoElement(driver, AddAddressButton);
		WebDriverUtils.clickOnElementWithWait(driver, AddAddressButton);

	}

	public AddAddressesPage returnAddAddresses() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addressesLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}

	public AddAddressesPage returnAddressesEdit() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, editLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addressesText));
		return new AddAddressesPage(driver);
	}
}
