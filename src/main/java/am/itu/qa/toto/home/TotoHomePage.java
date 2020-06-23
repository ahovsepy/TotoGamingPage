package am.itu.qa.toto.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.toto.base.TotoBasePage;
import am.itu.qa.toto.chat.TotoPokerPage;
import am.itu.qa.toto.deposit.TotoDepositPage;
import am.itu.qa.toto.digitain.TotoDigitainPage;
import am.itu.qa.toto.federbet.TotoFederBetPage;
import am.itu.qa.toto.game.TotoGamePage;
import am.itu.qa.toto.idq.TotoIdqPage;
import am.itu.qa.toto.language.TotoLanguagePage;
import am.itu.qa.toto.login.TotoLoginPage;
import am.itu.qa.toto.menu.TotoMenuPage;
import am.itu.qa.toto.mobile.TotoMobilePage;
import am.itu.qa.toto.promotions.TotoPromotionsPage;
import am.itu.qa.toto.register.TotoRegisterPage;

public class TotoHomePage extends TotoBasePage {

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

	public static final String SICBO_XPATH = "//a[contains(text(),'Sic Bo')]";

	@FindBy(xpath = SICBO_XPATH)
	WebElement my4Page;

	public TotoGamePage navigateToSicBo() {
		my4Page.click();
		return new TotoGamePage(this.driver);
	}

	public static final String CASINO_XPATH = "//a[contains(text(),'Casino')]";

	@FindBy(xpath = CASINO_XPATH)
	WebElement my5Page;

	public TotoDepositPage navigateToCasino() {
		my5Page.click();
		return new TotoDepositPage(this.driver);
	}

	public static final String TOTO_XPATH = "//a[@href='https://totogaming.am']";

	@FindBy(xpath = TOTO_XPATH)
	WebElement my7Page;

	public TotoPokerPage navigateToToto() {
		my7Page.click();
		return new TotoPokerPage(this.driver);
	}

	public static final String PROMOTION_XPATH = "//a[@class=' main_titles promo_link']";
	
	@FindBy(xpath = PROMOTION_XPATH)
	WebElement my8Page;
	
	public TotoPromotionsPage navigateToPromotions() {
		my8Page.click();
		return new TotoPromotionsPage(this.driver);
	}
	
public static final String MOBILE_XPATH = "//a[@class='toMobile']";
	
	@FindBy(xpath = MOBILE_XPATH)
	WebElement my9Page;
	
	public TotoMobilePage navigateToMobile() {
		my9Page.click();
		return new TotoMobilePage(this.driver);
	}
	
public static final String DIGITAIN_XPATH = "//a[@class='fic-digitain']";
	
	@FindBy(xpath = DIGITAIN_XPATH)
	WebElement my10Page;
	
	public TotoDigitainPage navigateToDigitain() {
		my10Page.click();
		return new TotoDigitainPage(this.driver);
	}
	
public static final String FEDERBET_XPATH = "//div[@class='federbet_box']";
	
	@FindBy(xpath = FEDERBET_XPATH)
	WebElement federPage;
	
	public TotoFederBetPage navigateToFederBet() {
		federPage.click();
		return new TotoFederBetPage(this.driver);
	}
	
public static final String IDQ_XPATH = "//div[@class='rng_box']";
public static final String ARCA_XPATH = "//a[@class='new_pay arca']";
public static final String IDRAM_XPATH = "//a[@class='new_pay idram']";
public static final String MOBIDRAM_XPATH = "//a[@class='new_pay mobidram']";
public static final String TELCELL_XPATH = "//a[@class='new_pay telcell']";
public static final String EASYPAY_XPATH = "//a[@class='new_pay easypay']";
	
	@FindBy(xpath = IDQ_XPATH)
	WebElement idqPage;
	
	@FindBy(xpath = ARCA_XPATH)
	WebElement arcaPage;
	
	@FindBy(xpath = IDRAM_XPATH)
	WebElement idramPage;
	
	@FindBy(xpath = MOBIDRAM_XPATH)
	WebElement mobidramPage;
	
	@FindBy(xpath = TELCELL_XPATH)
	WebElement telcellPage;
	
	@FindBy(xpath = EASYPAY_XPATH)
	WebElement 	easypayPage;
	
	
	public TotoIdqPage navigateToIdq() {
		idqPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToArca() {
		arcaPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToIdram() {
		idramPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToMobidram() {
		mobidramPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToTelcell() {
		telcellPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToEasypay() {
		easypayPage.click();
		return new TotoIdqPage(this.driver);
	}
	
}
