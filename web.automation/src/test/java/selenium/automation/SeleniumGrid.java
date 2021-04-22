package selenium.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {

		// https://www.selenium.dev/downloads/
		// https://chromedriver.storage.googleapis.com/index.html?path=89.0.4389.23/
		
		// hub node
		/*
		 * Running HUB => java -jar selenium-server-standalone-3.141.59.jar -role hub -port 2233
		 * 
		 * Running NODE => java -Dwebdriver.chrome.driver="chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -port 2244 -hub http://localhost:2233/grid/register
		 */

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		cap.setPlatform(Platform.WINDOWS);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:2244/wd/hub"), cap);
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=89.0.4389.23/");

	}

}
