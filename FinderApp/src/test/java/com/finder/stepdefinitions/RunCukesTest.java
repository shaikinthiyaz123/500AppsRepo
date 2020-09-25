package com.finder.stepdefinitions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilities.ConfigReader;
import utilities.DriverUtil;
import utilities.ExcelDataUtil;
import utilities.ExtendUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.TestLinkUtil;

@CucumberOptions(
		monochrome = true,
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"},
		tags = {"@Finder"},
		glue ={ "com.finder.stepdefinitions" }
		
		
		//Modified by Shaik Inthiyaz
		//tags = {"@Amazon"}
		//@MobileTest
		//"@APItests"
		//"@Webtest"
		//@BarneysWebTest
		//"@MaxBupaWebTest"
		)
public class RunCukesTest extends AbstractTestNGCucumberTests {
	private String url = "https://portal.500apps.io/#/login?app=my";                         //"https://portal.500apps.io/#/login?app=beta";																
	private String emailId = "apps2-staging@yopmail.com";            //"shaikimtiyaz123@yopmail.com";
	private String password = "agile123";                                   //"500Apps@123";
	private static By email_loc = By.id("user");
	private static By password_loc = By.id("pass");
	private static By submit_loc = By.xpath("//button[@class='btn w-100 submit-button mt-4 btn-primary py-3']");
	private static By finderappbutton = By.xpath("//h5[contains(text(),'Finder')]");
	private static By domain_search= By.xpath("//span[contains(text(),'Domain Search')]");
	private static By hipappbutton= By.xpath("//span[contains(text(),'Hipsocial')]");
	private static By finderappbuttonin = By.xpath("//span[contains(text(),'Finder')]");

	@BeforeClass
	public void onStart() throws InterruptedException {
		try {
			ExtendUtil.onStartExtend();
			GlobalUtil.setCommonSettings(ExcelDataUtil.getCommonSettings());

			String browser = "";
			browser = GlobalUtil.getCommonSettings().getBrowser();
			System.out.println(browser);

			String executionEnv = "";
			executionEnv = GlobalUtil.getCommonSettings().getExecutionEnv();

			String url = "";
			url = GlobalUtil.getCommonSettings().getUrl();

			if (browser == null) {
				browser = ConfigReader.getValue("defaultBrowser");
			}

			if (executionEnv == null) {
				executionEnv = ConfigReader.getValue("defaultExecutionEnvironment");
			}

			// testlink config
			if (GlobalUtil.getCommonSettings().getManageToolName().equalsIgnoreCase("Testlink")) {
				TestLinkUtil.DEV_KEY = GlobalUtil.getCommonSettings().getTestlinkAPIKey();
				TestLinkUtil.SERVER_URL = "http://" + GlobalUtil.getCommonSettings().getTestLinkHostName()
						+ "/testlink-1.9.16/lib/api/xmlrpc/v1/xmlrpc.php";
				TestLinkUtil.projectName = GlobalUtil.getCommonSettings().getTestlinkProjectName();
				TestLinkUtil.testPlanName = GlobalUtil.getCommonSettings().getTestlinkPlanName();
				TestLinkUtil.buildName = GlobalUtil.getCommonSettings().getBuildNumber();
				TestLinkUtil.needUpdate = GlobalUtil.getCommonSettings().getTestlinkTool();
				GlobalUtil.testlinkapi = new TestLinkUtil();
			}

			if (url == null) {
				url = ConfigReader.getValue("BASE_URL");
				GlobalUtil.getCommonSettings().setUrl(url);
			}
			LogUtil.infoLog(getClass(),
					"\n\n+===========================================================================================================+");
			LogUtil.infoLog(getClass(), " Suite started" + " at " + new Date());
			LogUtil.infoLog(getClass(), "Suite Execution For Web application on environment : " + executionEnv);
			LogUtil.infoLog(getClass(),
					"\n\n+===========================================================================================================+");

		} catch (Exception e) {
			e.printStackTrace();
			LogUtil.errorLog(getClass(), "Common Settings not properly set may not run the scripts properly");
		}

		GlobalUtil.setDriver(DriverUtil.getBrowser(GlobalUtil.getCommonSettings().getExecutionEnv(),
				GlobalUtil.getCommonSettings().getBrowser()));

		GlobalUtil.getDriver().get(url);

		GlobalUtil.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		KeywordUtil.delay(2000);

		WebElement ele = GlobalUtil.getDriver().findElement(email_loc);
		ele.sendKeys(emailId);

		WebElement pass = GlobalUtil.getDriver().findElement(password_loc);
		pass.sendKeys(password);
		KeywordUtil.delay(2000);
		WebElement click = GlobalUtil.getDriver().findElement(submit_loc);
		click.click();
		
		
			WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 250);
			// wait.ignoring(ElementNotVisibleException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(finderappbutton));
		
			/*GlobalUtil.getDriver().navigate().to(
					"https://appup2.qa.500apps.io/#/ms/finder/2/0/domain/d/f-domain-search/0/0/0/0/0/0/0/c-b/s-sz=md,s-cl=12,ik=id");*/
		//GlobalUtil.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		WebElement finder = GlobalUtil.getDriver().findElement(finderappbutton);
		finder.click();
		//GlobalUtil.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(domain_search));
		WebElement DS = GlobalUtil.getDriver().findElement(domain_search);
		DS.getText();
		System.out.println("domain search text=" + DS.getText());
		/*KeywordUtil.getDriver().navigate().refresh();
		WebElement click1 = GlobalUtil.getDriver().findElement(hipappbutton);
		click1.click();
		//KeywordUtil.delay(5000);
		WebElement click2 = GlobalUtil.getDriver().findElement(finderappbuttonin);
		click2.click();
		*/

		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(domain_search));
		GlobalUtil.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		// capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
		// UnexpectedAlertBehaviour.ACCEPT);
		//KeywordUtil.delay(1500);

	}

	@AfterClass
	public void onFinish() {
		LogUtil.infoLog(getClass(), " suite finished" + " at " + new Date());
		LogUtil.infoLog(getClass(),
				"\n\n+===========================================================================================================+");

		ExtendUtil.onEndExtend();

		KeywordUtil.onExecutionFinish();
		DriverUtil.closeAllDriver();
	}}