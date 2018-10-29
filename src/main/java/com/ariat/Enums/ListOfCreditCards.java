package com.ariat.Enums;

/**
 * Groups all available Core card payments and their corresponding test card
 * numbers
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public enum ListOfCreditCards {

	AMERICAN_EXPRESS("American Express", "378282246310005"),
	AMERICAN_EXPRESS_CORPORATE("American Express Corporate", "378734493671000"),
	AUSTRALIAN_BANKCARD("Australian BankCard", "5610591081018250"),
	DINERS_CLUB("Diners Club", "30569309025904"),
	DISCOVER("Discover", "6011111111111117"),
	JCB("JCB", "3530111333300000"),
	JCB1("JCB", "3566002020360505"),
	MASTER_CARD("MasterCard", "5555555555554444"),
	MASTER_CARD1("MasterCard", "5105105105105100"),
	VISA("Visa", "4111111111111111"),
	VISA1("Visa", "4012888888881881"),
	VISA2("Visa", "4222222222222"),
	DANKORT_PBS("Dankort", "76009244561"),
	DANKORT_PBS1("Dankort", "5019717010103742"),
	SWITCH_SOLO("Switch/Solo (Paymentech)", "6331101999990016");

	private String name;
	private String number;

	private ListOfCreditCards(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
}
