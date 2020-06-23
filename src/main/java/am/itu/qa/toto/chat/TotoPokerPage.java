package am.itu.qa.toto.chat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.toto.base.TotoBasePage;

public class TotoPokerPage extends TotoBasePage {

	public TotoPokerPage(WebDriver driver) {
		super(driver);

	}

	public static final String CASINOO_XPATH = "//a[@href='https://playin.totogaming.am/ggpoker']";
	public static final String KENO_XPATH = "//a[@href='https://playin.totogaming.am/Betongames']";
	public static final String ROCKETON_XPATH = "//div[contains(@id, 'BannersContainer')]//a[contains(@href, 'https://playin.totogaming.am/Betongames?url=Rocketon')]";
	public static final String SPORTS_XPATH = "//div[contains(@id, 'BannersContainer')]//a[contains(@href, 'https://sport.totogaming.am/SportsBook/Home?l=en&d=d')]";
	
	@FindBy(xpath = CASINOO_XPATH)
	WebElement casinoBtn;

	@FindBy(xpath = KENO_XPATH)
	WebElement kenoBtn;
	
	@FindBy(xpath = ROCKETON_XPATH)
	WebElement rocketonBtn;

	@FindBy(xpath = SPORTS_XPATH)
	WebElement sportsBtn;

	public void clickToCasinoo() {
		casinoBtn.click();
	}

	public void clickToKeno() {
		kenoBtn.click();
	}

	public void clickToRocketon() {
		rocketonBtn.click();
	}
	
	public void clickOnSportsBtn() {
		sportsBtn.click();
	}
	
}
