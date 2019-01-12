package com.ariat.Pages.Products;

import org.openqa.selenium.WebDriver;
import com.ariat.Pages.Main.BasePage;

/**
 * Implements product attributes methods for Bags Product Page
 * @author aila.bogasieru@ariat.com
 *
 */


import Interfaces.ProductAttributes;

public class BagsProductPage extends BasePage implements ProductAttributes{
	
	public BagsProductPage(WebDriver driver) {
		super(driver);
	}
}
