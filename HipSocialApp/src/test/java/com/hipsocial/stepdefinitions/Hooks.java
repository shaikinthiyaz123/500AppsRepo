package com.hipsocial.stepdefinitions;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import testlink.api.java.client.TestLinkAPIResults;
import utilities.ConfigReader;
import utilities.ExtendUtil;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class Hooks {

	String imagePath1;
	String pathForLogger1;
	String testCaseDescription1;

	@Before("@Hipsocial,@media,@CalView,@AddPost,@Filterpost,@DelAddNet,@Approve,@Reject")
	public void beforeMethoUnder(Scenario scenario1) throws InterruptedException {
	
		if (scenario1.getName().contains("_"))
			this.testCaseDescription1 = scenario1.getName().split("_")[1];
		else
			this.testCaseDescription1 = scenario1.getName();
		ExtendUtil.logger = ExtendUtil.extent.startTest(testCaseDescription1);
		LogUtil.infoLog(getClass(),
				"\n+----------------------------------------------------------------------------------------------------------------------------+");
		LogUtil.infoLog(getClass(), "Test Started: " + scenario1.getName());
		LogUtil.infoLog("Test Environment",
				"Test is executed in Environment: " + GlobalUtil.getCommonSettings().getExecutionEnv());
		LogUtil.infoLog("TestStarted", "Test is started with browser: " + GlobalUtil.getCommonSettings().getBrowser());
	}
	@After("@Hipsocial,@media,@CalView,@AddPost,@Filterpost,@DelAddNet,@AprvOrRej")
	public void afterMethodUnder(Scenario scenario1) {
		String testName = scenario1.getName().split("_")[0].trim();
		if (scenario1.isFailed()) {
			try {
				String scFileName = "ScreenShot_" + System.currentTimeMillis();
				String screenshotFilePath = ConfigReader.getValue("screenshotPath") + "\\" + scFileName + ".png";
				imagePath1 = HTMLReportUtil.testFailTakeScreenshot(screenshotFilePath);
				pathForLogger1 = ExtendUtil.logger.addScreenCapture(imagePath1);
				ExtendUtil.logger.log(LogStatus.FAIL,
						HTMLReportUtil.failStringRedColor("Failed at point: " + pathForLogger1) + GlobalUtil.e);
				scenario1.write("Current Page URL is " + GlobalUtil.getDriver().getCurrentUrl());
				byte[] screenshot = KeywordUtil.takeScreenshot(screenshotFilePath);
				scenario1.embed(screenshot, "image/png");
				// report the bug
				// String bugID = "Please check the Bug tool Configuration";
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			LogUtil.infoLog("TestEnded",
					"Test has ended closing browser: " + GlobalUtil.getCommonSettings().getBrowser());
			if (GlobalUtil.getCommonSettings().getManageToolName().equalsIgnoreCase("TestLink")) {
				GlobalUtil.testlinkapi.updateTestLinkResult(testName, "This test is passed",
						TestLinkAPIResults.TEST_PASSED);
			}
		}
		
		// close the browsers
		/* DriverUtil.closeAllDriver(); */
		ExtendUtil.extent.endTest(ExtendUtil.logger);
	}
	
	

}