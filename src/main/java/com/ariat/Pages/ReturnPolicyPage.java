package com.ariat.Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ariat.Utils.WebDriverUtils;

/**
 * Does asserts to check the text displayed on Return Policy page
 * @author aila.bogasieru@ariat.com
 *
 */

public class ReturnPolicyPage extends BasePage {

	private By text1 = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[1]/div[1]");
	private By text2 = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[2]/div[1]");
	private By text3 = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[3]/div[1]/span");
	private By text4 = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div[4]/div[1]/span");

	protected ReturnPolicyPage(WebDriver driver) {
		super(driver);
	}

	public void assertText1(String expectedText) {
		String text = WebDriverUtils.getElementText(driver, text1);
		assertEquals(text, expectedText, "1st text is displayed accordingly");
	}

	public void assertText2(String expectedText1) {
		String text1 = WebDriverUtils.getElementText(driver, text2);
		assertEquals(text1, expectedText1, "2nd text is displayed accordingly");
	}

	public void assertText3(String expectedText2) {
		String text2 = WebDriverUtils.getElementText(driver, text3);
		assertEquals(text2, expectedText2, "3d text is displayed accordingly");
	}

	public void assertText4(String expectedText3) {
		String text3 = WebDriverUtils.getElementText(driver, text4);
		assertEquals(text3, expectedText3, "4th text is displayed accordingly");
	}

}
