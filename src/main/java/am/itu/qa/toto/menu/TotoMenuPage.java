package am.itu.qa.toto.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoMenuPage extends TotoBasePage {

	public TotoMenuPage(WebDriver driver) {
		super(driver);
		
	}
	
	public static final String LIVE_BTN_XPATH = "//a[@id='mainLiveBtn']";
	public static final String CALENDAR_BTN_XPATH = "//a[@class='tg__submenu__item sub_cal']";
	public static final String SELECT_BTN_XPATH = "//div[@id='canal_filter']/div/label/span";
	public static final String RESULTS_BTN_XPATH = "//a[@class='tg__submenu__item sub_res']";
	public static final String SHOW_BTN_XPATH = "//a[@id='res_btn_show']";
	public static final String HOME_BTN_XPATH = "//a[@class='tg__submenu__item sub_home']";
	public static final String MULTI_BTN_XPATH = "//a[@class='tg__submenu__item sub_mv']";
	
	@FindBy(xpath = LIVE_BTN_XPATH)
	WebElement liveBtn;
	
	@FindBy(xpath = CALENDAR_BTN_XPATH)
	WebElement calendarBtn;
	
	@FindBy(xpath = SELECT_BTN_XPATH)
	WebElement selectBtn;
	
	@FindBy(xpath = RESULTS_BTN_XPATH)
	WebElement resultsBtn;
	
	@FindBy(xpath = SHOW_BTN_XPATH)
	WebElement showBtn;
	
	@FindBy(xpath = HOME_BTN_XPATH)
	WebElement homeBtn;
	
	@FindBy(xpath = MULTI_BTN_XPATH)
	WebElement multiBtn;
	
	public void clickOnLiveBtn() {
		liveBtn.click();

	}
	
	public void clickOnCalendarBtn() {
		calendarBtn.click();

	}
	
	public void clickOnSelectBtn() {
		selectBtn.click();

	}
	
	public void clickOnResultsBtn() {
		resultsBtn.click();

	}
	
	public void clickOnShowBtn() {
		showBtn.click();

	}
	
	public void clickOnHomeBtn() {
		homeBtn.click();

	}
	
	public void clickOnMultiBtn() {
		multiBtn.click();

	}
	
	public boolean menuDisplayed() {
		return liveBtn.isDisplayed();
	}

}
