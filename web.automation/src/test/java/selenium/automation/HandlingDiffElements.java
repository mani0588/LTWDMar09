package selenium.automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDiffElements extends DriverUtil {

	public static void main(String[] args) throws InterruptedException {

		getDriver();

		// chk, rdio, drd, link, btn, menu, para / lbl / err msg, text box, file upload

		// chk / radio
		driver.findElement(By.name("email_to[]")).click();
		driver.findElement(By.name("q4")).click();

		// text box
		driver.findElement(By.name("subject")).sendKeys("My contact form");

		// drop-dowm
		Select dd = new Select(driver.findElement(By.name("q3")));
		dd.selectByIndex(1);
		Thread.sleep(500);
		dd.selectByVisibleText("Third Option");
		Thread.sleep(500);
		dd.selectByValue("Fourth Option");

		// file upload
		String path = new File("").getAbsolutePath().concat("\\pom.xml");
		System.out.println(path);
		driver.findElement(By.name("attach4589")).sendKeys(path);

		// plain text / para / label / err msg
		String para = driver.findElement(By.tagName("p")).getText();
		System.out.println(para);

		// button
		driver.findElement(By.name("submit")).click();

		// link
		driver.findElement(By.linkText("Course Evaluation")).click();

	}

}
