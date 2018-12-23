package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.MyAccountPage;
import com.ariat.Pages.MyOrdersPage;
import com.ariat.Pages.OrderDetailsPage;
import com.ariat.Pages.SignInPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Order details from different type of navigation and checks values from
 * order
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class OrderDetailsTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private OrderDetailsPage orderDetailsPage;
	private MyAccountPage myAccountPage;
	private MyOrdersPage myOrdersPage;

	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345!";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void ordersChecksViewAllOrdersTest() {
		logger.info("Starting order details checks - View all orders test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNav();
		orderDetailsPage = myAccountPage.returnOrderDetailsMyOrdersPageMiddleNav();
		orderDetailsPage.returnMyOrdersBackFromOrderDetailsPage();
		logger.info("Finishing order details checks - View all orders test...");
	}

	@Test(priority = 1)
	public void orderChecksMyAccountMiddleNavTest() {
		logger.info("Starting order details checks - My account view test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		orderDetailsPage = myAccountPage.returnOrderDetailsMyAccountPageMiddleNav();
		orderDetailsPage.returnMyOrdersBackFromOrderDetailsPage();
		logger.info("Finishing order details checks - My account view test...");
	}

	@Test(priority = 2)
	public void orderChecksMyAccountTopNavTest() {
		logger.info("Starting orders check information orders test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myOrdersPage = myAccountPage.returnMyOrdersPageTopNav();
		logger.info("Finishing orders check information orders test.");
	}
}
