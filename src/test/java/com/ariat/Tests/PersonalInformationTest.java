package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.PersonalnformationPage;
import com.ariat.Pages.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class PersonalInformationTest extends BaseTest {

	private HomePage homePage;
	private Environments environment;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;
	private PersonalnformationPage personalInformationPage;
	

	private static final String EMAIL = "aila.bogasieru@gmail.com";
	private static final String PASSWORD = "Parola12345!";
	private static final String NEW_EMAIL = "aila.bogasieru@yahoo.com";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void updatePersonalInformationTest() {
		logger.info("Starting update personal information test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		personalInformationPage = myAccountPage.returnEditProfilePage();
		personalInformationPage.clearEmail();
		personalInformationPage.enterEmail(NEW_EMAIL);
		personalInformationPage.confirmEmail(NEW_EMAIL);
		personalInformationPage.enterPassword(PASSWORD);
		personalInformationPage.confirmPassword(PASSWORD);
		personalInformationPage.saveEdits();
		logger.info("Update personal information test ended...");
	}
	
	@Test
	public void unsubscribePersonalInformationTest() {
		logger.info("Starting unsubscribe from Ariat email list...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.closeSubscription();
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		personalInformationPage = myAccountPage.returnEditProfilePage();
		personalInformationPage.unsubscribeClick();
		logger.info("Unsubscribing from Ariat email list ended...");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		personalInformationPage.quit();
	}
}
