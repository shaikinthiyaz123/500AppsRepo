package com.HipsocialPages.com;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtendUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class AddStreamsPage {
	// ==============================Add Streams to Twitter
	// Locators====================================
	public static By Add_HomeStream_Xpath = By.xpath("//a[text()='Home']");
	public static By InsertedSuccessfully_toste_Xpath = By.xpath("//p[text()='Inserted Successfully...!']");
	public static By Add_MentionsStream_Xpath = By.xpath("//a[text()='Mentions']");
	public static By Add_MyTweetsStream_Xpath = By.xpath("//a[text()='MyTweets']");
	public static By Add_LikesStream_Xpath = By.xpath("//a[text()='Likes']");
	public static By Add_RetweetsStream_Xpath = By.xpath("//a[text()='Retweets']");
	public static By Add_FollowersStream_Xpath = By.xpath("//a[text()='Followers']");
	public static By Add_SearchStream_Xpath = By.xpath("//a[text()='Search']");
	public static By EnterStreamName_Xpath = By.xpath("//input[@id='search_query']");
	public static By Click_AddStream_Xpath = By.xpath("//button[text()='Add Stream']");
	public static By Add_TrendsStream_Xpath = By.xpath("//a[text()='Trends']");
	public static By Click_AddStreamtop_xpath= By.xpath("//button[text()=' Add Stream ']");
	// =============================Add Streams to FaceBook
	// Locators=====================================================================
	public static By FB_Timeline_Xpath = By.xpath("//a[text()='Timeline']");
	public static By FB_Events_Xpath = By.xpath("//a[text()='Events']");
	// =================================LinkedIn
	// Locators====================================================================
	public static By LnkedInMyposts_Xpath = By.xpath("//a[text()='MyPosts']");
	// =============================WordPress Locators=============================
	public static By WordMyposts_Xpath = By.xpath("//a[text()='MyPosts']");
	public static By WordFollowers_Xpath = By.xpath("//a[text()='Followers']");
	//================================================================================

	public static void toasteMessageDisplay() throws InterruptedException {
		KeywordUtil.waitForVisible(AddStreamsPage.InsertedSuccessfully_toste_Xpath);

		String toasteMessage = KeywordUtil.getDriver().findElement(AddStreamsPage.InsertedSuccessfully_toste_Xpath)
				.getText();
		String expected = "Inserted Successfully...!";
		Assert.assertEquals(toasteMessage, expected);

		ExtendUtil.logger.log(LogStatus.PASS,
				HTMLReportUtil.passStringGreenColor("Toaste message displayed is Stream " + toasteMessage));
		//KeywordUtil.delay(5000);
		
		}
	}

	

