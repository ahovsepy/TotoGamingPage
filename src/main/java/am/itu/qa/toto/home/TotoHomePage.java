package am.itu.qa.toto.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;
import am.itu.qa.toto.language.TotoLanguagePage;
import am.itu.qa.toto.login.TotoLoginPage;
import am.itu.qa.toto.menu.TotoMenuPage;
import am.itu.qa.toto.register.TotoRegisterPage;

public class TotoHomePage  extends TotoBasePage {

	public TotoHomePage(WebDriver driver) {
		super(driver);
	
	}
	
	public static final String MY_MENU_XPATH = "//a[contains(text(),'Esports')]";

	@FindBy(xpath = MY_MENU_XPATH)
	WebElement myPage;

	public TotoMenuPage navigateToMenu() {
		myPage.click();
		return new TotoMenuPage(this.driver);

	}
	
	public static final String REGISTER_BTN_XPATH = "//a[@class='registerDialog tl_register_button primBtn transBg']";

	@FindBy(xpath = REGISTER_BTN_XPATH)
	WebElement my1Page;

	public TotoRegisterPage navigateToHome() {
		my1Page.click();
		return new TotoRegisterPage(this.driver);

	}
	
	public static final String LANGUAGE_XPATH = "//div[contains(@class, 'tl_header_top_row')]//a[contains(@class, 'flex dropdown-menu')]";

	@FindBy(xpath = LANGUAGE_XPATH)
	WebElement my2Page;

	public TotoLanguagePage navigateToLanguage() {
		my2Page.click();
		return new TotoLanguagePage(this.driver);

	}
	
	public static final String LOGIN_XPATH = "//div[contains(@id, 'header_fix')]//a[contains(@class, 'loginDialog tl_login_button ternBtn transBg')]";

	@FindBy(xpath = LOGIN_XPATH)
	WebElement my3Page;

	public TotoLoginPage navigateToLogin() {
		my3Page.click();
		return new TotoLoginPage(this.driver);

	}
	
}
