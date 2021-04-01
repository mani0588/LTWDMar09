package selenium.automation;

public class DriverConfiguration extends DriverUtil {

	public static void main(String[] args) {
		
		getDriver();
		//driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	}

}
