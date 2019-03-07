package com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearWorkCategories.MenFootwearWorkLaceUpPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearWorkCategories.MenFootwearWorkPullOnPage;
import com.ariat.Pages.Main.BasePage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Men Footwear Work Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenFootwearWorkPage extends BasePage{
	
	private By laceUpFootwearWorkText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By laceUpFootwearWorkCategoryLeftNav = By.xpath("(//a[contains(text(),'Lace Up')])[3]");
	private By pullOnFootwearWorkText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By pullOnFootwearWorkCategoryLeftNav = By.linkText("Pull On");

	public MenFootwearWorkPage(WebDriver driver) {
		super(driver);
		
	}
	public MenFootwearWorkLaceUpPage returnMenFootwearWorkLaceUpCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, laceUpFootwearWorkCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(laceUpFootwearWorkText));
		return new MenFootwearWorkLaceUpPage(driver);
	}
	public MenFootwearWorkPullOnPage returnMenFootwearWorkPullOnCategoryPageLeftNav() {
		WebDriverUtils.clickOnElementWithWait(driver, pullOnFootwearWorkCategoryLeftNav);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(pullOnFootwearWorkText));
		return new MenFootwearWorkPullOnPage(driver);
	}
}
