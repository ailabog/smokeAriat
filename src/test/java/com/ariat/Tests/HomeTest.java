package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Home Page instantiates the browser and access the ariat environment and verifies ariat logo
 * @author aila.bogasieru@ariat.com
 *
 */

public class HomeTest extends BaseTest{

	private Environments environment;
	private HomePage homePage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	
	@Test
	public void setSubscription() {
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.setSubscription();
		//homePage.closeSubscription();
		homePage.signUpSubscription();
		//homePage.USlocation();
		//homePage.closeLocation();
		homePage.verifyLogo();
	}
	
	@Test
	public void UKlocation() {
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.setSubscription();
		//homePage.closeSubscription();
		homePage.signUpSubscription();
		homePage.UKlocation();
		//homePage.closeLocation();
		homePage.verifyLogo();
	}
	
	@Test
	public void USlocation() {
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		//homePage.setSubscription();
		//homePage.closeSubscription();
		//homePage.signUpSubscription();
		homePage.USlocation();
		//homePage.closeLocation();
		homePage.verifyLogo();
	}
	
	@Test
	public void homeTest() {
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		//homePage.setSubscription();
		homePage.closeSubscription();
		//homePage.signUpSubscription();
		//homePage.USlocation();
		//homePage.closeLocation();
		//homePage.verifyLogo();
	} 
	
	
	@AfterMethod
	public void tearDown() {
		homePage.quit();
	}
}
