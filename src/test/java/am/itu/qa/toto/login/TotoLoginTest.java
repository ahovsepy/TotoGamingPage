package am.itu.qa.toto.login;

import org.testng.annotations.Test;
import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;


public class TotoLoginTest extends TotoBaseTest {
	
	@Test(priority = 21)
	public void loginNegativeTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(4000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Login button");
		TotoLoginPage login = home.navigateToLogin();
		Thread.sleep(3000);

		System.out.println("2.In Login window type artu13@gmail.com in Username field");
		login.typeUsername("artu13@gmail.com");
		Thread.sleep(3000);
		
		System.out.println("3.In Login window type aaa12345 in Password field");
		login.typePassword("aaa12345");
		Thread.sleep(3000);
		
		System.out.println("4.In Login window click on Log In button");
		login.clickOnLoginBtn();
		Thread.sleep(4000);
		
		System.out.println("5.In Login window click on Close button");
		login.clickOnCloseBtn();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 5.Show Error message 'Wrong login parameters' ");

	}
	
	@Test(priority = 23)
	public void logOutPositiveTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(4000);
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Login button");
		TotoLoginPage login = home.navigateToLogin();
		Thread.sleep(3000);

		System.out.println("2.In Login window type artur131213 in Username field");
		login.typeUsername("artur131213");
		Thread.sleep(3000);
		
		System.out.println("3.In Login window type art12345 in Password field");
		login.typePassword("art12345");
		Thread.sleep(3000);
		
		System.out.println("4.In Login window click on Log In button");
		login.clickOnLoginBtn();
		Thread.sleep(3000);
		
		System.out.println("5.In Home page click on LogIn  menu button");
		login.clickOnLogBtn();
		Thread.sleep(3000);
		
		System.out.println("6.In Login window click on Log Out button");
		login.clickOnLogOutBtn();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 6.Show Log Out page ");


	}
}
