package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Pages.Main.ProductRegistrationPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class ProductRegistrationUSTest extends BaseTest{
	 
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private Environments environment;
	private ProductRegistrationPage productRegistrationPage;
	private MyAccountPage myAccountPage;
	private EUCountries euCountry;
	
	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void createAccountTest() {
		logger.info("Starting product registration test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.STAGING.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		productRegistrationPage = homePageUS.returnProductRegistrationPage();
		productRegistrationPage.continue1();
		productRegistrationPage.enterEmail("aila.bogasieru@yahoo.com");
		productRegistrationPage.continue2();
		productRegistrationPage.generateCode();
		productRegistrationPage.continue3();
		productRegistrationPage.selectCat("Women's", "Footwear", "Casual");
		productRegistrationPage.continue4();
		productRegistrationPage.collectInfoCustomer("A", "B", "Str", "New York", "New York", "345", "3643544");
		productRegistrationPage.continue5();
		productRegistrationPage.saveInfo();
		myAccountPage = productRegistrationPage.returnMyAccountPage();
	    logger.info("Product registration test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
		productRegistrationPage.quit();
		myAccountPage.quit();
	}
}
