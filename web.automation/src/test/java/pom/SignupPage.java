package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

	WebDriver driver;

	public SignupPage(WebDriver myDriver) {
		driver = myDriver;
	}

	@FindBy(name = "firstname")
	WebElement txtFirstname;

	@FindBy(name = "lastname")
	WebElement txtLastname;

	@FindBy(name = "reg_email__")
	WebElement txtEmail;

	@FindBy(name = "reg_passwd__")
	WebElement txtPassword;

	@FindBy(id = "month")
	WebElement drdBirthMonth;

	@FindBy(id = "day")
	WebElement drdBirthDay;

	@FindBy(id = "year")
	WebElement drdBirthYear;

	@FindBy(name = "websubmit")
	WebElement btnSubmit;

	public void enterName(String fName, String lName) {
		txtFirstname.sendKeys(fName);
		txtLastname.sendKeys(lName);
	}

	public void enterEmailOrMobileNum(String emailOrMob) {
		txtEmail.sendKeys(emailOrMob);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void selectBirthDate(String month, String day, String year) {
		Select ddMonth = new Select(drdBirthMonth);
		ddMonth.selectByVisibleText(month);
		Select ddDay = new Select(drdBirthDay);
		ddDay.selectByVisibleText(day);
		Select ddYear = new Select(drdBirthYear);
		ddYear.selectByVisibleText(year);
	}

	public void selectGender(String gender) {
		String xpath = "//label[text()='" + gender + "']/preceding-sibling::input | //label[text()='" + gender
				+ "']/following-sibling::input";
		driver.findElement(By.xpath(xpath)).click();
	}

	public void clickSignupButton() {
		btnSubmit.click();
	}

}
