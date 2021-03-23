package selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtil {

	public static WebDriver driver;
	
	public static void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // chrome browser opens
		driver.get("https://www.mycontactform.com/samples.php");
	}
	
	
}
