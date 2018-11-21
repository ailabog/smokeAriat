package com.ariat.Pages.Categories.WomenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenFootwearCountry.WomenFootwearCountrySubcategories.WomenFootwearRidingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedPage;
import com.ariat.Utils.WebDriverUtils;

public class WomenFootwearPage extends BasePage{
	
	
	private By footwearCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	private By clothingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
	private By accessoriesCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
	private By ridingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
	private By countryCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[5]/a");
	private By westernCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[6]/a");
	private By fashionCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[8]/a");
	private By featuredCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[9]/a");
	private By ridingTextLeftNav = By.xpath("//*[contains(text(),'Riding']");
	private By countryTextLeftNav = By.xpath("//*[contains(text(),'Country']");
	private By westernTextLeftNav = By.xpath("//*[contains(text(),'Western']");
	private By fashionTextLeftNav = By.xpath("//*[contains(text(),'Fashion']");
	private By featuredTextLeftNav = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/h1");
	private By womenFootwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By womenClothingText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menFootwearRidingText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By footwearRidingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
	
	protected WomenFootwearPage(WebDriver driver) {
		super(driver);
	}
	
	// Left navigation

		public WomenFootwearPage returnWomenFootwearPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, footwearCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(womenFootwearText));
			return new WomenFootwearPage(driver);
		}

		public WomenClothingPage returnWomenClothingPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, clothingCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(womenClothingText));
			return new WomenClothingPage(driver);
		}

		public WomenAccessoriesPage returnWomenAccessoriesPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, accessoriesCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesText));
			return new WomenAccessoriesPage(driver);
		}

		public WomenFootwearRidingPage returnWomenFootwearRidingPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, ridingCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(ridingTextLeftNav));
			return new WomenFootwearRidingPage(driver);
		}

		public WomenCountryPage returnWomenCountryPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, countryCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(countryTextLeftNav));
			return new WomenCountryPage(driver);
		}

		public WomenWesternPage returnWomenWesternPagePageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, westernCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(westernTextLeftNav));
			return new WomenWesternPage(driver);
		}

		public WomenFashionPage returnWomenFashionPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, fashionCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(fashionTextLeftNav));
			return new WomenFashionPage(driver);
		}

		public WomenFeaturedPage returnWomenFeaturedPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, featuredCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(featuredTextLeftNav));
			return new WomenFeaturedPage(driver);
		}
		
		public WomenRidingPage returnWomennRidingCategoryPageLeftNav() {
			WebDriverUtils.clickOnElementWithWait(driver, footwearRidingCategoryLeftNav);
			WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_2000_SECONDS,
					ExpectedConditions.invisibilityOfElementLocated(menFootwearRidingText));
			return new WomenRidingPage(driver);
		}
	}
