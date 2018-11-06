package com.ariat.Pages.Categories.MenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenWorkCategories.MenWorkLaceUpPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenWorkCategories.MenWorkPullOnPage;
import com.ariat.Utils.WebDriverUtils;

public class MenWorkPage extends BasePage{
	
	private By footwearSwitcher = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/a/span[2]");
	private By laceUpLeftNav = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/ul/li[1]/a");
	private By pullOnLeftNav = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/ul/li[2]/a");
	private By laceUpCategoryText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By pullOnCategoryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	

	public MenWorkPage(WebDriver driver) {
		super(driver);
		}
	
	public void footwearSwitcherClick() {
		WebDriverUtils.clickOnElementWithWait(driver, footwearSwitcher);
	}

	public MenWorkLaceUpPage returnMenWorkLaceUpPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, laceUpLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(laceUpCategoryText));
		return new MenWorkLaceUpPage(driver);
	}
	
	public MenWorkPullOnPage returnMenWorkPullOnPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, pullOnLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(pullOnCategoryText));
		return new MenWorkPullOnPage(driver);
	}
}
