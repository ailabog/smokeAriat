package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and
 * verifies ariat logo
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomeTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void UKlocationTest() {
		logger.info("Starting the test for UK location:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.setSubscription();
		homePage.signUpSubscription();
		homePage.chooseLocation();
		homePage.UKlocation();
		homePage.saveAndContinueLocation();
		homePage.verifyLogo();
		logger.info("Finishing the test for UK location:");
	}

	@Test
	public void closeSubscriptionTest() {
		logger.info("Starting the test for closing the subscription:");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		logger.info("The subscription was close successfully!");
	}

	@Test
	public void setSubscriptionTest() {
		logger.info("Starting the signup subscription");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.setSubscription();
		homePage.signUpSubscription();
		homePage.verifyLogo();
		logger.info("Subscription signup successfully!");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
	}
}
