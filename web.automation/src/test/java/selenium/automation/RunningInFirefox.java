package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunningInFirefox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // chrome browser opens
		driver.get("https://www.mycontactform.com/samples.php");

		// chk, rdio, drd, link, btn, menu, para / lbl / err msg, text box, file upload

		// chk / radio
		driver.findElement(By.name("email_to[]")).click();
		driver.findElement(By.name("q4")).click();
	}

}
