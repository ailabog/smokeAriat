package Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Main.MyAccountWishListPage;
import com.ariat.Pages.Main.MyBagPage;
import com.ariat.Pages.Main.MyWishListPage;
import com.ariat.Utils.WebDriverUtils;

public interface ProductAttributes {

	By addToBasket = By.cssSelector("#add-to-cart");
	By myBagText = By.xpath("*[contains[text(), 'My Bag']");
	By wishList = By.cssSelector(".add-to-wishlist");
	By bonusDialog = By.id("bonus-choose-container product-content");

	By myWishListText = By.xpath("//*contains[text(), 'Wish list']");

	By myAccountText = By.xpath("//*contains[text()='My account']");
	By myWishlistText = By.xpath("//*contains[text()='Wishlist']");

	//By selectSize = By.id("va-size");
	By selectSize = By.id("select2-va-size-container");
	//By selectSize = By.xpath("//select[@placeholder='Select Size']");
	By selectCalf = By.id("va-calf");
	By selectHeight = By.id("va-height");
	By increaseQty = By.xpath("//span[text()='+']");
	// increase qty //css=.quantity-increase

	By decreaseQty = By.xpath("//span[text()='-']");
	By writeReview = By.xpath("//*[@id=\"BVRRSummaryContainer\"]/div/div/div/div/div/div/div");
	By reviewDialog = By.id("bv-mbox-lightbox-list");
	By starReviewExcellent = By.xpath("//span[text()='Excellent']");
	By starReviewGood = By.xpath("//span[text()='Good']");
	By starReviewAverage = By.xpath("//span[text()='Average']");
	By starReviewFair = By.xpath("//span[text()='Fair']");
	By starReviewPoor = By.xpath("//span[text()='Poor']");
	By titleReview = By.id("bv-text-field-title");
	By textReview = By.id("bv-textarea-field-reviewtext");
	By addPhotoReview = By.xpath("//span[text()='Add Photo']");
	By addVideoReview = By.xpath("//button[text()=' Add Video ']");
	By addPhotoModal = By.id("bv-mbox-lightbox-list");
	By choosePhotoReview = By.id("bv-text-field-photourl_1");
	By videoModalReview = By.id("bv-mbox-lightbox-list");
	By insertVideoURLReview = By.id("bv-text-field-videourl_1");
	By addVideoButton = By.xpath("//button[text()='Add Video']");
	By recommendProductYes = By.id("bv-radio-isrecommended-true-label");
	By recommendProductNo = By.id("bv-radio-isrecommended-false-label");
	By nicknameReview = By.id("bv-text-field-usernickname");
	By userLocation = By.id("bv-text-field-userlocation");
	By emailReview = By.id("bv-email-field-hostedauthentication_authenticationemail");
	By postReviewButton = By.xpath("//span[text()='Post Review']");
	WebDriver driver = null;
	By updateButton = By.id("add-to-cart");
	By lengthLocator = By.id("va-length");

	static void selectAttributeSize(String size) {
		WebDriverUtils.selectVisibleText(driver, selectSize, size);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void selectAttributeCalf(String calf) {
		WebDriverUtils.selectVisibleText(driver, selectCalf, calf);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void selectAttributeHeight(String height) {
		WebDriverUtils.selectVisibleText(driver, selectHeight, height);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void setQtyIncrease(int n) {
		for (int i = 0; i <= n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, increaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		}
	}

	static void setQtyDecrease(int n) {
		for (int i = 0; i <= n; i++) {
			WebDriverUtils.clickOnElementWithWait(driver, decreaseQty);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		}
	}

	static void writeReviewClick() {
		WebDriverUtils.clickOnElementWithWait(driver, writeReview);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void writeReviewStar(String star) {
		if (WebDriverUtils.findElement(driver, reviewDialog) != null) {
			switch (star) {
			case "Excellent":
				WebDriverUtils.clickOnElementWithWait(driver, starReviewExcellent);
				break;

			case "Good":
				WebDriverUtils.clickOnElementWithWait(driver, starReviewGood);
				break;

			case "Average":
				WebDriverUtils.clickOnElementWithWait(driver, starReviewAverage);
				break;

			case "Fair":
				WebDriverUtils.clickOnElementWithWait(driver, starReviewFair);
				break;

			case "Poor":
				WebDriverUtils.clickOnElementWithWait(driver, starReviewPoor);
				break;

			default:
				throw new RuntimeException("No star supported");
			}
		}
	}

	static void writeReviewContent(String titleReviewText, String reviewText) {
		WebDriverUtils.enterTextBox(driver, titleReview, titleReviewText);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.enterTextBox(driver, textReview, reviewText);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void addPhoto() {
		WebDriverUtils.clickOnElementWithWait(driver, addPhotoReview);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		if (WebDriverUtils.findElement(driver, addPhotoModal) != null) {
			WebDriverUtils.clickOnElementWithWait(driver, choosePhotoReview);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			// Upload the file
		}
	}

	static void addVideo(String videoURL) {
		WebDriverUtils.clickOnElementWithWait(driver, addVideoReview);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		if (WebDriverUtils.findElement(driver, videoModalReview) != null) {
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.enterTextBox(driver, insertVideoURLReview, videoURL);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
			WebDriverUtils.clickOnElementWithWait(driver, addVideoButton);
			WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		}
	}

	static void recommendProductYes() {
		WebDriverUtils.clickOnElementWithWait(driver, recommendProductYes);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void recommendProductNo() {
		WebDriverUtils.clickOnElementWithWait(driver, recommendProductNo);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void userInfoReview(String nickname, String userLocationReview, String email) {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.enterTextBox(driver, nicknameReview, nickname);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.enterTextBox(driver, userLocation, userLocationReview);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.enterTextBox(driver, emailReview, email);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}
	
	static void selectAttributeLength(String lengthSize) {
		WebDriverUtils.enterTextBox(driver, lengthLocator, lengthSize);
	}


	static void postReview() {
		WebDriverUtils.clickOnElementWithWait(driver, postReviewButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static void addToCart() {
		WebDriverUtils.clickOnElementWithWait(driver, addToBasket);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_6000_SECONDS);
	}
	
	static void update() {
		WebDriverUtils.clickOnElementWithWait(driver, updateButton);
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
	}

	static MyBagPage returnMyBagPage() {
		WebDriverUtils.scrollLittDown(driver, addToBasket);
		WebDriverUtils.clickOnElementWithWait(driver, addToBasket);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(bonusDialog));
		return new MyBagPage(driver);
	}

	static MyAccountWishListPage returnMyAccountWishListPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, wishList);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myAccountText));
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishlistText));
		return new MyAccountWishListPage(driver);
	}

	static MyWishListPage returnMyWishListPage() {
		WebDriverUtils.explicitWait(driver, WebDriverUtils.WAIT_4000_SECONDS);
		WebDriverUtils.clickOnElementWithWait(driver, wishList);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_6000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(myWishListText));
		return new MyWishListPage(driver);
	}
}
