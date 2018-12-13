package com.ariat.Pages.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Footer.CarrersPage;
import com.ariat.Pages.Footer.PressRoomPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

public class AboutUsPage extends BasePage{
	
	private By carrersLink = By.xpath("//a[text()='Careers']");
	private By carrersText = By.xpath("//*contains[text(), 'CAREERS']");
	private By pressRoomLink = By.xpath("a[text()='Press Room']");
	private By pressRoomText = By.xpath("//*contains[text(), Press room']");

	public AboutUsPage(WebDriver driver) {
		super(driver);
	}
	
	public CarrersPage returnCarrersPage() {
		WebDriverUtils.clickOnElementWithWait(driver, carrersLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(carrersText));
		return new CarrersPage(driver);
	}
	
	public PressRoomPage returnPressRoom() {
		WebDriverUtils.clickOnElementWithWait(driver, pressRoomLink);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(pressRoomText));
		return new PressRoomPage(driver);	
	}
}
