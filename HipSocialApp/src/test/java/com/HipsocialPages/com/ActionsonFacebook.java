package com.HipsocialPages.com;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class ActionsonFacebook {
	public static By Click_DemoCategory_Xpath= By.xpath("//div[@class='p-0 py-1 ml-2' and text()='Demo']");
	public static By click_onLike_Xpath=By.xpath("(//a[@class='cursor-pointer']//i)[1]");
	public static By like_post_Xpath= By.xpath("//p[text()='You have liked a post']");
	public static By like_tooltip_xpath=  By.xpath("//div[@class='tooltip-inner']");
	public static By Undo_like_post_Xpath= By.xpath("(//a[@class='cursor-pointer']//i)[1]");
	public static By refresh_xpath= By.xpath("//div//a//i[@class='far fa-sync-alt small mr-3 h-icon']");
	public static By Click_Cross_Xpath= By.xpath("(//i[@class='fal fa-times time-icon  fa-lg h-icon align-middle'])[1]");
	public static By Delete_Stream_Xpath= By.xpath("(//footer//button[text()='Delete'])[1]");
	public static By comment_xpath= By.xpath("(//i[@data-original-title='Comment'])[1]");
	public static By Enter_commentText_xpath= By.xpath("(//textarea[@id='textarea'])[1]");
	public static By Submit_commentText_xpath= By.xpath("(//button[text()='Submit'])[2]");
	
	
	
	
	
	
	
	public static void assertTosterMessage(String expectedMessage) throws InterruptedException {

		
		Assert.assertEquals(KeywordUtil.tosterMessageSubText(), expectedMessage);

		ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil
				.passStringGreenColor("ActualText found in Alert was : " + KeywordUtil.tosterMessageSubText()));
		KeywordUtil.waitUntilTosterMessageDisappear();
		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Actual Message Text Matched to Expected Text Message "));

}
}
