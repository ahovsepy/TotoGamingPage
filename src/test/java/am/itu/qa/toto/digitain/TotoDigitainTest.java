package am.itu.qa.toto.digitain;

import org.testng.annotations.Test;
import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoDigitainTest extends TotoBaseTest {
	
	@Test

	public void digitainTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Digitain page link");
		home.navigateToDigitain();
		Thread.sleep(5000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Digitain page is presented");
	}

}
