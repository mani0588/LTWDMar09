package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution ended");
	}

}
