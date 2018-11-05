package com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Men Footwear Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenFootwearPage extends BasePage{
	
	private By menFootwearRidingCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/ul/li[1]/a");
	private By menFootwearRidingText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menFootwearCountryCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/ul/li[2]/a");
	private By menFootwearCountryText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menFootwearWesternCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/ul/li[3]/a");
    private By menFootwearWesternText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    private By menFootwearCasualShoesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/ul/li[5]/a");
    private By menCasualShoesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By menFootwearWorkCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[1]/li/ul/li[4]/a");
    private By menFootwearWorkText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
   

	public MenFootwearPage(WebDriver driver) {
		super(driver);
		}
	
	
	
	public MenFootwearRidingPage returnMenFootwearRidingCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearRidingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearRidingText));
		return new MenFootwearRidingPage(driver);
	}
	
	public MenFootwearCountryPage returnMenFootwearCountryCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearCountryCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearCountryText));
		return new MenFootwearCountryPage(driver);
	}
	
	public MenFootwearWesternPage returnMenFootwearWesternCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearWesternCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearWesternText));
		return new MenFootwearWesternPage(driver);
	}
	
	public MenFootwearWorkPage returnMenFootwearWorkCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearWorkCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearWorkText));
		return new MenFootwearWorkPage(driver);
	}
	
	public MenFootwearCasualShoesPage returnMenFootwearCasualShoesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearCasualShoesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menCasualShoesText));
		return new MenFootwearCasualShoesPage(driver);
	}
}

