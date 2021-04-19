package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFunctionalities {

	// Page object model with facebook
	// Excel file reading

	// Test Scenario / Class - Feature / use case / group of test case
	// ====> Verify login functionalities

	// Test case / @Test - Verify login is success for valid credentials -
	// admin, user, agent
	// Test data / @DataProvider - username and password
	// Steps:
	// Enter un
	// Enter pwd
	// Click login btn
	// Verification / Assert - Login should be success
	// Result - pass / fail

	// Test case / @Test - Verify login is not success for invalid credentials
	// Test data - username and password
	// Verification / Assert - Login should not be success
	// Result - pass / fail

	WebDriver driver;

	@Test(dataProvider = "dp")
	public void verifyLoginIsSuccessForValidCredentials(String un, String pwd) {

		// LoginPage loginPage = new LoginPage(driver);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUsername(un);
		loginPage.enterPassword(pwd);
		loginPage.clickLoginButton();
		// Assert
		// Check login btn is not displayed - false
		boolean isDisplayed = driver.findElement(By.name("btnSubmit")).isDisplayed();
		Assert.assertFalse(isDisplayed);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "user1", "pass1" }, new Object[] { "user2", "pass2" }, };
	}

	// 10 more test cases

	@Parameters("browser")
	@BeforeClass
	public void beforeMethod(String browser) {
		System.out.println("Pre condition to the test case");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.mycontactform.com/samples.php");
	}

	@AfterClass
	public void afterMethod() {
		System.out.println("Post condition to the test case");
		driver.quit();
	}
}