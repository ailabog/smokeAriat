package com.ariat.Enums;

/**
 * Enumerator with available environments
 * @author aila.bogasieru@ariat.com
 */

public enum Environments {
	
	STAGING("http://staging.ariat.com"),
	DEVELOPMENT("http://development.ariat.com");
	
	private String URL;
	
	private Environments(String URL) {
		this.URL = URL;
	}
	
	public String getURL() {
		return URL;
	}
}
