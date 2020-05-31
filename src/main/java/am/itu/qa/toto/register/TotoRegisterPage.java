package am.itu.qa.toto.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoRegisterPage extends TotoBasePage {

	public TotoRegisterPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String FIRSTNAME_INPUT_XPATH = "//input[@automation='firstname_input']";
	public static final String LASTNAME_INPUT_XPATH = "//input[@automation='lastname_input']";
	public static final String YEAR_BTN_XPATH = "//div[@id='custom_DateOfBirthYear']";
	public static final String YEARS_BTN_XPATH = "//li[@rel='1993']";
	public static final String MONTH_BTN_XPATH = "//div[@id='custom_DateOfBirthMonth']";
	public static final String MONTHS_BTN_XPATH = "//div[@id='mCSB_4_container']/li[6]";
	public static final String DAY_BTN_XPATH = "//div[@id='custom_DateOfBirthDay']";
	public static final String DAYS_BTN_XPATH = "//div[@id='mCSB_5_container']/li[3]";
	public static final String NEXT_BTN_XPATH = "//button[@id='continue_btn']";
	public static final String USERNAME_INPUT_XPATH = "//input[@automation='username_input']";
	public static final String EMAIL_INPUT_XPATH = "//input[@automation='email_input']";
	public static final String MOBILE_INPUT_XPATH = "//input[@automation='mobile_input']";
	public static final String PASPORT_INPUT_XPATH = "//input[@automation='passportnumber_input']";
	public static final String PASSWORD_INPUT_XPATH = "//input[@automation='password_input']";
	public static final String PASSWORDD_INPUT_XPATH = "//input[@automation='confirmpassword_input']";
	public static final String CONFIRM_BTN_XPATH = "//span[@class='flex popup_lbl_2']";

	@FindBy(xpath = FIRSTNAME_INPUT_XPATH)
	WebElement firstnameInput;
	
	@FindBy(xpath = LASTNAME_INPUT_XPATH)
	WebElement lastnameInput;
	
	@FindBy(xpath = YEAR_BTN_XPATH)
	WebElement yearBtn;
	
	@FindBy(xpath = YEARS_BTN_XPATH)
	WebElement yearsBtn;
	
	@FindBy(xpath = MONTH_BTN_XPATH)
	WebElement monthBtn;
	
	@FindBy(xpath = MONTHS_BTN_XPATH)
	WebElement monthsBtn;
	
	@FindBy(xpath = DAY_BTN_XPATH)
	WebElement dayBtn;
	
	@FindBy(xpath = DAYS_BTN_XPATH)
	WebElement daysBtn;
	
	@FindBy(xpath = NEXT_BTN_XPATH)
	WebElement nextBtn;
	
	@FindBy(xpath = USERNAME_INPUT_XPATH)
	WebElement usernameInput;
	
	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement emailInput;
	
	@FindBy(xpath = MOBILE_INPUT_XPATH)
	WebElement mobileInput;
	
	@FindBy(xpath = PASPORT_INPUT_XPATH)
	WebElement pasportInput;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	@FindBy(xpath = PASSWORDD_INPUT_XPATH)
	WebElement passworddInput;
	
	@FindBy(xpath = CONFIRM_BTN_XPATH)
	WebElement confirmBtn;
	
	public void typeFirstName(String firstname) {
		firstnameInput.sendKeys(firstname);
	}
	
	public void typeLastName(String lastname) {
		lastnameInput.sendKeys(lastname);
	}
	
	public void clickOnYearBtn() {
		yearBtn.click();

	}
	
	public void clickOnYearsBtn() {
		yearsBtn.click();

	}
	
	public void clickOnMonthBtn() {
		monthBtn.click();

	}
	
	public void clickOnMonthsBtn() {
		monthsBtn.click();

	}
	
	public void clickOnDayBtn() {
		dayBtn.click();

	}
	
	public void clickOnDaysBtn() {
		daysBtn.click();

	}
	
	public void clickOnNextBtn() {
		nextBtn.click();

	}
	
	public void typeUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void typeEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void typeMobile(String mobile) {
		mobileInput.sendKeys(mobile);
	}
	
	public void typePasport(String pasport) {
		pasportInput.sendKeys(pasport);
	}
	
	public void typePassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void typePasswordd(String passwordd) {
		passworddInput.sendKeys(passwordd);
	}
	
	public void clickOnConfirmBtn() {
		confirmBtn.click();
	}
	
	public boolean menuDisplayed() {
		return nextBtn.isDisplayed();
	}
}
