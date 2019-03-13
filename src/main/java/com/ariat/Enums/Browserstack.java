package com.ariat.Enums;

import java.util.stream.Stream;
import org.testng.SkipException;

	/**
	 * Groups Browserstack configuration: os, device, browser...
	 * 
	 * @author aila.bogasieru@ariat.com
	 *
	 */
	public enum Browserstack {

		// @formatter:off
		CHROME_DESKTOP(null, "Desktop", "Chrome", "Chrome", "Windows", "7", null), 
		EDGE_DESKTOP(null, "Desktop", "Edge", "Edge", "Windows", "10", null),
		IE_DESKTOP(null, "Desktop", "IE", "Internet Explorer", "Windows", "7", null), 
		FIREFOX_DESKTOP(null, "Desktop", "Firefox", "Firefox", "Windows", "7", null),
		SAFARI_DESKTOP_CURRENT(null, "Desktop", "Safari", "Safari", "OS X", "High Sierra", 0),
		SAFARI_DESKTOP_MINUS_1(null, "Desktop", "Safari", "Safari", "OS X", "Sierra", 1),
		SAFARI_DESKTOP_MINUS_2(null, "Desktop", "Safari", "Safari", "OS X", "El Capitan", 2),
		CHROME_MOBILE("Google Nexus 6", "Mobile", "Android", "Chrome", "Android", "6.0", null),
		SAFARI_MOBILE("iPhone 7", "Mobile", "Iphone", "Safari", "IOS", "10.3", null);
		// @formatter:on

		private String device;
		private String eswDevice;
		private String browser;
		private String eswBrowser;
		private String os;
		private String osVersion;
		private Integer offset;

		private Browserstack(String device, String eswDevice, String browser, String eswBrowser, String os,
				String osVersion, Integer offset) {
			this.device = device;
			this.eswDevice = eswDevice;
			this.browser = browser;
			this.eswBrowser = eswBrowser;
			this.os = os;
			this.osVersion = osVersion;
			this.offset = offset;
		}

		public String getDevice() {
			return device;
		}

		private String getESWDevice() {
			return eswDevice;
		}

		public String getBrowser() {
			return browser;
		}

		private String getESWBrowser() {
			return eswBrowser;
		}

		public String getOS() {
			return os;
		}

		public String getOSVersion() {
			return osVersion;
		}

		public Integer getOffset() {
			return offset;
		}

		// @formatter:off
		public static Browserstack getBy(String device, String browser, Integer offset) {
			return Stream.of(values())
					.filter(b -> b.getESWDevice().equals(device) && b.getESWBrowser().equals(browser))
					.filter(b -> !b.isSafariDesktop() || (b.isSafariDesktop() && b.getOffset().equals(offset)))
					.findFirst()
					.orElseThrow(() -> new SkipException("Unsupported device and browser."));
		}
		// @formatter:on

		public boolean isMobileDevice() {
			return "Mobile".equals(getESWDevice());
		}

		public boolean isDesktopDevice() {
			return "Desktop".equals(getESWDevice());
		}

		private boolean isSafariBrowser() {
			return "Safari".equals(getESWBrowser());
		}

		public boolean isSafariDesktop() {
			return isDesktopDevice() && isSafariBrowser();
		}
	}

