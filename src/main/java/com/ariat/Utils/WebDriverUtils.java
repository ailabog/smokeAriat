package com.ariat.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Helper class for encapsualting {@linkWebDriver} operations
 * @author aila.bogasieru@ariat.com
 *
 */

public class WebDriverUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(WebDriver.class);
	
	public final static long WAIT_60_SECONDS = 60;
	public final static long WAIT_40_SECONDS = 40;
	public final static long WAIT_20_SECONDS = 20;
	public final static long WAIT_10_SECONDS = 10;
	public final static long WAIT_5_SECONDS = 5;
	
	public static void enterTextBox(WebDriver driver, By locator, String text) throws TimeoutException {
		String s = "";
		if(!s.equals(text)) {
			logger.debug("Writing \" {}\" to element): {}", text, locator);
		}
		waitUntil(driver, WAIT_10_SECONDS, ExpectedConditions.elementToBeClickable(locator));
		WebElement element = findElement(driver, locator);
		element.clear();
		element.sendKeys(text);
	}

	public static void selectDropDown(WebDriver driver, By locator, String option) throws TimeoutException {
		String s = "";
		if(!s.equals(option)) {
			logger.debug("Writing \" {}\" to element): {}", option, locator);
		}
		waitUntil(driver, WAIT_10_SECONDS, ExpectedConditions.elementToBeClickable(locator));
		selectVisibleText(driver, locator, option);
	}
	
	public  static void switchToTab(WebDriver driver, int tab) {
		try {
			driver.switchTo().window((String) driver.getWindowHandles().toArray()[tab]);
		} catch (NoSuchWindowException e) {
			driver.quit();
			throw new WebDriverException(e);
		}
	}
	
	
	public static void waitUntil(WebDriver driver, long timeOutInSeconds, ExpectedCondition<?> expectedCondition) throws TimeoutException {
		new WebDriverWait(driver, timeOutInSeconds).until(expectedCondition);
	}
	
	
	public static void explicitWait(WebDriver driver, long millis) {
		try {
			Thread.sleep(millis);
		}catch (InterruptedException e) {
			driver.quit();
			throw new WebDriverException(e);
		}
	}
	
	
	public static void clickOnElement (WebDriver driver, By locator) {
		findElement(driver, locator).click();
	}
	
	
	public static WebElement findElement(WebDriver driver, By locator) {
		try {
			return driver.findElement(locator);
		}catch (NoSuchElementException e) {
			driver.quit();
			throw new WebDriverException(e);
		}
	}
	

	public static void clickOnElementWithWait(WebDriver driver, By locator) throws TimeoutException {
		waitUntil(driver, WAIT_10_SECONDS, ExpectedConditions.elementToBeClickable(locator));
		clickOnElement(driver, locator);
	}
	
	public static void selectVisibleText(WebDriver driver, By locator, String option) throws UnexpectedTagNameException, NoSuchElementException {
		String s = "";
		if(!s.equals(option)) {
			logger.debug("Writing \" {}\" to element): {}", option, locator);
		}
		try {
			new Select(findElement(driver, locator)).selectByVisibleText(option);
		} catch (WebDriverException e) {
			
			driver.quit();
			throw new WebDriverException(e);
		}
	}
	
	public static String getElementText(WebDriver driver, By locator) {
		return findElement(driver, locator).getText();
	}
	
	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
}
