package am.itu.qa.toto.idq;

import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoIdqTest extends TotoBaseTest {
	
	@Test(priority = 70)

	public void idqTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Idq page link");
		home.navigateToIdq();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Idq page is presented");
	}

	@Test(priority = 71)

	public void arcaTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Arca page link");
		home.navigateToArca();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Arca page is presented");
	}
	
	@Test(priority = 72)

	public void idramTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Idram page link");
		home.navigateToIdram();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Idram page is presented");
	}
	
	@Test(priority = 73)

	public void mobidramTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Mobidram page link");
		home.navigateToMobidram();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Mobidram page is presented");
	}
	
	@Test(priority = 74)

	public void telcellTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Telcell page link");
		home.navigateToTelcell();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Telcell page is presented");
	}

	@Test(priority = 75)

	public void easypayTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Easypay page link");
		home.navigateToEasypay();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Easypay page is presented");
	}

	
}
