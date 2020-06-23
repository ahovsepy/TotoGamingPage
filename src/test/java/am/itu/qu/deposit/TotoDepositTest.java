package am.itu.qu.deposit;

import org.testng.annotations.Test;
import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.deposit.TotoDepositPage;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoDepositTest extends TotoBaseTest {
	
	@Test(priority = 32)
	
	public void depositTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Casino button");
		home.navigateToCasino();
		Thread.sleep(7000);
		
		System.out.println("Expected results:");
		System.out.println("After step 1.Casino page is presented");
	}
	
	@Test(priority = 33)

	public void depositCasinotest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Casino button");
		TotoDepositPage deposit = home.navigateToCasino();
		Thread.sleep(7000);

		System.out.println("2.In Casino page click on Other button");
		deposit.clickOnOtherBtn();
		Thread.sleep(7000);
		
		System.out.println("3.In Other page click on Blood Bank game Play button");
		deposit.clickOnBloodBankBtn();
		Thread.sleep(3000);
		
		System.out.println("4.In Login window type artur131213 in Username field");
		deposit.typeUsername("artur131213");
		Thread.sleep(3000);
		
		System.out.println("5.In Login window type art12345 in Password field");
		deposit.typePassword("art12345");
		Thread.sleep(3000);
		
		System.out.println("6.In Login window click on Log In button");
		deposit.clickOnLoginBtn();
		Thread.sleep(5000);
		
		System.out.println("7.In Blood Bank game click on Deposit button");
		deposit.clickOnDepositBtn();
		Thread.sleep(5000);
		
		System.out.println("8.In Deposit page click on Withdraw button");
		deposit.clickOnWithdrawBtn();
		
		
		System.out.println("Expected results:");
		System.out.println("After step 2.Withdraw page is presented");

	}
	
}
