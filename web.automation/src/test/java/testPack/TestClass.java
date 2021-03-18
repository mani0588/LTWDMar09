package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

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
		System.out.println(driver.findElement(By.name("email_to[]")).isDisplayed()); // true
		System.out.println(driver.findElement(By.name("email_to[]")).isEnabled()); // true
		System.out.println(driver.findElement(By.name("email_to[]")).isSelected()); // false

		driver.close();

	}

}
