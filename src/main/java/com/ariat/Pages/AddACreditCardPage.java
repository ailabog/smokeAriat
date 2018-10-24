package com.ariat.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddACreditCardPage extends BasePage{
	
	private By cardNickNameTextBox = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_nickname");
	private By nameOnTheCardTextBox = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_owner");
	private By typeCardSelect = By.name("Card Type");
	private By cardNoTextBox = By.id("c-cardnumber");
	private By expirationMonthSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_month");
	private By expirationYearSelect = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_year");
	private By applyButton = By.id("applyBtn");
	private By cancelButton = By.xpath("//button[text()='Cancel]");

	protected AddACreditCardPage(WebDriver driver) {
		super(driver);
		
	}

}
