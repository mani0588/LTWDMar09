package selenium.automation;

import java.io.File;

import org.openqa.selenium.By;

public class XpathLocators extends DriverUtil {

	public static void main(String[] args) {
		
		
		getDriver();
		
		// xpath
		
//		/ - child only => html/body
//		// - child and grand child => html/body//div
//		
//		parent - parent only => //div[@id='right_col_top']/parent::div
//		ancestor - parent and grand-parent => //div[@id='right_col_top']/ancestor::div
		
//		preceding-sibling - //div[@id='content_wrapper']/preceding-sibling::div
//		following-sibling - //div[@id='content_wrapper']/following-sibling::div
		
//		text() - //h1[text()='Sample Email and Contact Forms']
//		starts-with - //h1[starts-with(text(),'Sample Email ')]
//		contains - //h1[contains(text(),'and Contact')]
		
		// (//input[starts-with(@name,'email_to')])[3]
		
		// Getting paragraph value
		String para = driver.findElement(By.xpath("//h1[@class='topbullet']/following-sibling::p")).getText();
		System.out.println(para);
		
		// locate file upload using attach a file lable
		String path = new File("").getAbsolutePath().concat("\\pom.xml");
		driver.findElement(By.xpath("//label[@for='attach4589']/following-sibling::input")).sendKeys(path);

		// Print the group name of Basic Contact Form link
		String header = driver.findElement(By.xpath("//a[contains(text(),'Basic Contact Form')]/ancestor::ul/preceding-sibling::h5")).getText();
		System.out.println(header);
		
		

	}

}
