package Listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Loggers.LogTest;



public class TestListeners implements ITestListener {
	private static final Logger logger = LogManager.getLogger(LogTest.class);
	public void onTestStart(ITestResult result) {
		logger.info("New Test Started" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test Successfully Finished" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		logger.info("Test Failed" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Test Skipped" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.info("Test Failed but within success percentage" + result.getName());
	}

	public void onStart(ITestContext context) {
		logger.info("This is onStart method" + context.getOutputDirectory());
	}

	public void onFinish(ITestContext context) {
		logger.info("This is onFinish method" + context.getPassedTests());
		logger.info("This is onFinish method" + context.getFailedTests());
	}
}