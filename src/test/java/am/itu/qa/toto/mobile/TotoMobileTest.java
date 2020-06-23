package am.itu.qa.toto.mobile;

import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoMobileTest extends TotoBaseTest {
	
	
	@Test(priority = 52)

	public void mobileTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Mobile version button");
		home.navigateToMobile();
		Thread.sleep(5000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Mobile version page is presented");
	}
	
	@Test(priority = 51)

	public void mobileWebTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Promotions page link");
		TotoMobilePage page = home.navigateToMobile();
		Thread.sleep(5000);
		
		System.out.println("2.In Mobile version page click on Web version page button");
		page.clickOnWebBtn();

		System.out.println("Expected results:");
		System.out.println("After step 1.Web version page is presented");
	}

}
