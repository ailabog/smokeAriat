package com.ariat.Pages.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Utils.WebDriverUtils;

/**
 * Implements checkout process page with its locators and methods
 * 
 * @author aila.bogasieru@ariat.com
 */

public class CheckoutProcessPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(CheckoutProcessPage.class);

	private By editBagLink = By.xpath("//button[@class='el-button summary__edit el-button--text']");
	private By arrowCountry = By.xpath("//span[@class='el-input__suffix']");
    private By selectOption = By.xpath("//span[text()='Austria']");
    private By selectOptionBE = By.xpath("//span[text()='Belgium']");
    private By selectOptionDE = By.xpath("//span[text()='Deutschland']");
    private By selectOptionFR = By.xpath("//span[text()='Belgique']");
	private By firstName = By.name("firstName");
	private By lastName = By.name("lastName");
	private By address = By.name("address1");
	private By address1 = By.name("address2");
	private By city = By.name("city");
	private By zipCode = By.name("zipcode");
	private By checkCheckBoxBilling = By.xpath("//input[@value='Use this address for Billing']");
	private By mobile = By.name("phone");
	private By email = By.name("email");
	private By addToAddressBoxCheck = By.xpath("//input[@vlaue='Add to Address Book']");
	private By stayInTouchCheck = By
			.xpath("//input[@value='Stay in touch. Learn about our new products and special offers first!']");
	private By continueCheckoutDE = By.xpath("//button[@class='el-button checkout_button el-button--primary']//span[text()='Fortsetzen']");
	private By continueCheckout1 = By.cssSelector(".el-button--primary:nth-child(1)");
	private By standardCheck = By.xpath("//input[@value='X-1']");
	private By expressCheck = By.xpath("//input[@value='U-1']");
	private By paypalCheck = By.xpath("//input[@vlaue='PAYPAL']");
	private By creditCardCheck = By.xpath("//input[@value='SA_SILENTPOST']");
	private By cardArrow = By.cssSelector(".el-row:nth-child(4) .el-select__caret");
	private By selectCard = By.xpath("//span[text()='(MasterCard) ************4444 1.2033']");
	
	
	private By selectTypeCard = By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[2]/form/div[6]/div/div/div/div[1]/div/span/span/i");
	private By optionCardMasterCard = By.xpath("//span[text()='MasterCard']");
	private By optionCardVisa = By.xpath("//span[text()='Visa']");
	private By optionCardAmericanExpress = By.xpath("//span[text()='American Express']");
	private By expirationDateMonth = By.xpath("//span[text()='June']");
	private By expirationDateMonthDE = By.xpath("//span[contains(text(),'Februar')]");

	private By expirationDateMonthUS = By.xpath(
			"//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[1]/form/div[4]/div/div/div[1]/span/span/i");
	
	private By monthExpirationUS = By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[1]/form/div[4]/div/div/div/input");
	
	private By monthExpiration = By.xpath("//ul[@class='el-scrollbar__view el-select-dropdown__list']//span[text()='February']");
	
	
	
	private By expirationDateYear = By.xpath("//span[text()='2024']");
	private By expirationDateYearUS = By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[1]/form/div[5]/div/div/div[1]/span/span/i");

	private By yearExpirationUS = By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[1]/form/div[5]/div/div/div/input");
	//private By securityCode = By.xpath("//div[@class='checkout_input ms-padding-right-10 el-input']//input[@class='el-input__inner']");
	private By securityCode = By.cssSelector(".checkout__card-cvn .el-input__inner");

	private By buyNowBtn = By.id("confirmpayment");
	
	private By checkoutCompleteText = By.xpath("//h1[text()='Checkout Complete']");
	private By paypalBtn = By.id("paypal-animation-content");
	private By placeOrderBtn = By.id("paymentbtn");
	private By giftCardTxtBox = By.xpath("//input[@placeholder=Gift Card Code']");
	private By pinTxtBox = By.xpath("//input[@placeholder='Pin']");
	private By applyGifCard = By.xpath("//button//span[text()='Apply']");
	private By promoCodeTxtBox = By.xpath("//input[@placeholder='Promo code']");
	private By expandGiftCard = By.xpath("//i[text()='Gift card']");
	private By expandPromoCode = By.xpath("//i[text()='Promo code']");

    private By selectState = By.xpath("//span[text()='Arizona']");
	private By checkoutBtn=By.xpath("//div[@data-funding-source='paypal']");
	private By emailTxtBoxPayPal=By.id("email");
	private By passwordTxtBoxPaypal=By.xpath("//div[@id='main']//input[@id='password']");
	private By loginPayPal=By.id("btnLogin");
	private By continueBtnPayPal=By.xpath("//button[text()='Continue']");
	private By confirmPayPal=By.id("confirmButtonTop");
	//private By nextPaymentButton = By.xpath("//button[@class='el-button checkout__button el-button--primary']//span[text()='Next: Payment']");
	private By nextPaymentButton = By.xpath("//span[text()='Next: Payment']");
	private By nextPaymentButtonDE = By.xpath("//span[text()='Weiter: Zahlung']");
	private By nextPaymentButtonFR = By.xpath("//span[text()='Suivant: Paiement']");
