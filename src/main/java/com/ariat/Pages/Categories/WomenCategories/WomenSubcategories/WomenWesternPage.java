package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearWesternSubcategories.WomenFootwearWesternFashionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwear.WomenFootwearWesternSubcategories.WomenFootwearWesternPerformancePage;
import com.ariat.Utils.WebDriverUtils;

public class WomenWesternPage extends BasePage{
	
	private By footwearSwitcher = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/a/span[2]");
    private By performanceWesternCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/ul/li[1]/a");
    private By westernFashionCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div[1]/ul/li/ul/li[2]/a");
    private By performanceWesternCategoryText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    private By westernFashionCategoryCategoryText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    
     
	public WomenWesternPage(WebDriver driver) {
		super(driver);
	}
	
	public void footwearClick() {
		WebDriverUtils.clickOnElementWithWait(driver, footwearSwitcher);
	}
	
	public WomenFootwearWesternFashionPage returnWomenWesternFashionCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, westernFashionCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(westernFashionCategoryCategoryText));
		return new WomenFootwearWesternFashionPage(driver);
	}
	
	public WomenFootwearWesternPerformancePage returnWomenWesternPerformanceCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, performanceWesternCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(performanceWesternCategoryText));
		return new WomenFootwearWesternPerformancePage(driver);
	}
}