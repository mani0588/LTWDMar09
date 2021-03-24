package selenium.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingGroupOfElements extends DriverUtil {

	public static void main(String[] args) {

		getDriver();

		List<WebElement> allChks = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No. of check boxes " + allChks.size());

//		WebElement ele = driver.findElement(By.xpath(""));
//		ele.click();
//
//		WebElement chk1 = allChks.get(0);
//		WebElement chk2 = allChks.get(1);

		for (int i = 0; i < allChks.size(); i++) {
			allChks.get(i).click();
		}
		
		// print text of all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("No. of links : " + allLinks.size());
		
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}


	}

}
