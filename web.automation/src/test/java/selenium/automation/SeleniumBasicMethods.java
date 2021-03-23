package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // chrome browser opens
		driver.get("https://www.mycontactform.com/samples.php");

		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

		// Navigation methods
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

		// Boolean methods
		WebElement chk1 = driver.findElement(By.name("email_to[]"));
		System.out.println(chk1.isDisplayed()); // true
		System.out.println(chk1.isEnabled()); // true
		System.out.println(chk1.isSelected()); // false

		driver.close();

	}

}
