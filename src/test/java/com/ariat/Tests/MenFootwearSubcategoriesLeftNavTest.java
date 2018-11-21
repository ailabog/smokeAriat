package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.MenCategories.MenCategoryPage;
import com.ariat.Pages.Categories.MenCategories.MenFashionSneakersPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearPage;
import com.ariat.Pages.Categories.MenCategories.MenRidingPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearCountry.MenFootwearCountrySubcategories.MenFootwearCountryOutdoorPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearCountry.MenFootwearCountrySubcategories.MenFootwearCountryRubberPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearCountry.MenFootwearCountrySubcategories.MenFootwearCountryToolBootsPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearCountry.MenFootwearCountrySubcategories.MenFootwearCountryWalkingPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearAllWeatherRidingPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearRidingBarnyardPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearRidingEndurancePage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearRidingHalfChapsPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearRidingPaddockPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearRiding.MenFootwearRidingCategories.MenFootwearRidingToolBootsPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearCasualShoesPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearCountryPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearWesternPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearWorkPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearWesternCategories.MenFootwearWesternFashionPage;
import com.ariat.Pages.Categories.MenCategories.MenFootwearSubcategories.MenFootwearWesternCategories.MenFootwearWesternPerformancePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearWorkCategories.MenFootwearWorkLaceUpPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearWorkCategories.MenFootwearWorkPullOnPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Left navigation for Men category
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenFootwearSubcategoriesLeftNavTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private MenCategoryPage menCategoryPage;
	private MenFootwearPage menFootwearPage;
	private MenRidingPage menRidingPage;
	private MenFootwearRidingToolBootsPage menFootwearRidingToolBootsPage;
	private MenFootwearRidingPaddockPage menFootwearRidingPaddockPage;
	private MenFootwearRidingHalfChapsPage menFootwearRidingHalfChapsPage;
	private MenFootwearAllWeatherRidingPage menFootwearAllWeatherRidingPage;
	private MenFootwearRidingEndurancePage menFootwearRidingEndurancePage;
	private MenFootwearRidingBarnyardPage menFootwearRidingBarnyardPage;

	private MenFootwearCountryPage menFootwearCountryPage;
	private MenFootwearCountryOutdoorPage menFootwearCountryOutdoorPage;
	private MenFootwearCountryRubberPage menFootwearCountryRubberPage;
	private MenFootwearCountryToolBootsPage menFootwearCountryToolBootsPage;
	private MenFootwearCountryWalkingPage menFootwearCountryWalkingPage;

	private MenFootwearWesternPage menFootwearWesternPage;
	private MenFootwearWesternPerformancePage menFootwearWesternPerformancePage;
	private MenFootwearWesternFashionPage menFootwearWesternFashionPage;

	private MenFootwearWorkPage menFootwearWorkPage;
	private MenFootwearWorkLaceUpPage menFootwearWorkLaceUpPage;
	private MenFootwearWorkPullOnPage menFootwearWorkPullOnPage;

	private MenFootwearCasualShoesPage menFootwearCasualShoesPage;
	private MenFashionSneakersPage menFootwearSneakersPage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void leftNavigationMenFootwearRidingSubcategories() {
		logger.info("Starting left navigation Men Footwear Riding sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menRidingPage = menFootwearPage.returnMenRidingCategoryPageLeftNav();
		menFootwearRidingToolBootsPage = menRidingPage.returnMenFootwearRidingToolBootsPageLeftNav();
		menFootwearRidingPaddockPage = menRidingPage.returnMenFootwearRidingPaddockPageLeftNav();
		menFootwearRidingHalfChapsPage = menRidingPage.returnMenFootwearRidingHalfChapsCategoryPageLeftNav();
		menFootwearAllWeatherRidingPage = menRidingPage.returnMenFootwearAllWeatherRidingCategoryPageLeftNav();
		menFootwearRidingEndurancePage = menRidingPage.returnMenFootwearRidingEnduranceCategoryPageLeftNav();
		menFootwearRidingBarnyardPage = menRidingPage.returnMenFootwearRidingBarnyardCategoryPageLeftNav();
		logger.info("Finishing left navigation Men Footwear Riding sub-categories test.");
	}

	@Test(priority = 1)
	public void leftNavigationMenFootwearCountrySubcategories() {
		logger.info("Starting left navigation Men Footwear Country sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menFootwearCountryPage = menFootwearPage.returnMenFootwearCountryCategoryPageLeftNav();
		menFootwearCountryOutdoorPage = menFootwearCountryPage.returnMenFootwearCountryOutdoorCategoryPageLeftNav();
		menFootwearCountryRubberPage = menFootwearCountryPage.returnMenFootwearCountryRubberCategoryPageLeftNav();
		menFootwearCountryToolBootsPage = menFootwearCountryPage.returnMenFootwearCountryTallBootsCategoryPageLeftNav();
		menFootwearCountryWalkingPage = menFootwearCountryPage.returnMenFootwearCountryWalkingCategoryPageLeftNav();
		logger.info("Finishing left navigation Men Footwear Country sub-categories test.");
	}

	@Test(priority = 2)
	public void leftNavigationMenFootwearWesternSubcategories() {
		logger.info("Starting left navigation Men Footwear Western sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menFootwearWesternPage = menFootwearPage.returnMenFootwearWesternCategoryPageLeftNav();
		menFootwearWesternPerformancePage = menFootwearWesternPage
				.returnMenFootwearWesternPerformanceCategoryPageLeftNav();
		menFootwearWesternFashionPage = menFootwearWesternPage.returnMenFootwearWesternFashionCategoryLeftNav();
		logger.info("Finishing left navigation Men Footwear Western sub-categories test.");
	}

	@Test(priority = 3)
	public void leftNavigationMenFootwearWorkSubcategories() {
		logger.info("Starting left navigation Men Footwear Work sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menFootwearWorkPage = menFootwearPage.returnMenFootwearWorkCategoryPageLeftNav();
		menFootwearWorkLaceUpPage = menFootwearWorkPage.returnMenFootwearWorkLaceUpCategoryPageLeftNav();
		menFootwearWorkPullOnPage = menFootwearWorkPage.returnMenFootwearWorkPullOnCategoryPageLeftNav();
		logger.info("Finishing left navigation Men Footwear Work sub-categories test.");
	}

	@Test(priority = 4)
	public void leftNavigationMenFootwearCasualShoesSubcategories() {
		logger.info("Starting left navigation Men Footwear Casual shoes sub-category test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menFootwearCasualShoesPage = menFootwearPage.returnMenFootwearCasualShoesCategoryPageLeftNav();
		menFootwearSneakersPage = menFootwearCasualShoesPage.returnMenFashionSneakersCategoryPageLeftNav();
		logger.info("Finishing left navigation Men Footwear Casual shoes sub-category test.");
	}

	@AfterTest
	public void tearDown() {
		homePage.quit();
		menCategoryPage.quit();
		menFootwearPage.quit();

		menRidingPage.quit();
		menFootwearRidingToolBootsPage.quit();
		menFootwearRidingPaddockPage.quit();
		menFootwearRidingHalfChapsPage.quit();
		menFootwearAllWeatherRidingPage.quit();
		menFootwearRidingEndurancePage.quit();
		menFootwearRidingBarnyardPage.quit();

		menFootwearCountryPage.quit();
		menFootwearCountryOutdoorPage.quit();
		menFootwearCountryRubberPage.quit();
		menFootwearCountryToolBootsPage.quit();
		menFootwearCountryWalkingPage.quit();

		menFootwearWesternPage.quit();
		menFootwearWesternPerformancePage.quit();
		menFootwearWesternFashionPage.quit();

		menFootwearWorkPage.quit();
		menFootwearWorkLaceUpPage.quit();
		menFootwearWorkPullOnPage.quit();
		menFootwearCasualShoesPage.quit();
		menFootwearSneakersPage.quit();
	}
}
