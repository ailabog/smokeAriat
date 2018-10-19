package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.CreateAccountPage;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.SignInPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test create account by instantiating the browser, go to Home page, and calls
 * all the methods such as: create account, login, check order status
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class CreateAcountTest extends BaseTest {

	private Environments environment;
	private CreateAccountPage createAccountPage;
	private HomePage homePage;
	private SignInPage signInPage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void createAccount() {
		logger.info("Starting create account test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.setSubscription();
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		createAccountPage = signInPage.returnCreateAccountPage();
		createAccountPage.createAccount();
		createAccountPage.GenderFemale();
		createAccountPage.productsEnglishCheck();
		createAccountPage.createAccountClick();
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		createAccountPage.quit();
	}
}
