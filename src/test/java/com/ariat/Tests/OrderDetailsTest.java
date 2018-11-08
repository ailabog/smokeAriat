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
import com.ariat.Pages.ReturnItemsPage;
import com.ariat.Pages.SalesReturnConfirmationPage;
import com.ariat.Pages.SignInPage;
import com.ariat.Pages.VerifyReturnItemsPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test Order details from different type of navigation and checks values from order
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


	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345!";
	private static final String order_no = "10002432";
	private static final String date = "30 Oct 2018";
	private static final String status = "Not shipped";
	private static final String total = "£250.00";
	

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void orderDetailsTest() {
		
		logger.info("Starting order details checks test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNav();
		orderDetailsPage = myAccountPage.returnOrderDetailsPagesMiddleNav();
		orderDetailsPage.assertInfoOrderDetails(order_no, date, status, total);
		orderDetailsPage.returnMyOrdersBackFromOrderDetailsPage();
		logger.info("Finishing order details check test...");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		orderDetailsPage.quit();
		}
}
