package selenium.automation;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandlingFramesWindowsAlert extends DriverUtil {

	public static void main(String[] args) {

		// Eclipse class creation checkboxes

		getDriver("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();

		// Handling windows
		Set<String> windows = driver.getWindowHandles();
		System.out.println("No. of windows " + windows.size());

		String secondID = windows.toArray()[1].toString();
		driver.switchTo().window(secondID);
		System.out.println(driver.getTitle());

		// Handling Frames
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Handling Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); // ok, yes, continue
		// alert.dismiss(); // non ok, no, reject, close, cancel
		
		// close and quit
		driver.close(); // close current window
		driver.quit(); // close all associated windows

	}

}
