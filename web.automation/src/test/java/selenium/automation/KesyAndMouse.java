package selenium.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KesyAndMouse extends DriverUtil {

	public static void main(String[] args) {

		getDriver();

		driver.findElement(By.name("user")).sendKeys("mani" + Keys.TAB + "pass" + Keys.ENTER);

		// Mouse Actions
		Actions act = new Actions(driver);

		// click
		act.click(driver.findElement(By.name("email_to[]"))).perform();
		// act.click(driver.findElement(By.name("user"))).pause(Duration.ofSeconds(2)).sendKeys("hello").perform();

		// double click
		act.doubleClick(driver.findElement(By.xpath("//h1"))).perform();

		// right / context click
		act.contextClick(driver.findElement(By.xpath("//h1"))).perform();

		// Mouse hover
		act.moveToElement(driver.findElement(By.linkText("Home"))).perform();

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");

//		for(WebElement e : driver.findElements(By.tagName("a")))
//		{
//			e.click();
//		}

	}

}
