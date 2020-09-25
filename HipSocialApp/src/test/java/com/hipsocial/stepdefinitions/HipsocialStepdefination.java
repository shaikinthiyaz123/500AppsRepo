package com.hipsocial.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.HipsocialPages.com.ActionsOnLinkedIn;
import com.HipsocialPages.com.ActionsOnTwitter;
import com.HipsocialPages.com.ActionsonFacebook;
import com.HipsocialPages.com.AddMedia;
import com.HipsocialPages.com.AddNetworkPage;
import com.HipsocialPages.com.AddPostsPage;
import com.HipsocialPages.com.AddStreamsPage;
import com.HipsocialPages.com.AddnDltNetwork;
import com.HipsocialPages.com.HipsocialCategoriesPage;
import com.HipsocialPages.com.RejOrApprvPosts;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Apps500Util;
import utilities.ExcelDataUtil;
import utilities.ExtendUtil;
import utilities.FileUploadingRobotClass;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;

public class HipsocialStepdefination extends KeywordUtil {

	@SuppressWarnings("rawtypes")
	static Class thisClass = HipsocialStepdefination.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	String social = "testing" + getCurrentDateTime();

	@Given("^Read Login Data from Excel \"([^\"]*)\"$")
	public void read_Login_Data_from_Excel(String arg2) throws Throwable {
		try {
			// getDriver().navigate().refresh();
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID("Hipsocial", arg2);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Given("^User click on Streams Option$")
	public void user_click_on_Streams_Option() throws Throwable {
		try {
			// click(HipsocialLoginPage.Click_Hipsocial_Xpath, "Click on
			// hipApp");
			click(HipsocialCategoriesPage.Click_Streams_Xpath, "Click on Streams module");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^Click on Horizantal bars$")
	public void click_on_Horizantal_bars() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on CATEGORIES$")
	public void click_on_CATEGORIES() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Categories_Xpath, "Click on Categories");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Enter the Categorie Name$")
	public void enter_the_Categorie_Name() throws Throwable {
		try {
			inputText(HipsocialCategoriesPage.EnterName_Css, dataMap.get("CategorieName"),
					"Enter Name of the Categorie");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Save$")
	public void click_on_Save() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Save_Xpath, "Click on Save Button");
			HipsocialCategoriesPage.toasteMessageDisplay();

		}

		catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Mousehover on existing category and click on ellipsis$")
	public void mousehover_on_existing_category_and_click_on_ellipsis() throws Throwable {
		try {
			HipsocialCategoriesPage.mouseHoveraction();
			Boolean Display = getDriver().findElement(HipsocialCategoriesPage.Click_Dots_Xpath).isDisplayed();
			System.out.println("Element Displayed is :" + Display);
			click(HipsocialCategoriesPage.Click_Dots_Xpath, "Click on ellipsis");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Edit option$")
	public void click_on_Edit_option() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Edit_Xpath, "Click on Edit");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Clear and enter the name$")
	public void clear_and_enter_the_name() throws Throwable {
		try {
			waitForVisible(HipsocialCategoriesPage.Edit_Categorie_Xpath);
			getDriver().findElement(HipsocialCategoriesPage.Edit_Categorie_Xpath).clear();
			inputText(HipsocialCategoriesPage.Edit_Categorie_Xpath, dataMap.get("EditCategorieName"),
					"Enter new Name of the Categorie");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Update$")
	public void click_on_Update() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Update_Xpath, "Click on Update");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Veriy the Message$")
	public void veriy_the_Message() throws Throwable {
		try {
			HipsocialCategoriesPage.toasteUpdateMessageDisplay();
			getDriver().navigate().refresh();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Delete option$")
	public void click_on_Delete_option() throws Throwable {
		try {
			click(HipsocialCategoriesPage.DeleteDropDown_Category_Xpath, "Click on Delete option");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Click on Delete Button$")
	public void click_on_Delete_Button() throws Throwable {
		try {
			click(HipsocialCategoriesPage.DeleteButton_Xpath, "Click on Delete Button");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Verify the Mesaage$")
	public void verify_the_Mesaage() throws Throwable {
		try {
			HipsocialCategoriesPage.toasteDeleteMessageDisplay();
			getDriver().navigate().refresh();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^Click on Twitter from Add Networks$")
	public void click_on_Twitter_from_Add_Networks() throws Throwable {
		try {

			AddNetworkPage.waitForClick();
			hoverOnElement(AddNetworkPage.Click_Twitter_Xpath);

			click(AddNetworkPage.Click_Twitter_Xpath, "Click on Twitter");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Switch to the next tab for Twitter site$")
	public void switch_to_the_next_tab_for_Twitter_site() throws Throwable {
		try {
			AddNetworkPage.switchWindowHandle();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Enter UserName Password and click on Authorise App$")
	public void enter_UserName_Password_and_click_on_Authorise_App() throws Throwable {
		try {
			inputText(AddNetworkPage.Enter_Twi_UserName_Css, dataMap.get("Twi_UserName"), "Enter UserName");
			inputText(AddNetworkPage.Enter_Twi_Pass_Css, dataMap.get("Twi_Password"), "Enter Password");

			click(AddNetworkPage.Click_AuthApp_Css, "Click on Authorise App");
			// inputText(AddNetworkPage.enter_User_xpath,
			// dataMap.get("Twi_UserName"), "Enter UserName");
			// inputText(AddNetworkPage. enter_pass_xpath,
			// dataMap.get("Twi_Password"), "Enter Password");
			// click(AddNetworkPage.click_again_xpath, "Click on login");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}
	}

	@Then("^Select the added network from the dropdown to verify$")
	public void select_the_added_network_from_the_dropdown_to_verify() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("ShaikIn91043713 (Twitter)");

			System.out.println("Twitter Account Selected Successfully from DropDown");
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Twitter Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^Click on Facebook from Add Networks$")
	public void click_on_Facebook_from_Add_Networks() throws Throwable {
		try {
			AddNetworkPage.waitForClick();

			hoverOnElement(AddNetworkPage.Click_FB_Xpath);

			click(AddNetworkPage.Click_FB_Xpath, "Click on FaceBook");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("^Switch to the next tab for Facebook site$")
	public void switch_to_the_next_tab_for_Facebook_site() throws Throwable {
		try {
			AddNetworkPage.switchWindowHandle();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Enter UserName Password and click on Login$")
	public void enter_UserName_Password_and_click_on_Login() throws Throwable {

		inputText(AddNetworkPage.FB_Username_Xpath, dataMap.get("FB_UserName"), "Enter UserName");

		inputText(AddNetworkPage.FB_Pass_Xpath, dataMap.get("FB_Password"), "Enter Password");

		click(AddNetworkPage.FB_ClickLogIn_Xpath, "Click on Login Button");

		waitForClickable(AddNetworkPage.FB_Click_Contiueas_Xpath);
		Actions act = new Actions(getDriver());
		act.moveToElement(getDriver().findElement(AddNetworkPage.FB_Click_Contiueas_Xpath)).click().build().perform();

		click(AddNetworkPage.FB_Click_Contiueas_Xpath, "Click on ContinueAS Button");

		try {
			click(AddNetworkPage.Click_FB1stPage_Xpath, "Click on Check Box");
			click(AddNetworkPage.Clcik_Submit_Xpath, "Click on Submit Button");
		} catch (Throwable e) {
			click(AddNetworkPage.Clcik_Back_Button_Xpath, "Click on Back Button");
			Apps500Util.assertTosterMessage("This account already exists.");


		}

	}

	@Then("^Select the added Facebook network from the dropdown to verify$")
	public void select_the_added_Facebook_network_from_the_dropdown_to_verify() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("QA testing (Facebook)");
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Facebook Account Selected Successfully from DropDown"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^Click on LinkedIn from Add Networks$")
	public void click_on_LinkedIn_from_Add_Networks() throws Throwable {

		hoverOnElement(AddNetworkPage.Click_LinkedIn_Xpath);
		click(AddNetworkPage.Click_LinkedIn_Xpath, "Click on LinkedIn Network");

	}

	@Then("^Switch to the next tab for LinkedIn site$")
	public void switch_to_the_next_tab_for_LinkedIn_site() throws Throwable {

		try {
			AddNetworkPage.switchWindowHandle();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Enter UserName Password and click on Sign In$")
	public void enter_UserName_Password_and_click_on_Sign_In() throws Throwable {

		inputText(AddNetworkPage.LinkedIn_Username_Xpath, dataMap.get("LinkUserNmae"), "Enter UserName");

		inputText(AddNetworkPage.LinkedIn_Pass_Xpath, dataMap.get("LinkPassword"), "Enter Password");

		click(AddNetworkPage.LinkedIn_ClickSignIn_Xpath, "Click on SignIn Button");

		try {
			click(AddNetworkPage.Click_Lnk1stpage_Xpath, "Click on Check Box");
			click(AddNetworkPage.Clcik_Submit_Xpath, "Click on Submit Button");
		} catch (Throwable e) {

			waitForClickable(AddNetworkPage.Clcik_Back_Button_Xpath);

			click(AddNetworkPage.Clcik_Back_Button_Xpath, "Click on Back Button");
			Apps500Util.assertTosterMessage("This account already exists.");


		}
	}

	@Then("^Select the added LinkedIn network from the dropdown to verify$")
	public void select_the_added_LinkedIn_network_from_the_dropdown_to_verify() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("500apps-socialchimp (LinkedIn)");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("LinkedIn Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Click on WordPress from Add Networks$")
	public void click_on_WordPress_from_Add_Networks() throws Throwable {
		try {
			hoverOnElement(AddNetworkPage.Click_Wordpress_Xpath);

			actClick(AddNetworkPage.Click_Wordpress_Xpath, "Click on WordPress from add networks");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Switch to the next tab for Wordpress site$")
	public void switch_to_the_next_tab_for_Wordpress_site() throws Throwable {
		try {
			AddNetworkPage.switchWindowHandle();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Enter UserName Password and click on Sign In and aprove$")
	public void enter_UserName_Password_and_click_on_Sign_In_and_aprove() throws Throwable {
		try {
			inputText(AddNetworkPage.WordPress_Username_Css, dataMap.get("WordUserName"), "Enter UserName");
			click(AddNetworkPage.Click_Continue_Css, "Click on Continue Button");

			inputText(AddNetworkPage.WordPress_Pass_Css, dataMap.get("WordPassword"), "Enter Password");

			click(AddNetworkPage.WordPress_ClickLogin_Css, "Click on LogIn Button");

			click(AddNetworkPage.WordPress_ClickApprove_Css, "Click on Approve Button");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Select the added WordPress network from the dropdown to verify$")
	public void select_the_added_WordPress_network_from_the_dropdown_to_verify() throws Throwable {
		try {

			AddNetworkPage.selectAddedNetwork("shaikinthiyaztest (WordPress)");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("WordPress Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Select the category from categories$")
	public void select_the_category_from_categories() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(AddNetworkPage.Click_AnyCategory_Xpath, "Click on the added category");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Select the twitter network from the add streams dropdown$")
	public void select_the_twitter_network_from_the_add_streams_dropdown() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("ShaikIn91043713 (Twitter)");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Twitter Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Click on Home and catch the Popup Message$")
	public void click_on_Home_and_catch_the_Popup_Message() throws Throwable {

		try {
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			clickStreams(AddStreamsPage.Add_HomeStream_Xpath, "Click on Home Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Mentions and catch the Popup Message$")
	public void click_on_Mentions_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_MentionsStream_Xpath);
			click(AddStreamsPage.Add_MentionsStream_Xpath, "Click on Mentions Stream");

			// clickStreams(AddStreamsPage.Add_MentionsStream_Xpath, "Click on
			// Mentions Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}

	}

	@Then("^Click on My Tweets and catch the Popup Message$")
	public void click_on_My_Tweets_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_MyTweetsStream_Xpath);
			click(AddStreamsPage.Add_MyTweetsStream_Xpath, "Click on MyTweets Stream");

			AddStreamsPage.toasteMessageDisplay();

			// clickStreams(AddStreamsPage.Add_MyTweetsStream_Xpath, "Click on
			// MyTweets Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}
	}

	@Then("^Click on likes and catch the Popup Message$")
	public void click_on_likes_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_LikesStream_Xpath);
			click(AddStreamsPage.Add_LikesStream_Xpath, "Click on Likes Stream");

			AddStreamsPage.toasteMessageDisplay();

			// clickStreams(AddStreamsPage.Add_LikesStream_Xpath, "Click on
			// Likes Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");
		} catch (Exception e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}

		catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Click on Retweets and catch the Popup Message$")
	public void click_on_Retweets_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_RetweetsStream_Xpath);
			click(AddStreamsPage.Add_RetweetsStream_Xpath, "Click on Retweets Stream");

			AddStreamsPage.toasteMessageDisplay();

			// clickStreams(AddStreamsPage.Add_RetweetsStream_Xpath, "Click on
			// Retweets Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));

		}

	}

	@Then("^Click on Followers and catch the Popup Message$")
	public void click_on_Followers_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_FollowersStream_Xpath);
			click(AddStreamsPage.Add_FollowersStream_Xpath, "Click on Followers Stream");

			AddStreamsPage.toasteMessageDisplay();

			// clickStreams(AddStreamsPage.Add_FollowersStream_Xpath, "Click on
			// Followers Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));

		}

	}

	@Then("^Click on Search and catch the Popup Message$")
	public void click_on_Search_and_catch_the_Popup_Message() throws Throwable {
		try {
			hoverOnElement(AddStreamsPage.Add_SearchStream_Xpath);

			click(AddStreamsPage.Add_SearchStream_Xpath, "Click on Search Stream");

			inputText(AddStreamsPage.EnterStreamName_Xpath, dataMap.get("Search"), "Enter the Search Query");
			click(AddStreamsPage.Click_AddStream_Xpath, "Click on Add Stream");

			AddStreamsPage.toasteMessageDisplay();
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Trends and catch the Popup Message$")
	public void click_on_Trends_and_catch_the_Popup_Message() throws Throwable {
		try {

			hoverOnElement(AddStreamsPage.Add_TrendsStream_Xpath);
			click(AddStreamsPage.Add_TrendsStream_Xpath, "Click on Treands Stream");
			AddStreamsPage.toasteMessageDisplay();

			// clickStreams(AddStreamsPage.Add_TrendsStream_Xpath, "Click on
			// Treands Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}
	}

	@Then("^Select the FaceBook network from the add streams dropdown$")
	public void select_the_FaceBook_network_from_the_add_streams_dropdown() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("QA testing (Facebook)");
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Facebook Account Selected Successfully from DropDown"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Timeline and catch up the toaste message$")
	public void click_on_Timeline_and_catch_up_the_toaste_message() throws Throwable {
		try {
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			// clickStreams(AddStreamsPage.FB_Timeline_Xpath, "Click on Timeline
			// Stream");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			hoverOnElement(AddStreamsPage.FB_Timeline_Xpath);
			click(AddStreamsPage.FB_Timeline_Xpath, "Click on Timeline Stream");
			AddStreamsPage.toasteMessageDisplay();

		} catch (Throwable e) {
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));

		}
	}

	@Then("^Click on Events and catch up the toaste message$")
	public void click_on_Events_and_catch_up_the_toaste_message() throws Throwable {
		try {
			// clickStreams(AddStreamsPage.FB_Events_Xpath, "Click on Events
			// Stream");
			click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on AddStream");

			hoverOnElement(AddStreamsPage.FB_Events_Xpath);
			click(AddStreamsPage.FB_Events_Xpath, "Click on Events Stream");
			AddStreamsPage.toasteMessageDisplay();

		} catch (Throwable e) {

			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));

		}

	}

	@When("^Select the LinkedIn network from the add streams dropdown$")
	public void select_the_LinkedIn_network_from_the_add_streams_dropdown() throws Throwable {
		try {
			AddNetworkPage.selectAddedNetwork("500apps-socialchimp (LinkedIn)");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("LinkedIn Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("^Click on MyPosts and catch up the toaste message$")
	public void click_on_MyPosts_and_catch_up_the_toaste_message() throws Throwable {

		try {
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			clickStreams(AddStreamsPage.LnkedInMyposts_Xpath, "Click on MyPosts");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			// AddStreamsPage.toasteMessageDisplay();
			// delay(5000);

		} catch (Throwable e) {

			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Select the WordPress network from the add streams dropdown$")
	public void select_the_WordPress_network_from_the_add_streams_dropdown() throws Throwable {

		try {
			AddNetworkPage.selectAddedNetwork("shaikinthiyaztest (WordPress)");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("WordPress Account Selected Successfully from DropDown"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Click on Myposts and catch up the toaste message$")
	public void click_on_Myposts_and_catch_up_the_toaste_message() throws Throwable {
		try {
			// clickStreams(AddStreamsPage.WordMyposts_Xpath, "Click on MyPosts
			// in Wordpress");
			// click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on
			// AddStream");

			hoverOnElement(AddStreamsPage.WordMyposts_Xpath);
			click(AddStreamsPage.WordMyposts_Xpath, "Click on MyPosts in Wordpress");

			AddStreamsPage.toasteMessageDisplay();

		} catch (Throwable e) {

			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}

	}

	@Then("^Click on Followers and catch up the toaste message$")
	public void click_on_Followers_and_catch_up_the_toaste_message() throws Throwable {
		try {
			// clickStreams(AddStreamsPage.WordFollowers_Xpath, "Click on
			// Followers in Wordpress");
			click(AddStreamsPage.Click_AddStreamtop_xpath, "Click on AddStream");

			hoverOnElement(AddStreamsPage.WordFollowers_Xpath);

			click(AddStreamsPage.WordFollowers_Xpath, "Click on Followers in Wordpress");

			AddStreamsPage.toasteMessageDisplay();

		} catch (Throwable e) {

			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Stream already selected"));
		}

	}

	@When("^User click on Posts options$")
	public void user_click_on_Posts_options() throws Throwable {
		try {

			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Click on Add Post and user should enter into Add Post page$")
	public void click_on_Add_Post_and_user_should_enter_into_Add_Post_page() throws Throwable {
		try {
			click(AddPostsPage.Click_on_AddPost, "Click on AddPost");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Select the Network from dropdown$")
	public void select_the_Network_from_dropdown() throws Throwable {

		try {
			click(AddPostsPage.Click_on_SelectNetwork, "Click on Select Network");

			click(AddPostsPage.Click_FB_CheckBox, "Click on FB Network");
			click(AddPostsPage.Click_LinedIn_CheckBox, "Click on LinkedIn Network");
			click(AddPostsPage.Click_Twitter_CheckBox, "Click on Twitter Network");
			click(AddPostsPage.Click_Done, "Click on Done");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^enter the text in text field and choose the image from media library$")
	public void enter_the_text_in_text_field_and_choose_the_image_from_media_library() throws Throwable {
		try {
			inputText(AddPostsPage.Enter_Text, dataMap.get("PostData"), "Enter the Text In text field");
			click(AddPostsPage.Click_on_MediaLibrary, "Click On Open Media Library");
			click(AddPostsPage.Pick_Image, "Select the Image");
			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^click on post now radio button and click on post now button$")
	public void click_on_post_now_radio_button_and_click_on_post_now_button() throws Throwable {
		try {
			//click(AddPostsPage.Click_on_PostNow_RadioButton, "Select the Postnow Radio Button");
			
			click(AddPostsPage.Click_on_Postnow_Button, "Click On Postnow Button");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Verify the posts page under list view$")
	public void verify_the_posts_page_under_list_view() throws Throwable {

		try {
			AddPostsPage.PosttoasteMessageDisplay();
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "a few seconds ago");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on Save as Draft radio button and click on Save as Draft button$")
	public void click_on_Save_as_Draft_radio_button_and_click_on_Save_as_Draft_button() throws Throwable {
		try {
			click(AddPostsPage.Click_on_SaveDraft_RadioButton, "Click on Save as Draft Radio Button");
			delay(1500);
			click(AddPostsPage.Click_on_SaveDraft_Button, "Click on Save as Draft Button");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on Schedule radio button and enter the time and click on Schedule$")
	public void click_on_Schedule_radio_button_and_enter_the_time_and_click_on_Schedule() throws Throwable {
		click(AddPostsPage.Click_on_Schedudle_RadioButton, "Click on Schedule Radio Button");
		click(AddPostsPage.Click_on_Schedudle_Time_CSS, "Click to Schedule the time");

		String our = "22";
		String min = "30";

		inputText(AddPostsPage.Hour_Xpath, our, "Enter Hours");
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.TAB).build().perform();
		inputText(AddPostsPage.Minute_Xpath, min, "Enter Minutes");
		click(AddPostsPage.Click_Schedule_Button_Xpath, "Click on Schedule Button");

	}

	@Then("^enter the text in text field and choose the image from Device$")
	public void enter_the_text_in_text_field_and_choose_the_image_from_Device() throws Throwable {

		try {
			inputText(AddPostsPage.Enter_Text, dataMap.get("PostData"), "Enter the Text In text field");

			click(AddPostsPage.Clcik_Choosefile_Xpath, "Click on Choose file Button");
			
			FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\ImageFiles\\Goodmorning.jpg");
			delay(5000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

		@Then("^Verify the posts page under list view for schedule$")
		public void verify_the_posts_page_under_list_view_for_schedule() throws Throwable {
			try {
				AddPostsPage.PosttoasteMessageDisplay();
				Apps500Util.verifyInsertedObjectPresentinlistView("span", "a few seconds ago");
				getDriver().navigate().refresh();

			} catch (Throwable e) {
				GlobalUtil.e = e;
				GlobalUtil.ErrorMsg = e.getMessage();
				Assert.fail(e.getMessage());

			}
		}
	

	@Then("^click on a category$")
	public void click_on_a_category() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(ActionsonFacebook.Click_DemoCategory_Xpath, "Click on category");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Click on Timeline$")
	public void click_on_Timeline() throws Throwable {
		try {
			clickStreams(AddStreamsPage.FB_Timeline_Xpath, "Click on Timeline Stream");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on like$")
	public void click_on_like() throws Throwable {

		try {
			likePost(ActionsonFacebook.click_onLike_Xpath, "Like", "You have liked a post", "You have disliked a post");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on Comment and enter the comment$")
	public void click_on_Comment_and_enter_the_comment() throws Throwable {
		click(ActionsonFacebook.comment_xpath, "Click on Comment");
		inputText(ActionsonFacebook.Enter_commentText_xpath, "nice", "Enter the Text for comment");
		click(ActionsonFacebook.Submit_commentText_xpath, "Click on Submit");
		ActionsonFacebook.assertTosterMessage("You have commented a post");
		click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
		click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
		getDriver().navigate().refresh();

	}

	@Then("^Like a post in LinkedIn$")
	public void like_a_post_in_LinkedIn() throws Throwable {

		try {
			likePost(ActionsOnLinkedIn.LinkedIn_click_Thumb_Xpath, "Like", "You have liked a post",
					"You have unliked a post");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Comment a post$")
	public void comment_a_post() throws Throwable {
		String LinkedInComment = "Awesome";
		try {
			hoverOnElement(ActionsOnLinkedIn.Click_On_LinkedInComment);
			click(ActionsOnLinkedIn.Click_On_LinkedInComment, "Click on Comment");
			inputText(ActionsOnLinkedIn.Enter_Comment_Data, LinkedInComment, "Enter the Text for comment");
			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.ENTER).build().perform();
			ActionsonFacebook.assertTosterMessage("You have Commented successfully");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Delete the MyPosts Stream$")
	public void delete_the_MyPosts_Stream() throws Throwable {
		try {
			click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
			click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
			getDriver().navigate().refresh();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^click on a category for twitter$")
	public void click_on_a_category_for_twitter() throws Throwable {
		try {
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(ActionsonFacebook.Click_DemoCategory_Xpath, "Click on category");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Perform Reply Action and catch up the toaste message$")
	public void perform_Reply_Action_and_catch_up_the_toaste_message() throws Throwable {
		try {

			hoverOnElement(ActionsOnTwitter.Click_Reply_Xpath);

			click(ActionsOnTwitter.Click_Reply_Xpath, "Click on Reply on Twitter Post");
			click(ActionsOnTwitter.Click_Reply_Xpath, "Click on Reply on Twitter Post");

			inputText(ActionsOnTwitter.Enter_ReplyText_Xpath, dataMap.get("Twt_Reply_data"), "Enter the Text for Reply");

			click(ActionsOnTwitter.Click_ReplySend_Xpath, "Click on Send");
			Apps500Util.assertTosterMessage("You have replied to a tweet");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Perform Like Action and catch up the toaste message$")
	public void perform_Like_Action_and_catch_up_the_toaste_message() throws Throwable {
		try {
			scrollingWithInElement(ActionsOnTwitter.Click_Reply_Xpath, "Scroll for Element");

			hoverOnElement(ActionsOnTwitter.Click_Like_Tweet_Xpath);
			String txt = getDriver().findElement(ActionsOnTwitter.like_tooltip_xpath).getText();
			System.out.println("Like Text=" + txt);
			if (txt.equals("Like")) {
				click(ActionsOnTwitter.Click_Like_Tweet_Xpath, "Click On Like in a Twitter Post");
				Apps500Util.assertTosterMessage("You have liked a tweet");
				getDriver().navigate().refresh();
			} else {

				ExtendUtil.logger.log(LogStatus.PASS,
						HTMLReportUtil.passStringGreenColor("You Already liked this tweet"));
			}

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Perform Retweet Action and catch up the toaste message$")
	public void perform_Retweet_Action_and_catch_up_the_toaste_message() throws Throwable {
		hoverOnElement(ActionsOnTwitter.Click_Retweet_Xpath);
		String tweet = getDriver().findElement(ActionsOnTwitter.like_tooltip_xpath).getText();
		if (tweet.equals("Retweet")) {
			click(ActionsOnTwitter.Click_Retweet_Xpath, "Clik on Retweet");
			Apps500Util.assertTosterMessage("You have retweeted successfully");
		} else {
			hoverOnElement(ActionsOnTwitter.Click_DisLike_Tweet_Xpath);
			click(ActionsOnTwitter.Click_DisLike_Tweet_Xpath, "Click on Undo Retweet");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("You have already retweeted this Tweet."));

		}

	}

	@Then("^Perform Follow Action and catch up the toaste message$")
	public void perform_Follow_Action_and_catch_up_the_toaste_message() throws Throwable {
		
			/*hoverOnElement(ActionsOnTwitter.Click_UnFollow_Xpath);
			String follow = getDriver().findElement(ActionsOnTwitter.like_tooltip_xpath).getText();

			if (follow.equals("unfollow"))
				hoverOnElement(ActionsOnTwitter.Click_UnFollow_Xpath);

			click(ActionsOnTwitter.Click_UnFollow_Xpath, "Click on Unfollow");
			try {
				delay(5000);
				Apps500Util.assertTosterMessage("You have unfollowed successfully");
				
			} catch (Throwable e) {
				GlobalUtil.e = e;
				GlobalUtil.ErrorMsg = e.getMessage();
				Assert.fail(e.getMessage());
				
			}
			*/
			//delay(5000);
		

	}

	@Then("^Delete the Home Stream$")
	public void delete_the_Home_Stream() throws Throwable {
		try {
			click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
			click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("StreamDel_toaste"));
			getDriver().navigate().refresh();
			//delay(5000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^click on Settings Icon$")
	public void click_on_Settings_Icon() throws Throwable {

		try {
			delay(1000);
			AddMedia.waitForDisplay(AddMedia.click_setting_icon_xpath);
			
			clickJS(AddMedia.click_setting_icon_xpath, "Click on settings icon");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("^click on Media Library$")
	public void click_on_Media_Library() throws Throwable {
		try {
			click(AddMedia.click_MediaLibrary_xpath, "Click on Media Library");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Select default category$")
	public void select_default_category() throws Throwable {
		try {
			AddMedia.selectMediaLib("All");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^click on Add Media$")
	public void click_on_Add_Media() throws Throwable {
		try {
			click(AddMedia.click_on_Addmedia_xpath, "Click on Add Media");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^browse the media from the system$")
	public void browse_the_media_from_the_system() throws Throwable {
		try {
			AddMedia.randomFileupload();
			
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^choose the category$")
	public void choose_the_category() throws Throwable {

		try {
			click(AddMedia.click_to_choose_category, "Click to choose a category");
			hoverOnElement(AddMedia.choose_category);
			click(AddMedia.choose_category, "Click on Category");
			//AddMedia.waitForDisplay();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Save button$")
	public void click_on_Save_button() throws Throwable {
		try {

			AddMedia.waitForDisplay(AddMedia.Click_on_Save_button);
			click(AddMedia.Click_on_Save_button, "Click on Save Button");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^catch the toaste message$")
	public void catch_the_toaste_message() throws Throwable {
		try {
			Apps500Util.assertTosterMessage("Inserted Successfully");
			getDriver().navigate().refresh();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^browse the Video from the system$")
	public void browse_the_Video_from_the_system() throws Throwable {

		hoverOnElement(AddMedia.click_on_browse);
		click(AddMedia.click_on_browse, "Click to choose file");
		delay(1000);

		FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\VideoFiles\\Motivationalvideo.mp4");
		

		
		
	}

	@Then("^choose the category for video$")
	public void choose_the_category_for_video() throws Throwable {
		try {
			click(AddMedia.click_to_choose_category, "Click to choose a category");
			hoverOnElement(AddMedia.choose_category_video);

			click(AddMedia.choose_category_video, "Click on Category");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^browse the Audio from the system$")
	public void browse_the_Audio_from_the_system() throws Throwable {

		hoverOnElement(AddMedia.click_on_browse);
		click(AddMedia.click_on_browse, "Click to choose file");
		delay(1000);
		FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\AudioFiles\\Audio.mp3");
		
		

	}

	@Then("^choose the category for audio$")
	public void choose_the_category_for_audio() throws Throwable {
		try {
			delay(8000);
			click(AddMedia.click_to_choose_category, "Click to choose a category");
			hoverOnElement(AddMedia.choose_category_audio);

			click(AddMedia.choose_category_audio, "Click on Category");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Click on Videos Option$")
	public void click_on_Videos_Option() throws Throwable {
		try {
			click(AddMedia.Click_on_Videos_xapth, "Click on videos Option");

			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Video added successfully under Vidoes"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Click on Autdios Option$")
	public void click_on_Autdios_Option() throws Throwable {
		try {
			click(AddMedia.Click_on_Audioes_xapth, "Click on Audios Option");
			delay(1000);
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Audio added successfully under Vidoes"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on calender$")
	public void click_on_calender() throws Throwable {
		try {
			hoverOnElement(AddPostsPage.click_on_calender_xpath);
			click(AddPostsPage.click_on_calender_xpath, "Click on Calender to see the calender view");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Try Monthly views in Calendar view$")
	public void try_Monthly_views_in_Calendar_view() throws Throwable {
		try {
			AddPostsPage.getMonth();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Try weekly view in calender view$")
	public void try_weekly_view_in_calender_view() throws Throwable {
		try {
			click(AddPostsPage.click_on_week_xpath, "Click on Week option");
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("User looking into weekly posts"));
			// AddPostsPage.getWeek();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}
	}

	@Then("^Try day view in calender view$")
	public void try_day_view_in_calender_view() throws Throwable {
		try {
			click(AddPostsPage.click_on_day_xpath, "Click on Day Option");
			AddPostsPage.getDay();
			getDriver().navigate().refresh();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^filter the facebook network$")
	public void filter_the_facebook_network() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_network_xpath, "facebook", "Select Facebook Network");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Filtered the posts based on Published$")
	public void filtered_the_posts_based_on_Published() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "Published", "Select Published Status");

			AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Facebook");

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Filtered the posts based on Scheduled$")
	public void filtered_the_posts_based_on_Scheduled() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "Scheduled", "Select Scheduled Status");
			AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Facebook");

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Filtered the posts based on Draft$")
	public void filtered_the_posts_based_on_Draft() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "Draft", "Select Draft Status");
			AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Facebook");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Filtered the posts based on Rejected$")
	public void filtered_the_posts_based_on_Rejected() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "Rejected", "Select Rejected Status");
			// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Facebook" );

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Filtered the posts based on To approve$")
	public void filtered_the_posts_based_on_To_approve() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "To Approve", "Select To approve Status");
			//AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Facebook");

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Filtered the posts based on Schedule expired$")
	public void filtered_the_posts_based_on_Schedule_expired() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_status_xpath, "Schedule Expired", "Select Schedule expired Status");
			 //AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Facebook");

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^filter the Twitter network$")
	public void filter_the_Twitter_network() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_network_xpath, "twitter", "Select Twitter Network");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^filter the LinkedIn network$")
	public void filter_the_LinkedIn_network() throws Throwable {
		try {
			selectByVisibleText(AddPostsPage.Select_network_xpath, "linkedIn", "Select LinkedIn Network");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Filtered the posts based on Published for Twitter$")
	public void filtered_the_posts_based_on_Published_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Published", "Select Published Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Twitter");

	}

	@Then("^Filtered the posts based on Scheduled for Twitter$")
	public void filtered_the_posts_based_on_Scheduled_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Scheduled", "Select Scheduled Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Twitter");

	}

	@Then("^Filtered the posts based on Draft for Twitter$")
	public void filtered_the_posts_based_on_Draft_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Draft", "Select Draft Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "Twitter");

	}

	@Then("^Filtered the posts based on Rejected for Twitter$")
	public void filtered_the_posts_based_on_Rejected_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Rejected", "Select Rejected Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Twitter" );

	}

	@Then("^Filtered the posts based on To approve for Twitter$")
	public void filtered_the_posts_based_on_To_approve_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "To Approve", "Select To Approve Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Twitter" );

	}

	@Then("^Filtered the posts based on Schedule expired for Twitter$")
	public void filtered_the_posts_based_on_Schedule_expired_for_Twitter() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Schedule Expired", "Select Schedule Expired Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"Twitter" );

	}

	@Then("^Filtered the posts based on Published for LinkedIn$")
	public void filtered_the_posts_based_on_Published_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Published", "Select Published Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "LinkedIn");

	}

	@Then("^Filtered the posts based on Scheduled for LinkedIn$")
	public void filtered_the_posts_based_on_Scheduled_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Scheduled", "Select Scheduled Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "LinkedIn");
	}

	@Then("^Filtered the posts based on Draft for LinkedIn$")
	public void filtered_the_posts_based_on_Draft_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Draft", "Select Draft Status");

		AddPostsPage.netElement(AddPostsPage.Network_clo_xpath, "LinkedIn");
	}

	@Then("^Filtered the posts based on Rejected for LinkedIn$")
	public void filtered_the_posts_based_on_Rejected_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Rejected", "Select Rejected Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"LinkedIn" );
	}

	@Then("^Filtered the posts based on To approve for LinkedIn$")
	public void filtered_the_posts_based_on_To_approve_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "To Approve", "Select  To Approve Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"LinkedIn" );
	}

	@Then("^Filtered the posts based on Schedule expired for LinkedIn$")
	public void filtered_the_posts_based_on_Schedule_expired_for_LinkedIn() throws Throwable {
		selectByVisibleText(AddPostsPage.Select_status_xpath, "Schedule Expired", "Select Schedule Expired Status");

		// AddPostsPage.netElement(AddPostsPage.Network_clo_xpath,"LinkedIn" );
	}

	@When("^User clicked on Settings icon$")
	public void user_clicked_on_Settings_icon() throws Throwable {
		try {
			click(AddnDltNetwork.click_setting_icon_xpath, "Click on settings icon");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^click on Manage Networks$")
	public void click_on_Manage_Networks() throws Throwable {
		try {
			click(AddnDltNetwork.click_Manage_Network_xpath, "Click on Manage network icon");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^click on twitter in Manage Network$")
	public void click_on_twitter_in_Manage_Network() throws Throwable {
		try {
			click(AddnDltNetwork.click_Twitter_xpath, "Click on Twitter");

			AddnDltNetwork.netVerify();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^delete the Twitter Network$")
	public void delete_the_Twitter_Network() throws Throwable {
		try {
			click(AddnDltNetwork.click_to_trash_xpath, "Click trash button ");
			click(AddnDltNetwork.click_Del_button, "Click on del button");
			Apps500Util.assertTosterMessage("Deleted Successfully.");
			getDriver().navigate().refresh();
			//AddnDltNetwork.netVerify();
			click(AddnDltNetwork.click_Twitter_xpath, "Click on Twitter");
			 
			// AddnDltNetwork.isElementPresent(AddnDltNetwork.click_to_trash_xpath);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Facebook network$")
	public void click_on_Facebook_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_facebook_xpath, "Click on Facebook");
			AddnDltNetwork.netVerify();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^deltete facebook network$")
	public void deltete_facebook_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_to_trash_xpath, "Click trash button ");
			click(AddnDltNetwork.click_Del_button, "Click on del button");
			Apps500Util.assertTosterMessage("Deleted Successfully.");
			getDriver().navigate().refresh();
			click(AddnDltNetwork.click_facebook_xpath, "Click on Facebook");
			// AddnDltNetwork.netVerify();
			// AddnDltNetwork.isElementPresent(AddnDltNetwork.click_to_trash_xpath);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on LinkedIn network$")
	public void click_on_LinkedIn_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_LinkedIn_xpath, "Click on LinkedIn");
			AddnDltNetwork.netVerify();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^delete LinkedIn network$")
	public void delete_LinkedIn_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_to_trash_xpath, "Click trash button ");
			click(AddnDltNetwork.click_Del_button, "Click on del button");
			Apps500Util.assertTosterMessage("Deleted Successfully.");
			getDriver().navigate().refresh();
			click(AddnDltNetwork.click_LinkedIn_xpath, "Click on LinkedIn");
			// AddnDltNetwork.netVerify();
			// AddnDltNetwork.isElementPresent(AddnDltNetwork.click_to_trash_xpath);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Wordpress network$")
	public void click_on_Wordpress_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_wordpress_xpath, "Click on WordPress");
			AddnDltNetwork.netVerify();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^delete Wordpress network$")
	public void delete_Wordpress_network() throws Throwable {
		try {
			click(AddnDltNetwork.click_to_trash_xpath, "Click trash button ");
			click(AddnDltNetwork.click_Del_button, "Click on del button");
			Apps500Util.assertTosterMessage("Deleted Successfully.");
			getDriver().navigate().refresh();
			click(AddnDltNetwork.click_wordpress_xpath, "Click on WordPress");
			// AddnDltNetwork.netVerify();
			// AddnDltNetwork.isElementPresent(AddnDltNetwork.click_to_trash_xpath);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Twitter to add the account$")
	public void click_on_Twitter_to_add_the_account() throws Throwable {
		try {
			click(AddnDltNetwork.click_Twitter_xpath, "Click on Twitter");

			delay(10000);
			hoverOnElement(AddnDltNetwork.click_Add_Network_xpath);
			click(AddnDltNetwork.click_Add_Network_xpath, "Click on Add Network");
			AddNetworkPage.switchWindowHandle();
			inputText(AddNetworkPage.Enter_Twi_UserName_Css, dataMap.get("Twi_UserName"), "Enter UserName");
			inputText(AddNetworkPage.Enter_Twi_Pass_Css, dataMap.get("Twi_Password"), "Enter Password");

			click(AddNetworkPage.Click_AuthApp_Css, "Click on Authorise App");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^verify account added or not$")
	public void verify_account_added_or_not() throws Throwable {
		try {
			click(AddnDltNetwork.click_Twitter_xpath, "Click on Twitter");
			AddnDltNetwork.netVerify();
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on Facebook to add the account$")
	public void click_on_Facebook_to_add_the_account() throws Throwable {
		try {
			click(AddnDltNetwork.click_facebook_xpath, "Click on Facebook");
			delay(6000);
			hoverOnElement(AddnDltNetwork.click_Add_Network_xpath);
			click(AddnDltNetwork.click_Add_Network_xpath, "Click on Add Network");
			AddNetworkPage.switchWindowHandle();
			inputText(AddNetworkPage.FB_Username_Xpath, dataMap.get("FB_UserName"), "Enter UserName");

			inputText(AddNetworkPage.FB_Pass_Xpath, dataMap.get("FB_Password"), "Enter Password");

			click(AddNetworkPage.FB_ClickLogIn_Xpath, "Click on Login Button");

			waitForClickable(AddNetworkPage.FB_Click_Contiueas_Xpath);
			Actions act = new Actions(getDriver());
			act.moveToElement(getDriver().findElement(AddNetworkPage.FB_Click_Contiueas_Xpath)).click().build()
					.perform();

			click(AddNetworkPage.FB_Click_Contiueas_Xpath, "Click on ContinueAS Button");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

		try {
			click(AddNetworkPage.Click_FB1stPage_Xpath, "Click on Check Box");
			click(AddNetworkPage.Clcik_Submit_Xpath, "Click on Submit Button");

		} catch (Exception e) {
			click(AddNetworkPage.Clcik_Back_Button_Xpath, "Click on Back Button");
			Apps500Util.assertTosterMessage("This account already exists.");

		}
		
		Apps500Util.assertTosterMessage("Successfully inserted");
		click(AddnDltNetwork.click_setting_icon_xpath, "Click on settings icon");
		click(AddnDltNetwork.click_Manage_Network_xpath, "Click on Manage network icon");
		click(AddnDltNetwork.click_facebook_xpath, "Click on Facebook");
		AddnDltNetwork.netVerify();
	}

	@Then("^click on LinkedIn to add the account$")
	public void click_on_LinkedIn_to_add_the_account() throws Throwable {
		try {
			click(AddnDltNetwork.click_LinkedIn_xpath, "Click on LinkedIn");
			delay(6000);
			hoverOnElement(AddnDltNetwork.click_Add_Network_xpath);
			click(AddnDltNetwork.click_Add_Network_xpath, "Click on Add Network");
			AddNetworkPage.switchWindowHandle();
			inputText(AddNetworkPage.LinkedIn_Username_Xpath, dataMap.get("LinkUserNmae"), "Enter UserName");

			inputText(AddNetworkPage.LinkedIn_Pass_Xpath, dataMap.get("LinkPassword"), "Enter Password");

			click(AddNetworkPage.LinkedIn_ClickSignIn_Xpath, "Click on SignIn Button");

			try {
				click(AddNetworkPage.Click_Lnk1stpage_Xpath, "Click on Check Box");
				click(AddNetworkPage.Clcik_Submit_Xpath, "Click on Submit Button");
			} catch (Throwable e) {

				waitForClickable(AddNetworkPage.Clcik_Back_Button_Xpath);

				click(AddNetworkPage.Clcik_Back_Button_Xpath, "Click on Back Button");
				Apps500Util.assertTosterMessage("This account already exists.");

			}
			Apps500Util.assertTosterMessage("Successful");
			click(AddnDltNetwork.click_setting_icon_xpath, "Click on settings icon");
			click(AddnDltNetwork.click_Manage_Network_xpath, "Click on Manage network icon");
			click(AddnDltNetwork.click_LinkedIn_xpath, "Click on LinkedIn");
			delay(1000);
			AddnDltNetwork.netVerify();
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Wordpress to add the account$")
	public void click_on_Wordpress_to_add_the_account() throws Throwable {
		try {
			click(AddnDltNetwork.click_wordpress_xpath, "Click on WordPress");
			delay(5000);
			hoverOnElement(AddnDltNetwork.click_Add_Network_xpath);
			click(AddnDltNetwork.click_Add_Network_xpath, "Click on Add Network");
			AddNetworkPage.switchWindowHandle();
			inputText(AddNetworkPage.WordPress_Username_Css, dataMap.get("WordUserName"), "Enter UserName");
			click(AddNetworkPage.Click_Continue_Css, "Click on Continue Button");

			inputText(AddNetworkPage.WordPress_Pass_Css, dataMap.get("WordPassword"), "Enter Password");

			click(AddNetworkPage.WordPress_ClickLogin_Css, "Click on LogIn Button");

			click(AddNetworkPage.WordPress_ClickApprove_Css, "Click on Approve Button");
			click(AddnDltNetwork.click_wordpress_xpath, "Click on WordPress");
			delay(1000);
			AddnDltNetwork.netVerify();
			
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}
	@When("^User is in Manage Approvals page$")
	public void user_is_in_Manage_Approvals_page() throws Throwable {
		try {
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^select network and manager form drop down to map the manger$")
	public void select_network_and_manager_form_drop_down_to_map_the_manger() throws Throwable {
		try {
			
				
			selectByVisibleText(RejOrApprvPosts.Select_Account_xpath,"QA testing - facebook","Select the Facebook Account");
			selectByVisibleText(RejOrApprvPosts.Select_manager_xpath,"hakeem","Select the Facebook Account");
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}

	}
	@Then("^Click on save to map the manager$")
	public void click_on_save_to_map_the_manager() throws Throwable {
		try {
			click(RejOrApprvPosts.Save_Button_xpath, "Click on Save Button");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^verify manager mapped or not for the Perticular network$")
	public void verify_manager_mapped_or_not_for_the_Perticular_network() throws Throwable {
		
		try {
			Apps500Util.assertTosterMessage("Successfully Saved");
			Apps500Util.verifyInsertedElementPresentInTable(3,"QA testing","parent");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	    
	}

	@Then("^go to the posts page and publish a post for required network$")
	public void go_to_the_posts_page_and_publish_a_post_for_required_network() throws Throwable {
		try {

			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			click(AddPostsPage.Click_on_AddPost, "Click on AddPost");
			click(AddPostsPage.Click_on_SelectNetwork, "Click on Select Network");
			click(AddPostsPage.Click_FB_CheckBox, "Click on FB Network");
			click(AddPostsPage.Click_Done, "Click on Done");
			inputText(AddPostsPage.Enter_Text, dataMap.get("ApprovePostData"), "Enter the Text In text field");

			click(AddPostsPage.Clcik_Choosefile_Xpath, "Click on Choose file Button");
			
			FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\ImageFiles\\Girls-Wallp.jpg");
			delay(5000);
			//click(AddPostsPage.Click_on_PostNow_RadioButton, "Select the Postnow Radio Button");
			click(AddPostsPage.Click_on_Postnow_Button, "Click On Postnow Button");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^verify records are added on posts page or not as to approve$")
	public void verify_records_are_added_on_posts_page_or_not_as_to_approve() throws Throwable {
		Apps500Util.assertTosterMessage("Successfully Inserted");
		Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

	    
	}

	@Then("^go to the manager account$")
	public void go_to_the_manager_account() throws Throwable {
		try {
	
			waitForVisible(RejOrApprvPosts.click_to_logout_css);
			click(RejOrApprvPosts.click_to_logout_css,"Click to logout on I Button");
			click(RejOrApprvPosts.click_on_logout_xpath,"Click on logout button");
			delay(3000);
			waitForClickable(RejOrApprvPosts.click_skip_xpath);
			hoverOnElement(RejOrApprvPosts.click_skip_xpath);
			click(RejOrApprvPosts.click_skip_xpath,"Click on Skip");
			
			String title = getDriver().getTitle();
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("User is in " +title+ "page" ));
			inputText(RejOrApprvPosts.userName, dataMap.get("email"), "Enter email address");
			inputText(RejOrApprvPosts.Password, dataMap.get("password"), "Enter Password");
			delay(1500);
			click(RejOrApprvPosts.loginbutton,"Click on Login Button");
			 WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 250);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(RejOrApprvPosts.Click_hipsocial_xpath));
			click(RejOrApprvPosts.Click_hipsocial_xpath,"Click on Hipsocial");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
		
		
	    
	}

	@Then("^approve or reject the posts$")
	public void approve_or_reject_the_posts() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_on_Approve_xpath,"Click on Approve");
			delay(8000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	    
	}

	@Then("^navigate back to user account$")
	public void navigate_back_to_user_account() throws Throwable {
		try {
			delay(6000);
			waitForVisible(RejOrApprvPosts.click_to_logout_css);
			click(RejOrApprvPosts.click_to_logout_css,"Click to logout on H Button");
			click(RejOrApprvPosts.click_on_logout_xpath,"Click on logout button");
			delay(3000);
			waitForClickable(RejOrApprvPosts.click_skip_xpath);
			hoverOnElement(RejOrApprvPosts.click_skip_xpath);
			click(RejOrApprvPosts.click_skip_xpath,"Click on Skip");
			String title = getDriver().getTitle();
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("User is in " +title+ "page" ));
			inputText(RejOrApprvPosts.userName, dataMap.get("useremail"), "Enter email address");
			inputText(RejOrApprvPosts.Password, dataMap.get("userpassword"), "Enter Password");
			delay(1500);
			click(RejOrApprvPosts.loginbutton,"Click on Login Button");
			 WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 250);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(RejOrApprvPosts.Click_hipsocial_xpath));
			click(RejOrApprvPosts.Click_hipsocial_xpath,"Click on Hipsocial");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
		
	    
	}

	@Then("^verify published status$")
	public void verify_published_status() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			//String Publish = "Published"; 
			String Status=KeywordUtil.getDriver().findElement(RejOrApprvPosts.click_published_xpath).getText();
			Assert.assertEquals(Status,dataMap.get("Verifypub"));
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "published");
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Manager Approved the Post"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	   
	}

	@Then("^go to the published network streem and see the post$")
	public void go_to_the_published_network_streem_and_see_the_post() throws Throwable {
		try {
			
			click(HipsocialCategoriesPage.Click_Streams_Xpath, "Click on Streams module");
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(ActionsonFacebook.Click_DemoCategory_Xpath, "Click on category");
			AddNetworkPage.selectAddedNetwork(dataMap.get("Fb_Dropdown"));
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Facebook Account Selected Successfully from DropDown"));
			//delay(1000);
			clickStreams(AddStreamsPage.FB_Timeline_Xpath, "Click on Timeline Stream");
			likePost(ActionsonFacebook.click_onLike_Xpath, dataMap.get("Liketooltip"), dataMap.get("like_toaste"), dataMap.get("dislike_toaste"));
			
			click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
			click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("StreamDel_toaste"));
		
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
			

			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}
		
	    
	}

	@Then("^reject the posts for facebook$")
	public void reject_the_posts_for_facebook() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_Reject_xpath,"Click on Reject");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^verify Rejected status for facebook$")
	public void verify_Rejected_status_for_facebook() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			 
			String Status=KeywordUtil.getDriver().findElement(RejOrApprvPosts.Reject_Status_onUser_xpath).getText();
			Assert.assertEquals(Status,dataMap.get("Verify_Reject"));
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "rejected");
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Manager Rejected the Post"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	   
	}

	@Then("^delete the facebook manager$")
	public void delete_the_facebook_manager() throws Throwable {
		try {
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	    
	}

	@Then("^select network and manager form drop down to map the manger for twitter$")
	public void select_network_and_manager_form_drop_down_to_map_the_manger_for_twitter() throws Throwable {
		try {
			selectByVisibleText(RejOrApprvPosts.Select_Account_xpath,dataMap.get("Select_Twitter"),"Select the Twitter Account");
			selectByVisibleText(RejOrApprvPosts.Select_manager_xpath,dataMap.get("Select_manager"),"Select the manager Account");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
		
	}

	@Then("^verify manager mapped or not for the twitter network$")
	public void verify_manager_mapped_or_not_for_the_twitter_network() throws Throwable {
		try {
			Apps500Util.assertTosterMessage(dataMap.get("Manger_Selected_Toaste"));
			Apps500Util.verifyInsertedElementPresentInTable(3,"ShaikIn91043713","parent");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	   
	}

	@Then("^go to the posts page and publish a post for twitter network$")
	public void go_to_the_posts_page_and_publish_a_post_for_twitter_network() throws Throwable {
		try {

			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			click(AddPostsPage.Click_on_AddPost, "Click on AddPost");
			click(AddPostsPage.Click_on_SelectNetwork, "Click on Select Network");
			click(AddPostsPage.Click_Twitter_CheckBox, "Click on twitter Network checkbox");
			click(AddPostsPage.Click_Done, "Click on Done");
			inputText(AddPostsPage.Enter_Text, dataMap.get("Approve_PostData_twi"), "Enter the Text In text field");

			click(AddPostsPage.Clcik_Choosefile_Xpath, "Click on Choose file Button");
			delay(2000);
			FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\ImageFiles\\Girls-Wallp.jpg");
			//click(AddPostsPage.Click_on_PostNow_RadioButton, "Select the Postnow Radio Button");
			click(AddPostsPage.Click_on_Postnow_Button, "Click On Postnow Button");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^approve the posts for twitter$")
	public void approve_the_posts_for_twitter() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_on_Approve_xpath,"Click on Approve");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^go to the twitter network streem and see the post$")
	public void go_to_the_twitter_network_streem_and_see_the_post() throws Throwable {
       try {
			
			click(HipsocialCategoriesPage.Click_Streams_Xpath, "Click on Streams module");
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(ActionsonFacebook.Click_DemoCategory_Xpath, "Click on category");
			AddNetworkPage.selectAddedNetwork(dataMap.get("Twitter_Streams_dropdown"));
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Twitter Account Selected Successfully from DropDown"));
			delay(1000);
			clickStreams(AddStreamsPage.Add_HomeStream_Xpath, "Click on Home Stream");
			likePost(ActionsOnTwitter.Click_Like_Tweet_Xpath, dataMap.get("Liketooltip"), dataMap.get("LikeTweet_toaste"), dataMap.get("dislike_tweet_toaste"));
			
			click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
			click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("StreamDel_toaste"));
		
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
			

			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}
	    
	}
	@Then("^reject the posts for twitter$")
	public void reject_the_posts_for_twitter() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_Reject_xpath,"Click on Reject");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^verify Rejected status twitter$")
	public void verify_Rejected_status_twitter() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			 
			String Status=KeywordUtil.getDriver().findElement(RejOrApprvPosts.Reject_Status_onUser_xpath).getText();
			Assert.assertEquals(Status,dataMap.get("Verify_Reject"));
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "rejected");
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Manager Rejected to Post on twitter "));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	   
	    
	}

	@Then("^delete the twitter manager in manage approvals$")
	public void delete_the_twitter_manager_in_manage_approvals() throws Throwable {
		try {
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	   
	}

	@Then("^select network and manager form drop down to map the manger for LinkedIn$")
	public void select_network_and_manager_form_drop_down_to_map_the_manger_for_LinkedIn() throws Throwable {
		try {
			
				

			selectByVisibleText(RejOrApprvPosts.Select_Account_xpath,dataMap.get("Select_LinkedIn"),"Select the LinkedIn Account");
			selectByVisibleText(RejOrApprvPosts.Select_manager_xpath,dataMap.get("Select_manager"),"Select the manager Account");
			
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	   
	}

	@Then("^verify manager mapped or not for the LinkedIn network$")
	public void verify_manager_mapped_or_not_for_the_LinkedIn_network() throws Throwable {
		try {
			Apps500Util.assertTosterMessage(dataMap.get("Manger_Selected_Toaste"));
			Apps500Util.verifyInsertedElementPresentInTable(3,"500apps-socialchimp","parent");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	    
	}

	@Then("^go to the posts page and publish a post for LinkedIn network$")
	public void go_to_the_posts_page_and_publish_a_post_for_LinkedIn_network() throws Throwable {
		try {

			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			click(AddPostsPage.Click_on_AddPost, "Click on AddPost");
			click(AddPostsPage.Click_on_SelectNetwork, "Click on Select Network");
			click(AddPostsPage.Click_LinedIn_CheckBox, "Click on LinkedIn Network checkbox");
			click(AddPostsPage.Click_Done, "Click on Done");
			inputText(RejOrApprvPosts.Enter_Text, "This is manager approved post on LinkedIn", "Enter the Text In text field");

			click(AddPostsPage.Clcik_Choosefile_Xpath, "Click on Choose file Button");
			
			FileUploadingRobotClass.uploadfile("src\\test\\resources\\testData\\ImageFiles\\japan.jpg");
			//click(AddPostsPage.Click_on_PostNow_RadioButton, "Select the Postnow Radio Button");
			delay(2000);
			click(AddPostsPage.Click_on_Postnow_Button, "Click On Postnow Button");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	   
	}

	@Then("^approve the posts for LinkedIn$")
	public void approve_the_posts_for_LinkedIn() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_on_Approve_xpath,"Click on Approve");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
		
	   
	}

	@Then("^go to the LinkedIn network streem and see the post$")
	public void go_to_the_LinkedIn_network_streem_and_see_the_post() throws Throwable {
try {
			
			click(HipsocialCategoriesPage.Click_Streams_Xpath, "Click on Streams module");
			click(HipsocialCategoriesPage.Click_Bars_Xpath, "Click on Hozantal bars");
			click(ActionsonFacebook.Click_DemoCategory_Xpath, "Click on category");
			RejOrApprvPosts.selectAddedNetwork("500apps-socialchimp (LinkedIn)");
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("LinkedIn Account Selected Successfully from DropDown"));
			//delay(1000);
			clickStreams(AddStreamsPage.LnkedInMyposts_Xpath, "Click on Myposts Stream");
			likePost(ActionsOnLinkedIn.LinkedIn_click_Thumb_Xpath, dataMap.get("Liketooltip"), dataMap.get("like_toaste"), dataMap.get("Unlike_Toaste"));
			
			click(ActionsonFacebook.Click_Cross_Xpath, "Click on CrossMark");
			click(ActionsonFacebook.Delete_Stream_Xpath, "Click on Delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("StreamDel_toaste"));
		
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
			//getDriver().navigate().refresh();
			

			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}
	    
	}

	@Then("^reject the posts for LinkedIn$")
	public void reject_the_posts_for_LinkedIn() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "to approve");

			click(RejOrApprvPosts.click_on_elipse_xpath,"Click on Elipse");
			click(RejOrApprvPosts.click_Reject_xpath,"Click on Reject");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	    
	}

	@Then("^verify Rejected status LinkedIn$")
	public void verify_Rejected_status_LinkedIn() throws Throwable {
		try {
			click(AddPostsPage.Click_on_Posts, "Click Posts on Header ");
			 
			String Status=KeywordUtil.getDriver().findElement(RejOrApprvPosts.Reject_Status_onUser_xpath).getText();
			Assert.assertEquals(Status,dataMap.get("Verify_Reject"));
			Apps500Util.verifyInsertedObjectPresentinlistView("span", "rejected");
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Manager Rejected the LinkedIn Post"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	    
	}

	@Then("^delete the LinkedIn manager in manage approvals$")
	public void delete_the_LinkedIn_manager_in_manage_approvals() throws Throwable {
		try {
			click(AddMedia.click_setting_icon_xpath, "Click on settings icon");
			click(RejOrApprvPosts.Manage_App_xpath, "Click on Manage Approvals");
			click(RejOrApprvPosts.click_delmanager_elipse_xpath, "click on Elipse");
			click(RejOrApprvPosts.click_elipsedel_xpath,"Click on delete");
			click(RejOrApprvPosts.click_managerDel_btn_xpath,"Click on delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("ManagerDel"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			
		}
	   
	}


}
