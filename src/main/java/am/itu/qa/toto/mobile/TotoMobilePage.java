package am.itu.qa.toto.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoMobilePage extends TotoBasePage {

	public TotoMobilePage(WebDriver driver) {
		super(driver);
		
	}
	
	public static final String WEB_BTN_XPATH ="//div[@class='toWeb btn_sec']";
	
	@FindBy(xpath = WEB_BTN_XPATH)
	WebElement webBtn;
	
	public void clickOnWebBtn() {
		webBtn.click();
	}
	

}
