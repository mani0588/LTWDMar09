package selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits extends DriverUtil {

	public static void main(String[] args) {

		getDriver();

		// Implicit wait
		// global wait
		// common condition - visiblity of element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for every 500 ms
		driver.findElement(By.tagName("Manikandan")).click();

		// Explicit wait
		// Specific situation with specific condition
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//input[@type='checkbox']"), 10));

	}

}
