package am.itu.qa.toto.language;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoLanguagePage extends TotoBasePage {

	public TotoLanguagePage(WebDriver driver) {
		super(driver);
	}

	public static final String ARM_BTN_XPATH = "//div[contains(@class, 'tl_header_top_row')]//a[contains(@class, 'flex hy')]";
	public static final String RU_BTN_XPATH = "//div[contains(@class, 'tl_header_top_row')]//a[contains(@class, 'flex ru')]";
	public static final String FA_BTN_XPATH = "//div[contains(@class, 'tl_header_top_row')]//a[contains(@class, 'flex fa')]";

	@FindBy(xpath = ARM_BTN_XPATH)
	WebElement armBtn;

	@FindBy(xpath = RU_BTN_XPATH)
	WebElement ruBtn;

	@FindBy(xpath = FA_BTN_XPATH)
	WebElement faBtn;

	public void clickOnArmBtn() {
		armBtn.click();

	}

	public void clickOnRuBtn() {
		ruBtn.click();

	}

	public void clickOnFaBtn() {
		faBtn.click();

	}

}
