package utilities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtendUtil {
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public static void onStartExtend() {
		
		
	
		extent = new ExtentReports(System.getProperty("user.dir") + ConfigReader.getValue("extentReportPath"));
		extent.loadConfig(new File(System.getProperty("user.dir") + ConfigReader.getValue("extentConfigPath")));
		// Get all the common setting from excel file that are required for
		GlobalUtil.setCommonSettings(ExcelDataUtil.getCommonSettings());
	}
	
public static void onEndExtend() {
		
	extent.endTest(logger);
	extent.flush();
	}
	
	
	
}


