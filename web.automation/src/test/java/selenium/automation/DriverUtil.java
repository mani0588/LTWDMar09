package selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtil {

	public static WebDriver driver;

	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // chrome browser opens
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
