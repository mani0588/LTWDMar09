package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromeDriver().setup();

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mycontactform.com/samples.php");

		Actions act = new Actions(driver);

		// single click or left click
		act.click(driver.findElement(By.name("email_to[]"))).build().perform();

		// double click
		act.doubleClick(driver.findElement(By.xpath("//label[text()='User Name:']"))).build().perform();

		// mouse hover / scroll up or down
		act.moveToElement(driver.findElement(By.linkText("Features"))).build().perform();

		// right click or context click
		// sroll until the element comes into visible portion
		// act.contextClick(driver.findElement(By.linkText("Features"))).sendKeys(Keys.ESCAPE).build().perform();

		// scroll up or down
		// act.sendKeys(Keys.END).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		// scroll - scrollTo
		// sendkeys - setAttribute
		// add or remove attributes - setAttribute('value','hello');
		// highlight - setAttribute('style','color:#FFG00, border fill');
		
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.linkText("testimonials"))).build().perform();

	}
}