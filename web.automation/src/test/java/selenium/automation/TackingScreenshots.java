package selenium.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class TackingScreenshots extends DriverUtil {

	public static void main(String[] args) throws IOException {

		getDriver("https://www.amazon.in/");

		// taking screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// save / store screenshot in your local system
		FileHandler.copy(screenshot, new File("./src/test/resources/AmazonHomePage_Visible.png"));

		// Full screenshot using Shutterbug
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS).withTitle("Tacking screenshot example")
				.withName("AmazonHomePage_Full").save("./src/test/resources/");

	}

}
