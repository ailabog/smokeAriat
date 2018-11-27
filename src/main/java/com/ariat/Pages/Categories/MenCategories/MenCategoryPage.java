package com.ariat.Pages.Categories.MenCategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearRidingPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements returns methods to pages: (top & left navigation)
 * Men Category Page
 * Men Footwear Page
 * Men Clothing Page
 * Men Accessories Page
 * Men Featured Page
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenCategoryPage extends BasePage{
	
	private By menFootwearCategory = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");

	private By menFootwearText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menClothingCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[2]/li/a");
	private By menClothingText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    private By menAccesoriesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[3]/li/a");
    private By menAccessoriesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
    private By menFeaturedCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[9]/li/a");
    private By menFeaturedText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    
    private By menCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/a");
    private By menText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
    
    private By footwearCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[1]/a");
    private By clothingCategoryLeftNav =By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[2]/a");
    private By accessoriesCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[3]/a");
    private By ridingCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[4]/a");
    private By countryCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[5]/a");
    private By westernCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[6]/a");
    private By workCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[7]/a");
    private By fashionCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[8]/a");
    private By featuredCategoryLeftNav = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[3]/ul/li[9]/a");
    private By ridingTextLeftNav = By.xpath("//*[contains(text(),'Riding']");
    private By countryTextLeftNav = By.xpath("//*[contains(text(),'Country']");
    private By westernTextLeftNav = By.xpath("//*[contains(text(),'Western']");
    private By fashionTextLeftNav = By.xpath("//*[contains(text(),'Fashion']");
    private By workTextLeftNav = By.xpath("//*[contains(text(),'Work']");
   
    
	public MenCategoryPage(WebDriver driver) {
		super(driver);
	}
	

	public void menCategory() {
		WebDriverUtils.moveToElement(driver, menCategory);
	}
	
	
	//Top navigation
	public MenCategoryPage returnMenCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menText));
		return new MenCategoryPage(driver);
	}
	
	public MenFootwearPage returnMenFootwearPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFootwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearText));
		return new MenFootwearPage(driver);
	}
	
	public MenClothingPage returnMenClothingCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menClothingCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingText));
		return new MenClothingPage(driver);
	}
	
	public MenAccessoriesPage returnMenAccessoriesCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menAccesoriesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesText));
		return new MenAccessoriesPage(driver);
	}
	
	public MenFeaturedPage returnMenFeaturedCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFeaturedCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFeaturedText));
		return new MenFeaturedPage(driver);
	}
	
//Left navigation
	
	public MenFootwearPage returnMenFootwearPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, footwearCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFootwearText));
		return new MenFootwearPage(driver);
	}
	
	public MenClothingPage returnMenClothingPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, clothingCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menClothingText));
		return new MenClothingPage(driver);
	}
	
	public MenAccessoriesPage returnMenAccessoriesPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, accessoriesCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menAccessoriesText));
		return new MenAccessoriesPage(driver);
	}
	
	public MenFootwearRidingPage returnMenFootwearRidingPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, ridingCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(ridingTextLeftNav));
		return new MenFootwearRidingPage(driver);
	}
	
	public MenCountryPage returnMenCountryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, countryCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(countryTextLeftNav));
		return new MenCountryPage(driver);
	}
	
	public MenWesternPage returnMenFootwearWesternPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, westernCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(westernTextLeftNav));
		return new MenWesternPage(driver);
	}
	
	public MenFashionPage returnMenFootwearFashionPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, fashionCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(fashionTextLeftNav));
		return new MenFashionPage(driver);
	}
	
	public MenWorkPage returnMenWorkPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, workCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(workTextLeftNav));
		return new MenWorkPage(driver);
	}
	
	public MenFeaturedPage returnMenFeaturedPagePageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, featuredCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_4000_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFeaturedText));
		return new MenFeaturedPage(driver);
	}
	
	
	
	
} 
