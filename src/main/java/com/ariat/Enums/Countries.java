package com.ariat.Enums;

/**
 * Shortcuts of countries by country code
 * @author aila.bogasieru@ariat.com
 */

public enum Countries {
	
	RO("Romania",              "RON",              "Romanian New leu"),
	USA("United States",       "USD",              "US dollar"),
	UK("English (United Kingdom)",       "GBP",              "British pound"),
	BE("Belgium",              "EUR",              "EURO"),
	BG("Bulgaria",             "BGN",              "Bulgarian leva"),
	CA("Canada",               "CAD",              "Canadian dollar"),
	DK("Denmark",              "DKK",              "Danish krone"),
	AU("Australia",            "AUD",              "Australian dollar");
	//TO DO
	//ADD ALL THE COUNTRIES WITH THE CORRESPONDING CURRENCY
	
	private String countryName;
	private String currencyISO;
	private String currencyFullName;
	
	private Countries(String countryName, String currencyISO, String currencyFullName) {
		this.countryName = countryName;
		this.currencyISO = currencyISO;
		this.currencyFullName = currencyFullName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	public String getCurrencyISO() {
		return currencyISO;
	}
	public String getCurrencyFullName() {
		return currencyFullName;
	}
}
