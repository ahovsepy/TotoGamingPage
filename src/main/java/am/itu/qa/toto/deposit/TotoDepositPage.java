package am.itu.qa.toto.deposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoDepositPage extends TotoBasePage {

	public TotoDepositPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String OTHER_BTN_XPATH = "//div[@id='2108']";
	public static final String BLOODBANK_BTN_XPATH = "//div[@style='background-image: url(\"/img/games/1x2/blood-bank-scratch.jpg\");']";
	public static final String USERNAME_INPUT_XPATH = "//input[@automation='email_input']";
	public static final String PASSWORD_INPUT_XPATH = "//input[@automation='password_input']";
	public static final String LOGIN_BTN_XPATH = "//button[@automation='login_button']";
	public static final String DEPOSIT_BTN_XPATH = "//a[@data-href='/Account/Deposit/']";
	public static final String WITHDRAW_BTN_XPATH = "//a[@id='withdraw_tab']";
	
	@FindBy(xpath = OTHER_BTN_XPATH)
	WebElement otherBtn;
	
	@FindBy(xpath = BLOODBANK_BTN_XPATH)
	WebElement bloodBankBtn;
	
	@FindBy(xpath = USERNAME_INPUT_XPATH)
	WebElement usernameInput;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	@FindBy(xpath = LOGIN_BTN_XPATH)
	WebElement loginBtn;
	
	@FindBy(xpath = DEPOSIT_BTN_XPATH)
	WebElement depositBtn;
	
	@FindBy(xpath = WITHDRAW_BTN_XPATH)
	WebElement 	withdrawBtn;
	
	public void clickOnOtherBtn() {
		otherBtn.click();
	}
	
	public void clickOnBloodBankBtn() {
		bloodBankBtn.click();
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
	
	public void clickOnDepositBtn() {
		depositBtn.click();

	}
	
	public void clickOnWithdrawBtn() {
		withdrawBtn.click();

	}

}
