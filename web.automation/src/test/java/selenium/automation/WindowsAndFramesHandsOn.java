package selenium.automation;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowsAndFramesHandsOn extends DriverUtil {

	public static void main(String[] args) {

		getDriver("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();

		// Switch to last window?
		// Handling windows
		Set<String> windows = driver.getWindowHandles();
		int noOfWinds = windows.size();
		System.out.println("No. of windows " + noOfWinds);

		String lastID = windows.toArray()[noOfWinds - 1].toString();
		driver.switchTo().window(lastID);
		System.out.println(driver.getTitle());

		// Find how many frames in a page?
		System.out.println("No. of frames " + driver.findElements(By.tagName("iframe")).size());

	}

}
