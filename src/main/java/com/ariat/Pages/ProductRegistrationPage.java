package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Utils.WebDriverUtils;

public class ProductRegistrationPage extends BasePage {

	private By continueBtn = By.xpath("//*[@id=\"product-registration-form\"]/div[1]/div/div[4]/button");
	private By emailTxtBox = By.xpath("dwfrm_productregistration_email");
	private By continue1Btn = By.xpath("//*[@id=\"product-registration-form\"]/div[2]/div[2]/div/div/div[3]/button");
	private By hereLink = By.xpath("span[text()='here']");
	private By code = By.xpath("dwfrm_productregistration_registrationcode");
	private By continue2Btn = By.xpath("//*[@id=\"product-registration-form\"]/div[3]/div[2]/div/div/div[3]/button");
	private By selectCat = By.id("ariat-select");
	private By selectsubCat = By.id("ariat-womens-select");
	private By selectsubSubCat = By.id("ariat-womens-footwear-select");
	private By continue3Btn = By.xpath("//*[@id=\"product-registration-form\"]/div[4]/div/div[3]/div/button");
	private By firstNameTxtBox = By.id("dwfrm_productregistration_shippingaddress_firstname");
	private By lastNameTxtBox = By.id("dwfrm_productregistration_shippingaddress_lastname");
	private By addressTxtBox = By.id("dwfrm_productregistration_shippingaddress_address1");
	private By cityTxtBox = By.id("dwfrm_productregistration_shippingaddress_city");
	private By stateSelect = By.id("dwfrm_productregistration_shippingaddress_states_state");
	private By zipCodeTxtBox = By.id("dwfrm_productregistration_shippingaddress_zip");
	private By phoneTxtBox = By.id("dwfrm_productregistration_shippingaddress_phone");
	private By continue4Btn = By.name("dwfrm_productregistration_submit");
	private By saveYourInfoBtn = By.xpath("//*[@id=\"product-registration-form\"]/div[6]/div/div[4]/button");
	private By passwdBtn = By.xpath("dwfrm_productregistration_password");
	private By passwdCnfBtn = By.xpath("dwfrm_productregistration_passwordconfirm");
	private By savePswdBtn = By.name("dwfrm_productregistration_save");
	private By myAccountText = By
			.xpath("//*contains[text()='//*[@id=\"product-registration-form\"]/div[6]/div/div[4]/button']");

	public ProductRegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void continue1() {
		WebDriverUtils.clickOnElementWithWait(driver, continueBtn);

	}

	public void continue2() {
		WebDriverUtils.clickOnElementWithWait(driver, continue1Btn);

	}

	public void continue3() {
		WebDriverUtils.clickOnElementWithWait(driver, continue2Btn);

	}

	public void continue4() {
		WebDriverUtils.clickOnElementWithWait(driver, continue3Btn);

	}

	public void continue5() {
		WebDriverUtils.clickOnElementWithWait(driver, continue4Btn);

	}

	public void enterEmail(String email) {
		WebDriverUtils.enterTextBox(driver, emailTxtBox, email);
	}

	public void generateCode() {
		WebDriverUtils.clickOnElementWithWait(driver, hereLink);
	}
	
	public void saveInfo() {
		WebDriverUtils.clickOnElementWithWait(driver, saveYourInfoBtn);
	}

	public void selectCat(String opt1, String opt2, String opt3) {
		WebDriverUtils.selectVisibleText(driver, selectCat, opt1);
		WebDriverUtils.selectVisibleText(driver, selectsubCat, opt2);
		WebDriverUtils.selectVisibleText(driver, selectsubSubCat, opt3);
	}
	
	public void enterpasswd(String passwd) {
		WebDriverUtils.enterTextBox(driver, passwdBtn, passwd);
		WebDriverUtils.enterTextBox(driver, passwdCnfBtn, passwd);
	}

	public void collectInfoCustomer(String fName, String fLast, String address, String city, String state, String zip,
			String phone) {
		WebDriverUtils.enterTextBox(driver, firstNameTxtBox, fName);
		WebDriverUtils.enterTextBox(driver, lastNameTxtBox, fLast);
		WebDriverUtils.enterTextBox(driver, addressTxtBox, address);
		WebDriverUtils.enterTextBox(driver, cityTxtBox, city);
		WebDriverUtils.enterTextBox(driver, stateSelect, state);
		WebDriverUtils.enterTextBox(driver, zipCodeTxtBox, zip);
		WebDriverUtils.enterTextBox(driver, phoneTxtBox, phone);
	}

	public MyAccountPage returnMyAccountPage() {
		WebDriverUtils.clickOnElementWithWait(driver, savePswdBtn);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountText));
		return new MyAccountPage(driver);
	}
}