//private By nameText =  By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div[1]/input");
//	xpath=(//input[@type='text'])[12]
//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div/form/div/div/div/input
//xpath=//div[2]/div/div/form/div/div/div/input
	
	private By nameText = By.cssSelector(".checkout__card-name .el-input__inner");
//.checkout__card-name .el-input__inner
    
   private By nameTextUS =  By.xpath("//*[@id=\"app\"]/main/div/div[2]/form[2]/div[2]/div/div[1]/form/div[2]/div/div[1]/input");
	//private By nameText = By.xpath("//div[@class='checkout_input el-input']//input[@class='el-input__inner']");
	//private By cardNo = By.xpath("//div[@class='el-form-item__content']//div[@class='checkout_input el-input']//input[@class='el-input__inner']");
	private By cardNo = By.cssSelector(".checkout__card-number .el-input__inner");
  
  //css=.checkout__card-number .el-input__inner
	//xpath=(//input[@type='text'])[13]
	//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div/form/div[2]/div/div/input
	//xpath=//form/div[2]/div/div/input
	
	private By useAddressAsItIsBtn = By.xpath("//span[contains(text(), 'Use address as is*')]");
//  private By useAddressAsItIsBtn = By.xpath("//button[@class='el-button checkout_button address-dialog_use-address-btn el-button--primary']//span[contains(text(), 'Use address as is*')]");
  //*[@id="app"]/main/div/form/div[13]/div/div[2]/div[1]/div[2]/div/div[3]/button
    private By closeWindowAddressBtn = By.xpath("//*[@id=\"app\"]/main/div/form/div[13]/div/div[1]/button");
    private By nextBtnPayPal = By.id("btnNext");
    private By klarnaBtn = By.xpath("//span[text()='Klarna']");
   // private By sofortBtn = By.xpath("//label[@class='el-radio is-checked payment-method-radio payment-method__SOFORT']");
    private By sofortBtn = By.xpath("//span[text()='Sofort']");
    private By giropayBtn = By.xpath("//span[text()='Giropay']");
     private By payPalBtn = By.xpath("//span[text()='Paypal']");
    private By creditCardBtn = By.xpath("//label[@class='el-radio is-checked payment-method-radio payment-method__SA_SILENTPOST']");
    private By reviewOrderBtn = By.id("paymentbtncs");
    private By BICFieldGiropay = By.xpath("//input[@type='text'])[12]");
   // private By BICFieldGiropay = By.xpath("//*[@id=\"app\"]/main/div/div[1]/form[2]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/input");
  // cssSelector .el-form-item__content:nth-child(2) > .checkout_input > .el-input__inner
  //  xpath=(//input[@type='text'])[12]
    
    private By dateOfBirthFieldKlarna = By.id("purchase-approval-national-identification-number");
	private By iframeKlarna = By.id("klarna-credit-fullscreen iframe");
  //id klarna-payments-device-recognition iframe
  		//id klarna-credit-fullscreen iframe
  		//id purchase-approval-national-identification-number
	//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/input
		//	xpath=//div/div/div/div/div/div/div/div/input
			
    private By continueKlarnaBtn = By.xpath("//div[@id='purchase-approval__container']//span[@id='purchase-approval-continue__text']");
    //span[text()='Credit Card']
    
    private By signInLink = By.xpath("//a[text()='Sign In']");
    
  //  private By typeCardLocator = By.id("c-ct");
    private By typeCardLocator = By.xpath("//*[@id=\"c-ct\"]");
    private By idealBtn = By.xpath("//span[text()='iDeal']");
    //labe[@class='el-radio payment-method-radio payment-method__IDEAL']
    
    //xpath=//span[contains(.,'MasterCard')]
    //month and day expir card
    //css=.el-form-item:nth-child(7) .el-select__caret
