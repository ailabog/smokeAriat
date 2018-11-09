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
 * Test return item for an logged customer and for a returning customer using different navigation
 * top nav for returning customer
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class ReturnItemTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private SignInPage signInPage;
	private OrderDetailsPage orderDetailsPage;
	private ReturnItemsPage returnItemsPage;
	private VerifyReturnItemsPage verifyReturnItemsPage;
	private SalesReturnConfirmationPage salesReturnConfirmationPage;
	private MyAccountPage myAccountPage;
	private MyOrdersPage myOrdersPage;

	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345!";
	public static final String ORDER_NO = "10002429";
	public static final String BILLING_ZIP_CODE = "35435";
	private static final String RETURN_REASON = "Uncomfortable";
	private static final String RETURN_REASON1 = "Shipping error";
	private static final String EXPECTED_MESSAGE = "Please select at least one item you wish to return";
	private static final String REASON_DESCRIPTION = "The article is not comfortable as expected";

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test
	public void returnItemWithoutBeingLoggedTest() {
		logger.info("Starting  return item for a customer not being logged test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.checkOrder(ORDER_NO, EMAIL, BILLING_ZIP_CODE);
		orderDetailsPage = signInPage.returnOrderDetailsPage();
		returnItemsPage = orderDetailsPage.returnReturnItemsPage();
		returnItemsPage.continueClick();
		returnItemsPage.AssertNoReason(EXPECTED_MESSAGE);
		orderDetailsPage = returnItemsPage.returnOrderDetailsPage();
		returnItemsPage = orderDetailsPage.returnReturnItemsPage();
		returnItemsPage.continueClick();
		returnItemsPage.checkItemClick();
		returnItemsPage.selectReturnReason(RETURN_REASON);
		returnItemsPage.describeReason(REASON_DESCRIPTION);
		returnItemsPage.selectQuantity("1");
		verifyReturnItemsPage = returnItemsPage.returnVerifyReturnItemsPage();
		salesReturnConfirmationPage = verifyReturnItemsPage.returnSalesReturnConfirmationPage();
		salesReturnConfirmationPage.returnOrderDetailsPage();
		logger.info("Finishing return item for a customer not being logged test...");
	}

	@Test
	public void returnItemReturningCustomerTest() {
		logger.info("Starting  return item as returning customer test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		signInPage = homePage.returnSignInPage();
		signInPage.returningCustomer(EMAIL);
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myOrdersPage = myAccountPage.returnMyOrdersPageTopNav();
		orderDetailsPage = myOrdersPage.returnOrderDetailsPage();
		returnItemsPage = orderDetailsPage.returnReturnItemsPage();
		returnItemsPage.checkItemClick();
		returnItemsPage.selectReturnReason(RETURN_REASON1);
		returnItemsPage.describeReason(REASON_DESCRIPTION);
		returnItemsPage.selectQuantity("1");
		verifyReturnItemsPage = returnItemsPage.returnVerifyReturnItemsPage();
		verifyReturnItemsPage.editReturn();
		returnItemsPage.selectQuantity("2");
		verifyReturnItemsPage = returnItemsPage.returnVerifyReturnItemsPage();
		salesReturnConfirmationPage = verifyReturnItemsPage.returnSalesReturnConfirmationPage();
		salesReturnConfirmationPage.returnOrderDetailsPage();
		logger.info("Finishing return item as returning customer test...");
	}

	@AfterMethod
	public void tearDown() {
		homePage.quit();
		signInPage.quit();
		myAccountPage.quit();
		orderDetailsPage.quit();
		returnItemsPage.quit();
		verifyReturnItemsPage.quit();
		salesReturnConfirmationPage.quit();
	}
}
