package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Contain locators and methods for My Orders page and links with page Order details page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyOrdersPage extends BasePage{
	
	private By orderDetailsLink = By.xpath("//*[@id=\"order-items\"]/div[1]/div[3]/a");
	private By returnPolicyLink = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/a");
	
	
	protected MyOrdersPage(WebDriver driver) {
		super(driver);
		}
}
