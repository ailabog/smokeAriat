package com.ariat.Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * links with Add a credit card page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class PaymentInformationPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(PaymentInformationPage.class);

	private By addACreditCardButton = By.xpath("//*[@title='Add a credit card']");
	private By addACreditCardText = By.xpath("//*contains[text(), 'Add a credit card']");
	WebElement cardTable = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]"));
	private By deleteCardLink = By.xpath("//a[text()='Delete card']");
	private By makeDefaultCardLink = By.xpath("a[text()='Make Default Card']");
	private By deleteButtonDeleteCard = By.xpath("//*[@id=\"ext-gen44\"]/body/div[8]/div[3]/div/button[2]");
	private By cancelButtonDeleteCard = By.xpath("//*[@id=\"ext-gen44\"]/body/div[8]/div[3]/div/button[1]/span");
	private By creditNickname = By.xpath("//span[text()='MASTER_ID123']");

	protected PaymentInformationPage(WebDriver driver) {
		super(driver);
	}

	public AddACreditCardPage returnAddACreditCardPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_40_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, addACreditCardButton);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(addACreditCardText));
		return new AddACreditCardPage(driver);
	}

	public void checkCreditCard(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteCardLink) != null
							&& WebDriverUtils.findElement(driver, makeDefaultCardLink) != null) {
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was created with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not created");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}

	public void deleteCreditCardNo(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteCardLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteCardLink);
						WebDriverUtils.clickOnElementWithWait(driver, cancelButtonDeleteCard);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was cancelled from deletion");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not cancelled from deletion");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}
	
	public void deleteCreditCardYes(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, deleteCardLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, deleteCardLink);
						WebDriverUtils.clickOnElementWithWait(driver, deleteButtonDeleteCard);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was deleted with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not deleted");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}
	
	public void makeDefaultCreditCard(String cardowner, String cardType, String expireDate) {
		ArrayList<WebElement> rows = (ArrayList<WebElement>) cardTable.findElements(By.tagName("div"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("div"));
			for (WebElement cell : cells) {
				if (cell.getText() == cardowner && cell.getText() == cardType && cell.getText() == expireDate) {
					if (WebDriverUtils.findElement(driver, makeDefaultCardLink) != null) {
						WebDriverUtils.clickOnElementWithWait(driver, makeDefaultCardLink);
						logger.info(
								"Credit card with:{}" + cardowner + cardType + expireDate + "was made default with success");
					} else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not made default");
					}

				} else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}
	
	public void assertMakeDefaultCreditCard(String expectedCreditCard) {
		String creditLabel = WebDriverUtils.getElementText(driver, creditNickname);
		String substring = "DEFAULT | ";
		String makeDefault = substring + creditLabel;
		assertEquals(makeDefault , expectedCreditCard, "Credit card made as default is being displayed");
	}
	
}
