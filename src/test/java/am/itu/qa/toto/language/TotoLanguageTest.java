package am.itu.qa.toto.language;

import org.testng.annotations.Test;
import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoLanguageTest extends TotoBaseTest {

	@Test(priority = 10)
	public void armTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Language menu button");
		TotoLanguagePage language = home.navigateToLanguage();
		Thread.sleep(3000);

		System.out.println("2.In Language menu click on Arm button");
		language.clickOnArmBtn();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Armenian page is presented");

	}

	@Test(priority = 11)
	public void ruTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Language menu button");
		TotoLanguagePage language = home.navigateToLanguage();
		Thread.sleep(3000);

		System.out.println("2.In Language menu click on Ru button");
		language.clickOnRuBtn();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Russian page is presented");

	}

	@Test(priority = 12)
	public void faTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Language menu button");
		TotoLanguagePage language = home.navigateToLanguage();
		Thread.sleep(3000);

		System.out.println("2.In Language menu click on Fa button");
		language.clickOnFaBtn();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Fa page is presented");

	}

}
