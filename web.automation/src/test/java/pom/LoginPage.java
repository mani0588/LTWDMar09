package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver myDriver) {
		driver = myDriver;
	}

	@FindBy(name = "user")
	WebElement txtUsername;

	@FindBy(name = "pass")
	WebElement txtPassword;

	@FindBy(name = "btnSubmit")
	WebElement buttonLogin;

	public void enterUsername(String un) {
		txtUsername.sendKeys(un);
	}
	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		buttonLogin.click();
	}

	// WebElement ele = driver.findElement(By.name("user"));

	// driver.findElement(By.name("user")).sendKeys(un);
	// driver.findElement(By.name("pass")).sendKeys(pwd);
	// driver.findElement(By.name("btnSubmit")).click();

}