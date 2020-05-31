package am.itu.qa.toto.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoLoginPage extends TotoBasePage{

	public TotoLoginPage(WebDriver driver) {
		super(driver);
	
	}

	public static final String USERNAME_INPUT_XPATH = "//input[@automation='email_input']";
	public static final String PASSWORD_INPUT_XPATH = "//input[@automation='password_input']";
	public static final String LOGIN_BTN_XPATH = "//button[@automation='login_button']";
	public static final String CLOSE_BTN_XPATH = "//div[@class='tl_head_close dont-shrink']";
	public static final String LOG_BTN_XPATH = "//div[contains(@id, 'header_fix')]//a[contains(@class, 'flex dropdown-menu')]//div";
	public static final String LOGOUT_BTN_XPATH = "//a[contains(text(),'Log Out')]";
	
	@FindBy(xpath = USERNAME_INPUT_XPATH)
	WebElement usernameInput;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;
	
	@FindBy(xpath = CLOSE_BTN_XPATH)
	WebElement closeBtn;
	
	@FindBy(xpath = LOG_BTN_XPATH)
	WebElement logBtn;
	
	@FindBy(xpath = LOGOUT_BTN_XPATH)
	WebElement logoutBtn;
	
	public void typeUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void typePassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();

	}
	
	public void clickOnCloseBtn() {
		closeBtn.click();

	}
	
	public void clickOnLogBtn() {
		logBtn.click();

	}
	
	public void clickOnLogOutBtn() {
		logoutBtn.click();

	}
	
}
