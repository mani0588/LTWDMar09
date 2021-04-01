package selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtil {

	public static WebDriver driver;

	public static void setup() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		co.addArguments("--incognito");
		//co.addArguments("--headless"); // no UI

		driver = new ChromeDriver(co); // chrome browser opens
	}

	public static void getDriver() {
		setup();
		driver.get("https://www.mycontactform.com/samples.php");
	}

	public static void getDriver(String url) {
		setup();
		driver.get(url);
	}

}
