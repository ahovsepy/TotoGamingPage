package am.itu.qa.toto.gameLogin;

import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.game.TotoGamePage;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoCasinoTest extends TotoBaseTest {

	@Test(priority = 22)

	public void sicBo() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Sic Bo button");
		home.navigateToSicBo();
		Thread.sleep(7000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Sic Bo page is presented");

	}

	@Test(priority = 23)

	public void casinoLogin() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Sic Bo button");
		TotoGamePage game = home.navigateToSicBo();
		Thread.sleep(7000);

		System.out.println("2.In Sic Bo page click on Casino button");
		game.clickOnCasino();
		Thread.sleep(7000);
		
		System.out.println("Expected results:");
		System.out.println("After step 2.Casino page is presented");

	}

	@Test(priority = 24)

	public void rocketonGame() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Sic Bo button");
		TotoGamePage game = home.navigateToSicBo();
		Thread.sleep(7000);

		System.out.println("2.In Sic Bo page click on Casino button");
		game.clickOnCasino();
		Thread.sleep(7000);

		System.out.println("3.In Casino page click on Rocketon game Play button");
		game.clickOnRocketon();
		Thread.sleep(7000);
		
		System.out.println("4.In Login window type artur131213 in Username field");
		game.typeUsername("artur131213");
		Thread.sleep(3000);
		
		System.out.println("5.In Login window type art12345 in Password field");
		game.typePassword("art12345");
		Thread.sleep(3000);
		
		System.out.println("6.In Login window click on Log In button");
		game.clickOnLoginBtn();
		Thread.sleep(9000);
		
		System.out.println("Expected results:");
		System.out.println("After step 6.Rocketon game is presented");

	}

}
