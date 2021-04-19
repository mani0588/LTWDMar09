package selenium.automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class PriorityAndDependency {

	// -10 -11 0 12
	// -11 -10 0 12

	// Total 3, Fail 3, Pass 0
	// Total 3, Fail 1, Pass 0, Skiped 2

	@Test(priority = 0)
	public void verifySignup() {
		System.out.println("verifySignup");
		Assert.assertTrue(false);
	}

	@Test(priority = 10, dependsOnMethods = { "verifySignup" })
	public void verifyLogin() {
		System.out.println("verifyLogin");
	}

	@Test(priority = 23, dependsOnMethods = { "verifyLogin" })
	public void verifyLogout() {
		System.out.println("verifyLogout");
	}

	@Test(priority = -100)
	public void verifyApplicaitonInstallation() {
		System.out.println("verifyApplicaitonInstallation");
	}

}
