package com.ariat.Pages.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements checkout page with its locators and methods
 * 
 * @author aila.bogasieru@ariat.com
 */

public class CheckoutPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(CheckoutPage.class);

	private By productImage = By.xpath("//img[@title='Heritage II Ellipse Tall Riding Boot']");
	private By productNameLink = By.xpath("//a[@title='Heritage II Ellipse Tall Riding Boot']");
	private By addToWishListLink = By.xpath(
			"//*[@id=\"app\"]/main/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div[4]/div/span/div/div[1]/button/span");
	private By removeLink = By.xpath(
			"//*[@id=\"app\"]/main/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div[4]/div/span/div/div[2]/button/span");
	private By increseQty = By.xpath("//i[@class='el-icon-plus']");
	private By decreaseQty = By.xpath("//i[@class='el-icon-minus']");
	private By promoCode = By.xpath("//input[@placeholder='Promo code']");
	private By applyPromoCode = By.xpath("//div[@class='el-form-item__content']");
	private By payPalCheckoutBtn = By.xpath("//*[@id=\"paypal-animation-content\"]/div[1]/div[1]");
	private By checkoutCheckoutBtn = By.xpath("//a//button[span()='Checkout']");
	private By secureCheckoutBtn = By.xpath("//a[text()='Secure Checkout']");
	private By returnPolicyBtn = By.xpath("//a[text()='Return Policies']");
	private By continueShoppingCheckoutBtn = By.xpath("//a[text()='Continue Shopping']");
	private By ariatLogo = By.className("global-nav-logo-svg");
	private By emailAccount = By.xpath("//input[@placeholder='Email address']");
	private By shippingAddressText = By.id("el-collapse-head-3303");
	
	

	protected CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public void checkProductImage() {
		if (WebDriverUtils.findElement(driver, productImage) != null
				&& WebDriverUtils.findElement(driver, productNameLink) != null
				&& WebDriverUtils.findElement(driver, addToWishListLink) != null
				&& WebDriverUtils.findElement(driver, removeLink) != null) {
			logger.info("Product image, Product name link, add to wishlist link and remove link are displayed");
		} else {
			logger.info("Elements were not found, something went wrong!");
		}
	}

	public void increaseQtyProduct() {
		logger.info("Increasing qty for the product..");
		WebDriverUtils.clickOnElementWithWait(driver, increseQty);
	}

	public void decreaseQtyProduct() {
		logger.info("Decreasing qty for the product..");
		WebDriverUtils.clickOnElementWithWait(driver, decreaseQty);
	}

	public void enterPromoCode(String promoCodeValue) {
		logger.info("Entering promo code for the product..");
		WebDriverUtils.enterTextBox(driver, promoCode, promoCodeValue);
	}

	public void clickApply() {
		logger.info("Applying promo code..");
		WebDriverUtils.clickOnElementWithWait(driver, applyPromoCode);
	}

	public void clickPayPalCheckout() {
		logger.info("Going to paypal checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, payPalCheckoutBtn);
	}

	public void clickCheckout() {
		logger.info("Going to checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, checkoutCheckoutBtn);
	}

	public void clickSecuredCheckout() {
		logger.info("Secure checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, secureCheckoutBtn);
	}

	public void clickReturnPolicy() {
		logger.info("Going to return policy..");
		WebDriverUtils.clickOnElementWithWait(driver, returnPolicyBtn);
	}

	public void goToContinueShopping() {
		logger.info("Continuing shopping..");
		WebDriverUtils.clickOnElementWithWait(driver, continueShoppingCheckoutBtn);
	}
	
	public HomePage returnHomePage() {
		WebDriverUtils.clickOnElementWithWait(driver, continueShoppingCheckoutBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(ariatLogo));
		return new HomePage(driver);
	}
	
	public MyAccountWishListPage returnMyAccountWishListPage() {
		WebDriverUtils.clickOnElementWithWait(driver, addToWishListLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(emailAccount));
		return new MyAccountWishListPage(driver);
	}
	
	public CheckoutProcessPage returnCheckoutProcessPage() {
		WebDriverUtils.clickOnElementWithWait(driver, continueShoppingCheckoutBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(shippingAddressText));
		return new CheckoutProcessPage(driver);
	}

}
