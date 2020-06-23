package am.itu.qa.toto.esports;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;
import am.itu.qa.toto.menu.TotoMenuPage;

public class TotoEsportsTest extends TotoBaseTest {

	@Test
	public void calendarTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on ESPORTS Link");
		TotoMenuPage menu = home.navigateToMenu();
		Thread.sleep(4000);

		System.out.println("2.In ESPORTS page LIVE link");
		menu.clickOnLiveBtn();
		Thread.sleep(4000);

		System.out.println("3.In Live page click on Calendar button");
		menu.clickOnCalendarBtn();
		Thread.sleep(4000);

		System.out.println("4.In Calendar page click on Select all button");
		menu.clickOnSelectBtn();
		Thread.sleep(4000);

		System.out.println("Expected results:");
		System.out.println("After step 4.Select all menu is presented");

		Assert.assertTrue(menu.menuDisplayed());
		Thread.sleep(4000);
	}

	@Test
	public void resultsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(4000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on ESPORTS Link");
		TotoMenuPage menu = home.navigateToMenu();
		Thread.sleep(4000);

		System.out.println("2.In ESPORTS page LIVE link");
		menu.clickOnLiveBtn();
		Thread.sleep(4000);

		System.out.println("3.In Live page click on Results button");
		menu.clickOnResultsBtn();
		Thread.sleep(4000);

		System.out.println("4.In Results page click on Show button");
		menu.clickOnShowBtn();
		Thread.sleep(4000);

		System.out.println("Expected results:");
		System.out.println("After step 4.Results page is presented");

		Assert.assertTrue(menu.menuDisplayed());

	}

	@Test
	public void homeTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on ESPORTS Link");
		TotoMenuPage menu = home.navigateToMenu();
		Thread.sleep(4000);

		System.out.println("2.In ESPORTS page LIVE link");
		menu.clickOnLiveBtn();
		Thread.sleep(4000);

		System.out.println("3.In Live page click on Home button");
		menu.clickOnHomeBtn();
		Thread.sleep(4000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Home page is presented");

		Assert.assertTrue(menu.menuDisplayed());

	}

	@Test
	public void multiTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on ESPORTS Link");
		TotoMenuPage menu = home.navigateToMenu();
		Thread.sleep(4000);

		System.out.println("2.In ESPORTS page LIVE link");
		menu.clickOnLiveBtn();
		Thread.sleep(4000);

		System.out.println("3.In Live page click on Multi View button");
		menu.clickOnMultiBtn();
		Thread.sleep(4000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Home page is presented");

		Assert.assertTrue(menu.menuDisplayed());

	}
}
