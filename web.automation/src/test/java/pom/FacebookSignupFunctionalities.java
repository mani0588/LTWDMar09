package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupFunctionalities {

	WebDriver driver;
	SignupPage signupPage;

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		}

		signupPage = PageFactory.initElements(driver, SignupPage.class);
	}

	@Test
	public void verifySignupIsWorkingForNewUser() {

		driver.get("https://www.facebook.com/r.php");
		signupPage.enterName("Supriya", "K");
		signupPage.enterEmailOrMobileNum("8939989399");
		signupPage.enterPassword("8939989399");
		signupPage.selectBirthDate("May", "17", "1988");
		signupPage.selectGender("Female");
		signupPage.clickSignupButton();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
