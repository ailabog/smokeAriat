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

	private By addACreditCardButton = By.linkText("Add a credit card");
	private By addACreditCardText = By.xpath("//*contains[text(), 'Add a credit card']");
    WebElement cardTable = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]"));
	private By deleteCardLink = By.xpath("//a[text()='Delete card']");
	private By makeDefaultLink = By.xpath("//*[@id=\"paymentinfo\"]/div[2]/div[1]/div/div/div[1]/div[3]/div/a");
	

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
							&& WebDriverUtils.findElement(driver, makeDefaultLink) != null) {
						logger.info("Credit card with:{}" + cardowner + cardType + expireDate + "was created with success");
						}
					else {
						logger.info("Credit card with{}" + cardowner + cardType + expireDate + "was not created");
					}
					
				}
				else {
					logger.info("Credit card was not found in the list of cards");
				}
			}
		}
	}

}
