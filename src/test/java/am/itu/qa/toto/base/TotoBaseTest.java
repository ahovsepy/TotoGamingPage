package am.itu.qa.toto.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TotoBaseTest {
	
	protected WebDriver driver;
	public static final String TOTO_GAMING_URL = "https://www.totogaming.am/en/";

	@BeforeClass
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(TOTO_GAMING_URL);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
