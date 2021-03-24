package selenium.automation;

import org.openqa.selenium.By;

public class LocatorsInSelenium extends DriverUtil {

	public static void main(String[] args) {

		// Locators - 8
		// id, name, linkText, partialLinkText
		// tagName, className, xpath, cssSelector

		getDriver();
		driver.findElement(By.name("email_to[]")).click();

		// //tagname[@att='attVal']
		// <input[tagname] type[att]="checkbox"[att val] name[att]="email_to[]"[att val]
		// value[att]="0"[att val]>
		driver.findElement(By.xpath("//input[@value='1' and @type='checkbox']")).click();

		driver.findElement(By.linkText("Features")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Feat")).click();

		driver.findElement(By.tagName("input")).sendKeys("mani");

		// <input name="pass" type="password" class="txt_log" id="pass" tabindex="2">
		driver.findElement(By.className("txt_log")).sendKeys("pass");

		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("abcdr");

		// xpath

	}

}
