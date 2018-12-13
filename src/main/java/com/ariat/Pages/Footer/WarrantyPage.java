package com.ariat.Pages.Footer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

public class WarrantyPage extends BasePage{
	
	private By warrantyText = By.xpath("//*[@id=\"main\"]/div/div/p[1]");
	private By warrantyText1 = By.xpath("//*[@id=\"main\"]/div/div/p[2]");
	private By warrantyText2 = By.xpath("//*[@id=\"main\"]/div/div/p[4]");
	private By customerServiceText = By.xpath("//p[text()='Customer Service Hours']");

	public WarrantyPage(WebDriver driver) {
		super(driver);
	}
	
	public void assertText(String expectedText1, String expectedText2, String expectedText3, String expectedText4) {
		String text = WebDriverUtils.getElementText(driver, warrantyText);
		assertEquals(text, expectedText1, "1st text is displayed accordingly");
		String text1 = WebDriverUtils.getElementText(driver, warrantyText1);
		assertEquals(text1, expectedText2, "1st text is displayed accordingly");
		String text2 = WebDriverUtils.getElementText(driver, warrantyText2);
		assertEquals(text2, expectedText3, "1st text is displayed accordingly");
		String text3 = WebDriverUtils.getElementText(driver, customerServiceText);
		assertEquals(text3, expectedText4, "1st text is displayed accordingly");
	} 
}

