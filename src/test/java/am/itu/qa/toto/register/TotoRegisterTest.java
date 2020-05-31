package am.itu.qa.toto.register;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;


public class TotoRegisterTest extends TotoBaseTest{
	
	@Test(priority = 1)
	public void calendarTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Register Link");
		TotoRegisterPage register = home.navigateToHome();
		Thread.sleep(3000);

		System.out.println("2.In Register window type Artur in FirstName field");
		register.typeFirstName("Artur");
		Thread.sleep(3000);
		
		System.out.println("3.In Register window type Avetisyan in LastName field");
		register.typeLastName("Avetisyan");
		Thread.sleep(3000);
		
		System.out.println("4.Click on Year button");
		register.clickOnYearBtn();
		Thread.sleep(3000);
		
		System.out.println("5.In Year menu choose birthday Year");
		register.clickOnYearsBtn();
		Thread.sleep(3000);
		
		System.out.println("6.Click on Month button");
		register.clickOnMonthBtn();
		Thread.sleep(3000);
		
		System.out.println("7.In Month menu choose birthday Month");
		register.clickOnMonthsBtn();
		Thread.sleep(3000);
		
		System.out.println("8.Click on Day button");
		register.clickOnDayBtn();
		Thread.sleep(3000);
		
		System.out.println("9.In Day menu choose birthday Day");
		register.clickOnDaysBtn();
		Thread.sleep(3000);
		
		System.out.println("10.Click on Next button");
		register.clickOnNextBtn();
		Thread.sleep(3000);
		
		System.out.println("11.In Register window type artur131213 in Username field");
		register.typeUsername("artur131213");
		Thread.sleep(3000);
		
		System.out.println("12.In Register window type artur131313@gmail.com in Email field");
		register.typeEmail("artur131313@gmail.com");
		Thread.sleep(3000);
		
		System.out.println("13.In Register window type 98110111 in Mobile field");
		register.typeMobile("98110111");
		Thread.sleep(3000);
		
		System.out.println("14.In Register window type AG010203 in Pasport field");
		register.typePasport("AG010203");
		Thread.sleep(3000);
		
		System.out.println("15.In Register window type www123456 in Password field");
		register.typePassword("www123456");
		Thread.sleep(3000);
		
		System.out.println("16.In Register window type www123456 in Passwordd field");
		register.typePasswordd("www123456");
		Thread.sleep(3000);

		System.out.println("17.Click on Confirm button");
		register.clickOnConfirmBtn();
		Thread.sleep(3000);
		
		System.out.println("Expected results:");
		System.out.println("After step 17.Register window is presented");

		Assert.assertTrue(register.menuDisplayed());

	}

}
