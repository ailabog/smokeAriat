package com.ariat.Utils;

	import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ariat.Enums.Browserstack;
import com.ariat.Enums.Environments;
import com.ariat.Exceptions.BrowserException;
import com.ariat.Exceptions.WebDriverException;
import com.ariat.Pages.Main.CreateAccountPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Environment;

	/**
	 * Utility class that provides browser/device configuration by using
	 * Browserstack.
	 * 
	 * @author aila.bogasieru@ariat.com
	 *
	 */
	public class BrowserUtils {

		private static final Logger logger = LoggerFactory.getLogger(CreateAccountPage.class);

		private static final String BROWSERSTACK_URL = "http://mohammed.jamboo@ariat.com:Rocking@10@hub.browserstack.com/wd/hub";
		private static final String BROWSERSTACK_BROWSERS_URL = "https://mohammed.jamboo@ariat.com:Rocking@10@www.browserstack.com/automate/browsers.json";
		private static final List<Browser> browsers = getAllSupportedBrowsers();

		public static WebDriver configureBrowser(String device, String browser, Environments environment, Integer offset) {
			try {
				logger.debug("Configuring browser {} for device {} and offset {}", browser, device, offset);
				return new RemoteWebDriver(new URL(BROWSERSTACK_URL), getConfiguration(device, browser, offset));
			} catch (MalformedURLException e) {
				logger.error("Browserstack url is not valid");
				throw new BrowserException(e);
			} catch (org.openqa.selenium.WebDriverException e1) {
				logger.error("WebDriverException thrown: {}", e1.getMessage());
				throw new WebDriverException(e1);
			}
		}

		private static DesiredCapabilities getConfiguration(String device, String browser, Integer offset) {
			DesiredCapabilities caps = new DesiredCapabilities();
			Browserstack config = Browserstack.getBy(device, browser, offset);
			caps.setCapability("browser", config.getBrowser());
			caps.setCapability("browserstack.debug", "true");
			caps.setCapability("os", config.getOS());
			caps.setCapability("os_version", config.getOSVersion());
			caps.setCapability("browserstack.safari.enablePopups", "true");
			if (config.isMobileDevice()) {
				caps.setCapability("realMobile", "true");
				caps.setCapability("device", config.getDevice());
			} else if (config.isDesktopDevice()) {
				if (Browserstack.SAFARI_DESKTOP_MINUS_1 == config) {
					SafariOptions options = new SafariOptions();
					options.setUseTechnologyPreview(true);
					caps.setCapability(SafariOptions.CAPABILITY, options);
				}
				caps.setCapability("browserstack.geckodriver", "0.18.0");
				caps.setCapability("browser_version", getBrowserVersion(config, offset));
			} else {
				logger.error("Device {} is not supported.", device);
				throw new BrowserException("Device ".concat(device).concat(" is not supported."));
			}
			return caps;
		}

		// @formatter:off
		private static String getBrowserVersion(Browserstack config, Integer offset) {
			return browsers.stream()
					.filter(browser -> browser.getBrowserVersion() == null || !browser.getBrowserVersion().contains("beta"))
					.filter(browser -> browser.getBrowser().equalsIgnoreCase(config.getBrowser()))
					.filter(browser -> browser.getOs().equalsIgnoreCase(config.getOS()))
					.filter(browser -> browser.getOsVersion().equalsIgnoreCase(config.getOSVersion()))
					.map(Browser::getBrowserVersion)
					.sorted((v1, v2) -> Double.compare(Double.valueOf(v2), Double.valueOf(v1)))
					.skip(config.isSafariDesktop() ? 0 : offset)
					.findFirst()
					.orElseThrow(() -> new BrowserException("Error occurred while retrieving browser version."));
		}
		// @formatter:on

		private static List<Browser> getAllSupportedBrowsers() {
			ObjectMapper mapper = new ObjectMapper();
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(BROWSERSTACK_BROWSERS_URL);
			try {
				return mapper.readValue(client.execute(request).getEntity().getContent(),
						new TypeReference<List<Browser>>() {
						});
			} catch (ParseException | IOException e) {
				logger.error("Error occurred while retrieving data from Browserstack {}.", e);
				throw new BrowserException("Error occurred while retrieving data from Browserstack.");
			}
		}
	}