//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div/form/div[4]/div/div/div/span/span/i
    //month xpath=//li[contains(.,'June')]
    
    //sageata //css=.el-form-item:nth-child(8) .el-select__caret
    //year xpath=//span[contains(.,'2021')]
    //cvv css=.checkout__card-cvn .el-input__inner  xpath=(//input[@type='text'])[17]   xpath=//div[6]/div/div/input
    
	//xpath=//span[contains(.,'Paypal')]
    //xpath=//span[contains(.,'Giropay')]
    //xpath=//span[contains(.,'Klarna')]
    //xpath=//span[contains(.,'Sofort')]
    //xpath=//span[contains(.,'Kreditkarte')]
    
    private By arrowExpMonth = By.cssSelector(".el-form-item:nth-child(7) .el-select__caret");
    		//sageata month css=.el-form-item:nth-child(7) .el-select__caret 
    		//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div/form/div[4]/div/div/div/span/span/i
    		//xpath=//div[4]/div/div/div/span/span/i
    
    
    private By arrowExpYear = By.cssSelector(".el-form-item:nth-child(8) .el-select__caret");
  //sageata year css=.el-form-item:nth-child(8) .el-select__caret
  		//xpath=//section[@id='app']/main/div/div/form[2]/div[2]/div/div/form/div[5]/div/div/div/span/span/i
  		//xpath=//div[5]/div/div/div/span/span/i
    public CheckoutProcessPage(WebDriver driver) {
		super(driver);
	}

	public void clickEditBag() {
		logger.info("Editing bag..");
		WebDriverUtils.clickOnElementWithWait(driver, editBagLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void reviewOrder() {
		WebDriverUtils.scroll300(driver, reviewOrderBtn);
		WebDriverUtils.clickOnElementWithWait(driver, reviewOrderBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
		public void clickCheckoutBtn() {
		WebDriverUtils.scrollLittDown(driver, checkoutBtn);
		WebDriverUtils.clickOnElementWithWait(driver, checkoutBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterEmailPayPal(String emailValue) {
    	logger.info("Entering email..");
		//WebElement iframeSwitch =  driver.findElement(By.id("main"));
		//driver.switchTo().frame(iframeSwitch);
		WebDriverUtils.enterTextBox(driver, emailTxtBoxPayPal, emailValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		driver.switchTo().defaultContent();
	}
	
	public void enterPasswordPayPal(String passwordValue) {
		logger.info("Entering password..");
		WebDriverUtils.enterTextBox(driver, passwordTxtBoxPaypal, passwordValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void clickLoginPayPal() {
		logger.info("Loging into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, loginPayPal);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickContinuePayPal() {
		logger.info("Continue into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, continueBtnPayPal);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickConfirmPayPal() {
		logger.info("Confirm paypal payment into PayPal Account..");
		WebDriverUtils.clickOnElementWithWait(driver, confirmPayPal);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectArrow() {
		logger.info("Selecting country..");
		WebDriverUtils.clickOnElementWithWait(driver, arrowCountry);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
		
	public void selectCountry(String optionCountry) {
		switch (optionCountry) {
		case "Belgium":
			WebDriverUtils.clickOnElementWithWait(driver, selectOptionBE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			break;
	    case "Deutschland":
			logger.info("Choosing Sofort..");
			WebDriverUtils.clickOnElementWithWait(driver, selectOptionDE);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		    break;
		case "France":
			logger.info("Choosing Giropay..");
			WebDriverUtils.scroll500Down(driver, selectOptionFR);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			break;
			
		case "UK":
			logger.info("Choosing  Credit Card..");
		  WebDriverUtils.clickOnElementWithWait(driver, selectOption);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
				break;
			default:
			throw new RuntimeException("Language" + optionCountry + "not supported");
		}
	}

	public void selectState() {
		logger.info("Selecting state..");
		WebDriverUtils.clickOnElementWithWait(driver, arrowCountry);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, selectState);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterFName(String nameValue) {
		logger.info("Entering first name..");
		WebDriverUtils.enterTextBox(driver, firstName, nameValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void closeWindowAddress() {
		WebDriverUtils.clickOnElementWithWait(driver, closeWindowAddressBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void useAddressAsItIs() {
		WebDriverUtils.clickOnElementWithWait(driver, useAddressAsItIsBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterLName(String lastValue) {
		logger.info("Entering last name..");
		WebDriverUtils.enterTextBox(driver, lastName, lastValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterAddress(String addressValue) {
		logger.info("Entering address address..");
		WebDriverUtils.enterTextBox(driver, address, addressValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterAddress1(String addressValue1) {
		logger.info("Entering address1 name..");
		WebDriverUtils.enterTextBox(driver, address1, addressValue1);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterCity(String cityValue) {
		logger.info("Entering city name..");
		WebDriverUtils.enterTextBox(driver, city, cityValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterZipCode(String zipCodeValue) {
		logger.info("Entering zip code..");
		WebDriverUtils.enterTextBox(driver, zipCode, zipCodeValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkBillingCheckBox() {
		logger.info("Checking billing address the same..");
		WebDriverUtils.clickOnElementWithWait(driver, checkCheckBoxBilling);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void pressPaymentMethods(String optionMethod) {
		switch (optionMethod) {
		case "Klarna":
			logger.info("Choosing Klarna..");
			WebDriverUtils.scroll500Down(driver, klarnaBtn);
			WebDriverUtils.clickOnElementWithWait(driver, klarnaBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			break;
			
	    case "Sofort":
			logger.info("Choosing Sofort..");
			WebDriverUtils.scroll500Down(driver, sofortBtn);
			WebDriverUtils.clickOnElementWithWait(driver, sofortBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
		    break;
		    
		case "Giropay":
			logger.info("Choosing Giropay..");
			WebDriverUtils.scroll500Down(driver, giropayBtn);
			WebDriverUtils.clickOnElementWithWait(driver, giropayBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
			break;
			
		case "CreditCard":
			logger.info("Choosing  Credit Card..");
			WebDriverUtils.scroll500Down(driver, creditCardBtn);
			WebDriverUtils.clickOnElementWithWait(driver, creditCardBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				break;
				
		case "Ideal":
			logger.info("Choosing  Ideal..");
			WebDriverUtils.scroll500Down(driver, idealBtn);
			WebDriverUtils.clickOnElementWithWait(driver, idealBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				break;
			
		case "PayPal":
			logger.info("Choosing PayPal..");
			WebDriverUtils.scroll500Down(driver, payPalBtn);
			WebDriverUtils.clickOnElementWithWait(driver, payPalBtn);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
				break;
		default:
			throw new RuntimeException("Language" + optionMethod + "not supported");
		}
	}

	public void enterMobile(String mobileValue) {
		logger.info("Entering mobile phone..");
		WebDriverUtils.enterTextBox(driver, mobile, mobileValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterEmail(String emailValue) {
		logger.info("Entering email..");
		WebDriverUtils.enterTextBox(driver, email, emailValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkAddToAddressBox() {
		logger.info("Checking add to address box..");
		WebDriverUtils.clickOnElementWithWait(driver, addToAddressBoxCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkStayInTouch() {
		logger.info("Checking stay in touch checkbox..");
		WebDriverUtils.clickOnElementWithWait(driver, stayInTouchCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void continueCheckoutDE() {
		logger.info("Continue checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, continueCheckoutDE);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}
	
	public void continueCheckout1() {
		logger.info("Continue checkout..");
		WebDriverUtils.clickOnElementWithWait(driver, continueCheckout1);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkStandardDelivery() {
		logger.info("Checking standard delivey..");
		WebDriverUtils.clickOnElementWithWait(driver, standardCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkExpressDelivery() {
		logger.info("Checking express delivery..");
		WebDriverUtils.clickOnElementWithWait(driver, expressCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkPayPal() {
		logger.info("Checking paypal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void checkCreditCard() {
		logger.info("Checking credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, creditCardCheck);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterCardName(String cardNameValue) {
		logger.info("Entering card name..");
		//WebDriverUtils.enterTextBox(driver, cardName, cardNameValue);
		WebDriverUtils.clickOnElementWithWait(driver, cardArrow);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, selectCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterCardNameNotlogged(String cardNameValue) {
		logger.info("Entering card name..");
		WebDriverUtils.scroll350Down(driver, nameText);
		WebDriverUtils.enterTextBox(driver, nameText, cardNameValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterCardNameNotloggedUS(String cardNameValue) {
		logger.info("Entering card name..");
		WebDriverUtils.scroll350Down(driver, nameTextUS);
		WebDriverUtils.enterTextBox(driver, nameTextUS, cardNameValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterCardNo(String cardNumberValue) {
		logger.info("Entering card number..");
		WebDriverUtils.enterTextBox(driver, cardNo, cardNumberValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectTypeCardMasterCard() {
		logger.info("Selecting type of credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, selectTypeCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, optionCardMasterCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectTypeCardVisa() {
		logger.info("Selecting type of credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, selectTypeCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, optionCardVisa);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectTypeCardAmericanExpress() {
		logger.info("Selecting type of credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, selectTypeCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, optionCardAmericanExpress);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectTypeCard(String optionTypeCardValue) {
		WebDriverUtils.selectDropDown(driver, typeCardLocator, optionTypeCardValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectExpirationMonth() {
		logger.info("Selecting expiration month credit card..");
		WebDriverUtils.scroll350Down(driver, arrowExpMonth);
		WebDriverUtils.clickOnElementWithWait(driver, arrowExpMonth);
		WebDriverUtils.clickOnElementWithWait(driver, expirationDateMonth);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectExpirationMonthUS() {
		logger.info("Selecting expiration month credit card..");
		WebDriverUtils.scroll350Down(driver, expirationDateMonthUS);
		WebDriverUtils.clickOnElementWithWait(driver, expirationDateMonthUS);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, monthExpirationUS);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void selectExpirationMonthDE() {
		logger.info("Selecting expiration month credit card..");
		WebDriverUtils.scroll350Down(driver, arrowExpMonth);
		WebDriverUtils.clickOnElementWithWait(driver, arrowExpMonth);
		WebDriverUtils.clickOnElementWithWait(driver, expirationDateMonthDE);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void selectExpirationYear() {
		logger.info("Selecting expiration year credit card..");
	//	WebDriverUtils.scroll350Down(driver, arrowExpMonth);
		WebDriverUtils.clickOnElementWithWait(driver, arrowExpYear);
		WebDriverUtils.clickOnElementWithWait(driver, expirationDateYear);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		
	}
	
	public void selectExpirationYearUS() {
		logger.info("Selecting expiration year credit card..");
		WebDriverUtils.clickOnElementWithWait(driver, expirationDateYearUS);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, yearExpirationUS);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterSecurityCode(String securityCardValue) {
		logger.info("Entering security card..");
		//WebDriverUtils.scroll500Down(driver, securityCode);
		//css=.checkout__card-cvn .el-input__inner
		//xpath=(//input[@type='text'])[17]
		WebDriverUtils.enterTextBox(driver, securityCode, securityCardValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void clickBuyNow() {
		logger.info("Buying now..");
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void nextBtnPayPal() {
		WebDriverUtils.clickOnElementWithWait(driver, nextBtnPayPal);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void gotoPayPal() {
		logger.info("Going to PayPal..");
		WebDriverUtils.clickOnElementWithWait(driver, paypalBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void placeOrder() {
		logger.info("Placing my order..");
		WebDriverUtils.clickOnElementWithWait(driver, placeOrderBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void expandPromoCode() {
		logger.info("Expanding promo code..");
		WebDriverUtils.clickOnElementWithWait(driver, expandPromoCode);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void expandGiftCard() {
		logger.info("Expanding gift card..");
		WebDriverUtils.clickOnElementWithWait(driver, expandGiftCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void apply() {
		logger.info("Apply..");
		WebDriverUtils.clickOnElementWithWait(driver, applyGifCard);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterPin(String pinValue) {
		logger.info("Entering pin..");
		WebDriverUtils.enterTextBox(driver, pinTxtBox, pinValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterGiftCard(String giftCardValue) {
		logger.info("Entering gift card..");
		WebDriverUtils.enterTextBox(driver, giftCardTxtBox, giftCardValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickSignIn() {
		WebDriverUtils.clickOnElementWithWait(driver, signInLink);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	public void enterPromoCode(String promoCodeValue) {
		logger.info("Entering promo code..");
		WebDriverUtils.enterTextBox(driver, promoCodeTxtBox, promoCodeValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickNextPayment() {
		logger.info("Going to the payment section..");
		WebDriverUtils.scroll500Down(driver, nextPaymentButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaymentButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickNextPaymentDE() {
		logger.info("Going to the payment section..");
		WebDriverUtils.scroll500Down(driver, nextPaymentButtonDE);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaymentButtonDE);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void clickNextPaymentFR() {
		logger.info("Going to the payment section..");
		WebDriverUtils.scroll500Down(driver, nextPaymentButtonFR);
		WebDriverUtils.clickOnElementWithWait(driver, nextPaymentButtonFR);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void enterBICGiropay(String BICValue) {
		WebDriverUtils.enterTextBox(driver, BICFieldGiropay, BICValue);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public void dateofBirthKlarna(String date) {
		WebElement iframeSwitch = driver.findElement(By.id("klarna-payments-device-recognition iframe"));
		driver.switchTo().frame(iframeSwitch);
		WebDriverUtils.enterTextBox(driver, dateOfBirthFieldKlarna, date);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		//driver.switchTo().defaultContent();
	}
	
	public void scrollLitlleDown() {
		WebDriverUtils.scroll300(driver, reviewOrderBtn);
	}
	
	public void continueKlarna() {
		WebDriverUtils.clickOnElementWithWait(driver, continueKlarnaBtn);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	public CheckoutProcessCompletePage returnCheckoutProcessCompletePage() {
		WebDriverUtils.scroll350Down(driver, buyNowBtn);
		WebDriverUtils.clickOnElementWithWait(driver, buyNowBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(checkoutCompleteText));
		return new CheckoutProcessCompletePage(driver);
	}
}
