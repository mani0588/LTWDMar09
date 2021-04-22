package testngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginPage;

public class TestNgParallelTest {

	@Test(dataProvider = "dp")
	public void verifyLoginIsSuccessForValidCredentials(String un, String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.mycontactform.com/samples.php");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUsername(un);
		loginPage.enterPassword(pwd);
		loginPage.clickLoginButton();
		boolean isDisplayed = driver.findElement(By.name("btnSubmit")).isDisplayed();
		driver.quit();
		Assert.assertFalse(isDisplayed);
	}

	@DataProvider(parallel = true)
	public Object[][] dp() {
		return new Object[][] { new Object[] { "user1", "pass1" }, new Object[] { "user2", "pass2" }, };
	}

}
