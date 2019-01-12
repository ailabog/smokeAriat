package com.ariat.Pages.Products;


import org.openqa.selenium.WebDriver;
import com.ariat.Pages.Main.BasePage;
import Interfaces.ProductAttributes;

/**
 * Implements Product attributes methods for Gloves Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class GlovesProductPage extends BasePage implements ProductAttributes{
	
	public GlovesProductPage(WebDriver driver) {
		super(driver);
	}
}
