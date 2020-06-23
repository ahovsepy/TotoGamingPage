package am.itu.qa.toto.chat;

import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoBannersTest extends TotoBaseTest {

	@Test(priority = 33)

	public void bannersCasinoTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoPokerPage menu = home.navigateToToto();
		Thread.sleep(5000);

		System.out.println("2.In TotoGaming HOME page click on Casino page button");
		menu.clickToCasinoo();

		System.out.println("Expected results:");
		System.out.println("After step 2.Casino page is presented");
	}

	@Test(priority = 34)

	public void bannersKenoTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoPokerPage menu = home.navigateToToto();
		Thread.sleep(5000);

		System.out.println("2.In TotoGaming HOME page click on Keno page button");
		menu.clickToKeno();

		System.out.println("Expected results:");
		System.out.println("After step 2.Keno page is presented");
	}
	
	@Test(priority = 35)

	public void bannersRocketonTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoPokerPage menu = home.navigateToToto();
		Thread.sleep(5000);

		System.out.println("2.In TotoGaming HOME page click on Rocketon page button");
		menu.clickToRocketon();

		System.out.println("Expected results:");
		System.out.println("After step 2.Rocketon page is presented");
	}

	@Test(priority = 36)

	public void bannersSportsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoPokerPage menu = home.navigateToToto();
		Thread.sleep(5000);

		System.out.println("2.In TotoGaming HOME page click on Sports page button");
		menu.clickOnSportsBtn();

		System.out.println("Expected results:");
		System.out.println("After step 2.Sports page is presented");
	}
	
}
