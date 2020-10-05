package com.finder.stepdefinitions;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.finder.finderPages.BulkDomainSearchPage;
import com.finder.finderPages.BulkEmailFinderPage;
import com.finder.finderPages.BulkEmailVerifypage;
import com.finder.finderPages.DomainSearchPage;
import com.finder.finderPages.EmailFinderPage;
import com.finder.finderPages.EmailVerifyPage;
import com.finder.finderPages.ListsPage;
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

public class FinderAppSteps extends KeywordUtil {

	@SuppressWarnings("rawtypes")
	static Class thisClass = FinderAppSteps.class;
	static String testCaseID = thisClass.getSimpleName();

	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	String find = "testing" + KeywordUtil.getCurrentDateTime();

	@Given("^Read the test data  \"([^\"]*)\" from Excel file for Finder$")
	public void read_the_test_data_from_Excel_file_for_Finder(String arg1) throws Throwable {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID("Finder", arg1);

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^Enter the DomainName for Domainsearch$")
	public void enter_the_DomainName_for_Domainsearch() throws Throwable {

		try {
			WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 120);
			wait.until(ExpectedConditions.elementToBeClickable(DomainSearchPage.Enter_Domain_Name_Field_Xpath));
			KeywordUtil.inputText(DomainSearchPage.Enter_Domain_Name_Field_Xpath, dataMap.get("DomainName"),
					"Enter Domain Name");
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^click on Find Email Address$")
	public void click_on_Find_Email_Address() throws Throwable {
		try {
			KeywordUtil.click(DomainSearchPage.Click_Find_Email_Address_Xpath, "Click on Find Email Address");
			delay(1500);
			KeywordUtil.scrollingToElementofAPage(DomainSearchPage.EmialAddress_Count_Xpath, "Scroll to the element");

			String count = GlobalUtil.getDriver().findElement(DomainSearchPage.EmialAddress_Count_Xpath).getText();
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Total number of Emils found =" + count));
			delay(1500);
			KeywordUtil.scrollingToElementofAPage(DomainSearchPage.domain_search, "Scroll up to domain search");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Email_Finder module$")
	public void click_on_Email_Finder_module() throws Throwable {
		try {
			KeywordUtil.click(EmailFinderPage.Click_EmailFinder_Xpath, "Click on EmailFinder");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Enter FN LN and DN for Emailfinder$")
	public void enter_FN_LN_and_DN_for_Emailfinder() throws Throwable {
		try {
			KeywordUtil.inputText(EmailFinderPage.Enter_EmailFinder_FN_Xpath, dataMap.get("FirstName"),
					"Enter First Name");
			KeywordUtil.inputText(EmailFinderPage.Enter_EmailFinder_LN_Xpath, dataMap.get("LastName"),
					"Enter Last Name");
			KeywordUtil.inputText(EmailFinderPage.Enter_EmailFinder_InputDomain_Xpath, dataMap.get("Domain"),
					"Enter Domain Name");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on Find$")
	public void click_on_Find() throws Throwable {
		try {

			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Click on Enter to find Email"));
			scrollingToElementofAPage(EmailFinderPage.Confidence_Score_xpath,
					"Scroll to get confidance score of an email");
			delay(1000);
			String txt = getElementText(EmailFinderPage.Confidence_Score_xpath);
			ExtendUtil.logger.log(LogStatus.PASS,
					HTMLReportUtil.passStringGreenColor("Confidance score of  Email:" + txt));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on Email_Verify module$")
	public void click_on_Email_Verify_module() throws Throwable {
		try {
			KeywordUtil.click(EmailVerifyPage.Click_EmailVerify_Xpath, "Click on EmailVerify ");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^enter the email address for Emailverify$")
	public void enter_the_email_address_for_Emailverify() throws Throwable {
		try {
			KeywordUtil.inputText(EmailVerifyPage.EnterEmailAddress_Css, dataMap.get("EmailAddress"),
					"Enter EmailAddress");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on find Button$")
	public void click_on_find_Button() throws Throwable {
		try {
			Actions action = new Actions(getDriver());
			 action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
			 WebDriverWait wait = new WebDriverWait(KeywordUtil.getDriver(), 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(EmailVerifyPage.Email_Success_xpath));
				
			 EmailVerifyPage.isWebElementVisible(EmailVerifyPage.Email_Success_xpath,"Email is valid");
		} catch (Throwable e) {
			
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());			
		}
		
		

	}

	@Then("^click on Bulk module$")
	public void click_on_Bulk_module() throws Throwable {
		try {
			KeywordUtil.click(BulkEmailVerifypage.BulkFinder_Click_Xpath, "Click on Bulk Module");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on upload csv file button for bulk emailverify$")
	public void click_on_upload_csv_file_button_for_bulk_emailverify() throws Throwable {
		try {
			KeywordUtil.click(BulkEmailVerifypage.EmailVerify_Upload_Csv_Click_Xpath, "Click on Upload Csv");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^click on up arrow button to upload the file for bulk emailverify$")
	public void click_on_up_arrow_button_to_upload_the_file_for_bulk_emailverify() throws Throwable {

		try {
			KeywordUtil.click(BulkEmailVerifypage.EmailVerify_UploadButton_Xpath, "Click on upload button");

			FileUploadingRobotClass.uploadfile("src/test/resources/testData/UploadFiles/verify7.csv");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^select the fields in mapping screen window for bulk emailverify$")
	public void select_the_fields_in_mapping_screen_window_for_bulk_emailverify() throws Throwable {
		try {
			KeywordUtil.selectByVisibleText(BulkEmailVerifypage.SelectOption_Xpath, "email", "Select Email");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on import from csv for bulk emailverify$")
	public void click_on_import_from_csv_for_bulk_emailverify() throws Throwable {
		try {
			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

			WebDriverWait wait = new WebDriverWait(getDriver(), 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BulkEmailVerifypage.BulkEmailVerif_resultbody));

			scrollingToElementofAPage(BulkEmailVerifypage.BulkEmailVerif_resultbody,
						"Scroll the page to see the valid emails");
			isWebElementVisible(BulkEmailVerifypage.BulkEmailVerif_resultbody, "Valid Emails displayed Card view tabular form");
			ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Emails displyed in the tabular form"));

			((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on email finder for bulk emailfinder$")
	public void click_on_email_finder_for_bulk_emailfinder() throws Throwable {
		try {
			KeywordUtil.click(BulkEmailFinderPage.BulkDomainFinder_Click_Xpath, "Click on domain finder");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^click on upload csv file button for bulk emailfinder$")
	public void click_on_upload_csv_file_button_for_bulk_emailfinder() throws Throwable {
		try {
			KeywordUtil.click(BulkEmailFinderPage.EmailFinder_Upload_Csv_Click_Xpath, "Click on Upload Csv");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on up arrow button to upload the file for bulk emailfinder$")
	public void click_on_up_arrow_button_to_upload_the_file_for_bulk_emailfinder() throws Throwable {
		try {
			KeywordUtil.click(BulkEmailFinderPage.EmailFinder_UploadButton_Xpath, "Click on Upload button");

			FileUploadingRobotClass.uploadfile("src/test/resources/testData/UploadFiles/Emialfinder10rec.csv");
			//src\test\resources\testData\UploadFiles
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^select the fields in mapping screen window in bulk emailfinder$")
	public void select_the_fields_in_mapping_screen_window_in_bulk_emailfinder() throws Throwable {
		try {
			KeywordUtil.selectByVisibleText(BulkEmailFinderPage.SelectOption_firstname_Xpath, "first name",
					"Select first name");
			KeywordUtil.selectByVisibleText(BulkEmailFinderPage.SelectOption_lastname_Xpath, "last name",
					"Select last name");
			KeywordUtil.selectByVisibleText(BulkEmailFinderPage.SelectOption_domainName_Xpath, "domain",
					"Select domain");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on import from csv in bulk emailfinder$")
	public void click_on_import_from_csv_in_bulk_emailfinder() throws Throwable {
		try {
			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^verify list of valid emails will display or not in a grid view or tabular form$")
	public void verify_list_of_valid_emails_will_display_or_not_in_a_grid_view_or_tabular_form() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BulkEmailFinderPage.card_body_xpath));

		scrollingToElementofAPage(BulkEmailFinderPage.card_body_xpath, "Scroll the page to see the valid emails");
		isWebElementVisible(BulkEmailFinderPage.card_body_xpath, "Valid Emails displayed Card view tabular form");
		ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Emails displyed in the tabular form"));

		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		

	}

	@Then("^click on domain search for bulk domain search$")
	public void click_on_domain_search_for_bulk_domain_search() throws Throwable {
		try {
			KeywordUtil.click(BulkDomainSearchPage.BulkDomainSearch_Click_Xpath, "Click on Domainsearch");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on upload csv file button for bulk domain search$")
	public void click_on_upload_csv_file_button_for_bulk_domain_search() throws Throwable {
		try {
			KeywordUtil.click(BulkDomainSearchPage.BulckDomainSearch_Csv_ClickXpath, "Click on Upload Csv");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on up arrow button to upload the file for bulk domain search$")
	public void click_on_up_arrow_button_to_upload_the_file_for_bulk_domain_search() throws Throwable {
		try {
			KeywordUtil.click(BulkDomainSearchPage.BulkDomainSearch_UploadButton_Xpath, "Click on Upload button");

			FileUploadingRobotClass.uploadfile("src/test/resources/testData/UploadFiles/DS_10Rec.csv");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^select the fields in mapping screen window for bulk domain search$")
	public void select_the_fields_in_mapping_screen_window_for_bulk_domain_search() throws Throwable {

		try {
			KeywordUtil.selectByVisibleText(BulkDomainSearchPage.BulkDomainSearch_SelectOption_Xpath, "domain",
					"Select Domain");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^click on import from csv for bulk domain search$")
	public void click_on_import_from_csv_for_bulk_domain_search() throws Throwable {
		try {

			Actions action = new Actions(getDriver());
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^verify user should get a download option after uploading a file for bulk domain search$")
	public void verify_user_should_get_a_download_option_after_uploading_a_file_for_bulk_domain_search()
			throws Throwable {

		WebDriverWait wait = new WebDriverWait(getDriver(), 40);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(BulkDomainSearchPage.BulkDomainSearch_Downlodlink_xpath));
		String txt = getDriver().findElement(BulkDomainSearchPage.BulkDomainSearch_Downlodlink_xpath).getText();
		ExtendUtil.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Successfully got " + txt + "Link"));

	}

	@When("^click on Lists module$")
	public void click_on_Lists_module() throws Throwable {
		try {
			click(ListsPage.Click_Lists_xpath, "Click on Lists on Header");
		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^click on Add List$")
	public void click_on_Add_List() throws Throwable {
		try {
			click(ListsPage.Click_Add_List_xpath, "Click on Add List");
		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@When("^enter the list name and save the list$")
	public void enter_the_list_name_and_save_the_list() throws Throwable {
		try {
			Random rand = new Random();

			int rand_int = rand.nextInt(100);
			System.out.println("Random Integers: " + rand_int);
			inputText(ListsPage.Enter_List_Name_xpath, dataMap.get("ListName") + rand_int, "Enter List Name");
			click(ListsPage.Click_Save_Button_xpath, "Click on Save");
			Apps500Util.assertTosterMessage(dataMap.get("SuccessfulToaste"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Edit the List$")
	public void edit_the_List() throws Throwable {
		try {

			click(ListsPage.Click_List_Elipse_xpath, "Click on Elipse Action");
			click(ListsPage.Click_List_Edit_xpath, "Click on Edit to edit the list");
			getDriver().findElement(ListsPage.Enter_List_Name_xpath).clear();
			Random rand = new Random();
			int rand_int = rand.nextInt(10);
			inputText(ListsPage.Enter_List_Name_xpath, dataMap.get("ListName") + rand_int, "Enter New List Name");
			click(ListsPage.Click_List_updatebtn, "Click on Update Button");
			Apps500Util.assertTosterMessage(dataMap.get("UpdateToaste"));

		} catch (Exception e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

	@Then("^Delete the List$")
	public void delete_the_List() throws Throwable {
		try {

			click(ListsPage.Click_List_Elipse_xpath, "Click on Elipse Action");
			click(ListsPage.Click_List_delete_xpath, "Click on delete");
			click(ListsPage.Click_List_delbtn, "Click on Delete Button");
			Apps500Util.assertTosterMessage(dataMap.get("DeleteToaste"));
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());

		}

	}

}
