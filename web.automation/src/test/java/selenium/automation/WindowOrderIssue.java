package selenium.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOrderIssue {

	static WebDriver driver;
	static String parentID;
	static List<String> winIds = new ArrayList<String>();

	public static List<String> addWindow() {
		Set<String> windows = driver.getWindowHandles();
		for (int i = 0; i < windows.size(); i++) {
			String id = windows.toArray()[i].toString();
			if (!winIds.contains(id)) {
				winIds.add(id);
			}
		}
		driver.switchTo().window(parentID);
		return winIds;
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://in.via.com");
		parentID = driver.getWindowHandle();
		addWindow();

		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.className("viaAlertClose")).click();

		driver.findElement(By.linkText("Support")).click();
		Thread.sleep(2000);
		addWindow();

		driver.findElement(By.linkText("Deals")).click();
		Thread.sleep(2000);
		addWindow();

		driver.findElement(By.linkText("Download App")).click();
		List<String> windows = addWindow();

		int noOfWinds = windows.size();
		System.out.println("No. of windows " + noOfWinds);

		String lastID = windows.get(noOfWinds - 1).toString();
		driver.switchTo().window(lastID);
		System.out.println(driver.getTitle());

		String secondID = windows.get(noOfWinds - 2).toString();
		driver.switchTo().window(secondID);
		System.out.println(driver.getTitle());

		// Dimension dim = driver.findElement(By.xpath("button")).getSize();
		// System.out.println(dim.getWidth());
		// System.out.println(dim.getHeight());

	}

}
