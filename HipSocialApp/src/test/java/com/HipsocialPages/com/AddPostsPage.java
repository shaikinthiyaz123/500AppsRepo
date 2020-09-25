package com.HipsocialPages.com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class AddPostsPage {
	static String image = "1";
	public static By Click_on_Posts = By.xpath("//span[text()='Posts']");
	public static By Click_on_AddPost = By.xpath("//button[text()='Add Post']");
	public static By Click_on_SelectNetwork = By.xpath("//span[text()='Select Network']");
	public static By Click_FB_CheckBox = By.xpath("//span[text()='QA testing']");
	public static By Click_Twitter_CheckBox = By.xpath("//span[text()='ShaikIn91043713']");
	public static By Click_LinedIn_CheckBox = By.xpath("//span[text()='500apps-socialchimp']");
	public static By Click_Done = By.xpath("//span[text()='Done']");
	public static By Enter_Text = By.xpath("//textarea[@name='message']");
	public static By Click_on_MediaLibrary = By.xpath("//a[contains(text(),'Upload from media')]");
	public static By Pick_Image = By.xpath("(//img[@class='rounded img-fluid rounded heigh-120px'])[" + image + "]");
	public static By Click_on_ok = By.xpath("//button[text()='Ok']");
	public static By Click_on_PostNow_RadioButton = By.xpath("//span[text()='Post Now']");
	public static By Click_on_Postnow_Button = By.xpath("//button[text()='Post Now']");
	public static By PostedSuccessfully_toaste_Xpath = By.xpath("//p[text()='Successfully Inserted']");
	public static By Publish_Successfull_Xpath = By.xpath("//span[text()='a few seconds ago']");
	public static By Click_on_SaveDraft_RadioButton = By.xpath("//span[text()='Save as Draft']");
	public static By Click_on_SaveDraft_Button = By.xpath("//button[text()='Save as Draft']");
	public static By Click_on_Schedudle_RadioButton = By
			.xpath("(//input[@value='scheduled']//following::label/span)[1]");
	public static By Click_on_Schedudle_Time_CSS = By.cssSelector("input[placeholder='Select schedule time']");
	public static By Hour_Xpath = By.xpath("//input[@aria-label='Hour']");
	public static By Minute_Xpath = By.xpath("//input[@aria-label='Minute']");
	public static By Click_Schedule_Button_Xpath = By.xpath("//button[text()='Schedule']");
	public static By Clcik_Choosefile_Xpath = By.xpath(
			"//textarea[@id='exampleFormControlTextarea2']/..//following-sibling::div//descendant::div//child::div[@class='custom-file b-form-file']");
	public static By click_on_calender_xpath = By.xpath("//i[@class='fal fa-calendar']");
	public static By Txt_calender_mwd_xpath = By.xpath("//div[@class='fc-center']//h2");
	public static By click_on_week_xpath = By
			.xpath("//button[@class='fc-agendaWeek-button fc-button fc-state-default']");
	public static By click_on_day_xpath = By
			.xpath("//button[@class='fc-agendaDay-button fc-button fc-state-default fc-corner-right']");
	// public static By click_on_dayfield_xpath=
	// By.xpath("//th[@class='fc-day-header fc-widget-header fc-wed
	// fc-today']");
	public static By day_in_month_xpath = By.xpath("//td[@class='fc-day-top fc-wed fc-today ']");
	public static By get_day_css = By.cssSelector("th[class='fc-axis fc-widget-header']+th>span");
	// ================================Posts
	// filter===============================================================================

	public static By Select_network_xpath = By.xpath("(//select[@class='px-2 p-1 text-capitalize'])[1]");
	public static By Select_status_xpath = By.xpath("(//select[@class='px-2 p-1 text-capitalize'])[2]");
	public static By Network_clo_xpath = By.xpath("//div[@class='media align-items-center']//h6");
	public static By no_post_found = By
			.xpath("//h3[@class='d-block font-weight-bold text-black-50 mt-6' and text()=' No Posts Found!']");

	public static void PosttoasteMessageDisplay() throws Exception {
		KeywordUtil.waitForVisible(AddPostsPage.PostedSuccessfully_toaste_Xpath);
		String toasteMessage = KeywordUtil.getDriver().findElement(AddPostsPage.PostedSuccessfully_toaste_Xpath)
				.getText();
		System.out.println("Toaste message displayed is -->" + toasteMessage);

		String expected = "Successfully Inserted";
		Assert.assertEquals(toasteMessage, expected);

		ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Posts:" + toasteMessage));

		/*
		 * String Publish = "a few seconds ago"; String
		 * Status=KeywordUtil.getDriver().findElement(AddPostsPage.
		 * Publish_Successfull_Xpath).getText(); System.out.println(Status);
		 * Assert.assertEquals(Status, Publish ,
		 * "Succefully Published a few seconds ago");
		 * ExtendUtil.logger.log(LogStatus.PASS,
		 * HTMLReportUtil.passStringGreenColor(
		 * "Record successfully Inserted in Posts Page "));
		 */

		/*
		 * Actions action = new Actions(KeywordUtil.getDriver());
		 * action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().
		 * perform(); KeywordUtil.delay(3000);
		 */
		//GlobalUtil.getDriver().navigate().refresh();
		KeywordUtil.delay(3000);

	}

	public static void getMonth() {
		LocalDate currentdate = LocalDate.now();
		System.out.println("Current date: " + currentdate);
		Month currentMonth = currentdate.getMonth();
		String thismonth = currentMonth.toString();

		String lower = thismonth.toLowerCase();
		StringUtils.capitalize(lower);
		String output = lower.substring(0, 1).toUpperCase() + lower.substring(1);

		String mnt = GlobalUtil.getDriver().findElement(Txt_calender_mwd_xpath).getText();

		if (mnt.contains(output)) {
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("User looking into" + mnt + "Posts"));
		} else {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.failStringRedColor("User not in current month"));

		}
		/*
		 * String today =
		 * GlobalUtil.getDriver().findElement(day_in_month_xpath).getAttribute(
		 * "data-date"); System.out.println("today date"+today);
		 * 
		 * if(today.equals(currentdate)){ ExtendUtil.logger.log(LogStatus.PASS,
		 * HTMLReportUtil.passStringGreenColor( today+
		 * "Heighlited in the Month page"));
		 * 
		 * } else{ ExtendUtil.logger.log(LogStatus.PASS,
		 * HTMLReportUtil.passStringGreenColor( today+
		 * "not heighlited in the Month page")); }
		 */
	}

	public static void getWeek() throws InterruptedException {
		LocalDate currentdate = LocalDate.now();
		System.out.println("Current date: " + currentdate);
		Month currentMonth = currentdate.getMonth();
		String thismonth = currentMonth.toString();

		String lower = thismonth.toLowerCase();
		StringUtils.capitalize(lower);
		String output = lower.substring(0, 1).toUpperCase() + lower.substring(1);

		String mnt = GlobalUtil.getDriver().findElement(Txt_calender_mwd_xpath).getText();

		if (mnt.contains(output)) {
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("User looking into weekly posts"));
		}
		KeywordUtil.delay(3000);
	}

	public static void getDay() {

		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		System.out.println("current day of week" + dayOfWeek);

		String today = dayOfWeek.toString();
		String lower = today.toLowerCase();
		StringUtils.capitalize(lower);
		String output = lower.substring(0, 1).toUpperCase() + lower.substring(1);
		String day = GlobalUtil.getDriver().findElement(get_day_css).getText();

		if (day.contains(output)) {
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("User looking into" + day + "posts"));
		} else {
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.failStringRedColor("User not looking into" + day + "Posts"));

		}
	}

	public static void netElement(By locator, String network) {
		String name ="";
		int count;
		
		
		List<WebElement> networkFilterResult = KeywordUtil.getDriver().findElements(locator);
		System.out.println("No of cols are : " + networkFilterResult.size());
		count = networkFilterResult.size();
		System.out.println(count);


		for (WebElement webElement : networkFilterResult) {
			name = webElement.getText();
			System.out.println(name);
			
			
				
			
			/*if( AddPostsPage.elementNotfound().isDisplayed()==true){
				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.failStringRedColor("No posts found"));*/
				
			// if
			if(!name.equals(network)){
				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.failStringRedColor("Filter is not working Properly"));
			
			}
			else{
				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.passStringGreenColor("Filter is working Properly"));
				
				
		}
		

	}
	
}
	public static WebElement  elementNotfound(){
		WebElement ele=  KeywordUtil.getDriver().findElement(AddPostsPage.no_post_found);
		
		 return ele;
		 
		
	}
}
