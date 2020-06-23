package am.itu.qa.toto.game;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoGamePage extends TotoBasePage {

	public TotoGamePage(WebDriver driver) {
		super(driver);

	}

	public static final String CASINO_BTN_XPATH = "//a[@href='https://playin.totogaming.am/en/?home=1']";
	public static final String ROCKETON_BTN_XPATH = "//div[@style='background-image: url(\"/img/games/Rocketon/Rocketon.jpg\");']";
	public static final String USERNAME_INPUT_XPATH = "//input[@automation='email_input']";
	public static final String PASSWORD_INPUT_XPATH = "//input[@automation='password_input']";
	public static final String LOGIN_BTN_XPATH = "//button[@automation='login_button']";

	@FindBy(xpath = CASINO_BTN_XPATH)
	WebElement casinoBtn;

	@FindBy(xpath = ROCKETON_BTN_XPATH)
	WebElement rocketonBtn;

	@FindBy(xpath = USERNAME_INPUT_XPATH)
	WebElement usernameInput;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;
	
	public void clickOnCasino() {
		casinoBtn.click();
	}

	public void clickOnRocketon() {
		rocketonBtn.click();
	}

	public void typeUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void typePassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();

	}
	
}
