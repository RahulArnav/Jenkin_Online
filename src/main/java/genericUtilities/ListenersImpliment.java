package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImpliment implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName=result.getMethod().getMethodName();
		System.out.println("Test script execution");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName=result.getMethod().getMethodName();
		System.out.println("Test script execution");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName=result.getMethod().getMethodName();
		System.out.println("Test script execution");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String testScriptName=result.getMethod().getMethodName();
		System.out.println("Test script execution");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("suite Execution Started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execute Finished");
	}
}
