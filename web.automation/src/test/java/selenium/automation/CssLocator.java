package selenium.automation;

import org.openqa.selenium.By;

public class CssLocator extends DriverUtil {

	public static void main(String[] args) {

		getDriver();
		driver.findElement(By.cssSelector("a")).sendKeys("Hello");

		// # - by id
		// . - by class name

		// > - child only
		// white-space - child and g-child

		// parent and ancestor - not applicable in css

		// preceding-sibling - not applicable in css
		// label[for='subject'] + input ==> following-sibling

		// selecting element by visible text not applicable in css

		// a:nth-child(1) - based on position

		// label[for^='sub'] - starts with
		// label[for$='ect'] - ends with
		// label[for*='ubj'] - contains

	}

}
