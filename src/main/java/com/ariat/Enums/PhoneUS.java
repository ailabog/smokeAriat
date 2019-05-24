package com.ariat.Enums;

/**
 * List of US phones
 * @author aila.bogasieru@ariat.com
 */


public enum PhoneUS {
	
	
	phone1("208252-7991"), 
	phone2("(442)226-3903"), 
	phone3("(669)666-5709"),
	phone4("(201)455-3324"),
	phone5("(787)922-8878"),
	phone6("(716)213-6898"), 
	phone7("(314)319-9069"),
	phone9("(575)512-4841"), 
	phone10("(343)400-7358"),
	phone11("(520)345-3484");

	private String number;

	private PhoneUS(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
		
	}
	
}
